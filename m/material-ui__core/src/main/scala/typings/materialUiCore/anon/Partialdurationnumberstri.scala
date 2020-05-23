package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  duration  :number | string,   easing  :string,   delay  :number | string}> */
@js.native
trait Partialdurationnumberstri extends js.Object {
  var delay: js.UndefOr[Double | String] = js.native
  var duration: js.UndefOr[Double | String] = js.native
  var easing: js.UndefOr[String] = js.native
}

object Partialdurationnumberstri {
  @scala.inline
  def apply(delay: Double | String = null, duration: Double | String = null, easing: String = null): Partialdurationnumberstri = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialdurationnumberstri]
  }
}

