package typings.materialRipple

import typings.materialRipple.adapterMod.MDCRippleAdapter
import typings.materialRipple.foundationMod.default
import typings.std.ClientRect
import typings.std.Element
import typings.std.Event_
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCRipple ()
    extends typings.materialBase.componentMod.default[MDCRippleAdapter, default] {
    var unbounded: Boolean = js.native
    def activate(): Unit = js.native
    def deactivate(): Unit = js.native
    def layout(): Unit = js.native
  }
  
  @js.native
  class MDCRippleFoundation () extends default
  
  @js.native
  class RippleCapableSurface () extends js.Object {
    /**
      * Whether or not the ripple is attached to a disabled component.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    var root_ : Element = js.native
    /**
      * Whether or not the ripple bleeds out of the bounds of the element.
      */
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  
  /* static members */
  @js.native
  object MDCRipple extends js.Object {
    def attachTo(root: Element): MDCRipple = js.native
    def attachTo(root: Element, options: AnonIsUnbounded): MDCRipple = js.native
    def createAdapter(instance: RippleCapableSurface): MDCRippleAdapter = js.native
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

