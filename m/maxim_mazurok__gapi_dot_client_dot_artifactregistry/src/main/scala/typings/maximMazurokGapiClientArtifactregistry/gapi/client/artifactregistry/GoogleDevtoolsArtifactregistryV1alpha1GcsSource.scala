package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsArtifactregistryV1alpha1GcsSource extends js.Object {
  
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
  implicit class GoogleDevtoolsArtifactregistryV1alpha1GcsSourceOps[Self <: GoogleDevtoolsArtifactregistryV1alpha1GcsSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrisVarargs(value: String*): Self = this.set("uris", js.Array(value :_*))
    
    @scala.inline
    def setUris(value: js.Array[String]): Self = this.set("uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUris: Self = this.set("uris", js.undefined)
    
    @scala.inline
    def setUseWildcards(value: Boolean): Self = this.set("useWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseWildcards: Self = this.set("useWildcards", js.undefined)
  }
}
