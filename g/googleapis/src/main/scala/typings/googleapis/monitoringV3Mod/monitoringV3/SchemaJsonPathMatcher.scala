package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJsonPathMatcher extends StObject {
  
  /**
    * The type of JSONPath match that will be applied to the JSON output (ContentMatcher.content)
    */
  var jsonMatcher: js.UndefOr[String | Null] = js.undefined
  
  /**
    * JSONPath within the response output pointing to the expected ContentMatcher::content to match against.
    */
  var jsonPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaJsonPathMatcher {
  
  inline def apply(): SchemaJsonPathMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJsonPathMatcher]
  }
  
  extension [Self <: SchemaJsonPathMatcher](x: Self) {
    
    inline def setJsonMatcher(value: String): Self = StObject.set(x, "jsonMatcher", value.asInstanceOf[js.Any])
    
    inline def setJsonMatcherNull: Self = StObject.set(x, "jsonMatcher", null)
    
    inline def setJsonMatcherUndefined: Self = StObject.set(x, "jsonMatcher", js.undefined)
    
    inline def setJsonPath(value: String): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
    
    inline def setJsonPathNull: Self = StObject.set(x, "jsonPath", null)
    
    inline def setJsonPathUndefined: Self = StObject.set(x, "jsonPath", js.undefined)
  }
}
