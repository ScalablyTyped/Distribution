package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegexMatcher extends StObject {
  
  /**
    * Google's RE2 regex engine.
    */
  var googleRe2: js.UndefOr[SchemaGoogleRE2] = js.undefined
  
  /**
    * The regex match string. The string must be supported by the configured engine.
    */
  var regex: js.UndefOr[String | Null] = js.undefined
}
object SchemaRegexMatcher {
  
  inline def apply(): SchemaRegexMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegexMatcher]
  }
  
  extension [Self <: SchemaRegexMatcher](x: Self) {
    
    inline def setGoogleRe2(value: SchemaGoogleRE2): Self = StObject.set(x, "googleRe2", value.asInstanceOf[js.Any])
    
    inline def setGoogleRe2Undefined: Self = StObject.set(x, "googleRe2", js.undefined)
    
    inline def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexNull: Self = StObject.set(x, "regex", null)
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
