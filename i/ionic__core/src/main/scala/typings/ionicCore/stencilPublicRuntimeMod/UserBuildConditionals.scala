package typings.ionicCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserBuildConditionals extends StObject {
  
  var isBrowser: Boolean
  
  var isDev: Boolean
  
  var isServer: Boolean
  
  var isTesting: Boolean
}
object UserBuildConditionals {
  
  @scala.inline
  def apply(isBrowser: Boolean, isDev: Boolean, isServer: Boolean, isTesting: Boolean): UserBuildConditionals = {
    val __obj = js.Dynamic.literal(isBrowser = isBrowser.asInstanceOf[js.Any], isDev = isDev.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], isTesting = isTesting.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserBuildConditionals]
  }
  
  @scala.inline
  implicit class UserBuildConditionalsMutableBuilder[Self <: UserBuildConditionals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsBrowser(value: Boolean): Self = StObject.set(x, "isBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDev(value: Boolean): Self = StObject.set(x, "isDev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTesting(value: Boolean): Self = StObject.set(x, "isTesting", value.asInstanceOf[js.Any])
  }
}
