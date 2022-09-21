package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceGroup extends StObject {
  
  /** Device selectors for this group. A device matching any of the selectors is included in this group. */
  var deviceSelectors: js.UndefOr[js.Array[DeviceSelector]] = js.undefined
  
  /** The name of the group. */
  var name: js.UndefOr[String] = js.undefined
}
object DeviceGroup {
  
  inline def apply(): DeviceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceGroup]
  }
  
  extension [Self <: DeviceGroup](x: Self) {
    
    inline def setDeviceSelectors(value: js.Array[DeviceSelector]): Self = StObject.set(x, "deviceSelectors", value.asInstanceOf[js.Any])
    
    inline def setDeviceSelectorsUndefined: Self = StObject.set(x, "deviceSelectors", js.undefined)
    
    inline def setDeviceSelectorsVarargs(value: DeviceSelector*): Self = StObject.set(x, "deviceSelectors", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
