package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2HashConfig extends StObject {
  
  /**
    * Output only. Different password hash algorithms used in Identity Toolkit.
    */
  var algorithm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Memory cost for hash calculation. Used by scrypt and other similar password derivation algorithms. See https://tools.ietf.org/html/rfc7914 for explanation of field.
    */
  var memoryCost: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. How many rounds for hash calculation. Used by scrypt and other similar password derivation algorithms.
    */
  var rounds: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Non-printable character to be inserted between the salt and plain text password in base64.
    */
  var saltSeparator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Signer key in base64.
    */
  var signerKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2HashConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2HashConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2HashConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2HashConfig](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNull: Self = StObject.set(x, "algorithm", null)
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setMemoryCost(value: Double): Self = StObject.set(x, "memoryCost", value.asInstanceOf[js.Any])
    
    inline def setMemoryCostNull: Self = StObject.set(x, "memoryCost", null)
    
    inline def setMemoryCostUndefined: Self = StObject.set(x, "memoryCost", js.undefined)
    
    inline def setRounds(value: Double): Self = StObject.set(x, "rounds", value.asInstanceOf[js.Any])
    
    inline def setRoundsNull: Self = StObject.set(x, "rounds", null)
    
    inline def setRoundsUndefined: Self = StObject.set(x, "rounds", js.undefined)
    
    inline def setSaltSeparator(value: String): Self = StObject.set(x, "saltSeparator", value.asInstanceOf[js.Any])
    
    inline def setSaltSeparatorNull: Self = StObject.set(x, "saltSeparator", null)
    
    inline def setSaltSeparatorUndefined: Self = StObject.set(x, "saltSeparator", js.undefined)
    
    inline def setSignerKey(value: String): Self = StObject.set(x, "signerKey", value.asInstanceOf[js.Any])
    
    inline def setSignerKeyNull: Self = StObject.set(x, "signerKey", null)
    
    inline def setSignerKeyUndefined: Self = StObject.set(x, "signerKey", js.undefined)
  }
}
