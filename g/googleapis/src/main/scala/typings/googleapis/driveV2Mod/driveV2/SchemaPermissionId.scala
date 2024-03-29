package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPermissionId extends StObject {
  
  /**
    * The permission ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always drive#permissionId.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaPermissionId {
  
  inline def apply(): SchemaPermissionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionId]
  }
  
  extension [Self <: SchemaPermissionId](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
