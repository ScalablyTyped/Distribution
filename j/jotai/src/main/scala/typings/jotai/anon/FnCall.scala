package typings.jotai.anon

import typings.jotai.reactUseAtomValueMod.Options
import typings.jotai.vanillaAtomMod.Atom_
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomValue
import typings.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[AtomType /* <: Atom_[Any] */](atom: AtomType): Awaited[ExtractAtomValue[AtomType]] = js.native
  def apply[AtomType /* <: Atom_[Any] */](atom: AtomType, options: Options): Awaited[ExtractAtomValue[AtomType]] = js.native
  def apply[Value](atom: Atom_[Value]): Awaited[Value] = js.native
  def apply[Value](atom: Atom_[Value], options: Options): Awaited[Value] = js.native
}
