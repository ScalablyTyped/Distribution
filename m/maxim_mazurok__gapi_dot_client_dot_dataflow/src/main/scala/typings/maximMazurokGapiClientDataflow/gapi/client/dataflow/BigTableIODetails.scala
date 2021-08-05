package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigTableIODetails extends StObject {
  
  /** InstanceId accessed in the connection. */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /** ProjectId accessed in the connection. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** TableId accessed in the connection. */
  var tableId: js.UndefOr[String] = js.undefined
}
object BigTableIODetails {
  
  inline def apply(): BigTableIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigTableIODetails]
  }
  
  extension [Self <: BigTableIODetails](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
