package typings.jqueryNotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryNotifyInstance extends StObject {
  
  def close(): Unit
  
  var element: JQuery
  
  var isOpen: Boolean
  
  def open(): Unit
  
  var options: JQueryNotifyOptions
}
object JQueryNotifyInstance {
  
  inline def apply(
    close: () => Unit,
    element: JQuery,
    isOpen: Boolean,
    open: () => Unit,
    options: JQueryNotifyOptions
  ): JQueryNotifyInstance = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), element = element.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryNotifyInstance]
  }
  
  extension [Self <: JQueryNotifyInstance](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setElement(value: JQuery): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setOptions(value: JQueryNotifyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
