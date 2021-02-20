package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an impersonation, where an admin acts on behalf of an end
  * user. Information about the acting admin is not currently available.
  */
@js.native
trait SchemaImpersonation extends StObject {
  
  /**
    * The impersonated user.
    */
  var impersonatedUser: js.UndefOr[SchemaUser] = js.native
}
object SchemaImpersonation {
  
  @scala.inline
  def apply(): SchemaImpersonation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImpersonation]
  }
  
  @scala.inline
  implicit class SchemaImpersonationMutableBuilder[Self <: SchemaImpersonation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImpersonatedUser(value: SchemaUser): Self = StObject.set(x, "impersonatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpersonatedUserUndefined: Self = StObject.set(x, "impersonatedUser", js.undefined)
  }
}
