package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingOnSyntax[T] extends js.Object {
  def onActivation(fn: js.Function2[/* context */ Context, /* injectable */ T, T]): BindingWhenSyntax[T]
}

object BindingOnSyntax {
  @scala.inline
  def apply[T](onActivation: js.Function2[/* context */ Context, /* injectable */ T, T] => BindingWhenSyntax[T]): BindingOnSyntax[T] = {
    val __obj = js.Dynamic.literal(onActivation = js.Any.fromFunction1(onActivation))
  
    __obj.asInstanceOf[BindingOnSyntax[T]]
  }
}

