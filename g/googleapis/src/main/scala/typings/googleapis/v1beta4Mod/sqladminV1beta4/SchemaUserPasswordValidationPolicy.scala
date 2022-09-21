package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserPasswordValidationPolicy extends StObject {
  
  /**
    * Number of failed login attempts allowed before user get locked.
    */
  var allowedFailedAttempts: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If true, failed login attempts check will be enabled.
    */
  var enableFailedAttemptsCheck: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, the user must specify the current password before changing the password. This flag is supported only for MySQL.
    */
  var enablePasswordVerification: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Expiration duration after password is updated.
    */
  var passwordExpirationDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Read-only password status.
    */
  var status: js.UndefOr[SchemaPasswordStatus] = js.undefined
}
object SchemaUserPasswordValidationPolicy {
  
  inline def apply(): SchemaUserPasswordValidationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserPasswordValidationPolicy]
  }
  
  extension [Self <: SchemaUserPasswordValidationPolicy](x: Self) {
    
    inline def setAllowedFailedAttempts(value: Double): Self = StObject.set(x, "allowedFailedAttempts", value.asInstanceOf[js.Any])
    
    inline def setAllowedFailedAttemptsNull: Self = StObject.set(x, "allowedFailedAttempts", null)
    
    inline def setAllowedFailedAttemptsUndefined: Self = StObject.set(x, "allowedFailedAttempts", js.undefined)
    
    inline def setEnableFailedAttemptsCheck(value: Boolean): Self = StObject.set(x, "enableFailedAttemptsCheck", value.asInstanceOf[js.Any])
    
    inline def setEnableFailedAttemptsCheckNull: Self = StObject.set(x, "enableFailedAttemptsCheck", null)
    
    inline def setEnableFailedAttemptsCheckUndefined: Self = StObject.set(x, "enableFailedAttemptsCheck", js.undefined)
    
    inline def setEnablePasswordVerification(value: Boolean): Self = StObject.set(x, "enablePasswordVerification", value.asInstanceOf[js.Any])
    
    inline def setEnablePasswordVerificationNull: Self = StObject.set(x, "enablePasswordVerification", null)
    
    inline def setEnablePasswordVerificationUndefined: Self = StObject.set(x, "enablePasswordVerification", js.undefined)
    
    inline def setPasswordExpirationDuration(value: String): Self = StObject.set(x, "passwordExpirationDuration", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpirationDurationNull: Self = StObject.set(x, "passwordExpirationDuration", null)
    
    inline def setPasswordExpirationDurationUndefined: Self = StObject.set(x, "passwordExpirationDuration", js.undefined)
    
    inline def setStatus(value: SchemaPasswordStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
