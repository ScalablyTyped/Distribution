package typings.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoriesInsightsFeedResponseData extends js.Object {
  
  var user: StoriesInsightsFeedResponseUser = js.native
}
object StoriesInsightsFeedResponseData {
  
  @scala.inline
  def apply(user: StoriesInsightsFeedResponseUser): StoriesInsightsFeedResponseData = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseData]
  }
  
  @scala.inline
  implicit class StoriesInsightsFeedResponseDataOps[Self <: StoriesInsightsFeedResponseData] (val x: Self) extends AnyVal {
    
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
    def setUser(value: StoriesInsightsFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
