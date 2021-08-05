package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessCategory extends StObject {
  
  var C: String
  
  var CN: String
  
  var DC: String
  
  var DN: String
  
  var E: String
  
  var L: String
  
  var O: String
  
  var OU: String
  
  var SN: String
  
  var ST: String
  
  var STREET: String
  
  var UID: String
  
  var businessCategory: String
  
  var jurisdictionOfIncorporationC: String
  
  var jurisdictionOfIncorporationL: String
  
  var jurisdictionOfIncorporationSP: String
  
  var postalCode: String
  
  var serialNumber: String
}
object BusinessCategory {
  
  inline def apply(
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
  
  extension [Self <: BusinessCategory](x: Self) {
    
    inline def setBusinessCategory(value: String): Self = StObject.set(x, "businessCategory", value.asInstanceOf[js.Any])
    
    inline def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
    
    inline def setCN(value: String): Self = StObject.set(x, "CN", value.asInstanceOf[js.Any])
    
    inline def setDC(value: String): Self = StObject.set(x, "DC", value.asInstanceOf[js.Any])
    
    inline def setDN(value: String): Self = StObject.set(x, "DN", value.asInstanceOf[js.Any])
    
    inline def setE(value: String): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionOfIncorporationC(value: String): Self = StObject.set(x, "jurisdictionOfIncorporationC", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionOfIncorporationL(value: String): Self = StObject.set(x, "jurisdictionOfIncorporationL", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionOfIncorporationSP(value: String): Self = StObject.set(x, "jurisdictionOfIncorporationSP", value.asInstanceOf[js.Any])
    
    inline def setL(value: String): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    
    inline def setO(value: String): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
    
    inline def setOU(value: String): Self = StObject.set(x, "OU", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setSN(value: String): Self = StObject.set(x, "SN", value.asInstanceOf[js.Any])
    
    inline def setST(value: String): Self = StObject.set(x, "ST", value.asInstanceOf[js.Any])
    
    inline def setSTREET(value: String): Self = StObject.set(x, "STREET", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setUID(value: String): Self = StObject.set(x, "UID", value.asInstanceOf[js.Any])
  }
}
