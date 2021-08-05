package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alerts extends StObject {
  
  /** The alerts returned in this list response. */
  var items: js.UndefOr[js.Array[Alert]] = js.undefined
  
  /** Kind of list this is, in this case adsense#alerts. */
  var kind: js.UndefOr[String] = js.undefined
}
object Alerts {
  
  inline def apply(): Alerts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alerts]
  }
  
  extension [Self <: Alerts](x: Self) {
    
    inline def setItems(value: js.Array[Alert]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Alert*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
