package typings.inversify.dtsInterfacesInterfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingScopeEnum extends js.Object {
  var Request: BindingScope
  var Singleton: BindingScope
  var Transient: BindingScope
}

object BindingScopeEnum {
  @scala.inline
  def apply(Request: BindingScope, Singleton: BindingScope, Transient: BindingScope): BindingScopeEnum = {
    val __obj = js.Dynamic.literal(Request = Request.asInstanceOf[js.Any], Singleton = Singleton.asInstanceOf[js.Any], Transient = Transient.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BindingScopeEnum]
  }
}

