package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TechnologyTargeting extends StObject {
  
  /** IDs of device capabilities to be included/excluded. */
  var deviceCapabilityTargeting: js.UndefOr[CriteriaTargeting] = js.undefined
  
  /** IDs of device categories to be included/excluded. */
  var deviceCategoryTargeting: js.UndefOr[CriteriaTargeting] = js.undefined
  
  /** Operating system related targeting information. */
  var operatingSystemTargeting: js.UndefOr[OperatingSystemTargeting] = js.undefined
}
object TechnologyTargeting {
  
  inline def apply(): TechnologyTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TechnologyTargeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TechnologyTargeting] (val x: Self) extends AnyVal {
    
    inline def setDeviceCapabilityTargeting(value: CriteriaTargeting): Self = StObject.set(x, "deviceCapabilityTargeting", value.asInstanceOf[js.Any])
    
    inline def setDeviceCapabilityTargetingUndefined: Self = StObject.set(x, "deviceCapabilityTargeting", js.undefined)
    
    inline def setDeviceCategoryTargeting(value: CriteriaTargeting): Self = StObject.set(x, "deviceCategoryTargeting", value.asInstanceOf[js.Any])
    
    inline def setDeviceCategoryTargetingUndefined: Self = StObject.set(x, "deviceCategoryTargeting", js.undefined)
    
    inline def setOperatingSystemTargeting(value: OperatingSystemTargeting): Self = StObject.set(x, "operatingSystemTargeting", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemTargetingUndefined: Self = StObject.set(x, "operatingSystemTargeting", js.undefined)
  }
}
