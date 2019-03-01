package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  /**
    * The duration of the animation in milliseconds.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * When using jQuery as the general framework, the easing can be set to linear or swing. More easing functions are
    * available with the use of jQuery plug-ins, most notably the jQuery UI suite. See the
    * {@link http://api.jquery.com/animate/|jQuery docs}. When using MooTools as the general framework, use the
    * property name transition instead of easing.
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
}

object Animation {
  @scala.inline
  def apply(duration: scala.Int | scala.Double = null, easing: java.lang.String = null): Animation = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[Animation]
  }
}

