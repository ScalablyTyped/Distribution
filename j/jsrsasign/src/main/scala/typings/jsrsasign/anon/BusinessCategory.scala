package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusinessCategory extends StObject {
  
  var C: String = js.native
  
  var CN: String = js.native
  
  var DC: String = js.native
  
  var DN: String = js.native
  
  var E: String = js.native
  
  var L: String = js.native
  
  var O: String = js.native
  
  var OU: String = js.native
  
  var SN: String = js.native
  
  var ST: String = js.native
  
  var STREET: String = js.native
  
  var UID: String = js.native
  
  var businessCategory: String = js.native
  
  var jurisdictionOfIncorporationC: String = js.native
  
  var jurisdictionOfIncorporationL: String = js.native
  
  var jurisdictionOfIncorporationSP: String = js.native
  
  var postalCode: String = js.native
  
  var serialNumber: String = js.native
}
object BusinessCategory {
  
  @scala.inline
  def apply(
    C: String,
    CN: String,
    DC: String,
    DN: String,
    E: String,
    L: String,
    O: String,
    OU: String,
    SN: String,
    ST: String,
    STREET: String,
    UID: String,
    businessCategory: String,
    jurisdictionOfIncorporationC: String,
    jurisdictionOfIncorporationL: String,
    jurisdictionOfIncorporationSP: String,
    postalCode: String,
    serialNumber: String
  ): BusinessCategory = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], DC = DC.asInstanceOf[js.Any], DN = DN.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], OU = OU.asInstanceOf[js.Any], SN = SN.asInstanceOf[js.Any], ST = ST.asInstanceOf[js.Any], STREET = STREET.asInstanceOf[js.Any], UID = UID.asInstanceOf[js.Any], businessCategory = businessCategory.asInstanceOf[js.Any], jurisdictionOfIncorporationC = jurisdictionOfIncorporationC.asInstanceOf[js.Any], jurisdictionOfIncorporationL = jurisdictionOfIncorporationL.asInstanceOf[js.Any], jurisdictionOfIncorporationSP = jurisdictionOfIncorporationSP.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessCategory]
  }
  
  @scala.inline
  implicit class BusinessCategoryMutableBuilder[Self <: BusinessCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusinessCategory(value: String): Self = StObject.set(x, "businessCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCN(value: String): Self = StObject.set(x, "CN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDC(value: String): Self = StObject.set(x, "DC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDN(value: String): Self = StObject.set(x, "DN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: String): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionOfIncorporationC(value: String): Self = StObject.set(x, "jurisdictionOfIncorporationC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionOfIncorporationL(value: String): Self = StObject.set(x, "jurisdictionOfIncorporationL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionOfIncorporationSP(value: String): Self = StObject.set(x, "jurisdictionOfIncorporationSP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: String): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: String): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOU(value: String): Self = StObject.set(x, "OU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSN(value: String): Self = StObject.set(x, "SN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setST(value: String): Self = StObject.set(x, "ST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTREET(value: String): Self = StObject.set(x, "STREET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUID(value: String): Self = StObject.set(x, "UID", value.asInstanceOf[js.Any])
  }
}
