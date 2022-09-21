package typings.googleapis.v1p4beta1Mod.cloudassetV1p4beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitySelector extends StObject {
  
  /**
    * Required. The identity appear in the form of members in [IAM policy binding](https://cloud.google.com/iam/reference/rest/v1/Binding). The examples of supported forms are: "user:mike@example.com", "group:admins@example.com", "domain:google.com", "serviceAccount:my-project-id@appspot.gserviceaccount.com". Notice that wildcard characters (such as * and ?) are not supported. You must give a specific identity.
    */
  var identity: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentitySelector {
  
  inline def apply(): SchemaIdentitySelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitySelector]
  }
  
  extension [Self <: SchemaIdentitySelector](x: Self) {
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityNull: Self = StObject.set(x, "identity", null)
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
  }
}
