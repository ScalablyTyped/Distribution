package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature extends StObject {
  
  /**
    * A list of acceptable values. Only effective when the policy is `RESTRICTED`.
    */
  var allowedValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The policy of the feature.
    */
  var policy: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature](x: Self) {
    
    inline def setAllowedValues(value: js.Array[String]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesNull: Self = StObject.set(x, "allowedValues", null)
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: String*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyNull: Self = StObject.set(x, "policy", null)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
