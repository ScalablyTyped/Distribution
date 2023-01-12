package typings.gridstack

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDdResizableHandleMod {
  
  @JSImport("gridstack/dist/dd-resizable-handle", "DDResizableHandle")
  @js.native
  open class DDResizableHandle protected () extends StObject {
    def this(host: HTMLElement, direction: String, option: DDResizableHandleOpt) = this()
    
    /** call this when resize handle needs to be removed and cleaned up */
    def destroy(): DDResizableHandle = js.native
  }
  
  trait DDResizableHandleOpt extends StObject {
    
    var move: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var start: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var stop: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  }
  object DDResizableHandleOpt {
    
    inline def apply(): DDResizableHandleOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDResizableHandleOpt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DDResizableHandleOpt] (val x: Self) extends AnyVal {
      
      inline def setMove(value: /* event */ Any => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
      
      inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      inline def setStart(value: /* event */ Any => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: /* event */ Any => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    }
  }
}
