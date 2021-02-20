package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsArtifactregistryV1alpha1GcsSource extends StObject {
  
  /** Cloud Storage paths URI (e.g., gs://my_bucket//my_object). */
  var uris: js.UndefOr[js.Array[String]] = js.native
  
  /** Supports URI wildcards for matching multiple objects from a single URI. */
  var useWildcards: js.UndefOr[Boolean] = js.native
}
object GoogleDevtoolsArtifactregistryV1alpha1GcsSource {
  
  @scala.inline
  def apply(): GoogleDevtoolsArtifactregistryV1alpha1GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsArtifactregistryV1alpha1GcsSource]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsArtifactregistryV1alpha1GcsSourceMutableBuilder[Self <: GoogleDevtoolsArtifactregistryV1alpha1GcsSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    @scala.inline
    def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value :_*))
    
    @scala.inline
    def setUseWildcards(value: Boolean): Self = StObject.set(x, "useWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseWildcardsUndefined: Self = StObject.set(x, "useWildcards", js.undefined)
  }
}
