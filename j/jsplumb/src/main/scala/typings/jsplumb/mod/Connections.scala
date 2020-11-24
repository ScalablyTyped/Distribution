package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connections extends js.Object {
  
  def detach(): Unit = js.native
  
  def each(e: js.Function1[/* c */ Connection, Unit]): Unit = js.native
  
  var length: Double = js.native
}
object Connections {
  
  @scala.inline
  def apply(detach: () => Unit, each: js.Function1[/* c */ Connection, Unit] => Unit, length: Double): Connections = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), each = js.Any.fromFunction1(each), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connections]
  }
  
  @scala.inline
  implicit class ConnectionsOps[Self <: Connections] (val x: Self) extends AnyVal {
    
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
    def setDetach(value: () => Unit): Self = this.set("detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEach(value: js.Function1[/* c */ Connection, Unit] => Unit): Self = this.set("each", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}
