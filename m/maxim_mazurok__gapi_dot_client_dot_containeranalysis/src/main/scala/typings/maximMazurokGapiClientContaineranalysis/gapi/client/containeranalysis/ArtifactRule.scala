package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactRule extends StObject {
  
  var artifactRule: js.UndefOr[js.Array[String]] = js.undefined
}
object ArtifactRule {
  
  inline def apply(): ArtifactRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactRule]
  }
  
  extension [Self <: ArtifactRule](x: Self) {
    
    inline def setArtifactRule(value: js.Array[String]): Self = StObject.set(x, "artifactRule", value.asInstanceOf[js.Any])
    
    inline def setArtifactRuleUndefined: Self = StObject.set(x, "artifactRule", js.undefined)
    
    inline def setArtifactRuleVarargs(value: String*): Self = StObject.set(x, "artifactRule", js.Array(value :_*))
  }
}
