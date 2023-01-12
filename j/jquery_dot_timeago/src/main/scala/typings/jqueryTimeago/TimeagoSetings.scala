package typings.jqueryTimeago

import typings.jqueryTimeago.anon.Day
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeagoSetings extends StObject {
  
  var allowFuture: js.UndefOr[Boolean] = js.undefined
  
  var refreshMillis: js.UndefOr[Double] = js.undefined
  
  var strings: js.UndefOr[Day] = js.undefined
}
object TimeagoSetings {
  
  inline def apply(): TimeagoSetings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeagoSetings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeagoSetings] (val x: Self) extends AnyVal {
    
    inline def setAllowFuture(value: Boolean): Self = StObject.set(x, "allowFuture", value.asInstanceOf[js.Any])
    
    inline def setAllowFutureUndefined: Self = StObject.set(x, "allowFuture", js.undefined)
    
    inline def setRefreshMillis(value: Double): Self = StObject.set(x, "refreshMillis", value.asInstanceOf[js.Any])
    
    inline def setRefreshMillisUndefined: Self = StObject.set(x, "refreshMillis", js.undefined)
    
    inline def setStrings(value: Day): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
  }
}
