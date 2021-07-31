package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerStateFormat extends StObject {
  
  var name: String
  
  var options: ServerStateCookieOptions
  
  var value: String
}
object ServerStateFormat {
  
  @scala.inline
  def apply(name: String, options: ServerStateCookieOptions, value: String): ServerStateFormat = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerStateFormat]
  }
  
  @scala.inline
  implicit class ServerStateFormatMutableBuilder[Self <: ServerStateFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ServerStateCookieOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
