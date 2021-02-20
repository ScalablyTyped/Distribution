package typings.jquerymobile

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedToolbarEvents extends StObject {
  
  var create: js.UndefOr[JQueryMobileEvent] = js.native
}
object FixedToolbarEvents {
  
  @scala.inline
  def apply(): FixedToolbarEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedToolbarEvents]
  }
  
  @scala.inline
  implicit class FixedToolbarEventsMutableBuilder[Self <: FixedToolbarEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
