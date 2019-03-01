package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Request")(Request)
    __obj.updateDynamic("Singleton")(Singleton)
    __obj.updateDynamic("Transient")(Transient)
    __obj.asInstanceOf[BindingScopeEnum]
  }
}

