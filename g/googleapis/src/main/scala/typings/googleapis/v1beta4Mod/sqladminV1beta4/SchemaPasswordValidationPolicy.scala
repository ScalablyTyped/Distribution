package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPasswordValidationPolicy extends StObject {
  
  /**
    * The complexity of the password.
    */
  var complexity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Disallow username as a part of the password.
    */
  var disallowUsernameSubstring: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the password policy is enabled or not.
    */
  var enablePasswordPolicy: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Minimum number of characters allowed.
    */
  var minLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Minimum interval after which the password can be changed. This flag is only supported for PostgresSQL.
    */
  var passwordChangeInterval: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of previous passwords that cannot be reused.
    */
  var reuseInterval: js.UndefOr[Double | Null] = js.undefined
}
object SchemaPasswordValidationPolicy {
  
  inline def apply(): SchemaPasswordValidationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPasswordValidationPolicy]
  }
  
  extension [Self <: SchemaPasswordValidationPolicy](x: Self) {
    
    inline def setComplexity(value: String): Self = StObject.set(x, "complexity", value.asInstanceOf[js.Any])
    
    inline def setComplexityNull: Self = StObject.set(x, "complexity", null)
    
    inline def setComplexityUndefined: Self = StObject.set(x, "complexity", js.undefined)
    
    inline def setDisallowUsernameSubstring(value: Boolean): Self = StObject.set(x, "disallowUsernameSubstring", value.asInstanceOf[js.Any])
    
    inline def setDisallowUsernameSubstringNull: Self = StObject.set(x, "disallowUsernameSubstring", null)
    
    inline def setDisallowUsernameSubstringUndefined: Self = StObject.set(x, "disallowUsernameSubstring", js.undefined)
    
    inline def setEnablePasswordPolicy(value: Boolean): Self = StObject.set(x, "enablePasswordPolicy", value.asInstanceOf[js.Any])
    
    inline def setEnablePasswordPolicyNull: Self = StObject.set(x, "enablePasswordPolicy", null)
    
    inline def setEnablePasswordPolicyUndefined: Self = StObject.set(x, "enablePasswordPolicy", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthNull: Self = StObject.set(x, "minLength", null)
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setPasswordChangeInterval(value: String): Self = StObject.set(x, "passwordChangeInterval", value.asInstanceOf[js.Any])
    
    inline def setPasswordChangeIntervalNull: Self = StObject.set(x, "passwordChangeInterval", null)
    
    inline def setPasswordChangeIntervalUndefined: Self = StObject.set(x, "passwordChangeInterval", js.undefined)
    
    inline def setReuseInterval(value: Double): Self = StObject.set(x, "reuseInterval", value.asInstanceOf[js.Any])
    
    inline def setReuseIntervalNull: Self = StObject.set(x, "reuseInterval", null)
    
    inline def setReuseIntervalUndefined: Self = StObject.set(x, "reuseInterval", js.undefined)
  }
}
