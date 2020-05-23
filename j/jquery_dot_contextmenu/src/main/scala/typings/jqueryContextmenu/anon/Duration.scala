package typings.jqueryContextmenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var hide: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[String] = js.undefined
}

object Duration {
  @scala.inline
  def apply(duration: js.UndefOr[Double] = js.undefined, hide: String = null, show: String = null): Duration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

