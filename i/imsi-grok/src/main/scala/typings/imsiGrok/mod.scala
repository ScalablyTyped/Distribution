package typings.imsiGrok

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("imsi-grok", "grok")
  @js.native
  def grok(imsi: String): IMSIBreakdown | Null = js.native
  
  @js.native
  trait IMSIBreakdown extends StObject {
    
    var country_code: String = js.native
    
    var country_iso: String = js.native
    
    var country_name: String = js.native
    
    var mcc: String = js.native
    
    var mnc: String = js.native
    
    var network_name: String = js.native
  }
  object IMSIBreakdown {
    
    @scala.inline
    def apply(
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
    implicit class IMSIBreakdownMutableBuilder[Self <: IMSIBreakdown] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry_iso(value: String): Self = StObject.set(x, "country_iso", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry_name(value: String): Self = StObject.set(x, "country_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMcc(value: String): Self = StObject.set(x, "mcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMnc(value: String): Self = StObject.set(x, "mnc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetwork_name(value: String): Self = StObject.set(x, "network_name", value.asInstanceOf[js.Any])
    }
  }
}
