package typings.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserCommon extends ObjectCommon {
  
  // Make it possible to narrow the object type using the custom property
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  /** Whether this user is enabled */
  var enabled: Boolean = js.native
  
  /** The username */
  @JSName("name")
  var name_UserCommon: String = js.native
  
  /** The hashed password */
  var password: String = js.native
}
object UserCommon {
  
  @scala.inline
  def apply(enabled: Boolean, name: String, password: String): UserCommon = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCommon]
  }
  
  @scala.inline
  implicit class UserCommonMutableBuilder[Self <: UserCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
