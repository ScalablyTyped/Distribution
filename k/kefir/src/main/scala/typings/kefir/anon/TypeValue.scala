package typings.kefir.anon

import typings.kefir.kefirStrings.error
import typings.kefir.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeValue[E]
  extends Event[js.Any, E] {
  
  var `type`: error = js.native
  
  var value: E = js.native
}
object TypeValue {
  
  @scala.inline
  def apply[E](`type`: error, value: E): TypeValue[E] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeValue[E]]
  }
  
  @scala.inline
  implicit class TypeValueMutableBuilder[Self <: TypeValue[_], E] (val x: Self with TypeValue[E]) extends AnyVal {
    
    @scala.inline
    def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: E): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
