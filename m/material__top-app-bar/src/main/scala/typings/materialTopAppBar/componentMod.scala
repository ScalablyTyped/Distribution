package typings.materialTopAppBar

import typings.materialBase.componentMod.MDCComponent
import typings.materialRipple.componentMod.MDCRippleFactory
import typings.materialTopAppBar.materialTopAppBarMod.MDCTopAppBarBaseFoundation
import typings.std.Element
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/top-app-bar/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCTopAppBar () extends MDCComponent[MDCTopAppBarBaseFoundation] {
    def initialize(): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory): Unit = js.native
    def setScrollTarget(target: EventTarget): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MDCTopAppBar extends js.Object {
    def attachTo(root: Element): MDCTopAppBar = js.native
  }
  
}

