package typings.linkifyjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, string>> */
@js.native
trait PartialRecordLinkEntityTyHashtag extends js.Object {
  var email: js.UndefOr[String] = js.native
  var hashtag: js.UndefOr[String] = js.native
  var mention: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object PartialRecordLinkEntityTyHashtag {
  @scala.inline
  def apply(): PartialRecordLinkEntityTyHashtag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordLinkEntityTyHashtag]
  }
  @scala.inline
  implicit class PartialRecordLinkEntityTyHashtagOps[Self <: PartialRecordLinkEntityTyHashtag] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setHashtag(value: String): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashtag: Self = this.set("hashtag", js.undefined)
    @scala.inline
    def setMention(value: String): Self = this.set("mention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMention: Self = this.set("mention", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

