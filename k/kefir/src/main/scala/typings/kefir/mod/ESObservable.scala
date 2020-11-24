package typings.kefir.mod

import typings.kefir.anon.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ESObservable[T, S] extends js.Object {
  
  def subscribe(callbacks: ESObserver[T, S]): Unsubscribe = js.native
}
object ESObservable {
  
  @scala.inline
  def apply[T, S](subscribe: ESObserver[T, S] => Unsubscribe): ESObservable[T, S] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[ESObservable[T, S]]
  }
  
  @scala.inline
  implicit class ESObservableOps[Self <: ESObservable[_, _], T, S] (val x: Self with (ESObservable[T, S])) extends AnyVal {
    
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
    def setSubscribe(value: ESObserver[T, S] => Unsubscribe): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
}
