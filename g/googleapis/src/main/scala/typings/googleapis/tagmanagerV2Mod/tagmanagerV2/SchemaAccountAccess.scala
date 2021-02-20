package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

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
    * Whether the user has no access, user access, or admin access to an
    * account.
    */
  var permission: js.UndefOr[String] = js.native
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
    def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
