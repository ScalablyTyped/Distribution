package typings.materialIconButton

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialIconButton.adapterMod.MDCIconButtonToggleAdapter
import typings.materialIconButton.anon.PartialMDCIconButtonToggl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/icon-button/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCIconButtonToggleFoundation {
    def this(adapter: PartialMDCIconButtonToggl) = this()
  }
  
  @JSImport("@material/icon-button/foundation", "MDCIconButtonToggleFoundation")
  @js.native
  open class MDCIconButtonToggleFoundation () extends MDCFoundation[MDCIconButtonToggleAdapter] {
    def this(adapter: PartialMDCIconButtonToggl) = this()
    
    def handleClick(): Unit = js.native
    
    /**
      * Whether the icon button has an aria label that changes depending on
      * toggled state.
      */
    /* private */ var hasToggledAriaLabel: Any = js.native
    
    def isOn(): Boolean = js.native
    
    def toggle(): Unit = js.native
    def toggle(isOn: Boolean): Unit = js.native
  }
}
