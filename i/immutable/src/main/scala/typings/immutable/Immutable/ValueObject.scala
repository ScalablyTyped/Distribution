package typings.immutable.Immutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueObject extends js.Object {
  
  /**
    * True if this and the other Collection have value equality, as defined
    * by `Immutable.is()`.
    *
    * Note: This is equivalent to `Immutable.is(this, other)`, but provided to
    * allow for chained expressions.
    */
  def equals(other: js.Any): Boolean = js.native
}
object ValueObject {
  
  @scala.inline
  def apply(equals: js.Any => Boolean): ValueObject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals))
    __obj.asInstanceOf[ValueObject]
  }
  
  @scala.inline
  implicit class ValueObjectOps[Self <: ValueObject] (val x: Self) extends AnyVal {
    
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
    def setEquals(value: js.Any => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
  }
}
