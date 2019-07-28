package typings.atMaterialLineDashRipple.atMaterialLineDashRippleMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialLineDashRipple.adapterMod.MDCLineRippleAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/line-ripple", "MDCLineRipple")
@js.native
class MDCLineRipple ()
  extends default[MDCLineRippleAdapter, typings.atMaterialLineDashRipple.foundationMod.default] {
  /**
    * Activates the line ripple
    */
  def activate(): Unit = js.native
  /**
    * Deactivates the line ripple
    */
  def deactivate(): Unit = js.native
  /**
    * Sets the transform origin given a user's click location. The `rippleCenter` is the
    * x-coordinate of the middle of the ripple.
    */
  def setRippleCenter(xCoordinate: Double): Unit = js.native
}

/* static members */
@JSImport("@material/line-ripple", "MDCLineRipple")
@js.native
object MDCLineRipple extends js.Object {
  def attachTo(root: Element): MDCLineRipple = js.native
}

