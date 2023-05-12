package typings.jotai

import typings.jotai.anon.Children
import typings.jotai.anon.Value
import typings.jotai.reactProviderMod.Store
import typings.jotai.reactUseAtomMod.Options
import typings.jotai.reactUseAtomMod.SetAtom
import typings.jotai.vanillaAtomMod.Atom_
import typings.jotai.vanillaAtomMod.WritableAtom
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomArgs
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomResult
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomValue
import typings.react.mod.FunctionComponentElement
import typings.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  @JSImport("jotai/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Provider(param0: Children): FunctionComponentElement[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("Provider")(param0.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentElement[Value]]
  
  inline def useAtom[AtomType /* <: Atom_[Any] */](atom: AtomType): js.Tuple2[Awaited[ExtractAtomValue[AtomType]], scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Awaited[ExtractAtomValue[AtomType]], scala.Nothing]]
  inline def useAtom[AtomType /* <: Atom_[Any] */](atom: AtomType, options: Options): js.Tuple2[Awaited[ExtractAtomValue[AtomType]], scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Awaited[ExtractAtomValue[AtomType]], scala.Nothing]]
  inline def useAtom[Value](atom: Atom_[Value]): js.Tuple2[Awaited[Value], scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Awaited[Value], scala.Nothing]]
  inline def useAtom[Value](atom: Atom_[Value], options: Options): js.Tuple2[Awaited[Value], scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Awaited[Value], scala.Nothing]]
  inline def useAtom[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result]): js.Tuple2[Awaited[Value], SetAtom[Args, Result]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Awaited[Value], SetAtom[Args, Result]]]
  inline def useAtom[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result], options: Options): js.Tuple2[Awaited[Value], SetAtom[Args, Result]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Awaited[Value], SetAtom[Args, Result]]]
  
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
