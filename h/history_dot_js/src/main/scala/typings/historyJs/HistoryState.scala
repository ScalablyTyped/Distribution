package typings.historyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryState extends js.Object {
  var cleanUrl: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var hashedUrl: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: String
}

object HistoryState {
  @scala.inline
  def apply(
    url: String,
    cleanUrl: String = null,
    data: js.Any = null,
    hashedUrl: String = null,
    title: String = null
  ): HistoryState = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (cleanUrl != null) __obj.updateDynamic("cleanUrl")(cleanUrl.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (hashedUrl != null) __obj.updateDynamic("hashedUrl")(hashedUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryState]
  }
}

