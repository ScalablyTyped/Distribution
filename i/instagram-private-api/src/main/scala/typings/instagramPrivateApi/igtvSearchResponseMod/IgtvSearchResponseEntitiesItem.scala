package typings.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvSearchResponseEntitiesItem extends js.Object {
  
  var hashtag: js.UndefOr[IgtvSearchResponseHashtag] = js.native
  
  var user: js.UndefOr[IgtvSearchResponseUser] = js.native
}
object IgtvSearchResponseEntitiesItem {
  
  @scala.inline
  def apply(): IgtvSearchResponseEntitiesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgtvSearchResponseEntitiesItem]
  }
  
  @scala.inline
  implicit class IgtvSearchResponseEntitiesItemOps[Self <: IgtvSearchResponseEntitiesItem] (val x: Self) extends AnyVal {
    
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
    def setHashtag(value: IgtvSearchResponseHashtag): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashtag: Self = this.set("hashtag", js.undefined)
    
    @scala.inline
    def setUser(value: IgtvSearchResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
