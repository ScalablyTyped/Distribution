package typings.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedResponsePaginationInfo extends js.Object {
  
  var group_id: Null = js.native
  
  var source: Null = js.native
}
object TimelineFeedResponsePaginationInfo {
  
  @scala.inline
  def apply(group_id: Null, source: Null): TimelineFeedResponsePaginationInfo = {
    val __obj = js.Dynamic.literal(group_id = group_id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponsePaginationInfo]
  }
  
  @scala.inline
  implicit class TimelineFeedResponsePaginationInfoOps[Self <: TimelineFeedResponsePaginationInfo] (val x: Self) extends AnyVal {
    
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
    def setGroup_id(value: Null): Self = this.set("group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Null): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
