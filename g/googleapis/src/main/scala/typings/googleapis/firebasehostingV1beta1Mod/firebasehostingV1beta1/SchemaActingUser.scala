package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains metadata about the user who performed an action, such as creating
  * a release or finalizing a version.
  */
@js.native
trait SchemaActingUser extends StObject {
  
  /**
    * The email address of the user when the user performed the action.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * A profile image URL for the user. May not be present if the user has
    * changed their email address or deleted their account.
    */
  var imageUrl: js.UndefOr[String] = js.native
}
object SchemaActingUser {
  
  @scala.inline
  def apply(): SchemaActingUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActingUser]
  }
  
  @scala.inline
  implicit class SchemaActingUserMutableBuilder[Self <: SchemaActingUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
  }
}
