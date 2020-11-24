package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRegionInstanceGroupsListInstancesRequest extends js.Object {
  
  /**
    * Instances in which state should be returned. Valid options are:
    * &#39;ALL&#39;, &#39;RUNNING&#39;. By default, it lists all instances.
    */
  var instanceState: js.UndefOr[String] = js.native
  
  /**
    * Name of port user is interested in. It is optional. If it is set, only
    * information about this ports will be returned. If it is not set, all the
    * named ports will be returned. Always lists all instances.
    */
  var portName: js.UndefOr[String] = js.native
}
object SchemaRegionInstanceGroupsListInstancesRequest {
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupsListInstancesRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupsListInstancesRequestOps[Self <: SchemaRegionInstanceGroupsListInstancesRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceState(value: String): Self = this.set("instanceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceState: Self = this.set("instanceState", js.undefined)
    
    @scala.inline
    def setPortName(value: String): Self = this.set("portName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortName: Self = this.set("portName", js.undefined)
  }
}
