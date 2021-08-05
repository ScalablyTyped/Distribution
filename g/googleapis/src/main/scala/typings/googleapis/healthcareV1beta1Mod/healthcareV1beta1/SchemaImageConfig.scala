package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies how de-identification of image pixel should be handled.
  */
trait SchemaImageConfig extends StObject {
  
  /**
    * Determines how to redact text from image.
    */
  var textRedactionMode: js.UndefOr[String] = js.undefined
}
object SchemaImageConfig {
  
  inline def apply(): SchemaImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageConfig]
  }
  
  extension [Self <: SchemaImageConfig](x: Self) {
    
    inline def setTextRedactionMode(value: String): Self = StObject.set(x, "textRedactionMode", value.asInstanceOf[js.Any])
    
    inline def setTextRedactionModeUndefined: Self = StObject.set(x, "textRedactionMode", js.undefined)
  }
}
