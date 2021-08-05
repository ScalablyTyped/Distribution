package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mask a string by replacing its characters with a fixed character.
  */
trait SchemaCharacterMaskConfig extends StObject {
  
  /**
    * Character to mask the sensitive values. If not supplied, defaults to
    * &quot;*&quot;.
    */
  var maskingCharacter: js.UndefOr[String] = js.undefined
}
object SchemaCharacterMaskConfig {
  
  inline def apply(): SchemaCharacterMaskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCharacterMaskConfig]
  }
  
  extension [Self <: SchemaCharacterMaskConfig](x: Self) {
    
    inline def setMaskingCharacter(value: String): Self = StObject.set(x, "maskingCharacter", value.asInstanceOf[js.Any])
    
    inline def setMaskingCharacterUndefined: Self = StObject.set(x, "maskingCharacter", js.undefined)
  }
}
