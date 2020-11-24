package typings.luminoPolling.anon

import typings.luminoPolling.mod.IPoll.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel[T, U, V /* <: String */] extends js.Object {
  
  def cancel(last: State[T, U, V]): Boolean = js.native
}
object Cancel {
  
  @scala.inline
  def apply[T, U, V /* <: String */](cancel: State[T, U, V] => Boolean): Cancel[T, U, V] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel))
    __obj.asInstanceOf[Cancel[T, U, V]]
  }
  
  @scala.inline
  implicit class CancelOps[Self <: Cancel[_, _, _], T, U, V /* <: String */] (val x: Self with (Cancel[T, U, V])) extends AnyVal {
    
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
    def setCancel(value: State[T, U, V] => Boolean): Self = this.set("cancel", js.Any.fromFunction1(value))
  }
}
