package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordRequirements extends StObject {
  
  /** Number of incorrect device-unlock passwords that can be entered before a device is wiped. A value of 0 means there is no restriction. */
  var maximumFailedPasswordsForWipe: js.UndefOr[Double] = js.undefined
  
  /** Password expiration timeout. */
  var passwordExpirationTimeout: js.UndefOr[String] = js.undefined
  
  /**
    * The length of the password history. After setting this field, the user won't be able to enter a new password that is the same as any password in the history. A value of 0 means
    * there is no restriction.
    */
  var passwordHistoryLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum allowed password length. A value of 0 means there is no restriction. Only enforced when password_quality is NUMERIC, NUMERIC_COMPLEX, ALPHABETIC, ALPHANUMERIC, or
    * COMPLEX.
    */
  var passwordMinimumLength: js.UndefOr[Double] = js.undefined
  
  /** Minimum number of letters required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumLetters: js.UndefOr[Double] = js.undefined
  
  /** Minimum number of lower case letters required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumLowerCase: js.UndefOr[Double] = js.undefined
  
  /** Minimum number of non-letter characters (numerical digits or symbols) required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumNonLetter: js.UndefOr[Double] = js.undefined
  
  /** Minimum number of numerical digits required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumNumeric: js.UndefOr[Double] = js.undefined
  
  /** Minimum number of symbols required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumSymbols: js.UndefOr[Double] = js.undefined
  
  /** Minimum number of upper case letters required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumUpperCase: js.UndefOr[Double] = js.undefined
  
  /** The required password quality. */
  var passwordQuality: js.UndefOr[String] = js.undefined
  
  /** The scope that the password requirement applies to. */
  var passwordScope: js.UndefOr[String] = js.undefined
  
  /**
    * The length of time after a device or work profile is unlocked using a strong form of authentication (password, PIN, pattern) that it can be unlocked using any other authentication
    * method (e.g. fingerprint, trust agents, face). After the specified time period elapses, only strong forms of authentication can be used to unlock the device or work profile.
    */
  var requirePasswordUnlock: js.UndefOr[String] = js.undefined
  
  /**
    * Controls whether a unified lock is allowed for the device and the work profile, on devices running Android 9 and above with a work profile. This can be set only if password_scope is
    * set to SCOPE_PROFILE, the policy will be rejected otherwise. If user has not set a separate work lock and this field is set to REQUIRE_SEPARATE_WORK_LOCK, a NonComplianceDetail is
    * reported with nonComplianceReason set to USER_ACTION.
    */
  var unifiedLockSettings: js.UndefOr[String] = js.undefined
}
object PasswordRequirements {
  
  inline def apply(): PasswordRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordRequirements]
  }
  
  extension [Self <: PasswordRequirements](x: Self) {
    
    inline def setMaximumFailedPasswordsForWipe(value: Double): Self = StObject.set(x, "maximumFailedPasswordsForWipe", value.asInstanceOf[js.Any])
    
    inline def setMaximumFailedPasswordsForWipeUndefined: Self = StObject.set(x, "maximumFailedPasswordsForWipe", js.undefined)
    
    inline def setPasswordExpirationTimeout(value: String): Self = StObject.set(x, "passwordExpirationTimeout", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpirationTimeoutUndefined: Self = StObject.set(x, "passwordExpirationTimeout", js.undefined)
    
    inline def setPasswordHistoryLength(value: Double): Self = StObject.set(x, "passwordHistoryLength", value.asInstanceOf[js.Any])
    
    inline def setPasswordHistoryLengthUndefined: Self = StObject.set(x, "passwordHistoryLength", js.undefined)
    
    inline def setPasswordMinimumLength(value: Double): Self = StObject.set(x, "passwordMinimumLength", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumLengthUndefined: Self = StObject.set(x, "passwordMinimumLength", js.undefined)
    
    inline def setPasswordMinimumLetters(value: Double): Self = StObject.set(x, "passwordMinimumLetters", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumLettersUndefined: Self = StObject.set(x, "passwordMinimumLetters", js.undefined)
    
    inline def setPasswordMinimumLowerCase(value: Double): Self = StObject.set(x, "passwordMinimumLowerCase", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumLowerCaseUndefined: Self = StObject.set(x, "passwordMinimumLowerCase", js.undefined)
    
    inline def setPasswordMinimumNonLetter(value: Double): Self = StObject.set(x, "passwordMinimumNonLetter", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumNonLetterUndefined: Self = StObject.set(x, "passwordMinimumNonLetter", js.undefined)
    
    inline def setPasswordMinimumNumeric(value: Double): Self = StObject.set(x, "passwordMinimumNumeric", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumNumericUndefined: Self = StObject.set(x, "passwordMinimumNumeric", js.undefined)
    
    inline def setPasswordMinimumSymbols(value: Double): Self = StObject.set(x, "passwordMinimumSymbols", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumSymbolsUndefined: Self = StObject.set(x, "passwordMinimumSymbols", js.undefined)
    
    inline def setPasswordMinimumUpperCase(value: Double): Self = StObject.set(x, "passwordMinimumUpperCase", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumUpperCaseUndefined: Self = StObject.set(x, "passwordMinimumUpperCase", js.undefined)
    
    inline def setPasswordQuality(value: String): Self = StObject.set(x, "passwordQuality", value.asInstanceOf[js.Any])
    
    inline def setPasswordQualityUndefined: Self = StObject.set(x, "passwordQuality", js.undefined)
    
    inline def setPasswordScope(value: String): Self = StObject.set(x, "passwordScope", value.asInstanceOf[js.Any])
    
    inline def setPasswordScopeUndefined: Self = StObject.set(x, "passwordScope", js.undefined)
    
    inline def setRequirePasswordUnlock(value: String): Self = StObject.set(x, "requirePasswordUnlock", value.asInstanceOf[js.Any])
    
    inline def setRequirePasswordUnlockUndefined: Self = StObject.set(x, "requirePasswordUnlock", js.undefined)
    
    inline def setUnifiedLockSettings(value: String): Self = StObject.set(x, "unifiedLockSettings", value.asInstanceOf[js.Any])
    
    inline def setUnifiedLockSettingsUndefined: Self = StObject.set(x, "unifiedLockSettings", js.undefined)
  }
}
