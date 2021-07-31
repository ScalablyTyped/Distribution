package typings.kefir.anon

import typings.kefir.kefirStrings.end
import typings.kefir.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueVoid
  extends StObject
     with Event[js.Any, js.Any] {
  
  var `type`: end
  
  var value: Unit
}
object ValueVoid {
  
  @scala.inline
  def apply(value: Unit): ValueVoid = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("end")
    __obj.asInstanceOf[ValueVoid]
  }
  
  @scala.inline
  implicit class ValueVoidMutableBuilder[Self <: ValueVoid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: end): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
