package typings.jotai

import typings.jotai.anon.Children
import typings.jotai.anon.Devgetatomstate
import typings.jotai.anon.Devgetmounted
import typings.jotai.anon.Value
import typings.jotai.reactProviderMod.Store
import typings.jotai.reactUseAtomMod.Options
import typings.jotai.vanillaAtomMod.Atom_
import typings.jotai.vanillaAtomMod.PrimitiveAtom
import typings.jotai.vanillaAtomMod.Read
import typings.jotai.vanillaAtomMod.SetAtom
import typings.jotai.vanillaAtomMod.WithInitialValue
import typings.jotai.vanillaAtomMod.WritableAtom
import typings.jotai.vanillaAtomMod.Write
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomArgs
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomResult
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomValue
import typings.react.mod.FunctionComponentElement
import typings.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object indexMod {
  
  @JSImport("jotai/index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Provider(param0: Children): FunctionComponentElement[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("Provider")(param0.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentElement[Value]]
  
  inline def atom[Value](initialValue: Value): PrimitiveAtom[Value] & WithInitialValue[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("atom")(initialValue.asInstanceOf[js.Any]).asInstanceOf[PrimitiveAtom[Value] & WithInitialValue[Value]]
  inline def atom[Value](read: Read[Value, scala.Nothing]): Atom_[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("atom")(read.asInstanceOf[js.Any]).asInstanceOf[Atom_[Value]]
  inline def atom[Value, Args /* <: js.Array[Any] */, Result](initialValue: Value, write: Write[Args, Result]): (WritableAtom[Value, Args, Result]) & WithInitialValue[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("atom")(initialValue.asInstanceOf[js.Any], write.asInstanceOf[js.Any])).asInstanceOf[(WritableAtom[Value, Args, Result]) & WithInitialValue[Value]]
  inline def atom[Value, Args /* <: js.Array[Any] */, Result](read: Read[Value, SetAtom[Args, Result]], write: Write[Args, Result]): WritableAtom[Value, Args, Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("atom")(read.asInstanceOf[js.Any], write.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[Value, Args, Result]]
  
  inline def createStore(): Devgetatomstate | Devgetmounted = ^.asInstanceOf[js.Dynamic].applyDynamic("createStore")().asInstanceOf[Devgetatomstate | Devgetmounted]
  
  inline def getDefaultStore(): Devgetatomstate | Devgetmounted = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultStore")().asInstanceOf[Devgetatomstate | Devgetmounted]
  
  inline def useAtom[AtomType /* <: Atom_[Any] */](atom: AtomType): js.Tuple2[Awaited[ExtractAtomValue[AtomType]], scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Awaited[ExtractAtomValue[AtomType]], scala.Nothing]]
  inline def useAtom[AtomType /* <: Atom_[Any] */](atom: AtomType, options: Options): js.Tuple2[Awaited[ExtractAtomValue[AtomType]], scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Awaited[ExtractAtomValue[AtomType]], scala.Nothing]]
  inline def useAtom[Value](atom: Atom_[Value]): js.Tuple2[Awaited[Value], scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Awaited[Value], scala.Nothing]]
  inline def useAtom[Value](atom: Atom_[Value], options: Options): js.Tuple2[Awaited[Value], scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Awaited[Value], scala.Nothing]]
  inline def useAtom[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result]): js.Tuple2[Awaited[Value], typings.jotai.reactUseAtomMod.SetAtom[Args, Result]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Awaited[Value], typings.jotai.reactUseAtomMod.SetAtom[Args, Result]]]
  inline def useAtom[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result], options: Options): js.Tuple2[Awaited[Value], typings.jotai.reactUseAtomMod.SetAtom[Args, Result]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Awaited[Value], typings.jotai.reactUseAtomMod.SetAtom[Args, Result]]]
  
  inline def useAtomValue[AtomType /* <: Atom_[Any] */](atom: AtomType): Awaited[ExtractAtomValue[AtomType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtomValue")(atom.asInstanceOf[js.Any]).asInstanceOf[Awaited[ExtractAtomValue[AtomType]]]
  inline def useAtomValue[AtomType /* <: Atom_[Any] */](atom: AtomType, options: typings.jotai.reactUseAtomValueMod.Options): Awaited[ExtractAtomValue[AtomType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtomValue")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Awaited[ExtractAtomValue[AtomType]]]
  inline def useAtomValue[Value](atom: Atom_[Value]): Awaited[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtomValue")(atom.asInstanceOf[js.Any]).asInstanceOf[Awaited[Value]]
  inline def useAtomValue[Value](atom: Atom_[Value], options: typings.jotai.reactUseAtomValueMod.Options): Awaited[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtomValue")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Awaited[Value]]
  
  inline def useSetAtom[AtomType /* <: WritableAtom[Any, js.Array[Any], Any] */](atom: AtomType): typings.jotai.reactUseSetAtomMod.SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetAtom")(atom.asInstanceOf[js.Any]).asInstanceOf[typings.jotai.reactUseSetAtomMod.SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]]]
  inline def useSetAtom[AtomType /* <: WritableAtom[Any, js.Array[Any], Any] */](atom: AtomType, options: typings.jotai.reactUseSetAtomMod.Options): typings.jotai.reactUseSetAtomMod.SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSetAtom")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.jotai.reactUseSetAtomMod.SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]]]
  inline def useSetAtom[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result]): typings.jotai.reactUseSetAtomMod.SetAtom[Args, Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetAtom")(atom.asInstanceOf[js.Any]).asInstanceOf[typings.jotai.reactUseSetAtomMod.SetAtom[Args, Result]]
  inline def useSetAtom[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result], options: typings.jotai.reactUseSetAtomMod.Options): typings.jotai.reactUseSetAtomMod.SetAtom[Args, Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSetAtom")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.jotai.reactUseSetAtomMod.SetAtom[Args, Result]]
  
  inline def useStore(): Store = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")().asInstanceOf[Store]
  inline def useStore(options: typings.jotai.reactProviderMod.Options): Store = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(options.asInstanceOf[js.Any]).asInstanceOf[Store]
}
