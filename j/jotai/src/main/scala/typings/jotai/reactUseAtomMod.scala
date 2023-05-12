package typings.jotai

import typings.jotai.vanillaAtomMod.Atom_
import typings.jotai.vanillaAtomMod.WritableAtom
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomArgs
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomResult
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomValue
import typings.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactUseAtomMod {
  
  @JSImport("jotai/react/useAtom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAtom[AtomType /* <: WritableAtom[Any, js.Array[Any], Any] */](atom: AtomType): js.Tuple2[
    Awaited[ExtractAtomValue[AtomType]], 
    SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    Awaited[ExtractAtomValue[AtomType]], 
    SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]]
  ]]
  inline def useAtom[AtomType /* <: WritableAtom[Any, js.Array[Any], Any] */](atom: AtomType, options: Options): js.Tuple2[
    Awaited[ExtractAtomValue[AtomType]], 
    SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    Awaited[ExtractAtomValue[AtomType]], 
    SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]]
  ]]
  inline def useAtom[Value](atom: Atom_[Value]): js.Tuple2[Awaited[Value], scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Awaited[Value], scala.Nothing]]
  inline def useAtom[Value](atom: Atom_[Value], options: Options): js.Tuple2[Awaited[Value], scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Awaited[Value], scala.Nothing]]
  inline def useAtom[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result]): js.Tuple2[Awaited[Value], SetAtom[Args, Result]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Awaited[Value], SetAtom[Args, Result]]]
  inline def useAtom[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result], options: Options): js.Tuple2[Awaited[Value], SetAtom[Args, Result]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtom")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Awaited[Value], SetAtom[Args, Result]]]
  
  type Options = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jotai.anon.FnCall>[1] */ js.Any
  
  type SetAtom[Args /* <: js.Array[Any] */, Result] = js.Function1[/* args */ Args, Result]
}
