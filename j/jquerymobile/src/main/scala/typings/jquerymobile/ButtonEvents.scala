package typings.jquerymobile

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonEvents extends StObject {
  
  var create: js.UndefOr[JQueryMobileEvent] = js.native
}
object ButtonEvents {
  
  @scala.inline
  def apply(): ButtonEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonEvents]
  }
  
  @scala.inline
  implicit class ButtonEventsMutableBuilder[Self <: ButtonEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
