package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mask a string by replacing its characters with a fixed character.
  */
@js.native
trait SchemaCharacterMaskConfig extends StObject {
  
  /**
    * Character to mask the sensitive values. If not supplied, defaults to
    * &quot;*&quot;.
    */
  var maskingCharacter: js.UndefOr[String] = js.native
}
object SchemaCharacterMaskConfig {
  
  @scala.inline
  def apply(): SchemaCharacterMaskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCharacterMaskConfig]
  }
  
  @scala.inline
  implicit class SchemaCharacterMaskConfigMutableBuilder[Self <: SchemaCharacterMaskConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaskingCharacter(value: String): Self = StObject.set(x, "maskingCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskingCharacterUndefined: Self = StObject.set(x, "maskingCharacter", js.undefined)
  }
}
