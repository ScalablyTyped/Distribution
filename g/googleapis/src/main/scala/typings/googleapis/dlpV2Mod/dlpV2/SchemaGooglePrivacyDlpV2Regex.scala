package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Regex extends StObject {
  
  /**
    * The index of the submatch to extract as findings. When not specified, the entire match is returned. No more than 3 may be included.
    */
  var groupIndexes: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Pattern defining the regular expression. Its syntax (https://github.com/google/re2/wiki/Syntax) can be found under the google/re2 repository on GitHub.
    */
  var pattern: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2Regex {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Regex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Regex]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Regex](x: Self) {
    
    inline def setGroupIndexes(value: js.Array[Double]): Self = StObject.set(x, "groupIndexes", value.asInstanceOf[js.Any])
    
    inline def setGroupIndexesNull: Self = StObject.set(x, "groupIndexes", null)
    
    inline def setGroupIndexesUndefined: Self = StObject.set(x, "groupIndexes", js.undefined)
    
    inline def setGroupIndexesVarargs(value: Double*): Self = StObject.set(x, "groupIndexes", js.Array(value*))
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternNull: Self = StObject.set(x, "pattern", null)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
  }
}
