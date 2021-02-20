package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPackagesResponse extends StObject {
  
  /** The token to retrieve the next page of packages, or empty if there are no more packages to return. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The packages returned. */
  var packages: js.UndefOr[js.Array[Package]] = js.native
}
object ListPackagesResponse {
  
  @scala.inline
  def apply(): ListPackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagesResponse]
  }
  
  @scala.inline
  implicit class ListPackagesResponseMutableBuilder[Self <: ListPackagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPackages(value: js.Array[Package]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    @scala.inline
    def setPackagesVarargs(value: Package*): Self = StObject.set(x, "packages", js.Array(value :_*))
  }
}
