package typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPolicyOptions extends StObject {
  
  /**
    * Optional. The policy format version to be returned. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional
    * bindings must specify version 3. Policies without any conditional bindings may specify any valid value or leave the field unset. To learn which resources support conditions in their
    * IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    */
  var requestedPolicyVersion: js.UndefOr[Double] = js.native
}
object GetPolicyOptions {
  
  @scala.inline
  def apply(): GetPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyOptions]
  }
  
  @scala.inline
  implicit class GetPolicyOptionsMutableBuilder[Self <: GetPolicyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestedPolicyVersion(value: Double): Self = StObject.set(x, "requestedPolicyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedPolicyVersionUndefined: Self = StObject.set(x, "requestedPolicyVersion", js.undefined)
  }
}
