package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUndeleteRoleRequest extends StObject {
  
  /**
    * Used to perform a consistent read-modify-write.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
}
object SchemaUndeleteRoleRequest {
  
  inline def apply(): SchemaUndeleteRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUndeleteRoleRequest]
  }
  
  extension [Self <: SchemaUndeleteRoleRequest](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
