package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExtractionRule extends StObject {
  
  /**
    * Regex used to extract backend details from source. If empty, whole source value will be used.
    */
  var extractionRegex: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Source on which the rule is applied.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
}
object SchemaExtractionRule {
  
  inline def apply(): SchemaExtractionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtractionRule]
  }
  
  extension [Self <: SchemaExtractionRule](x: Self) {
    
    inline def setExtractionRegex(value: String): Self = StObject.set(x, "extractionRegex", value.asInstanceOf[js.Any])
    
    inline def setExtractionRegexNull: Self = StObject.set(x, "extractionRegex", null)
    
    inline def setExtractionRegexUndefined: Self = StObject.set(x, "extractionRegex", js.undefined)
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
