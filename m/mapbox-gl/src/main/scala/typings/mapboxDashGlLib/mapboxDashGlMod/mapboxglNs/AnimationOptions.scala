package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnimationOptions extends js.Object {
  /** When set to false, no animation happens */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /** Number in milliseconds */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
           * A function taking a time in the range 0..1 and returning a number where 0 is the initial
           * state and 1 is the final state.
           */
  var easing: js.UndefOr[js.Function1[/* time */ scala.Double, scala.Double]] = js.undefined
  /** point, origin of movement relative to map center */
  var offset: js.UndefOr[PointLike] = js.undefined
}

