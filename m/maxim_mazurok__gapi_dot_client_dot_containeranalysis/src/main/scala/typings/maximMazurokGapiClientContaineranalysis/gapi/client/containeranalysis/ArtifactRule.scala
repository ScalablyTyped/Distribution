package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactRule extends StObject {
  
  var artifactRule: js.UndefOr[js.Array[String]] = js.undefined
}
object ArtifactRule {
  
  @scala.inline
  def apply(): ArtifactRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactRule]
  }
  
  @scala.inline
  implicit class ArtifactRuleMutableBuilder[Self <: ArtifactRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactRule(value: js.Array[String]): Self = StObject.set(x, "artifactRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactRuleUndefined: Self = StObject.set(x, "artifactRule", js.undefined)
    
    @scala.inline
    def setArtifactRuleVarargs(value: String*): Self = StObject.set(x, "artifactRule", js.Array(value :_*))
  }
}
