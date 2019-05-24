package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  duration  :number | string,   easing  :string,   delay  :number | string}> */
trait Partialdurationnumberstringeasingstringdelaynumber extends js.Object {
  var delay: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var duration: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
}

object Partialdurationnumberstringeasingstringdelaynumber {
  @scala.inline
  def apply(
    delay: scala.Double | java.lang.String = null,
    duration: scala.Double | java.lang.String = null,
    easing: java.lang.String = null
  ): Partialdurationnumberstringeasingstringdelaynumber = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[Partialdurationnumberstringeasingstringdelaynumber]
  }
}

