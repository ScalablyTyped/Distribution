package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The current status of a Replica.
  */
@js.native
trait SchemaReplicaStatus extends js.Object {
  
  /**
    * [Output Only] Human-readable details about the current state of the
    * replica
    */
  var details: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The state of the Replica.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The template used to build the replica.
    */
  var templateVersion: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Link to the virtual machine that this Replica represents.
    */
  var vmLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The time that this Replica got to the RUNNING state, in RFC
    * 3339 format. If the start time is unknown, UNKNOWN is returned.
    */
  var vmStartTime: js.UndefOr[String] = js.native
}
object SchemaReplicaStatus {
  
  @scala.inline
  def apply(): SchemaReplicaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicaStatus]
  }
  
  @scala.inline
  implicit class SchemaReplicaStatusOps[Self <: SchemaReplicaStatus] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTemplateVersion(value: String): Self = this.set("templateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateVersion: Self = this.set("templateVersion", js.undefined)
    
    @scala.inline
    def setVmLink(value: String): Self = this.set("vmLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmLink: Self = this.set("vmLink", js.undefined)
    
    @scala.inline
    def setVmStartTime(value: String): Self = this.set("vmStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmStartTime: Self = this.set("vmStartTime", js.undefined)
  }
}
