package typings.instagramPrivateApi.musicSearchFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MusicSearchFeedResponseRootObject extends js.Object {
  
  var alacorn_session_id: String = js.native
  
  var items: js.Array[MusicSearchFeedResponseItemsItem] = js.native
  
  var page_info: MusicSearchFeedResponsePageInfo = js.native
  
  var status: String = js.native
}
object MusicSearchFeedResponseRootObject {
  
  @scala.inline
  def apply(
    alacorn_session_id: String,
    items: js.Array[MusicSearchFeedResponseItemsItem],
    page_info: MusicSearchFeedResponsePageInfo,
    status: String
  ): MusicSearchFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicSearchFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class MusicSearchFeedResponseRootObjectOps[Self <: MusicSearchFeedResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setAlacorn_session_id(value: String): Self = this.set("alacorn_session_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: MusicSearchFeedResponseItemsItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[MusicSearchFeedResponseItemsItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_info(value: MusicSearchFeedResponsePageInfo): Self = this.set("page_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
