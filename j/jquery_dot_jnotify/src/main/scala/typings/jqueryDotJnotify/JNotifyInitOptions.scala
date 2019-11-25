package typings.jqueryDotJnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JNotifyInitOptions extends js.Object {
  var appendType: js.UndefOr[String] = js.undefined
  var oneAtTime: js.UndefOr[Boolean] = js.undefined
}

object JNotifyInitOptions {
  @scala.inline
  def apply(appendType: String = null, oneAtTime: js.UndefOr[Boolean] = js.undefined): JNotifyInitOptions = {
    val __obj = js.Dynamic.literal()
    if (appendType != null) __obj.updateDynamic("appendType")(appendType.asInstanceOf[js.Any])
    if (!js.isUndefined(oneAtTime)) __obj.updateDynamic("oneAtTime")(oneAtTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[JNotifyInitOptions]
  }
}

