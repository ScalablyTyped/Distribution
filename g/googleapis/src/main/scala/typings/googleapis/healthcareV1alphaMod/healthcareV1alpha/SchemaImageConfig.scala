package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies how de-identification of image pixel should be handled.
  */
trait SchemaImageConfig extends StObject {
  
  /**
    * If true, all text found in the image is redacted.
    */
  var redactAllText: js.UndefOr[Boolean] = js.undefined
}
object SchemaImageConfig {
  
  inline def apply(): SchemaImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageConfig]
  }
  
  extension [Self <: SchemaImageConfig](x: Self) {
    
    inline def setRedactAllText(value: Boolean): Self = StObject.set(x, "redactAllText", value.asInstanceOf[js.Any])
    
    inline def setRedactAllTextUndefined: Self = StObject.set(x, "redactAllText", js.undefined)
  }
}
