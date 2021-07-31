package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constants extends StObject {
  
  var constants: js.Any
  
  var cookies: js.Any
}
object Constants {
  
  @scala.inline
  def apply(constants: js.Any, cookies: js.Any): Constants = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants]
  }
  
  @scala.inline
  implicit class ConstantsMutableBuilder[Self <: Constants] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstants(value: js.Any): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookies(value: js.Any): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
  }
}
