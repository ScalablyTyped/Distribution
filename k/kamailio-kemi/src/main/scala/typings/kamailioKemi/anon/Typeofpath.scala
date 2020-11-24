package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpath extends js.Object {
  
  def add_path(): Double = js.native
  
  def add_path_received(): Double = js.native
  
  def add_path_received_user(_user: String): Double = js.native
  
  def add_path_received_user_params(_user: String, _params: String): Double = js.native
  
  def add_path_user(_user: String): Double = js.native
  
  def add_path_user_params(_user: String, _params: String): Double = js.native
}
object Typeofpath {
  
  @scala.inline
  def apply(
    add_path: () => Double,
    add_path_received: () => Double,
    add_path_received_user: String => Double,
    add_path_received_user_params: (String, String) => Double,
    add_path_user: String => Double,
    add_path_user_params: (String, String) => Double
  ): Typeofpath = {
    val __obj = js.Dynamic.literal(add_path = js.Any.fromFunction0(add_path), add_path_received = js.Any.fromFunction0(add_path_received), add_path_received_user = js.Any.fromFunction1(add_path_received_user), add_path_received_user_params = js.Any.fromFunction2(add_path_received_user_params), add_path_user = js.Any.fromFunction1(add_path_user), add_path_user_params = js.Any.fromFunction2(add_path_user_params))
    __obj.asInstanceOf[Typeofpath]
  }
  
  @scala.inline
  implicit class TypeofpathOps[Self <: Typeofpath] (val x: Self) extends AnyVal {
    
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
    def setAdd_path(value: () => Double): Self = this.set("add_path", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAdd_path_received(value: () => Double): Self = this.set("add_path_received", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAdd_path_received_user(value: String => Double): Self = this.set("add_path_received_user", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdd_path_received_user_params(value: (String, String) => Double): Self = this.set("add_path_received_user_params", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAdd_path_user(value: String => Double): Self = this.set("add_path_user", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdd_path_user_params(value: (String, String) => Double): Self = this.set("add_path_user_params", js.Any.fromFunction2(value))
  }
}
