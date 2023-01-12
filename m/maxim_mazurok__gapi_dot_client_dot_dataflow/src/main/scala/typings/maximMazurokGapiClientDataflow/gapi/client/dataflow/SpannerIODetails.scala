package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpannerIODetails extends StObject {
  
  /** DatabaseId accessed in the connection. */
  var databaseId: js.UndefOr[String] = js.undefined
  
  /** InstanceId accessed in the connection. */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /** ProjectId accessed in the connection. */
  var projectId: js.UndefOr[String] = js.undefined
}
object SpannerIODetails {
  
  inline def apply(): SpannerIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpannerIODetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpannerIODetails] (val x: Self) extends AnyVal {
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
