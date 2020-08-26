package typings.historyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryState extends js.Object {
  var cleanUrl: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var hashedUrl: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var url: String = js.native
}

object HistoryState {
  @scala.inline
  def apply(url: String): HistoryState = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryState]
  }
  @scala.inline
  implicit class HistoryStateOps[Self <: HistoryState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCleanUrl(value: String): Self = this.set("cleanUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanUrl: Self = this.set("cleanUrl", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHashedUrl(value: String): Self = this.set("hashedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashedUrl: Self = this.set("hashedUrl", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

