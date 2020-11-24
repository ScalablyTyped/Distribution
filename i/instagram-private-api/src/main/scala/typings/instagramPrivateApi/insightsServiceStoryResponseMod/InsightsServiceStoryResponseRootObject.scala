package typings.instagramPrivateApi.insightsServiceStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceStoryResponseRootObject extends js.Object {
  
  var data: InsightsServiceStoryResponseData = js.native
}
object InsightsServiceStoryResponseRootObject {
  
  @scala.inline
  def apply(data: InsightsServiceStoryResponseData): InsightsServiceStoryResponseRootObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceStoryResponseRootObject]
  }
  
  @scala.inline
  implicit class InsightsServiceStoryResponseRootObjectOps[Self <: InsightsServiceStoryResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setData(value: InsightsServiceStoryResponseData): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
