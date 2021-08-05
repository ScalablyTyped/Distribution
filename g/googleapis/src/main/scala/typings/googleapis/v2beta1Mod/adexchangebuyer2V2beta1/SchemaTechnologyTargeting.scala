package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents targeting about various types of technology.
  */
trait SchemaTechnologyTargeting extends StObject {
  
  /**
    * IDs of device capabilities to be included/excluded.
    */
  var deviceCapabilityTargeting: js.UndefOr[SchemaCriteriaTargeting] = js.undefined
  
  /**
    * IDs of device categories to be included/excluded.
    */
  var deviceCategoryTargeting: js.UndefOr[SchemaCriteriaTargeting] = js.undefined
  
  /**
    * Operating system related targeting information.
    */
  var operatingSystemTargeting: js.UndefOr[SchemaOperatingSystemTargeting] = js.undefined
}
object SchemaTechnologyTargeting {
  
  inline def apply(): SchemaTechnologyTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTechnologyTargeting]
  }
  
  extension [Self <: SchemaTechnologyTargeting](x: Self) {
    
    inline def setDeviceCapabilityTargeting(value: SchemaCriteriaTargeting): Self = StObject.set(x, "deviceCapabilityTargeting", value.asInstanceOf[js.Any])
    
    inline def setDeviceCapabilityTargetingUndefined: Self = StObject.set(x, "deviceCapabilityTargeting", js.undefined)
    
    inline def setDeviceCategoryTargeting(value: SchemaCriteriaTargeting): Self = StObject.set(x, "deviceCategoryTargeting", value.asInstanceOf[js.Any])
    
    inline def setDeviceCategoryTargetingUndefined: Self = StObject.set(x, "deviceCategoryTargeting", js.undefined)
    
    inline def setOperatingSystemTargeting(value: SchemaOperatingSystemTargeting): Self = StObject.set(x, "operatingSystemTargeting", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemTargetingUndefined: Self = StObject.set(x, "operatingSystemTargeting", js.undefined)
  }
}
