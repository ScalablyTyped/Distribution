package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdminAuditData extends StObject {
  
  /**
    * The permission_delta when when creating or updating a Role.
    */
  var permissionDelta: js.UndefOr[SchemaPermissionDelta] = js.undefined
}
object SchemaAdminAuditData {
  
  inline def apply(): SchemaAdminAuditData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdminAuditData]
  }
  
  extension [Self <: SchemaAdminAuditData](x: Self) {
    
    inline def setPermissionDelta(value: SchemaPermissionDelta): Self = StObject.set(x, "permissionDelta", value.asInstanceOf[js.Any])
    
    inline def setPermissionDeltaUndefined: Self = StObject.set(x, "permissionDelta", js.undefined)
  }
}
