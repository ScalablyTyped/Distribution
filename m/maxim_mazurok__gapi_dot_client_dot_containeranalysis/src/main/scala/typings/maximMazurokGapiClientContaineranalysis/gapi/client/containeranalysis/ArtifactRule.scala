package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactRule extends js.Object {
  
  var artifactRule: js.UndefOr[js.Array[String]] = js.native
}
object ArtifactRule {
  
  @scala.inline
  def apply(): ArtifactRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactRule]
  }
  
  @scala.inline
  implicit class ArtifactRuleOps[Self <: ArtifactRule] (val x: Self) extends AnyVal {
    
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
    def setArtifactRuleVarargs(value: String*): Self = this.set("artifactRule", js.Array(value :_*))
    
    @scala.inline
    def setArtifactRule(value: js.Array[String]): Self = this.set("artifactRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifactRule: Self = this.set("artifactRule", js.undefined)
  }
}
