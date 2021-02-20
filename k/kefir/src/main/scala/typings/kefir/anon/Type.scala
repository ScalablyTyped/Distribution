package typings.kefir.anon

import typings.kefir.kefirStrings.value
import typings.kefir.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type[V]
  extends Event[V, js.Any] {
  
  var `type`: value = js.native
  
  var value: V = js.native
}
object Type {
  
  @scala.inline
  def apply[V](`type`: value, value: V): Type[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[V]]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type[_], V] (val x: Self with Type[V]) extends AnyVal {
    
    @scala.inline
    def setType(value: value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
