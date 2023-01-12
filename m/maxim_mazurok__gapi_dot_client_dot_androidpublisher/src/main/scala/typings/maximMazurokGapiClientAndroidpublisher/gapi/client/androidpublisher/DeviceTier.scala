package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceTier extends StObject {
  
  /** Groups of devices included in this tier. These groups must be defined explicitly under device_groups in this configuration. */
  var deviceGroupNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The priority level of the tier. Tiers are evaluated in descending order of level: the highest level tier has the highest priority. The highest tier matching a given device is
    * selected for that device. You should use a contiguous range of levels for your tiers in a tier set; tier levels in a tier set must be unique. For instance, if your tier set has 4
    * tiers (including the global fallback), you should define tiers 1, 2 and 3 in this configuration. Note: tier 0 is implicitly defined as a global fallback and selected for devices
    * that don't match any of the tiers explicitly defined here. You mustn't define level 0 explicitly in this configuration.
    */
  var level: js.UndefOr[Double] = js.undefined
}
object DeviceTier {
  
  inline def apply(): DeviceTier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceTier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceTier] (val x: Self) extends AnyVal {
    
    inline def setDeviceGroupNames(value: js.Array[String]): Self = StObject.set(x, "deviceGroupNames", value.asInstanceOf[js.Any])
    
    inline def setDeviceGroupNamesUndefined: Self = StObject.set(x, "deviceGroupNames", js.undefined)
    
    inline def setDeviceGroupNamesVarargs(value: String*): Self = StObject.set(x, "deviceGroupNames", js.Array(value*))
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
