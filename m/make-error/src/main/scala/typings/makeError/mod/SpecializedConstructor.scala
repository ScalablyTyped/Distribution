package typings.makeError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpecializedConstructor[T] extends js.Object {
  
  var super_ : js.Any = js.native
}
object SpecializedConstructor {
  
  @scala.inline
  def apply[T](super_ : js.Any): SpecializedConstructor[T] = {
    val __obj = js.Dynamic.literal(super_ = super_.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecializedConstructor[T]]
  }
  
  @scala.inline
  implicit class SpecializedConstructorOps[Self <: SpecializedConstructor[_], T] (val x: Self with SpecializedConstructor[T]) extends AnyVal {
    
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
    def setSuper_(value: js.Any): Self = this.set("super_", value.asInstanceOf[js.Any])
  }
}
