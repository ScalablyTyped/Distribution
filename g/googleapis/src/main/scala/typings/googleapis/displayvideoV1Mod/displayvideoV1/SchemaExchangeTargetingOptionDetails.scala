package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExchangeTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The type of exchange.
    */
  var exchange: js.UndefOr[String | Null] = js.undefined
}
object SchemaExchangeTargetingOptionDetails {
  
  inline def apply(): SchemaExchangeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExchangeTargetingOptionDetails]
  }
  
  extension [Self <: SchemaExchangeTargetingOptionDetails](x: Self) {
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeNull: Self = StObject.set(x, "exchange", null)
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
  }
}
