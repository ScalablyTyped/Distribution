package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaArtifactRule extends StObject {
  
  var artifactRule: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaArtifactRule {
  
  inline def apply(): SchemaArtifactRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifactRule]
  }
  
  extension [Self <: SchemaArtifactRule](x: Self) {
    
    inline def setArtifactRule(value: js.Array[String]): Self = StObject.set(x, "artifactRule", value.asInstanceOf[js.Any])
    
    inline def setArtifactRuleNull: Self = StObject.set(x, "artifactRule", null)
    
    inline def setArtifactRuleUndefined: Self = StObject.set(x, "artifactRule", js.undefined)
    
    inline def setArtifactRuleVarargs(value: String*): Self = StObject.set(x, "artifactRule", js.Array(value*))
  }
}
