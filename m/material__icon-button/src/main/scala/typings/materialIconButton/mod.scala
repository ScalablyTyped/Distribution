package typings.materialIconButton

import typings.materialIconButton.adapterMod.MDCIconButtonToggleAdapter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/icon-button", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCIconButtonToggle ()
    extends typings.materialIconButton.componentMod.MDCIconButtonToggle
  
  @js.native
  class MDCIconButtonToggleFoundation ()
    extends typings.materialIconButton.foundationMod.MDCIconButtonToggleFoundation {
    def this(adapter: PartialMDCIconButtonToggl) = this()
  }
  
  /* static members */
  @js.native
  object MDCIconButtonToggle extends js.Object {
    def attachTo(root: HTMLElement): typings.materialIconButton.componentMod.MDCIconButtonToggle = js.native
  }
  
  /* static members */
  @js.native
  object MDCIconButtonToggleFoundation extends js.Object {
    val cssClasses: AnonICONBUTTONON = js.native
    val defaultAdapter: MDCIconButtonToggleAdapter = js.native
    val strings: AnonARIAPRESSED = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    var ICON_BUTTON_ON: String = js.native
    var ROOT: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    var ARIA_PRESSED: String = js.native
    var CHANGE_EVENT: String = js.native
  }
  
}

