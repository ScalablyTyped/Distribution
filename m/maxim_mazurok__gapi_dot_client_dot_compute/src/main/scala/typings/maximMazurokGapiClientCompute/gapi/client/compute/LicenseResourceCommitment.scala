package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseResourceCommitment extends StObject {
  
  /** The number of licenses purchased. */
  var amount: js.UndefOr[String] = js.undefined
  
  /** Specifies the core range of the instance for which this license applies. */
  var coresPerLicense: js.UndefOr[String] = js.undefined
  
  /** Any applicable license URI. */
  var license: js.UndefOr[String] = js.undefined
}
object LicenseResourceCommitment {
  
  inline def apply(): LicenseResourceCommitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseResourceCommitment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicenseResourceCommitment] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCoresPerLicense(value: String): Self = StObject.set(x, "coresPerLicense", value.asInstanceOf[js.Any])
    
    inline def setCoresPerLicenseUndefined: Self = StObject.set(x, "coresPerLicense", js.undefined)
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
  }
}
