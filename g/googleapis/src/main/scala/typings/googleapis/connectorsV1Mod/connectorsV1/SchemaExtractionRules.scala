package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExtractionRules extends StObject {
  
  /**
    * Collection of Extraction Rule.
    */
  var extractionRule: js.UndefOr[js.Array[SchemaExtractionRule]] = js.undefined
}
object SchemaExtractionRules {
  
  inline def apply(): SchemaExtractionRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtractionRules]
  }
  
  extension [Self <: SchemaExtractionRules](x: Self) {
    
    inline def setExtractionRule(value: js.Array[SchemaExtractionRule]): Self = StObject.set(x, "extractionRule", value.asInstanceOf[js.Any])
    
    inline def setExtractionRuleUndefined: Self = StObject.set(x, "extractionRule", js.undefined)
    
    inline def setExtractionRuleVarargs(value: SchemaExtractionRule*): Self = StObject.set(x, "extractionRule", js.Array(value*))
  }
}
