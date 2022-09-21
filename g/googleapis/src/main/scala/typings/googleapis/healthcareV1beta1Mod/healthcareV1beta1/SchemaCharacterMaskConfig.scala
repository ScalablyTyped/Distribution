package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCharacterMaskConfig extends StObject {
  
  /**
    * Character to mask the sensitive values. If not supplied, defaults to "*".
    */
  var maskingCharacter: js.UndefOr[String | Null] = js.undefined
}
object SchemaCharacterMaskConfig {
  
  inline def apply(): SchemaCharacterMaskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCharacterMaskConfig]
  }
  
  extension [Self <: SchemaCharacterMaskConfig](x: Self) {
    
    inline def setMaskingCharacter(value: String): Self = StObject.set(x, "maskingCharacter", value.asInstanceOf[js.Any])
    
    inline def setMaskingCharacterNull: Self = StObject.set(x, "maskingCharacter", null)
    
    inline def setMaskingCharacterUndefined: Self = StObject.set(x, "maskingCharacter", js.undefined)
  }
}
