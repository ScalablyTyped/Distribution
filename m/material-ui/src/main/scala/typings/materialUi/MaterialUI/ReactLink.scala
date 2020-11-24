package typings.materialUi.MaterialUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ReactLink is from "react/addons"
@js.native
trait ReactLink[T] extends js.Object {
  
  def requestChange(newValue: T): Unit = js.native
  
  var value: T = js.native
}
object ReactLink {
  
  @scala.inline
  def apply[T](requestChange: T => Unit, value: T): ReactLink[T] = {
    val __obj = js.Dynamic.literal(requestChange = js.Any.fromFunction1(requestChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactLink[T]]
  }
  
  @scala.inline
  implicit class ReactLinkOps[Self <: ReactLink[_], T] (val x: Self with ReactLink[T]) extends AnyVal {
    
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
    def setRequestChange(value: T => Unit): Self = this.set("requestChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
