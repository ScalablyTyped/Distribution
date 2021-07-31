package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotAttributes extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var onSlotchange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var slot: js.UndefOr[String] = js.undefined
}
object SlotAttributes {
  
  @scala.inline
  def apply(): SlotAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotAttributes]
  }
  
  @scala.inline
  implicit class SlotAttributesMutableBuilder[Self <: SlotAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnSlotchange(value: /* event */ Event => Unit): Self = StObject.set(x, "onSlotchange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlotchangeUndefined: Self = StObject.set(x, "onSlotchange", js.undefined)
    
    @scala.inline
    def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
  }
}
