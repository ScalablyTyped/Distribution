package typings.jqueryDotContextmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var hide: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[String] = js.undefined
}

object Anon_Duration {
  @scala.inline
  def apply(duration: Int | Double = null, hide: String = null, show: String = null): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (show != null) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_Duration]
  }
}

