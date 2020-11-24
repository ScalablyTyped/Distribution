package typings.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvSearchResponseResultsItem extends js.Object {
  
  var channel: IgtvSearchResponseChannel = js.native
  
  var `type`: String = js.native
  
  var user: IgtvSearchResponseUser = js.native
}
object IgtvSearchResponseResultsItem {
  
  @scala.inline
  def apply(channel: IgtvSearchResponseChannel, `type`: String, user: IgtvSearchResponseUser): IgtvSearchResponseResultsItem = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvSearchResponseResultsItem]
  }
  
  @scala.inline
  implicit class IgtvSearchResponseResultsItemOps[Self <: IgtvSearchResponseResultsItem] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: IgtvSearchResponseChannel): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: IgtvSearchResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
