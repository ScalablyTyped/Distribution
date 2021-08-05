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
  
  inline def apply(): Frame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Frame]
  }
  
  extension [Self <: Frame](x: Self) {
    
    inline def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
    
    inline def setTargetNameUndefined: Self = StObject.set(x, "targetName", js.undefined)
    
    inline def setWorkflowGuid(value: String): Self = StObject.set(x, "workflowGuid", value.asInstanceOf[js.Any])
    
    inline def setWorkflowGuidUndefined: Self = StObject.set(x, "workflowGuid", js.undefined)
    
    inline def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    
    inline def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
  }
}
