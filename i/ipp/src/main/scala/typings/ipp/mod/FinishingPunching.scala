package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinishingPunching extends js.Object {
  var `punching-locations`: js.UndefOr[js.Array[Double]] = js.undefined
  var `punching-offset`: js.UndefOr[Double] = js.undefined
  var `punching-reference-edge`: js.UndefOr[ReferenceEdge] = js.undefined
}

object FinishingPunching {
  @scala.inline
  def apply(
    `punching-locations`: js.Array[Double] = null,
    `punching-offset`: js.UndefOr[Double] = js.undefined,
    `punching-reference-edge`: ReferenceEdge = null
  ): FinishingPunching = {
    val __obj = js.Dynamic.literal()
    if (`punching-locations` != null) __obj.updateDynamic("punching-locations")(`punching-locations`.asInstanceOf[js.Any])
    if (!js.isUndefined(`punching-offset`)) __obj.updateDynamic("punching-offset")(`punching-offset`.get.asInstanceOf[js.Any])
    if (`punching-reference-edge` != null) __obj.updateDynamic("punching-reference-edge")(`punching-reference-edge`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishingPunching]
  }
}

