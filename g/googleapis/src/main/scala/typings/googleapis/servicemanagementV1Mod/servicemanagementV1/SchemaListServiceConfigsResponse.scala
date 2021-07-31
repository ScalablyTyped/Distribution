package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for ListServiceConfigs method.
  */
trait SchemaListServiceConfigsResponse extends StObject {
  
  /**
    * The token of the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of service configuration resources.
    */
  var serviceConfigs: js.UndefOr[js.Array[SchemaService]] = js.undefined
}
object SchemaListServiceConfigsResponse {
  
  @scala.inline
  def apply(): SchemaListServiceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceConfigsResponse]
  }
  
  @scala.inline
  implicit class SchemaListServiceConfigsResponseMutableBuilder[Self <: SchemaListServiceConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setServiceConfigs(value: js.Array[SchemaService]): Self = StObject.set(x, "serviceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceConfigsUndefined: Self = StObject.set(x, "serviceConfigs", js.undefined)
    
    @scala.inline
    def setServiceConfigsVarargs(value: SchemaService*): Self = StObject.set(x, "serviceConfigs", js.Array(value :_*))
  }
}
