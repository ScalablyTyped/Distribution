package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceIdentity extends StObject {
  
  /**
    * The email address of the service account that a service producer would use to access consumer resources.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique and stable id of the service account. https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts#ServiceAccount
    */
  var uniqueId: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceIdentity {
  
  inline def apply(): SchemaServiceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceIdentity]
  }
  
  extension [Self <: SchemaServiceIdentity](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    inline def setUniqueIdNull: Self = StObject.set(x, "uniqueId", null)
    
    inline def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
  }
}
