package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentUnregisterOptions extends StObject {
  
  var all: js.UndefOr[Boolean] = js.undefined
}
object UserAgentUnregisterOptions {
  
  @scala.inline
  def apply(): UserAgentUnregisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentUnregisterOptions]
  }
  
  @scala.inline
  implicit class UserAgentUnregisterOptionsMutableBuilder[Self <: UserAgentUnregisterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
  }
}
