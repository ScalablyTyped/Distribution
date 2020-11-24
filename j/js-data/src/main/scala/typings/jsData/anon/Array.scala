package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array extends js.Object {
  
  def array(value: js.Any): Boolean = js.native
  
  def boolean(value: js.Any): Boolean = js.native
  
  def integer(value: js.Any): Boolean = js.native
  
  def `null`(value: js.Any): Boolean = js.native
  
  def number(value: js.Any): Boolean = js.native
  
  def `object`(value: js.Any): Boolean = js.native
  
  def string(value: js.Any): Boolean = js.native
}
object Array {
  
  @scala.inline
  def apply(
    array: js.Any => Boolean,
    boolean: js.Any => Boolean,
    integer: js.Any => Boolean,
    `null`: js.Any => Boolean,
    number: js.Any => Boolean,
    `object`: js.Any => Boolean,
    string: js.Any => Boolean
  ): Array = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction1(array), boolean = js.Any.fromFunction1(boolean), integer = js.Any.fromFunction1(integer), number = js.Any.fromFunction1(number), string = js.Any.fromFunction1(string))
    __obj.updateDynamic("null")(js.Any.fromFunction1(`null`))
    __obj.updateDynamic("object")(js.Any.fromFunction1(`object`))
    __obj.asInstanceOf[Array]
  }
  
  @scala.inline
  implicit class ArrayOps[Self <: Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArray(value: js.Any => Boolean): Self = this.set("array", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBoolean(value: js.Any => Boolean): Self = this.set("boolean", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInteger(value: js.Any => Boolean): Self = this.set("integer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNull(value: js.Any => Boolean): Self = this.set("null", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNumber(value: js.Any => Boolean): Self = this.set("number", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObject(value: js.Any => Boolean): Self = this.set("object", js.Any.fromFunction1(value))
    
    @scala.inline
    def setString(value: js.Any => Boolean): Self = this.set("string", js.Any.fromFunction1(value))
  }
}
