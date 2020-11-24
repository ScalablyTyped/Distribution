package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrafeasV1beta1IntotoArtifact extends js.Object {
  
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
  implicit class GrafeasV1beta1IntotoArtifactOps[Self <: GrafeasV1beta1IntotoArtifact] (val x: Self) extends AnyVal {
    
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
    def setHashes(value: ArtifactHashes): Self = this.set("hashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashes: Self = this.set("hashes", js.undefined)
    
    @scala.inline
    def setResourceUri(value: String): Self = this.set("resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUri: Self = this.set("resourceUri", js.undefined)
  }
}
