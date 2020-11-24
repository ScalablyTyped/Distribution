package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseRootObject extends js.Object {
  
  var data: InsightsServicePostResponseData = js.native
}
object InsightsServicePostResponseRootObject {
  
  @scala.inline
  def apply(data: InsightsServicePostResponseData): InsightsServicePostResponseRootObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseRootObject]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseRootObjectOps[Self <: InsightsServicePostResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setData(value: InsightsServicePostResponseData): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
