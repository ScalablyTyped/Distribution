package typings.htmlparser2.feedHandlerMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedItem extends js.Object {
  var description: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var link: js.UndefOr[String] = js.native
  var pubDate: js.UndefOr[Date] = js.native
  var title: js.UndefOr[String] = js.native
}

object FeedItem {
  @scala.inline
  def apply(): FeedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedItem]
  }
  @scala.inline
  implicit class FeedItemOps[Self <: FeedItem] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setPubDate(value: Date): Self = this.set("pubDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubDate: Self = this.set("pubDate", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

