package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IAM Policy information associated with the GCP resource described by the
  * Cloud SCC asset. This information is managed and defined by the GCP
  * resource and cannot be modified by the user.
  */
trait SchemaIamPolicy extends StObject {
  
  /**
    * The JSON representation of the Policy associated with the asset. See
    * https://cloud.google.com/iam/reference/rest/v1/Policy for format details.
    */
  var policyBlob: js.UndefOr[String] = js.undefined
}
object SchemaIamPolicy {
  
  @scala.inline
  def apply(): SchemaIamPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIamPolicy]
  }
  
  @scala.inline
  implicit class SchemaIamPolicyMutableBuilder[Self <: SchemaIamPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyBlob(value: String): Self = StObject.set(x, "policyBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyBlobUndefined: Self = StObject.set(x, "policyBlob", js.undefined)
  }
}
