package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for `ListServices` method.
  */
trait SchemaListServicesResponse extends StObject {
  
  /**
    * Token that can be passed to `ListServices` to resume a paginated query.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The returned services will only have the name field set.
    */
  var services: js.UndefOr[js.Array[SchemaManagedService]] = js.undefined
}
object SchemaListServicesResponse {
  
  @scala.inline
  def apply(): SchemaListServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServicesResponse]
  }
  
  @scala.inline
  implicit class SchemaListServicesResponseMutableBuilder[Self <: SchemaListServicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setServices(value: js.Array[SchemaManagedService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: SchemaManagedService*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
