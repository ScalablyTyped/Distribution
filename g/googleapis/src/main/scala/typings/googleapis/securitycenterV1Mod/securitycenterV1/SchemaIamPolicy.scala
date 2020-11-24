package typings.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IAM Policy information associated with the GCP resource described by the
  * Cloud SCC asset. This information is managed and defined by the GCP
  * resource and cannot be modified by the user.
  */
@js.native
trait SchemaIamPolicy extends js.Object {
  
  /**
    * The JSON representation of the Policy associated with the asset. See
    * https://cloud.google.com/iam/reference/rest/v1/Policy for format details.
    */
  var policyBlob: js.UndefOr[String] = js.native
}
object SchemaIamPolicy {
  
  @scala.inline
  def apply(): SchemaIamPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIamPolicy]
  }
  
  @scala.inline
  implicit class SchemaIamPolicyOps[Self <: SchemaIamPolicy] (val x: Self) extends AnyVal {
    
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
    def setPolicyBlob(value: String): Self = this.set("policyBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyBlob: Self = this.set("policyBlob", js.undefined)
  }
}
