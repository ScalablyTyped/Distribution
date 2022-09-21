package typings.googleapis.policytroubleshooterV1betaMod.policytroubleshooterV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicytroubleshooterV1betaTroubleshootIamPolicyRequest extends StObject {
  
  /**
    * The information to use for checking whether a member has a permission for a resource.
    */
  var accessTuple: js.UndefOr[SchemaGoogleCloudPolicytroubleshooterV1betaAccessTuple] = js.undefined
}
object SchemaGoogleCloudPolicytroubleshooterV1betaTroubleshootIamPolicyRequest {
  
  inline def apply(): SchemaGoogleCloudPolicytroubleshooterV1betaTroubleshootIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicytroubleshooterV1betaTroubleshootIamPolicyRequest]
  }
  
  extension [Self <: SchemaGoogleCloudPolicytroubleshooterV1betaTroubleshootIamPolicyRequest](x: Self) {
    
    inline def setAccessTuple(value: SchemaGoogleCloudPolicytroubleshooterV1betaAccessTuple): Self = StObject.set(x, "accessTuple", value.asInstanceOf[js.Any])
    
    inline def setAccessTupleUndefined: Self = StObject.set(x, "accessTuple", js.undefined)
  }
}
