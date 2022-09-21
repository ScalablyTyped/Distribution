package typings.googleapis.policytroubleshooterV1Mod.policytroubleshooterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest extends StObject {
  
  /**
    * The information to use for checking whether a principal has a permission for a resource.
    */
  var accessTuple: js.UndefOr[SchemaGoogleCloudPolicytroubleshooterV1AccessTuple] = js.undefined
}
object SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest {
  
  inline def apply(): SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest]
  }
  
  extension [Self <: SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest](x: Self) {
    
    inline def setAccessTuple(value: SchemaGoogleCloudPolicytroubleshooterV1AccessTuple): Self = StObject.set(x, "accessTuple", value.asInstanceOf[js.Any])
    
    inline def setAccessTupleUndefined: Self = StObject.set(x, "accessTuple", js.undefined)
  }
}
