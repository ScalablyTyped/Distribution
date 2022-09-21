package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAccountAdminsResponse extends StObject {
  
  /**
    * A collection of Admin instances.
    */
  var accountAdmins: js.UndefOr[js.Array[SchemaAdmin]] = js.undefined
}
object SchemaListAccountAdminsResponse {
  
  inline def apply(): SchemaListAccountAdminsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccountAdminsResponse]
  }
  
  extension [Self <: SchemaListAccountAdminsResponse](x: Self) {
    
    inline def setAccountAdmins(value: js.Array[SchemaAdmin]): Self = StObject.set(x, "accountAdmins", value.asInstanceOf[js.Any])
    
    inline def setAccountAdminsUndefined: Self = StObject.set(x, "accountAdmins", js.undefined)
    
    inline def setAccountAdminsVarargs(value: SchemaAdmin*): Self = StObject.set(x, "accountAdmins", js.Array(value*))
  }
}
