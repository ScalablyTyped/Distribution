package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofrls extends js.Object {
  
  def handle_notify(): Double = js.native
  
  def handle_subscribe(): Double = js.native
  
  def handle_subscribe_uri(wuri: String): Double = js.native
  
  def update_subs(uri: String, event: String): Double = js.native
}
object Typeofrls {
  
  @scala.inline
  def apply(
    handle_notify: () => Double,
    handle_subscribe: () => Double,
    handle_subscribe_uri: String => Double,
    update_subs: (String, String) => Double
  ): Typeofrls = {
    val __obj = js.Dynamic.literal(handle_notify = js.Any.fromFunction0(handle_notify), handle_subscribe = js.Any.fromFunction0(handle_subscribe), handle_subscribe_uri = js.Any.fromFunction1(handle_subscribe_uri), update_subs = js.Any.fromFunction2(update_subs))
    __obj.asInstanceOf[Typeofrls]
  }
  
  @scala.inline
  implicit class TypeofrlsOps[Self <: Typeofrls] (val x: Self) extends AnyVal {
    
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
    def setHandle_notify(value: () => Double): Self = this.set("handle_notify", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandle_subscribe(value: () => Double): Self = this.set("handle_subscribe", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandle_subscribe_uri(value: String => Double): Self = this.set("handle_subscribe_uri", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate_subs(value: (String, String) => Double): Self = this.set("update_subs", js.Any.fromFunction2(value))
  }
}
