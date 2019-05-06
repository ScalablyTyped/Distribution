package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRippleEffect extends js.Object {
  /**
    * Sets the type of ripple-effect:  - `bounded`: the ripple effect expands from the user's click position - `unbounded`: the ripple effect expands from the center of the button and overflows the container.  NOTE: Surfaces for bounded ripples should have the overflow property set to hidden, while surfaces for unbounded ripples should have it set to visible.
    */
  var `type`: atIonicCoreLib.atIonicCoreLibStrings.bounded | atIonicCoreLib.atIonicCoreLibStrings.unbounded
  /**
    * Adds the ripple effect to the parent element
    */
  def addRipple(pageX: scala.Double, pageY: scala.Double): js.Promise[js.Function0[scala.Unit]]
}

object IonRippleEffect {
  @scala.inline
  def apply(
    addRipple: (scala.Double, scala.Double) => js.Promise[js.Function0[scala.Unit]],
    `type`: atIonicCoreLib.atIonicCoreLibStrings.bounded | atIonicCoreLib.atIonicCoreLibStrings.unbounded
  ): IonRippleEffect = {
    val __obj = js.Dynamic.literal(addRipple = js.Any.fromFunction2(addRipple))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRippleEffect]
  }
}

