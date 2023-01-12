package typings.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserCommon
  extends StObject
     with ObjectCommon {
  
  // Make it possible to narrow the object type using the custom property
  var custom: Unit
  
  /** Whether this user is enabled */
  var enabled: Boolean
  
  /** The username */
  @JSName("name")
  var name_UserCommon: String
  
  /** The hashed password */
  var password: String
}
object UserCommon {
  
  inline def apply(custom: Unit, enabled: Boolean, name: String, password: String): UserCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserCommon] (val x: Self) extends AnyVal {
    
    inline def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
