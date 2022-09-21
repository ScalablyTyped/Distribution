package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEndpoint extends StObject {
  
  /**
    * The protocol that the bidder endpoint is using.
    */
  var bidProtocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum number of queries per second allowed to be sent to this server.
    */
  var maximumQps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of the endpoint resource that must follow the pattern `bidders/{bidderAccountId\}/endpoints/{endpointId\}`, where {bidderAccountId\} is the account ID of the bidder who operates this endpoint, and {endpointId\} is a unique ID assigned by the server.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The trading location that bid requests should be sent from. See https://developers.google.com/authorized-buyers/rtb/peer-guide#trading-locations for further information.
    */
  var tradingLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The URL that bid requests should be sent to.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaEndpoint {
  
  inline def apply(): SchemaEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpoint]
  }
  
  extension [Self <: SchemaEndpoint](x: Self) {
    
    inline def setBidProtocol(value: String): Self = StObject.set(x, "bidProtocol", value.asInstanceOf[js.Any])
    
    inline def setBidProtocolNull: Self = StObject.set(x, "bidProtocol", null)
    
    inline def setBidProtocolUndefined: Self = StObject.set(x, "bidProtocol", js.undefined)
    
    inline def setMaximumQps(value: String): Self = StObject.set(x, "maximumQps", value.asInstanceOf[js.Any])
    
    inline def setMaximumQpsNull: Self = StObject.set(x, "maximumQps", null)
    
    inline def setMaximumQpsUndefined: Self = StObject.set(x, "maximumQps", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTradingLocation(value: String): Self = StObject.set(x, "tradingLocation", value.asInstanceOf[js.Any])
    
    inline def setTradingLocationNull: Self = StObject.set(x, "tradingLocation", null)
    
    inline def setTradingLocationUndefined: Self = StObject.set(x, "tradingLocation", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
