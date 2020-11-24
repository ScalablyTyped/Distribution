package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Api[A] extends js.Object {
  
  var api: A = js.native
  
  def cancel(): js.Any = js.native
}
object Api {
  
  @scala.inline
  def apply[A](api: A, cancel: () => js.Any): Api[A] = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[Api[A]]
  }
  
  @scala.inline
  implicit class ApiOps[Self <: Api[_], A] (val x: Self with Api[A]) extends AnyVal {
    
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
    def setApi(value: A): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: () => js.Any): Self = this.set("cancel", js.Any.fromFunction0(value))
  }
}
