package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response containing a partial list of manifests and a page token used to
  * build the next request if the request has been truncated.
  */
@js.native
trait SchemaManifestsListResponse extends StObject {
  
  /**
    * Output only. Manifests contained in this list response.
    */
  var manifests: js.UndefOr[js.Array[SchemaManifest]] = js.native
  
  /**
    * Output only. A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaManifestsListResponse {
  
  @scala.inline
  def apply(): SchemaManifestsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManifestsListResponse]
  }
  
  @scala.inline
  implicit class SchemaManifestsListResponseMutableBuilder[Self <: SchemaManifestsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManifests(value: js.Array[SchemaManifest]): Self = StObject.set(x, "manifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestsUndefined: Self = StObject.set(x, "manifests", js.undefined)
    
    @scala.inline
    def setManifestsVarargs(value: SchemaManifest*): Self = StObject.set(x, "manifests", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
