package typings.materialIconButton

import typings.materialBase.componentMod.MDCComponent
import typings.materialIconButton.foundationMod.MDCIconButtonToggleFoundation
import typings.materialRipple.componentMod.MDCRipple
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/icon-button/component", "MDCIconButtonToggle")
  @js.native
  class MDCIconButtonToggle protected () extends MDCComponent[MDCIconButtonToggleFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCIconButtonToggleFoundation, args: js.Any*) = this()
    
    def on: Boolean = js.native
    def on_=(isOn: Boolean): Unit = js.native
    
    def ripple: MDCRipple = js.native
  }
  /* static members */
  object MDCIconButtonToggle {
    
    @JSImport("@material/icon-button/component", "MDCIconButtonToggle.attachTo")
    @js.native
    def attachTo(root: HTMLElement): MDCIconButtonToggle = js.native
  }
}
