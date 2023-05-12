package typings.jotai

import typings.jotai.vanillaAtomMod.Atom_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaUtilsFreezeAtomMod {
  
  @JSImport("jotai/vanilla/utils/freezeAtom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def freezeAtom[AtomType /* <: Atom_[Any] */](anAtom: AtomType): AtomType = ^.asInstanceOf[js.Dynamic].applyDynamic("freezeAtom")(anAtom.asInstanceOf[js.Any]).asInstanceOf[AtomType]
  
  inline def freezeAtomCreator[CreateAtom /* <: js.Function1[/* repeated */ Any, Atom_[Any]] */](createAtom: CreateAtom): CreateAtom = ^.asInstanceOf[js.Dynamic].applyDynamic("freezeAtomCreator")(createAtom.asInstanceOf[js.Any]).asInstanceOf[CreateAtom]
}
