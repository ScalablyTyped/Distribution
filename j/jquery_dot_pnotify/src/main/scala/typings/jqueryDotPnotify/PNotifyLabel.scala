package typings.jqueryDotPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyLabel extends js.Object {
  var all: js.UndefOr[String] = js.undefined
  var close: js.UndefOr[String] = js.undefined
  var last: js.UndefOr[String] = js.undefined
  var redisplay: js.UndefOr[String] = js.undefined
  var stick: js.UndefOr[String] = js.undefined
}

object PNotifyLabel {
  @scala.inline
  def apply(
    all: String = null,
    close: String = null,
    last: String = null,
    redisplay: String = null,
    stick: String = null
  ): PNotifyLabel = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (redisplay != null) __obj.updateDynamic("redisplay")(redisplay.asInstanceOf[js.Any])
    if (stick != null) __obj.updateDynamic("stick")(stick.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNotifyLabel]
  }
}

