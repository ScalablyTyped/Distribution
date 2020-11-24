package typings.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoriesInsightsFeedResponseUser extends js.Object {
  
  var business_manager: StoriesInsightsFeedResponseBusinessManager = js.native
  
  var id: String = js.native
}
object StoriesInsightsFeedResponseUser {
  
  @scala.inline
  def apply(business_manager: StoriesInsightsFeedResponseBusinessManager, id: String): StoriesInsightsFeedResponseUser = {
    val __obj = js.Dynamic.literal(business_manager = business_manager.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseUser]
  }
  
  @scala.inline
  implicit class StoriesInsightsFeedResponseUserOps[Self <: StoriesInsightsFeedResponseUser] (val x: Self) extends AnyVal {
    
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
    def setBusiness_manager(value: StoriesInsightsFeedResponseBusinessManager): Self = this.set("business_manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
