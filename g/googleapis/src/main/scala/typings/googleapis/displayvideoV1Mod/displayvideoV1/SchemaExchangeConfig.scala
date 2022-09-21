package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExchangeConfig extends StObject {
  
  /**
    * All enabled exchanges in the partner. Duplicate enabled exchanges will be ignored.
    */
  var enabledExchanges: js.UndefOr[js.Array[SchemaExchangeConfigEnabledExchange]] = js.undefined
}
object SchemaExchangeConfig {
  
  inline def apply(): SchemaExchangeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExchangeConfig]
  }
  
  extension [Self <: SchemaExchangeConfig](x: Self) {
    
    inline def setEnabledExchanges(value: js.Array[SchemaExchangeConfigEnabledExchange]): Self = StObject.set(x, "enabledExchanges", value.asInstanceOf[js.Any])
    
    inline def setEnabledExchangesUndefined: Self = StObject.set(x, "enabledExchanges", js.undefined)
    
    inline def setEnabledExchangesVarargs(value: SchemaExchangeConfigEnabledExchange*): Self = StObject.set(x, "enabledExchanges", js.Array(value*))
  }
}
