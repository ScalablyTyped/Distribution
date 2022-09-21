package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentMatcher extends StObject {
  
  /**
    * String, regex or JSON content to match. Maximum 1024 bytes. An empty content string indicates no content matching is to be performed.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Matcher information for MATCHES_JSON_PATH and NOT_MATCHES_JSON_PATH
    */
  var jsonPathMatcher: js.UndefOr[SchemaJsonPathMatcher] = js.undefined
  
  /**
    * The type of content matcher that will be applied to the server output, compared to the content string when the check is run.
    */
  var matcher: js.UndefOr[String | Null] = js.undefined
}
object SchemaContentMatcher {
  
  inline def apply(): SchemaContentMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentMatcher]
  }
  
  extension [Self <: SchemaContentMatcher](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setJsonPathMatcher(value: SchemaJsonPathMatcher): Self = StObject.set(x, "jsonPathMatcher", value.asInstanceOf[js.Any])
    
    inline def setJsonPathMatcherUndefined: Self = StObject.set(x, "jsonPathMatcher", js.undefined)
    
    inline def setMatcher(value: String): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
    inline def setMatcherNull: Self = StObject.set(x, "matcher", null)
    
    inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
  }
}
