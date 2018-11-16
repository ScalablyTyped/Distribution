package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BindingInSyntax[T] extends js.Object {
  def inRequestScope(): BindingWhenOnSyntax[T]
  def inSingletonScope(): BindingWhenOnSyntax[T]
  def inTransientScope(): BindingWhenOnSyntax[T]
}

