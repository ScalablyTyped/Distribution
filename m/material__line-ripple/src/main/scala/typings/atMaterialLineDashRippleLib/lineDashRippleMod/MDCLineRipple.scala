package typings
package atMaterialLineDashRippleLib.lineDashRippleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/line-ripple", "MDCLineRipple")
@js.native
class MDCLineRipple ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialLineDashRippleLib.adapterMod.MDCLineRippleAdapter, 
      atMaterialLineDashRippleLib.foundationMod.default
    ] {
  /**
       * Activates the line ripple
       */
  def activate(): scala.Unit = js.native
  /**
       * Deactivates the line ripple
       */
  def deactivate(): scala.Unit = js.native
  /**
       * Sets the transform origin given a user's click location. The `rippleCenter` is the
       * x-coordinate of the middle of the ripple.
       */
  def setRippleCenter(xCoordinate: scala.Double): scala.Unit = js.native
}

@JSImport("@material/line-ripple", "MDCLineRipple")
@js.native
object MDCLineRipple extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialLineDashRippleLib.lineDashRippleMod.MDCLineRipple = js.native
}

