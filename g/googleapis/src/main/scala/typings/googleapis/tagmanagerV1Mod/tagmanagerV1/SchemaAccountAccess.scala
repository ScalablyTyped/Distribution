package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the Google Tag Manager Account access permissions.
  */
@js.native
trait SchemaAccountAccess extends StObject {
  
  /**
    * List of Account permissions. Valid account permissions are read and
    * manage.
    */
  var permission: js.UndefOr[js.Array[String]] = js.native
}
object SchemaAccountAccess {
  
  @scala.inline
  def apply(): SchemaAccountAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountAccess]
  }
  
  @scala.inline
  implicit class SchemaAccountAccessMutableBuilder[Self <: SchemaAccountAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermission(value: js.Array[String]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setPermissionVarargs(value: String*): Self = StObject.set(x, "permission", js.Array(value :_*))
  }
}
