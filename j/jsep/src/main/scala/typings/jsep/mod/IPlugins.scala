package typings.jsep.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlugins extends StObject {
  
  def register(plugins: IPlugin*): Unit
  
  var registered: StringDictionary[IPlugin]
}
object IPlugins {
  
  inline def apply(register: /* repeated */ IPlugin => Unit, registered: StringDictionary[IPlugin]): IPlugins = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), registered = registered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlugins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPlugins] (val x: Self) extends AnyVal {
    
    inline def setRegister(value: /* repeated */ IPlugin => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    
    inline def setRegistered(value: StringDictionary[IPlugin]): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
  }
}
