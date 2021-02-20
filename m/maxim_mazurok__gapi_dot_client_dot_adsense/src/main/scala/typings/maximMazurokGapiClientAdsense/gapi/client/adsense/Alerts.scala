package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alerts extends StObject {
  
  /** The alerts returned in this list response. */
  var items: js.UndefOr[js.Array[Alert]] = js.native
  
  /** Kind of list this is, in this case adsense#alerts. */
  var kind: js.UndefOr[String] = js.native
}
object Alerts {
  
  @scala.inline
  def apply(): Alerts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alerts]
  }
  
  @scala.inline
  implicit class AlertsMutableBuilder[Self <: Alerts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Alert]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Alert*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
