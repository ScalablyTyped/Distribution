package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialIconDashButton.Anon_ARIAPRESSED
import typings.atMaterialIconDashButton.Anon_ICONBUTTONON
import typings.atMaterialIconDashButton.adapterMod.MDCIconButtonToggleAdapter
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "iconButton")
@js.native
object iconButton extends js.Object {
  @js.native
  class MDCIconButtonToggle ()
    extends typings.atMaterialIconDashButton.atMaterialIconDashButtonMod.MDCIconButtonToggle
  
  @js.native
  class MDCIconButtonToggleFoundation ()
    extends typings.atMaterialIconDashButton.atMaterialIconDashButtonMod.MDCIconButtonToggleFoundation {
    def this(adapter: Partial[MDCIconButtonToggleAdapter]) = this()
  }
  
  /* static members */
  @js.native
  object MDCIconButtonToggle extends js.Object {
    def attachTo(root: HTMLElement): typings.atMaterialIconDashButton.componentMod.MDCIconButtonToggle = js.native
  }
  
  /* static members */
  @js.native
  object MDCIconButtonToggleFoundation extends js.Object {
    val cssClasses: Anon_ICONBUTTONON = js.native
    val defaultAdapter: MDCIconButtonToggleAdapter = js.native
    val strings: Anon_ARIAPRESSED = js.native
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

