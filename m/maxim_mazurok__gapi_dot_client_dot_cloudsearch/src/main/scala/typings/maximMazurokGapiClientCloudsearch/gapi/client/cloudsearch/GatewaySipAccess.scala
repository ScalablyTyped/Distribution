package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewaySipAccess extends StObject {
  
  /** Permanent numeric code for manual entry on specially configured devices, currently the same as the PSTN "Universal pin". */
  var sipAccessCode: js.UndefOr[String] = js.undefined
  
  /**
    * The SIP URI the conference can be reached through. The string is on one of the formats: "sip:@" "sips:@" where currently is the 13-digit universal pin (with the future option to
    * support using a Meet meeting code as well), and is a valid address to be resolved using a DNS SRV lookup, or a dotted quad.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object GatewaySipAccess {
  
  inline def apply(): GatewaySipAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewaySipAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GatewaySipAccess] (val x: Self) extends AnyVal {
    
    inline def setSipAccessCode(value: String): Self = StObject.set(x, "sipAccessCode", value.asInstanceOf[js.Any])
    
    inline def setSipAccessCodeUndefined: Self = StObject.set(x, "sipAccessCode", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
