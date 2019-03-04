package typings
package historyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryState extends js.Object {
  var cleanUrl: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var hashedUrl: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object HistoryState {
  @scala.inline
  def apply(
    url: java.lang.String,
    cleanUrl: java.lang.String = null,
    data: js.Any = null,
    hashedUrl: java.lang.String = null,
    title: java.lang.String = null
  ): HistoryState = {
    val __obj = js.Dynamic.literal(url = url)
    if (cleanUrl != null) __obj.updateDynamic("cleanUrl")(cleanUrl)
    if (data != null) __obj.updateDynamic("data")(data)
    if (hashedUrl != null) __obj.updateDynamic("hashedUrl")(hashedUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[HistoryState]
  }
}

