package typings.jquerymobile

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapsibleSetEvents extends StObject {
  
  var create: js.UndefOr[JQueryMobileEvent] = js.native
}
object CollapsibleSetEvents {
  
  @scala.inline
  def apply(): CollapsibleSetEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleSetEvents]
  }
  
  @scala.inline
  implicit class CollapsibleSetEventsMutableBuilder[Self <: CollapsibleSetEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
