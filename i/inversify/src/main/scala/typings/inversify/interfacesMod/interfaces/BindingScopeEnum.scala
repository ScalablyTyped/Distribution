package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingScopeEnum extends js.Object {
  var Request: BindingScope = js.native
  var Singleton: BindingScope = js.native
  var Transient: BindingScope = js.native
}

object BindingScopeEnum {
  @scala.inline
  def apply(Request: BindingScope, Singleton: BindingScope, Transient: BindingScope): BindingScopeEnum = {
    val __obj = js.Dynamic.literal(Request = Request.asInstanceOf[js.Any], Singleton = Singleton.asInstanceOf[js.Any], Transient = Transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingScopeEnum]
  }
  @scala.inline
  implicit class BindingScopeEnumOps[Self <: BindingScopeEnum] (val x: Self) extends AnyVal {
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
    def setRequest(value: BindingScope): Self = this.set("Request", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingleton(value: BindingScope): Self = this.set("Singleton", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransient(value: BindingScope): Self = this.set("Transient", value.asInstanceOf[js.Any])
  }
  
}

