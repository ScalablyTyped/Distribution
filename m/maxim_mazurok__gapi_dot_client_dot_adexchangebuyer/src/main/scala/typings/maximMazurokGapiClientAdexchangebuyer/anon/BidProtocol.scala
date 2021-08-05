package typings.maximMazurokGapiClientAdexchangebuyer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BidProtocol extends StObject {
  
  /**
    * The protocol that the bidder endpoint is using. OpenRTB protocols with prefix PROTOCOL_OPENRTB_PROTOBUF use proto buffer, otherwise use JSON.  Allowed values:
    * - PROTOCOL_ADX
    * - PROTOCOL_OPENRTB_2_2
    * - PROTOCOL_OPENRTB_2_3
    * - PROTOCOL_OPENRTB_2_4
    * - PROTOCOL_OPENRTB_2_5
    * - PROTOCOL_OPENRTB_PROTOBUF_2_3
    * - PROTOCOL_OPENRTB_PROTOBUF_2_4
    * - PROTOCOL_OPENRTB_PROTOBUF_2_5
    */
  var bidProtocol: js.UndefOr[String] = js.undefined
  
  /** The maximum queries per second the Ad Exchange will send. */
  var maximumQps: js.UndefOr[Double] = js.undefined
  
  /**
    * The geographical region the Ad Exchange should send requests from. Only used by some quota systems, but always setting the value is recommended. Allowed values:
    * - ASIA
    * - EUROPE
    * - US_EAST
    * - US_WEST
    */
  var region: js.UndefOr[String] = js.undefined
  
  /** The URL to which the Ad Exchange will send bid requests. */
  var url: js.UndefOr[String] = js.undefined
}
object BidProtocol {
  
  inline def apply(): BidProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BidProtocol]
  }
  
  extension [Self <: BidProtocol](x: Self) {
    
    inline def setBidProtocol(value: String): Self = StObject.set(x, "bidProtocol", value.asInstanceOf[js.Any])
    
    inline def setBidProtocolUndefined: Self = StObject.set(x, "bidProtocol", js.undefined)
    
    inline def setMaximumQps(value: Double): Self = StObject.set(x, "maximumQps", value.asInstanceOf[js.Any])
    
    inline def setMaximumQpsUndefined: Self = StObject.set(x, "maximumQps", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
