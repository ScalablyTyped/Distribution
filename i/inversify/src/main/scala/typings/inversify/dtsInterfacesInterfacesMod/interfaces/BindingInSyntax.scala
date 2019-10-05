package typings.inversify.dtsInterfacesInterfacesMod.interfaces

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
    inRequestScope: () => BindingWhenOnSyntax[T],
    inSingletonScope: () => BindingWhenOnSyntax[T],
    inTransientScope: () => BindingWhenOnSyntax[T]
  ): BindingInSyntax[T] = {
    val __obj = js.Dynamic.literal(inRequestScope = js.Any.fromFunction0(inRequestScope), inSingletonScope = js.Any.fromFunction0(inSingletonScope), inTransientScope = js.Any.fromFunction0(inTransientScope))
  
    __obj.asInstanceOf[BindingInSyntax[T]]
  }
}

