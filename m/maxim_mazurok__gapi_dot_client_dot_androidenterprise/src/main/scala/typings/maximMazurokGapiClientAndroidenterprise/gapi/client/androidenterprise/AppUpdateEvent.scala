package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppUpdateEvent extends StObject {
  
  /** The id of the product (e.g. "app:com.google.android.gm") that was updated. This field will always be present. */
  var productId: js.UndefOr[String] = js.undefined
}
object AppUpdateEvent {
  
  inline def apply(): AppUpdateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppUpdateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppUpdateEvent] (val x: Self) extends AnyVal {
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
