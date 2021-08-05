package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPolicyOptions extends StObject {
  
  /**
    * Optional. The policy format version to be returned.Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.Requests for policies with any conditional
    * bindings must specify version 3. Policies without any conditional bindings may specify any valid value or leave the field unset.To learn which resources support conditions in their
    * IAM policies, see the IAM documentation (https://cloud.google.com/iam/help/conditions/resource-policies).
    */
  var requestedPolicyVersion: js.UndefOr[Double] = js.undefined
}
object GetPolicyOptions {
  
  inline def apply(): GetPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyOptions]
  }
  
  extension [Self <: GetPolicyOptions](x: Self) {
    
    inline def setRequestedPolicyVersion(value: Double): Self = StObject.set(x, "requestedPolicyVersion", value.asInstanceOf[js.Any])
    
    inline def setRequestedPolicyVersionUndefined: Self = StObject.set(x, "requestedPolicyVersion", js.undefined)
  }
}
