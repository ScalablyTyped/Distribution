package typings.heremaps.HNs.mapeventsNs.BehaviorNs

import typings.heremaps.HNs.mathNs.BitMask
import typings.heremaps.HNs.utilNs.kineticsNs.IKinetics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are used to initialize the Behavior class.
  * @property kinetics {H.util.kinetics.IKinetics=} - The parameters for the kinetic movement.
  * @property enable {number=} - The bitmask of behaviors to enable like H.mapevents.Behavior.DRAGGING. All are enabled by default.
  */
trait Options extends js.Object {
  var enable: js.UndefOr[BitMask] = js.undefined
  var kinetics: js.UndefOr[IKinetics] = js.undefined
}

object Options {
  @scala.inline
  def apply(enable: js.UndefOr[BitMask] = js.undefined, kinetics: IKinetics = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (kinetics != null) __obj.updateDynamic("kinetics")(kinetics)
    __obj.asInstanceOf[Options]
  }
}

