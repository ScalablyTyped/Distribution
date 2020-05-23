package typings.kolite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opacity extends js.Object {
  var opacity: js.UndefOr[Double] = js.undefined
  var segments: js.UndefOr[Double] = js.undefined
  var steps: js.UndefOr[Double] = js.undefined
}

object Opacity {
  @scala.inline
  def apply(
    opacity: js.UndefOr[Double] = js.undefined,
    segments: js.UndefOr[Double] = js.undefined,
    steps: js.UndefOr[Double] = js.undefined
  ): Opacity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(segments)) __obj.updateDynamic("segments")(segments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
}

