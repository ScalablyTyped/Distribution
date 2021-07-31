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
  
  @scala.inline
  def apply(): SchemaTechnologyTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTechnologyTargeting]
  }
  
  @scala.inline
  implicit class SchemaTechnologyTargetingMutableBuilder[Self <: SchemaTechnologyTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceCapabilityTargeting(value: SchemaCriteriaTargeting): Self = StObject.set(x, "deviceCapabilityTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCapabilityTargetingUndefined: Self = StObject.set(x, "deviceCapabilityTargeting", js.undefined)
    
    @scala.inline
    def setDeviceCategoryTargeting(value: SchemaCriteriaTargeting): Self = StObject.set(x, "deviceCategoryTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCategoryTargetingUndefined: Self = StObject.set(x, "deviceCategoryTargeting", js.undefined)
    
    @scala.inline
    def setOperatingSystemTargeting(value: SchemaOperatingSystemTargeting): Self = StObject.set(x, "operatingSystemTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemTargetingUndefined: Self = StObject.set(x, "operatingSystemTargeting", js.undefined)
  }
}
