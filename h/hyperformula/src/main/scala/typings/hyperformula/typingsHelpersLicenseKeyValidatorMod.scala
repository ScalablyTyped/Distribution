package typings.hyperformula

import typings.hyperformula.hyperformulaStrings.expired
import typings.hyperformula.hyperformulaStrings.invalid
import typings.hyperformula.hyperformulaStrings.missing
import typings.hyperformula.hyperformulaStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsHelpersLicenseKeyValidatorMod {
  
  @JSImport("hyperformula/typings/helpers/licenseKeyValidator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkLicenseKeyValidity(licenseKey: String): LicenseKeyValidityState = ^.asInstanceOf[js.Dynamic].applyDynamic("checkLicenseKeyValidity")(licenseKey.asInstanceOf[js.Any]).asInstanceOf[LicenseKeyValidityState]
  
  /* Rewritten from type alias, can be one of: 
    - typings.hyperformula.hyperformulaStrings.valid
    - typings.hyperformula.hyperformulaStrings.invalid
    - typings.hyperformula.hyperformulaStrings.expired
    - typings.hyperformula.hyperformulaStrings.missing
  */
  trait LicenseKeyValidityState extends StObject
  object LicenseKeyValidityState {
    
    inline def EXPIRED: expired = "expired".asInstanceOf[expired]
    
    inline def INVALID: invalid = "invalid".asInstanceOf[invalid]
    
    inline def MISSING: missing = "missing".asInstanceOf[missing]
    
    inline def VALID: valid = "valid".asInstanceOf[valid]
  }
}
