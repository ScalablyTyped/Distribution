package typings.googleapis.v1p1alpha1Mod.securitycenterV1p1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSecuritycenterV1p1beta1IamPolicy extends StObject {
  
  /**
    * The JSON representation of the Policy associated with the asset. See https://cloud.google.com/iam/docs/reference/rest/v1/Policy for format details.
    */
  var policyBlob: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSecuritycenterV1p1beta1IamPolicy {
  
  inline def apply(): SchemaGoogleCloudSecuritycenterV1p1beta1IamPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSecuritycenterV1p1beta1IamPolicy]
  }
  
  extension [Self <: SchemaGoogleCloudSecuritycenterV1p1beta1IamPolicy](x: Self) {
    
    inline def setPolicyBlob(value: String): Self = StObject.set(x, "policyBlob", value.asInstanceOf[js.Any])
    
    inline def setPolicyBlobNull: Self = StObject.set(x, "policyBlob", null)
    
    inline def setPolicyBlobUndefined: Self = StObject.set(x, "policyBlob", js.undefined)
  }
}
