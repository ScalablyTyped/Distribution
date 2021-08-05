package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detected start or end of a structural component.
  */
trait SchemaDetectedBreak extends StObject {
  
  /**
    * True if break prepends the element.
    */
  var isPrefix: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Detected break type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaDetectedBreak {
  
  inline def apply(): SchemaDetectedBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectedBreak]
  }
  
  extension [Self <: SchemaDetectedBreak](x: Self) {
    
    inline def setIsPrefix(value: Boolean): Self = StObject.set(x, "isPrefix", value.asInstanceOf[js.Any])
    
    inline def setIsPrefixUndefined: Self = StObject.set(x, "isPrefix", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
