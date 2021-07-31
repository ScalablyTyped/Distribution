package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The current status of a Replica.
  */
trait SchemaReplicaStatus extends StObject {
  
  /**
    * [Output Only] Human-readable details about the current state of the
    * replica
    */
  var details: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The state of the Replica.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The template used to build the replica.
    */
  var templateVersion: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Link to the virtual machine that this Replica represents.
    */
  var vmLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The time that this Replica got to the RUNNING state, in RFC
    * 3339 format. If the start time is unknown, UNKNOWN is returned.
    */
  var vmStartTime: js.UndefOr[String] = js.undefined
}
object SchemaReplicaStatus {
  
  @scala.inline
  def apply(): SchemaReplicaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicaStatus]
  }
  
  @scala.inline
  implicit class SchemaReplicaStatusMutableBuilder[Self <: SchemaReplicaStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTemplateVersion(value: String): Self = StObject.set(x, "templateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateVersionUndefined: Self = StObject.set(x, "templateVersion", js.undefined)
    
    @scala.inline
    def setVmLink(value: String): Self = StObject.set(x, "vmLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmLinkUndefined: Self = StObject.set(x, "vmLink", js.undefined)
    
    @scala.inline
    def setVmStartTime(value: String): Self = StObject.set(x, "vmStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmStartTimeUndefined: Self = StObject.set(x, "vmStartTime", js.undefined)
  }
}
