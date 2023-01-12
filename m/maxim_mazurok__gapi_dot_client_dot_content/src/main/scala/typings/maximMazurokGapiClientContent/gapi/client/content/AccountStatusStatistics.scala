package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountStatusStatistics extends StObject {
  
  /** Number of active offers. */
  var active: js.UndefOr[String] = js.undefined
  
  /** Number of disapproved offers. */
  var disapproved: js.UndefOr[String] = js.undefined
  
  /** Number of expiring offers. */
  var expiring: js.UndefOr[String] = js.undefined
  
  /** Number of pending offers. */
  var pending: js.UndefOr[String] = js.undefined
}
object AccountStatusStatistics {
  
  inline def apply(): AccountStatusStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatusStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountStatusStatistics] (val x: Self) extends AnyVal {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDisapproved(value: String): Self = StObject.set(x, "disapproved", value.asInstanceOf[js.Any])
    
    inline def setDisapprovedUndefined: Self = StObject.set(x, "disapproved", js.undefined)
    
    inline def setExpiring(value: String): Self = StObject.set(x, "expiring", value.asInstanceOf[js.Any])
    
    inline def setExpiringUndefined: Self = StObject.set(x, "expiring", js.undefined)
    
    inline def setPending(value: String): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
  }
}
