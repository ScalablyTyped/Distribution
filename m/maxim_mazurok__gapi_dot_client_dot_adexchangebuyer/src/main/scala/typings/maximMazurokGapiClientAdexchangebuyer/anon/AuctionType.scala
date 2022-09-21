package typings.maximMazurokGapiClientAdexchangebuyer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuctionType extends StObject {
  
  /** Only set when contextType=AUCTION_TYPE. Represents the auction types this restriction applies to. */
  var auctionType: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The type of context (e.g., location, platform, auction type, SSL-ness). */
  var contextType: js.UndefOr[String] = js.undefined
  
  /**
    * Only set when contextType=LOCATION. Represents the geo criterias this restriction applies to. Impressions are considered to match a context if either the user location or
    * publisher location matches a given geoCriteriaId.
    */
  var geoCriteriaId: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Only set when contextType=PLATFORM. Represents the platforms this restriction applies to. */
  var platform: js.UndefOr[js.Array[String]] = js.undefined
}
object AuctionType {
  
  inline def apply(): AuctionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuctionType]
  }
  
  extension [Self <: AuctionType](x: Self) {
    
    inline def setAuctionType(value: js.Array[String]): Self = StObject.set(x, "auctionType", value.asInstanceOf[js.Any])
    
    inline def setAuctionTypeUndefined: Self = StObject.set(x, "auctionType", js.undefined)
    
    inline def setAuctionTypeVarargs(value: String*): Self = StObject.set(x, "auctionType", js.Array(value*))
    
    inline def setContextType(value: String): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
    
    inline def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
    
    inline def setGeoCriteriaId(value: js.Array[Double]): Self = StObject.set(x, "geoCriteriaId", value.asInstanceOf[js.Any])
    
    inline def setGeoCriteriaIdUndefined: Self = StObject.set(x, "geoCriteriaId", js.undefined)
    
    inline def setGeoCriteriaIdVarargs(value: Double*): Self = StObject.set(x, "geoCriteriaId", js.Array(value*))
    
    inline def setPlatform(value: js.Array[String]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setPlatformVarargs(value: String*): Self = StObject.set(x, "platform", js.Array(value*))
  }
}
