package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the Google Tag Manager Account access permissions.
  */
@js.native
trait SchemaAccountAccess extends js.Object {
  
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
  implicit class SchemaAccountAccessOps[Self <: SchemaAccountAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPermission(value: String): Self = this.set("permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
  }
}
