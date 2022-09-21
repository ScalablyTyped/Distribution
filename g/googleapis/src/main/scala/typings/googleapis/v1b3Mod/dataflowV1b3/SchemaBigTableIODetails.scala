package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBigTableIODetails extends StObject {
  
  /**
    * InstanceId accessed in the connection.
    */
  var instanceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ProjectId accessed in the connection.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * TableId accessed in the connection.
    */
  var tableId: js.UndefOr[String | Null] = js.undefined
}
object SchemaBigTableIODetails {
  
  inline def apply(): SchemaBigTableIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigTableIODetails]
  }
  
  extension [Self <: SchemaBigTableIODetails](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdNull: Self = StObject.set(x, "tableId", null)
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
