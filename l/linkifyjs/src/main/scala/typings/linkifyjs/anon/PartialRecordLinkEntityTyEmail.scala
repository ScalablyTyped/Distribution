package typings.linkifyjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, (href : string): string>> */
@js.native
trait PartialRecordLinkEntityTyEmail extends js.Object {
  
  var email: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
  
  var hashtag: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
  
  var mention: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
  
  var url: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
}
object PartialRecordLinkEntityTyEmail {
  
  @scala.inline
  def apply(): PartialRecordLinkEntityTyEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordLinkEntityTyEmail]
  }
  
  @scala.inline
  implicit class PartialRecordLinkEntityTyEmailOps[Self <: PartialRecordLinkEntityTyEmail] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: /* value */ String => String): Self = this.set("email", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setHashtag(value: /* value */ String => String): Self = this.set("hashtag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHashtag: Self = this.set("hashtag", js.undefined)
    
    @scala.inline
    def setMention(value: /* value */ String => String): Self = this.set("mention", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMention: Self = this.set("mention", js.undefined)
    
    @scala.inline
    def setUrl(value: /* value */ String => String): Self = this.set("url", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
