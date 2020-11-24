package typings.jsSchema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectConstructor extends js.Object {
  
  def like(obj: js.Any): ObjectConstructor = js.native
  
  def reference(obj: js.Any): ObjectConstructor = js.native
}
object ObjectConstructor {
  
  @scala.inline
  def apply(like: js.Any => ObjectConstructor, reference: js.Any => ObjectConstructor): ObjectConstructor = {
    val __obj = js.Dynamic.literal(like = js.Any.fromFunction1(like), reference = js.Any.fromFunction1(reference))
    __obj.asInstanceOf[ObjectConstructor]
  }
  
  @scala.inline
  implicit class ObjectConstructorOps[Self <: ObjectConstructor] (val x: Self) extends AnyVal {
    
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
    def setLike(value: js.Any => ObjectConstructor): Self = this.set("like", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReference(value: js.Any => ObjectConstructor): Self = this.set("reference", js.Any.fromFunction1(value))
  }
}
