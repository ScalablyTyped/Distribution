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

object BindingInSyntax {
  @scala.inline
  def apply[T](
    inRequestScope: js.Function0[BindingWhenOnSyntax[T]],
    inSingletonScope: js.Function0[BindingWhenOnSyntax[T]],
    inTransientScope: js.Function0[BindingWhenOnSyntax[T]]
  ): BindingInSyntax[T] = {
    val __obj = js.Dynamic.literal(inRequestScope = inRequestScope, inSingletonScope = inSingletonScope, inTransientScope = inTransientScope)
  
    __obj.asInstanceOf[BindingInSyntax[T]]
  }
}

