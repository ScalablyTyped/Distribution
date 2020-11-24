package typings.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPolicyOptions extends js.Object {
  
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
  implicit class GetPolicyOptionsOps[Self <: GetPolicyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequestedPolicyVersion(value: Double): Self = this.set("requestedPolicyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedPolicyVersion: Self = this.set("requestedPolicyVersion", js.undefined)
  }
}
