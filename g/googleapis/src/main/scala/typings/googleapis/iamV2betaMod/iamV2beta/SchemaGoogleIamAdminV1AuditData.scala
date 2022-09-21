package typings.googleapis.iamV2betaMod.iamV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIamAdminV1AuditData extends StObject {
  
  /**
    * The permission_delta when when creating or updating a Role.
    */
  var permissionDelta: js.UndefOr[SchemaGoogleIamAdminV1AuditDataPermissionDelta] = js.undefined
}
object SchemaGoogleIamAdminV1AuditData {
  
  inline def apply(): SchemaGoogleIamAdminV1AuditData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamAdminV1AuditData]
  }
  
  extension [Self <: SchemaGoogleIamAdminV1AuditData](x: Self) {
    
    inline def setPermissionDelta(value: SchemaGoogleIamAdminV1AuditDataPermissionDelta): Self = StObject.set(x, "permissionDelta", value.asInstanceOf[js.Any])
    
    inline def setPermissionDeltaUndefined: Self = StObject.set(x, "permissionDelta", js.undefined)
  }
}
