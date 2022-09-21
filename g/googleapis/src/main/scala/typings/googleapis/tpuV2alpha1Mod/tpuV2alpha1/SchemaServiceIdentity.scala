package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceIdentity extends StObject {
  
  /**
    * The email address of the service identity.
    */
  var email: js.UndefOr[String | Null] = js.undefined
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
  }
}
