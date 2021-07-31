package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTypeProvidersListTypesResponse extends StObject {
  
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A list of resource type info.
    */
  var types: js.UndefOr[js.Array[SchemaTypeInfo]] = js.undefined
}
object SchemaTypeProvidersListTypesResponse {
  
  @scala.inline
  def apply(): SchemaTypeProvidersListTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeProvidersListTypesResponse]
  }
  
  @scala.inline
  implicit class SchemaTypeProvidersListTypesResponseMutableBuilder[Self <: SchemaTypeProvidersListTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[SchemaTypeInfo]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: SchemaTypeInfo*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
