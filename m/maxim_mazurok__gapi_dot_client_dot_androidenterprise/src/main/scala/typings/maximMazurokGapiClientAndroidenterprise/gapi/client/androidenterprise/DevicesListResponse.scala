package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesListResponse extends StObject {
  
  /** A managed device. */
  var device: js.UndefOr[js.Array[Device]] = js.native
}
object DevicesListResponse {
  
  @scala.inline
  def apply(): DevicesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicesListResponse]
  }
  
  @scala.inline
  implicit class DevicesListResponseMutableBuilder[Self <: DevicesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: js.Array[Device]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setDeviceVarargs(value: Device*): Self = StObject.set(x, "device", js.Array(value :_*))
  }
}
