package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypesListResponse extends StObject {
  
  /** A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Output only. A list of resource types supported by Deployment Manager. */
  var types: js.UndefOr[js.Array[Type]] = js.native
}
object TypesListResponse {
  
  @scala.inline
  def apply(): TypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypesListResponse]
  }
  
  @scala.inline
  implicit class TypesListResponseMutableBuilder[Self <: TypesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[Type]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: Type*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
