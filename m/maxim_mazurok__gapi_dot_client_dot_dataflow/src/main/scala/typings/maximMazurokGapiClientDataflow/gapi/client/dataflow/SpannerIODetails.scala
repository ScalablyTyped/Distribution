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
  
  @scala.inline
  def apply(): SpannerIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpannerIODetails]
  }
  
  @scala.inline
  implicit class SpannerIODetailsMutableBuilder[Self <: SpannerIODetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
