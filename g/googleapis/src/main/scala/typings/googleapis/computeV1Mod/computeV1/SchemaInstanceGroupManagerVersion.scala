package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerVersion extends StObject {
  
  var instanceTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the version. Unique among all versions in the scope of this
    * managed instance group.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the intended number of instances to be created from the
    * instanceTemplate. The final number of instances created from the template
    * will be equal to:   - If expressed as a fixed number, the minimum of
    * either targetSize.fixed or instanceGroupManager.targetSize is used.  - if
    * expressed as a percent, the targetSize would be (targetSize.percent/100 *
    * InstanceGroupManager.targetSize) If there is a remainder, the number is
    * rounded up.  If unset, this version will update any remaining instances
    * not updated by another version. Read Starting a canary update for more
    * information.
    */
  var targetSize: js.UndefOr[SchemaFixedOrPercent] = js.undefined
}
object SchemaInstanceGroupManagerVersion {
  
  inline def apply(): SchemaInstanceGroupManagerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerVersion]
  }
  
  extension [Self <: SchemaInstanceGroupManagerVersion](x: Self) {
    
    inline def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTargetSize(value: SchemaFixedOrPercent): Self = StObject.set(x, "targetSize", value.asInstanceOf[js.Any])
    
    inline def setTargetSizeUndefined: Self = StObject.set(x, "targetSize", js.undefined)
  }
}
