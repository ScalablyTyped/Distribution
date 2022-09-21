package typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManifestsListResponse extends StObject {
  
  /**
    * Output only. Manifests contained in this list response.
    */
  var manifests: js.UndefOr[js.Array[SchemaManifest]] = js.undefined
  
  /**
    * Output only. A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaManifestsListResponse {
  
  inline def apply(): SchemaManifestsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManifestsListResponse]
  }
  
  extension [Self <: SchemaManifestsListResponse](x: Self) {
    
    inline def setManifests(value: js.Array[SchemaManifest]): Self = StObject.set(x, "manifests", value.asInstanceOf[js.Any])
    
    inline def setManifestsUndefined: Self = StObject.set(x, "manifests", js.undefined)
    
    inline def setManifestsVarargs(value: SchemaManifest*): Self = StObject.set(x, "manifests", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
