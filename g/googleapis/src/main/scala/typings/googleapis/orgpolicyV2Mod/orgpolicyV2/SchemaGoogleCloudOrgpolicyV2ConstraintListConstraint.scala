package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudOrgpolicyV2ConstraintListConstraint extends StObject {
  
  /**
    * Indicates whether values grouped into categories can be used in `Policy.allowed_values` and `Policy.denied_values`. For example, `"in:Python"` would match any value in the 'Python' group.
    */
  var supportsIn: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether subtrees of Cloud Resource Manager resource hierarchy can be used in `Policy.allowed_values` and `Policy.denied_values`. For example, `"under:folders/123"` would match any resource under the 'folders/123' folder.
    */
  var supportsUnder: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudOrgpolicyV2ConstraintListConstraint {
  
  inline def apply(): SchemaGoogleCloudOrgpolicyV2ConstraintListConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudOrgpolicyV2ConstraintListConstraint]
  }
  
  extension [Self <: SchemaGoogleCloudOrgpolicyV2ConstraintListConstraint](x: Self) {
    
    inline def setSupportsIn(value: Boolean): Self = StObject.set(x, "supportsIn", value.asInstanceOf[js.Any])
    
    inline def setSupportsInNull: Self = StObject.set(x, "supportsIn", null)
    
    inline def setSupportsInUndefined: Self = StObject.set(x, "supportsIn", js.undefined)
    
    inline def setSupportsUnder(value: Boolean): Self = StObject.set(x, "supportsUnder", value.asInstanceOf[js.Any])
    
    inline def setSupportsUnderNull: Self = StObject.set(x, "supportsUnder", null)
    
    inline def setSupportsUnderUndefined: Self = StObject.set(x, "supportsUnder", js.undefined)
  }
}
