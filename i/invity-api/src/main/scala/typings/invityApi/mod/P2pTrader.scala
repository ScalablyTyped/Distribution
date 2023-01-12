package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P2pTrader extends StObject {
  
  var name: String
  
  var numberOfTrades: Double
  
  var onlineStatus: OnlineStatus
  
  var rating: String
}
object P2pTrader {
  
  inline def apply(name: String, numberOfTrades: Double, onlineStatus: OnlineStatus, rating: String): P2pTrader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], numberOfTrades = numberOfTrades.asInstanceOf[js.Any], onlineStatus = onlineStatus.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[P2pTrader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: P2pTrader] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTrades(value: Double): Self = StObject.set(x, "numberOfTrades", value.asInstanceOf[js.Any])
    
    inline def setOnlineStatus(value: OnlineStatus): Self = StObject.set(x, "onlineStatus", value.asInstanceOf[js.Any])
    
    inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
  }
}
