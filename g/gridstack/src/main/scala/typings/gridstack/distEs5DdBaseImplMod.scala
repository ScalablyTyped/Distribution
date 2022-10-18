package typings.gridstack

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5DdBaseImplMod {
  
  /* note: abstract class */ @JSImport("gridstack/dist/es5/dd-base-impl", "DDBaseImplement")
  @js.native
  open class DDBaseImplement () extends StObject {
    
    def destroy(): Unit = js.native
    
    def disable(): Unit = js.native
    
    /** returns the enable state, but you have to call enable()/disable() to change (as other things need to happen) */
    def disabled: Boolean = js.native
    
    def enable(): Unit = js.native
    
    def off(event: String): Unit = js.native
    
    def on(event: String, callback: EventCallback): Unit = js.native
    
    def triggerEvent(eventName: String, event: Event): Boolean | Unit = js.native
  }
  
  type EventCallback = js.Function1[/* event */ Event, Boolean | Unit]
  
  trait HTMLElementExtendOpt[T] extends StObject {
    
    var el: HTMLElement
    
    var option: T
    
    def updateOption(T: Any): DDBaseImplement
  }
  object HTMLElementExtendOpt {
    
    inline def apply[T](el: HTMLElement, option: T, updateOption: Any => DDBaseImplement): HTMLElementExtendOpt[T] = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], updateOption = js.Any.fromFunction1(updateOption))
      __obj.asInstanceOf[HTMLElementExtendOpt[T]]
    }
    
    extension [Self <: HTMLElementExtendOpt[?], T](x: Self & HTMLElementExtendOpt[T]) {
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setOption(value: T): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setUpdateOption(value: Any => DDBaseImplement): Self = StObject.set(x, "updateOption", js.Any.fromFunction1(value))
    }
  }
}
