package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Frame extends js.Object {
  
  var targetName: js.UndefOr[String] = js.native
  
  var workflowGuid: js.UndefOr[String] = js.native
  
  var zoneId: js.UndefOr[String] = js.native
}
object Frame {
  
  @scala.inline
  def apply(): Frame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Frame]
  }
  
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
    
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
    def setTargetName(value: String): Self = this.set("targetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetName: Self = this.set("targetName", js.undefined)
    
    @scala.inline
    def setWorkflowGuid(value: String): Self = this.set("workflowGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkflowGuid: Self = this.set("workflowGuid", js.undefined)
    
    @scala.inline
    def setZoneId(value: String): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoneId: Self = this.set("zoneId", js.undefined)
  }
}
