package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the Google Tag Manager Account access permissions.
  */
trait SchemaAccountAccess extends StObject {
  
  /**
    * Whether the user has no access, user access, or admin access to an
    * account.
    */
  var permission: js.UndefOr[String] = js.undefined
}
object SchemaAccountAccess {
  
  inline def apply(): SchemaAccountAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountAccess]
  }
  
  extension [Self <: SchemaAccountAccess](x: Self) {
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
