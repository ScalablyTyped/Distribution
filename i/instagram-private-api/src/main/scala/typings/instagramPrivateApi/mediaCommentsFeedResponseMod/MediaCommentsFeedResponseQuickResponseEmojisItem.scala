package typings.instagramPrivateApi.mediaCommentsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaCommentsFeedResponseQuickResponseEmojisItem extends js.Object {
  
  var unicode: String = js.native
}
object MediaCommentsFeedResponseQuickResponseEmojisItem {
  
  @scala.inline
  def apply(unicode: String): MediaCommentsFeedResponseQuickResponseEmojisItem = {
    val __obj = js.Dynamic.literal(unicode = unicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCommentsFeedResponseQuickResponseEmojisItem]
  }
  
  @scala.inline
  implicit class MediaCommentsFeedResponseQuickResponseEmojisItemOps[Self <: MediaCommentsFeedResponseQuickResponseEmojisItem] (val x: Self) extends AnyVal {
    
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
    def setUnicode(value: String): Self = this.set("unicode", value.asInstanceOf[js.Any])
  }
}
