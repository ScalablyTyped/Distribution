package typings.imsiGrok

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("imsi-grok", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def grok(imsi: String): IMSIBreakdown | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("grok")(imsi.asInstanceOf[js.Any]).asInstanceOf[IMSIBreakdown | Null]
  
  trait IMSIBreakdown extends StObject {
    
    var country_code: String
    
    var country_iso: String
    
    var country_name: String
    
    var mcc: String
    
    var mnc: String
    
    var network_name: String
  }
  object IMSIBreakdown {
    
    inline def apply(
      country_code: String,
      country_iso: String,
      country_name: String,
      mcc: String,
      mnc: String,
      network_name: String
    ): IMSIBreakdown = {
      val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], country_iso = country_iso.asInstanceOf[js.Any], country_name = country_name.asInstanceOf[js.Any], mcc = mcc.asInstanceOf[js.Any], mnc = mnc.asInstanceOf[js.Any], network_name = network_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMSIBreakdown]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMSIBreakdown] (val x: Self) extends AnyVal {
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setCountry_iso(value: String): Self = StObject.set(x, "country_iso", value.asInstanceOf[js.Any])
      
      inline def setCountry_name(value: String): Self = StObject.set(x, "country_name", value.asInstanceOf[js.Any])
      
      inline def setMcc(value: String): Self = StObject.set(x, "mcc", value.asInstanceOf[js.Any])
      
      inline def setMnc(value: String): Self = StObject.set(x, "mnc", value.asInstanceOf[js.Any])
      
      inline def setNetwork_name(value: String): Self = StObject.set(x, "network_name", value.asInstanceOf[js.Any])
    }
  }
}
