package typings.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Opacity extends js.Object {
  var opacity: js.UndefOr[Double] = js.undefined
  var segments: js.UndefOr[Double] = js.undefined
  var steps: js.UndefOr[Double] = js.undefined
}

object Anon_Opacity {
  @scala.inline
  def apply(opacity: Int | Double = null, segments: Int | Double = null, steps: Int | Double = null): Anon_Opacity = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Opacity]
  }
}

