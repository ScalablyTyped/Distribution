package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpannerIODetails extends StObject {
  
  /**
    * DatabaseId accessed in the connection.
    */
  var databaseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * InstanceId accessed in the connection.
    */
  var instanceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ProjectId accessed in the connection.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSpannerIODetails {
  
  inline def apply(): SchemaSpannerIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpannerIODetails]
  }
  
  extension [Self <: SchemaSpannerIODetails](x: Self) {
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdNull: Self = StObject.set(x, "databaseId", null)
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
