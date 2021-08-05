package typings.ionicCliFramework.definitionsMod

import typings.ionicCliFramework.ionicCliFrameworkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationError extends StObject {
  
  var key: String
  
  var message: String
  
  def validator(): `true` | String
  def validator(input: String): `true` | String
  def validator(input: String, key: String): `true` | String
  def validator(input: Unit, key: String): `true` | String
  @JSName("validator")
  var validator_Original: Validator
}
object ValidationError {
  
  inline def apply(
    key: String,
    message: String,
    validator: (/* input */ js.UndefOr[String], /* key */ js.UndefOr[String]) => `true` | String
  ): ValidationError = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], validator = js.Any.fromFunction2(validator))
    __obj.asInstanceOf[ValidationError]
  }
  
  extension [Self <: ValidationError](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setValidator(value: (/* input */ js.UndefOr[String], /* key */ js.UndefOr[String]) => `true` | String): Self = StObject.set(x, "validator", js.Any.fromFunction2(value))
  }
}
