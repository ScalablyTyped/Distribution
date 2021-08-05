package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupManagerVersion extends StObject {
  
  /**
    * The URL of the instance template that is specified for this managed instance group. The group uses this template to create new instances in the managed instance group until the
    * `targetSize` for this version is reached. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the
    * group's updatePolicy.type to PROACTIVE; in those cases, existing instances are updated until the `targetSize` for this version is reached.
    */
  var instanceTemplate: js.UndefOr[String] = js.undefined
  
  /** Name of the version. Unique among all versions in the scope of this managed instance group. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the intended number of instances to be created from the instanceTemplate. The final number of instances created from the template will be equal to:
    * - If expressed as a fixed number, the minimum of either targetSize.fixed or instanceGroupManager.targetSize is used.
    * - if expressed as a percent, the targetSize would be (targetSize.percent/100 * InstanceGroupManager.targetSize) If there is a remainder, the number is rounded up.  If unset, this
    * version will update any remaining instances not updated by another version. Read Starting a canary update for more information.
    */
  var targetSize: js.UndefOr[FixedOrPercent] = js.undefined
}
object InstanceGroupManagerVersion {
  
  inline def apply(): InstanceGroupManagerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerVersion]
  }
  
  extension [Self <: InstanceGroupManagerVersion](x: Self) {
    
    inline def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTargetSize(value: FixedOrPercent): Self = StObject.set(x, "targetSize", value.asInstanceOf[js.Any])
    
    inline def setTargetSizeUndefined: Self = StObject.set(x, "targetSize", js.undefined)
  }
}
