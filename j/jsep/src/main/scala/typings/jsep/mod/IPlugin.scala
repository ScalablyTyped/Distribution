package typings.jsep.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlugin extends StObject {
  
  def init(): Unit
  
  var name: String
}
object IPlugin {
  
  inline def apply(init: () => Unit, name: String): IPlugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPlugin] (val x: Self) extends AnyVal {
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
