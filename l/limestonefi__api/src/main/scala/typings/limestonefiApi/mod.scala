package typings.limestonefiApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@limestonefi/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPrice(token: String): js.Promise[PriceData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrice")(token.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PriceData]]
  
  trait PriceData extends StObject {
    
    var price: Double
    
    var updated: js.Date
  }
  object PriceData {
    
    inline def apply(price: Double, updated: js.Date): PriceData = {
      val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[PriceData]
    }
    
    extension [Self <: PriceData](x: Self) {
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: js.Date): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
}
