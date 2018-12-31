package typings
package heremapsLib.HNs.mapeventsNs.BehaviorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are used to initialize the Behavior class.
  * @property kinetics {H.util.kinetics.IKinetics=} - The parameters for the kinetic movement.
  * @property enable {number=} - The bitmask of behaviors to enable like H.mapevents.Behavior.DRAGGING. All are enabled by default.
  */
trait Options extends js.Object {
  var enable: js.UndefOr[heremapsLib.HNs.mathNs.BitMask] = js.undefined
  var kinetics: js.UndefOr[heremapsLib.HNs.utilNs.kineticsNs.IKinetics] = js.undefined
}

