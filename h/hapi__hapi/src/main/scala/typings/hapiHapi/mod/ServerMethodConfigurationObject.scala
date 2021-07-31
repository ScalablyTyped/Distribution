package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerMethodConfigurationObject extends StObject {
  
  /**
    * the method function.
    */
  def method(args: js.Any*): js.Any
  /**
    * the method function.
    */
  @JSName("method")
  var method_Original: ServerMethod
  
  /**
    * the method name.
    */
  var name: String
  
  /**
    * (optional) settings.
    */
  var options: js.UndefOr[ServerMethodOptions] = js.undefined
}
object ServerMethodConfigurationObject {
  
  @scala.inline
  def apply(method: ServerMethod, name: String): ServerMethodConfigurationObject = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerMethodConfigurationObject]
  }
  
  @scala.inline
  implicit class ServerMethodConfigurationObjectMutableBuilder[Self <: ServerMethodConfigurationObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: ServerMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ServerMethodOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
