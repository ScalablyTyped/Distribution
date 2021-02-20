package typings.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value[U] extends StObject {
  
  var convert: Boolean = js.native
  
  var value: U = js.native
}
object Value {
  
  @scala.inline
  def apply[U](convert: Boolean, value: U): Value[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[U]]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value[_], U] (val x: Self with Value[U]) extends AnyVal {
    
    @scala.inline
    def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: U): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
