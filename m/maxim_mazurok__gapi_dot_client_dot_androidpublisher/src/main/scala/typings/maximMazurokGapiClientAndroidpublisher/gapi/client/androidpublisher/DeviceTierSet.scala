package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceTierSet extends StObject {
  
  /** Device tiers belonging to the set. */
  var deviceTiers: js.UndefOr[js.Array[DeviceTier]] = js.undefined
}
object DeviceTierSet {
  
  inline def apply(): DeviceTierSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceTierSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceTierSet] (val x: Self) extends AnyVal {
    
    inline def setDeviceTiers(value: js.Array[DeviceTier]): Self = StObject.set(x, "deviceTiers", value.asInstanceOf[js.Any])
    
    inline def setDeviceTiersUndefined: Self = StObject.set(x, "deviceTiers", js.undefined)
    
    inline def setDeviceTiersVarargs(value: DeviceTier*): Self = StObject.set(x, "deviceTiers", js.Array(value*))
  }
}
