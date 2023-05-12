package typings.jotai

import typings.jotai.vanillaAtomMod.Atom_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaUtilsAtomFamilyMod {
  
  @JSImport("jotai/vanilla/utils/atomFamily", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atomFamily[Param, AtomType /* <: Atom_[Any] */](initializeAtom: js.Function1[/* param */ Param, AtomType]): AtomFamily_[Param, AtomType] = ^.asInstanceOf[js.Dynamic].applyDynamic("atomFamily")(initializeAtom.asInstanceOf[js.Any]).asInstanceOf[AtomFamily_[Param, AtomType]]
  inline def atomFamily[Param, AtomType /* <: Atom_[Any] */](
    initializeAtom: js.Function1[/* param */ Param, AtomType],
    areEqual: js.Function2[/* a */ Param, /* b */ Param, Boolean]
  ): AtomFamily_[Param, AtomType] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomFamily")(initializeAtom.asInstanceOf[js.Any], areEqual.asInstanceOf[js.Any])).asInstanceOf[AtomFamily_[Param, AtomType]]
  
  @js.native
  trait AtomFamily_[Param, AtomType] extends StObject {
    
    def apply(param: Param): AtomType = js.native
    
    def remove(param: Param): Unit = js.native
    
    def setShouldRemove(): Unit = js.native
    def setShouldRemove(shouldRemove: ShouldRemove[Param]): Unit = js.native
  }
  
  type ShouldRemove[Param] = js.Function2[/* createdAt */ Double, /* param */ Param, Boolean]
}
