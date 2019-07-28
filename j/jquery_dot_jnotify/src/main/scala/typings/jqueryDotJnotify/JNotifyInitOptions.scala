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
    if (appendType != null) __obj.updateDynamic("appendType")(appendType)
    if (!js.isUndefined(oneAtTime)) __obj.updateDynamic("oneAtTime")(oneAtTime)
    __obj.asInstanceOf[JNotifyInitOptions]
  }
}

