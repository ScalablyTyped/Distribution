package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Opacity extends js.Object {
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var segments: js.UndefOr[scala.Double] = js.undefined
  var steps: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Opacity {
  @scala.inline
  def apply(
    opacity: scala.Int | scala.Double = null,
    segments: scala.Int | scala.Double = null,
    steps: scala.Int | scala.Double = null
  ): Anon_Opacity = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Opacity]
  }
}

