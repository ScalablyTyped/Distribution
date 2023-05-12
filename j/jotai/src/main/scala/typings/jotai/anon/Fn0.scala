package typings.jotai.anon

import typings.jotai.reactUseAtomMod.Options
import typings.jotai.reactUseAtomMod.SetAtom
import typings.jotai.vanillaAtomMod.Atom_
import typings.jotai.vanillaAtomMod.WritableAtom
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomArgs
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomResult
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomValue
import typings.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn0 extends StObject {
  
  def apply[AtomType /* <: WritableAtom[Any, js.Array[Any], Any] */](atom: AtomType): js.Tuple2[
    Awaited[ExtractAtomValue[AtomType]], 
    SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]]
  ] = js.native
  def apply[AtomType /* <: WritableAtom[Any, js.Array[Any], Any] */](atom: AtomType, options: Options): js.Tuple2[
    Awaited[ExtractAtomValue[AtomType]], 
    SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]]
  ] = js.native
  def apply[Value](atom: Atom_[Value]): js.Tuple2[Awaited[Value], scala.Nothing] = js.native
  def apply[Value](atom: Atom_[Value], options: Options): js.Tuple2[Awaited[Value], scala.Nothing] = js.native
  def apply[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result]): js.Tuple2[Awaited[Value], SetAtom[Args, Result]] = js.native
  def apply[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result], options: Options): js.Tuple2[Awaited[Value], SetAtom[Args, Result]] = js.native
}
