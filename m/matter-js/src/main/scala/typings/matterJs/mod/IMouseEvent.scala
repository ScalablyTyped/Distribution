package typings.matterJs.mod

import typings.matterJs.matterJsStrings.mousedown
import typings.matterJs.matterJsStrings.mousemove
import typings.matterJs.matterJsStrings.mouseup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMouseEvent[T] extends IEvent[T] {
  
  @JSName("name")
  var name_IMouseEvent: mousedown | mousemove | mouseup = js.native
}
object IMouseEvent {
  
  @scala.inline
  def apply[T](name: mousedown | mousemove | mouseup, source: T): IMouseEvent[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEvent[T]]
  }
  
  @scala.inline
  implicit class IMouseEventOps[Self <: IMouseEvent[_], T] (val x: Self with IMouseEvent[T]) extends AnyVal {
    
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
    def setName(value: mousedown | mousemove | mouseup): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
