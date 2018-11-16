package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BindingOnSyntax[T] extends js.Object {
  def onActivation(fn: js.Function2[/* context */ Context, /* injectable */ T, T]): BindingWhenSyntax[T]
}

