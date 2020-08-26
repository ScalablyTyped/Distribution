package typings.materialIconButton

import typings.materialBase.componentMod.MDCComponent
import typings.materialIconButton.foundationMod.MDCIconButtonToggleFoundation
import typings.materialRipple.componentMod.MDCRipple
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/icon-button/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCIconButtonToggle () extends MDCComponent[MDCIconButtonToggleFoundation] {
    def on: Boolean = js.native
    def on_=(isOn: Boolean): Unit = js.native
    def ripple: MDCRipple = js.native
  }
  
  /* static members */
  @js.native
  object MDCIconButtonToggle extends js.Object {
    def attachTo(root: HTMLElement): MDCIconButtonToggle = js.native
  }
  
}

