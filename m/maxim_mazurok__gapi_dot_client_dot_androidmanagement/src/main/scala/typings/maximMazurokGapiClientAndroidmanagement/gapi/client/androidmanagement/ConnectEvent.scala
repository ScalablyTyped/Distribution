package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectEvent extends StObject {
  
  /** The destination IP address of the connect call. */
  var destinationIpAddress: js.UndefOr[String] = js.undefined
  
  /** The destination port of the connect call. */
  var destinationPort: js.UndefOr[Double] = js.undefined
  
  /** The package name of the UID that performed the connect call. */
  var packageName: js.UndefOr[String] = js.undefined
}
object ConnectEvent {
  
  inline def apply(): ConnectEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectEvent] (val x: Self) extends AnyVal {
    
    inline def setDestinationIpAddress(value: String): Self = StObject.set(x, "destinationIpAddress", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpAddressUndefined: Self = StObject.set(x, "destinationIpAddress", js.undefined)
    
    inline def setDestinationPort(value: Double): Self = StObject.set(x, "destinationPort", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortUndefined: Self = StObject.set(x, "destinationPort", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
