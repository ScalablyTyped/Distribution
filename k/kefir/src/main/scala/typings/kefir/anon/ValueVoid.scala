package typings.kefir.anon

import typings.kefir.kefirStrings.end
import typings.kefir.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueVoid
  extends Event[js.Any, js.Any] {
  
  var `type`: end = js.native
  
  var value: Unit = js.native
}
object ValueVoid {
  
  @scala.inline
  def apply(`type`: end, value: Unit): ValueVoid = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
