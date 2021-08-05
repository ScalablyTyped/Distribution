package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to perform string matching. It allows substring and regular
  * expressions, together with their negations.
  */
trait SchemaContentMatcher extends StObject {
  
  /**
    * String or regex content to match (max 1024 bytes)
    */
  var content: js.UndefOr[String] = js.undefined
}
object SchemaContentMatcher {
  
  inline def apply(): SchemaContentMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentMatcher]
  }
  
  extension [Self <: SchemaContentMatcher](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
