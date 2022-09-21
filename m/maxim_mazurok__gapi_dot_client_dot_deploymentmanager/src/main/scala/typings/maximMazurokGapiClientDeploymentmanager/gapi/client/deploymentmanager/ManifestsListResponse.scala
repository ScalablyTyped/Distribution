package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestsListResponse extends StObject {
  
  /** Output only. Manifests contained in this list response. */
  var manifests: js.UndefOr[js.Array[Manifest]] = js.undefined
  
  /** Output only. A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ManifestsListResponse {
  
  inline def apply(): ManifestsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestsListResponse]
  }
  
  extension [Self <: ManifestsListResponse](x: Self) {
    
    inline def setManifests(value: js.Array[Manifest]): Self = StObject.set(x, "manifests", value.asInstanceOf[js.Any])
    
    inline def setManifestsUndefined: Self = StObject.set(x, "manifests", js.undefined)
    
    inline def setManifestsVarargs(value: Manifest*): Self = StObject.set(x, "manifests", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
