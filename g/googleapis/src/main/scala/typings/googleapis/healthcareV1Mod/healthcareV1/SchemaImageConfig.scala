package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImageConfig extends StObject {
  
  /**
    * Determines how to redact text from image.
    */
  var textRedactionMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaImageConfig {
  
  inline def apply(): SchemaImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageConfig]
  }
  
  extension [Self <: SchemaImageConfig](x: Self) {
    
    inline def setTextRedactionMode(value: String): Self = StObject.set(x, "textRedactionMode", value.asInstanceOf[js.Any])
    
    inline def setTextRedactionModeNull: Self = StObject.set(x, "textRedactionMode", null)
    
    inline def setTextRedactionModeUndefined: Self = StObject.set(x, "textRedactionMode", js.undefined)
  }
}
