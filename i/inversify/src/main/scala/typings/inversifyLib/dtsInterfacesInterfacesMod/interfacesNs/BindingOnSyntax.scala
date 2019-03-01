package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingOnSyntax[T] extends js.Object {
  def onActivation(fn: js.Function2[/* context */ Context, /* injectable */ T, T]): BindingWhenSyntax[T]
}

object BindingOnSyntax {
  @scala.inline
  def apply[T](
    onActivation: js.Function1[js.Function2[/* context */ Context, /* injectable */ T, T], BindingWhenSyntax[T]]
  ): BindingOnSyntax[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onActivation")(onActivation)
    __obj.asInstanceOf[BindingOnSyntax[T]]
  }
}

