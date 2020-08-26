package typings.kikBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KikMessage extends js.Object {
  var big: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var noForward: js.UndefOr[Boolean] = js.native
  var pic: js.UndefOr[String] = js.native
  var text: String = js.native
  var title: String = js.native
}

object KikMessage {
  @scala.inline
  def apply(text: String, title: String): KikMessage = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[KikMessage]
  }
  @scala.inline
  implicit class KikMessageOps[Self <: KikMessage] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setBig(value: Boolean): Self = this.set("big", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBig: Self = this.set("big", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setNoForward(value: Boolean): Self = this.set("noForward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoForward: Self = this.set("noForward", js.undefined)
    @scala.inline
    def setPic(value: String): Self = this.set("pic", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePic: Self = this.set("pic", js.undefined)
  }
  
}

