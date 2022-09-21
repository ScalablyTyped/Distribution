package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExchangeConfigEnabledExchange extends StObject {
  
  /**
    * The enabled exchange.
    */
  var exchange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Agency ID of Google Ad Manager. The field is only relevant when Google Ad Manager is the enabled exchange.
    */
  var googleAdManagerAgencyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Network ID of Google Ad Manager. The field is only relevant when Google Ad Manager is the enabled exchange.
    */
  var googleAdManagerBuyerNetworkId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Seat ID of the enabled exchange.
    */
  var seatId: js.UndefOr[String | Null] = js.undefined
}
object SchemaExchangeConfigEnabledExchange {
  
  inline def apply(): SchemaExchangeConfigEnabledExchange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExchangeConfigEnabledExchange]
  }
  
  extension [Self <: SchemaExchangeConfigEnabledExchange](x: Self) {
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeNull: Self = StObject.set(x, "exchange", null)
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    inline def setGoogleAdManagerAgencyId(value: String): Self = StObject.set(x, "googleAdManagerAgencyId", value.asInstanceOf[js.Any])
    
    inline def setGoogleAdManagerAgencyIdNull: Self = StObject.set(x, "googleAdManagerAgencyId", null)
    
    inline def setGoogleAdManagerAgencyIdUndefined: Self = StObject.set(x, "googleAdManagerAgencyId", js.undefined)
    
    inline def setGoogleAdManagerBuyerNetworkId(value: String): Self = StObject.set(x, "googleAdManagerBuyerNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGoogleAdManagerBuyerNetworkIdNull: Self = StObject.set(x, "googleAdManagerBuyerNetworkId", null)
    
    inline def setGoogleAdManagerBuyerNetworkIdUndefined: Self = StObject.set(x, "googleAdManagerBuyerNetworkId", js.undefined)
    
    inline def setSeatId(value: String): Self = StObject.set(x, "seatId", value.asInstanceOf[js.Any])
    
    inline def setSeatIdNull: Self = StObject.set(x, "seatId", null)
    
    inline def setSeatIdUndefined: Self = StObject.set(x, "seatId", js.undefined)
  }
}
