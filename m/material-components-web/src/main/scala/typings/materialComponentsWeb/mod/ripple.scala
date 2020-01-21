package typings.materialComponentsWeb.mod

import typings.materialRipple.AnonIsUnbounded
import typings.materialRipple.AnonPassive
import typings.materialRipple.AnonX
import typings.materialRipple.adapterMod.MDCRippleAdapter
import typings.std.ClientRect
import typings.std.Element
import typings.std.Event_
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "ripple")
@js.native
object ripple extends js.Object {
  @js.native
  class MDCRipple ()
    extends typings.materialRipple.mod.MDCRipple
  
  @js.native
  class MDCRippleFoundation ()
    extends typings.materialRipple.mod.MDCRippleFoundation
  
  @js.native
  class RippleCapableSurface ()
    extends typings.materialRipple.mod.RippleCapableSurface
  
  /* static members */
  @js.native
  object MDCRipple extends js.Object {
    def attachTo(root: Element): typings.materialRipple.mod.MDCRipple = js.native
    def attachTo(root: Element, options: AnonIsUnbounded): typings.materialRipple.mod.MDCRipple = js.native
    def createAdapter(instance: typings.materialRipple.mod.RippleCapableSurface): MDCRippleAdapter = js.native
  }
  
  /* static members */
  @js.native
  object MDCRippleFoundation extends js.Object {
    val cssClasses: typings.materialRipple.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRippleAdapter = js.native
    val numbers: typings.materialRipple.constantsMod.numbers = js.native
    val strings: typings.materialRipple.constantsMod.strings = js.native
  }
  
  @js.native
  object util extends js.Object {
    def applyPassive(): Boolean | AnonPassive = js.native
    def applyPassive(globalObj: Window_): Boolean | AnonPassive = js.native
    def applyPassive(globalObj: Window_, forceRefresh: Boolean): Boolean | AnonPassive = js.native
    def getMatchesProperty(HTMLElementPrototype: js.Object): js.Array[String] = js.native
    def getNormalizedEventCoords(ev: Event_, pageOffset: AnonX, clientRect: ClientRect): AnonX = js.native
    def supportsCssVariables(windowObj: Window_): js.UndefOr[Boolean] = js.native
    def supportsCssVariables(windowObj: Window_, forceRefresh: Boolean): js.UndefOr[Boolean] = js.native
  }
  
}

