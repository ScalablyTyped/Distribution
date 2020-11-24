package typings.graphviz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasAttributes extends js.Object {
  
  def get(name: String): PossibleValue = js.native
  
  def set(name: String, value: PossibleValue): Unit = js.native
}
object HasAttributes {
  
  @scala.inline
  def apply(get: String => PossibleValue, set: (String, PossibleValue) => Unit): HasAttributes = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[HasAttributes]
  }
  
  @scala.inline
  implicit class HasAttributesOps[Self <: HasAttributes] (val x: Self) extends AnyVal {
    
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
    def setGet(value: String => PossibleValue): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, PossibleValue) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
