package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseResourceCommitment extends StObject {
  
  /** The number of licenses purchased. */
  var amount: js.UndefOr[String] = js.native
  
  /** Specifies the core range of the instance for which this license applies. */
  var coresPerLicense: js.UndefOr[String] = js.native
  
  /** Any applicable license URI. */
  var license: js.UndefOr[String] = js.native
}
object LicenseResourceCommitment {
  
  @scala.inline
  def apply(): LicenseResourceCommitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseResourceCommitment]
  }
  
  @scala.inline
  implicit class LicenseResourceCommitmentMutableBuilder[Self <: LicenseResourceCommitment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setCoresPerLicense(value: String): Self = StObject.set(x, "coresPerLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoresPerLicenseUndefined: Self = StObject.set(x, "coresPerLicense", js.undefined)
    
    @scala.inline
    def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
  }
}
