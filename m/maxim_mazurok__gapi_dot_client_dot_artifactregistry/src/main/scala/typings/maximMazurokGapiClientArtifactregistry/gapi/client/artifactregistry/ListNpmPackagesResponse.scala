package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNpmPackagesResponse extends StObject {
  
  /** The token to retrieve the next page of artifacts, or empty if there are no more artifacts to return. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The npm packages returned. */
  var npmPackages: js.UndefOr[js.Array[NpmPackage]] = js.undefined
}
object ListNpmPackagesResponse {
  
  inline def apply(): ListNpmPackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNpmPackagesResponse]
  }
  
  extension [Self <: ListNpmPackagesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNpmPackages(value: js.Array[NpmPackage]): Self = StObject.set(x, "npmPackages", value.asInstanceOf[js.Any])
    
    inline def setNpmPackagesUndefined: Self = StObject.set(x, "npmPackages", js.undefined)
    
    inline def setNpmPackagesVarargs(value: NpmPackage*): Self = StObject.set(x, "npmPackages", js.Array(value*))
  }
}
