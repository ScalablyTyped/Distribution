package typings.materialSwitch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @js.native
  sealed trait CssClasses extends StObject
  @JSImport("@material/switch/constants", "CssClasses")
  @js.native
  object CssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CssClasses & String] = js.native
    
    @js.native
    sealed trait PROCESSING
      extends StObject
         with CssClasses
    /* "mdc-switch--processing" */ val PROCESSING: typings.materialSwitch.constantsMod.CssClasses.PROCESSING & String = js.native
    
    @js.native
    sealed trait SELECTED
      extends StObject
         with CssClasses
    /* "mdc-switch--selected" */ val SELECTED: typings.materialSwitch.constantsMod.CssClasses.SELECTED & String = js.native
    
    @js.native
    sealed trait UNSELECTED
      extends StObject
         with CssClasses
    /* "mdc-switch--unselected" */ val UNSELECTED: typings.materialSwitch.constantsMod.CssClasses.UNSELECTED & String = js.native
  }
  
  @js.native
  sealed trait Selectors extends StObject
  @JSImport("@material/switch/constants", "Selectors")
  @js.native
  object Selectors extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Selectors & String] = js.native
    
    @js.native
    sealed trait RIPPLE
      extends StObject
         with Selectors
    /* ".mdc-switch__ripple" */ val RIPPLE: typings.materialSwitch.constantsMod.Selectors.RIPPLE & String = js.native
  }
}
