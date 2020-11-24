package typings.linkifyjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, string | (href : string): string>> */
@js.native
trait PartialRecordLinkEntityTy extends js.Object {
  
  var email: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.native
  
  var hashtag: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.native
  
  var mention: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.native
  
  var url: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.native
}
object PartialRecordLinkEntityTy {
  
  @scala.inline
  def apply(): PartialRecordLinkEntityTy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordLinkEntityTy]
  }
  
  @scala.inline
  implicit class PartialRecordLinkEntityTyOps[Self <: PartialRecordLinkEntityTy] (val x: Self) extends AnyVal {
    
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
    def setEmailFunction1(value: /* href */ String => String): Self = this.set("email", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmail(value: String | (js.Function1[/* href */ String, String])): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setHashtagFunction1(value: /* href */ String => String): Self = this.set("hashtag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHashtag(value: String | (js.Function1[/* href */ String, String])): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashtag: Self = this.set("hashtag", js.undefined)
    
    @scala.inline
    def setMentionFunction1(value: /* href */ String => String): Self = this.set("mention", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMention(value: String | (js.Function1[/* href */ String, String])): Self = this.set("mention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMention: Self = this.set("mention", js.undefined)
    
    @scala.inline
    def setUrlFunction1(value: /* href */ String => String): Self = this.set("url", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUrl(value: String | (js.Function1[/* href */ String, String])): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
