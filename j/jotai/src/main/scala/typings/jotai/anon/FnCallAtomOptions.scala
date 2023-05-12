package typings.jotai.anon

import typings.jotai.reactUseSetAtomMod.Options
import typings.jotai.reactUseSetAtomMod.SetAtom
import typings.jotai.vanillaAtomMod.WritableAtom
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomArgs
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallAtomOptions extends StObject {
  
  def apply[AtomType /* <: WritableAtom[Any, js.Array[Any], Any] */](atom: AtomType): SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]] = js.native
  def apply[AtomType /* <: WritableAtom[Any, js.Array[Any], Any] */](atom: AtomType, options: Options): SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]] = js.native
  def apply[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result]): SetAtom[Args, Result] = js.native
  def apply[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result], options: Options): SetAtom[Args, Result] = js.native
}
