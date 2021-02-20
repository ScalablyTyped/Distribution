package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrafeasV1beta1IntotoArtifact extends StObject {
  
  var hashes: js.UndefOr[ArtifactHashes] = js.native
  
  var resourceUri: js.UndefOr[String] = js.native
}
object GrafeasV1beta1IntotoArtifact {
  
  @scala.inline
  def apply(): GrafeasV1beta1IntotoArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1beta1IntotoArtifact]
  }
  
  @scala.inline
  implicit class GrafeasV1beta1IntotoArtifactMutableBuilder[Self <: GrafeasV1beta1IntotoArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashes(value: ArtifactHashes): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    @scala.inline
    def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
  }
}
