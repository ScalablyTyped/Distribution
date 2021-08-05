package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the Google Tag Manager Account access permissions.
  */
trait SchemaAccountAccess extends StObject {
  
  /**
    * List of Account permissions. Valid account permissions are read and
    * manage.
    */
  var permission: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaAccountAccess {
  
  inline def apply(): SchemaAccountAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountAccess]
  }
  
  extension [Self <: SchemaAccountAccess](x: Self) {
    
    inline def setPermission(value: js.Array[String]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPermissionVarargs(value: String*): Self = StObject.set(x, "permission", js.Array(value :_*))
  }
}
