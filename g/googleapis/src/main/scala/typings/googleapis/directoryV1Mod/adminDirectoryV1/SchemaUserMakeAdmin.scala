package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON request template for setting/revoking admin status of a user in
  * Directory API.
  */
@js.native
trait SchemaUserMakeAdmin extends StObject {
  
  /**
    * Boolean indicating new admin status of the user
    */
  var status: js.UndefOr[Boolean] = js.native
}
object SchemaUserMakeAdmin {
  
  @scala.inline
  def apply(): SchemaUserMakeAdmin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserMakeAdmin]
  }
  
  @scala.inline
  implicit class SchemaUserMakeAdminMutableBuilder[Self <: SchemaUserMakeAdmin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
