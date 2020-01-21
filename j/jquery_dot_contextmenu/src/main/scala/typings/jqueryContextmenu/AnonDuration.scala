package typings.jqueryContextmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var hide: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[String] = js.undefined
}

object AnonDuration {
  @scala.inline
  def apply(duration: Int | Double = null, hide: String = null, show: String = null): AnonDuration = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDuration]
  }
}

