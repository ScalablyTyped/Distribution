package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceAccessControl extends StObject {
  
  /**
    * The GCP IAM Policy to set on the resource.
    */
  var gcpIamPolicy: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceAccessControl {
  
  inline def apply(): SchemaResourceAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceAccessControl]
  }
  
  extension [Self <: SchemaResourceAccessControl](x: Self) {
    
    inline def setGcpIamPolicy(value: String): Self = StObject.set(x, "gcpIamPolicy", value.asInstanceOf[js.Any])
    
    inline def setGcpIamPolicyNull: Self = StObject.set(x, "gcpIamPolicy", null)
    
    inline def setGcpIamPolicyUndefined: Self = StObject.set(x, "gcpIamPolicy", js.undefined)
  }
}
