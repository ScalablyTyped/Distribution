package typings.ledgerhqHwTransport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observer[Ev] extends js.Object {
  
  def complete(): js.Any = js.native
  
  def error(e: js.Any): js.Any = js.native
  
  def next(event: Ev): js.Any = js.native
}
object Observer {
  
  @scala.inline
  def apply[Ev](complete: () => js.Any, error: js.Any => js.Any, next: Ev => js.Any): Observer[Ev] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[Observer[Ev]]
  }
  
  @scala.inline
  implicit class ObserverOps[Self <: Observer[_], Ev] (val x: Self with Observer[Ev]) extends AnyVal {
    
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
    def setComplete(value: () => js.Any): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: js.Any => js.Any): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNext(value: Ev => js.Any): Self = this.set("next", js.Any.fromFunction1(value))
  }
}
