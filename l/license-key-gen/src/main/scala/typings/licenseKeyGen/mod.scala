package typings.licenseKeyGen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("license-key-gen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLicense(licenseData: licenseData): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("createLicense")(licenseData.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def validateLicense(licenseData: licenseData, serial: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("validateLicense")(licenseData.asInstanceOf[js.Any], serial.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  trait licenseData extends StObject {
    
    var appVersion: String
    
    var info: userInfo
    
    var osType: String
    
    var prodCode: String
  }
  object licenseData {
    
    inline def apply(appVersion: String, info: userInfo, osType: String, prodCode: String): licenseData = {
      val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], osType = osType.asInstanceOf[js.Any], prodCode = prodCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[licenseData]
    }
    
    extension [Self <: licenseData](x: Self) {
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: userInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setOsType(value: String): Self = StObject.set(x, "osType", value.asInstanceOf[js.Any])
      
      inline def setProdCode(value: String): Self = StObject.set(x, "prodCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait userInfo extends StObject {
    
    var city: String
    
    var company: String
    
    var state: String
    
    var street: String
    
    var zip: String
  }
  object userInfo {
    
    inline def apply(city: String, company: String, state: String, street: String, zip: String): userInfo = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[userInfo]
    }
    
    extension [Self <: userInfo](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
}
