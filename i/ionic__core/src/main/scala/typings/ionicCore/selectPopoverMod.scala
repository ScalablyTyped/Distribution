package typings.ionicCore

import typings.ionicCore.selectPopoverInterfaceMod.SelectPopoverOption
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectPopoverMod {
  
  @JSImport("@ionic/core/dist/types/components/select-popover/select-popover", "SelectPopover")
  @js.native
  class SelectPopover ()
    extends StObject
       with ComponentInterface {
    
    /** Header text for the popover */
    var header: js.UndefOr[String] = js.native
    
    /** Text for popover body */
    var message: js.UndefOr[String] = js.native
    
    def onSelect(ev: js.Any): Unit = js.native
    
    /** Array of options for the popover */
    var options: js.Array[SelectPopoverOption] = js.native
    
    @JSName("render")
    def render_MSelectPopover(): js.Any = js.native
    
    /** Subheader text for the popover */
    var subHeader: js.UndefOr[String] = js.native
  }
}
