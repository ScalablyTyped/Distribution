package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDetectedBreak extends StObject {
  
  /**
    * True if break prepends the element.
    */
  var isPrefix: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Detected break type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaDetectedBreak {
  
  inline def apply(): SchemaDetectedBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectedBreak]
  }
  
  extension [Self <: SchemaDetectedBreak](x: Self) {
    
    inline def setIsPrefix(value: Boolean): Self = StObject.set(x, "isPrefix", value.asInstanceOf[js.Any])
    
    inline def setIsPrefixNull: Self = StObject.set(x, "isPrefix", null)
    
    inline def setIsPrefixUndefined: Self = StObject.set(x, "isPrefix", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
