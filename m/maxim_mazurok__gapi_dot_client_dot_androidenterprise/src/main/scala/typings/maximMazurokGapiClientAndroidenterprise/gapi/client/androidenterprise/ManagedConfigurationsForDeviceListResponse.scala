package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedConfigurationsForDeviceListResponse extends StObject {
  
  /** A managed configuration for an app on a specific device. */
  var managedConfigurationForDevice: js.UndefOr[js.Array[ManagedConfiguration]] = js.native
}
object ManagedConfigurationsForDeviceListResponse {
  
  @scala.inline
  def apply(): ManagedConfigurationsForDeviceListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfigurationsForDeviceListResponse]
  }
  
  @scala.inline
  implicit class ManagedConfigurationsForDeviceListResponseMutableBuilder[Self <: ManagedConfigurationsForDeviceListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedConfigurationForDevice(value: js.Array[ManagedConfiguration]): Self = StObject.set(x, "managedConfigurationForDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedConfigurationForDeviceUndefined: Self = StObject.set(x, "managedConfigurationForDevice", js.undefined)
    
    @scala.inline
    def setManagedConfigurationForDeviceVarargs(value: ManagedConfiguration*): Self = StObject.set(x, "managedConfigurationForDevice", js.Array(value :_*))
  }
}
