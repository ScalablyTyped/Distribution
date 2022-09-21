package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListLocationAdminsResponse extends StObject {
  
  /**
    * A collection of Admins.
    */
  var admins: js.UndefOr[js.Array[SchemaAdmin]] = js.undefined
}
object SchemaListLocationAdminsResponse {
  
  inline def apply(): SchemaListLocationAdminsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLocationAdminsResponse]
  }
  
  extension [Self <: SchemaListLocationAdminsResponse](x: Self) {
    
    inline def setAdmins(value: js.Array[SchemaAdmin]): Self = StObject.set(x, "admins", value.asInstanceOf[js.Any])
    
    inline def setAdminsUndefined: Self = StObject.set(x, "admins", js.undefined)
    
    inline def setAdminsVarargs(value: SchemaAdmin*): Self = StObject.set(x, "admins", js.Array(value*))
  }
}
