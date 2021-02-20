package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response that returns all Type Providers supported by Deployment Manager
  */
@js.native
trait SchemaTypeProvidersListResponse extends StObject {
  
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Output only. A list of resource type providers supported by Deployment
    * Manager.
    */
  var typeProviders: js.UndefOr[js.Array[SchemaTypeProvider]] = js.native
}
object SchemaTypeProvidersListResponse {
  
  @scala.inline
  def apply(): SchemaTypeProvidersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeProvidersListResponse]
  }
  
  @scala.inline
  implicit class SchemaTypeProvidersListResponseMutableBuilder[Self <: SchemaTypeProvidersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTypeProviders(value: js.Array[SchemaTypeProvider]): Self = StObject.set(x, "typeProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeProvidersUndefined: Self = StObject.set(x, "typeProviders", js.undefined)
    
    @scala.inline
    def setTypeProvidersVarargs(value: SchemaTypeProvider*): Self = StObject.set(x, "typeProviders", js.Array(value :_*))
  }
}
