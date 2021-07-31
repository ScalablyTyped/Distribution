package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frame extends StObject {
  
  var targetName: js.UndefOr[String] = js.undefined
  
  var workflowGuid: js.UndefOr[String] = js.undefined
  
  var zoneId: js.UndefOr[String] = js.undefined
}
object Frame {
  
  @scala.inline
  def apply(): Frame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Frame]
  }
  
  @scala.inline
  implicit class FrameMutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNameUndefined: Self = StObject.set(x, "targetName", js.undefined)
    
    @scala.inline
    def setWorkflowGuid(value: String): Self = StObject.set(x, "workflowGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowGuidUndefined: Self = StObject.set(x, "workflowGuid", js.undefined)
    
    @scala.inline
    def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
  }
}
