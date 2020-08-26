package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingOnSyntax[T] extends js.Object {
  def onActivation(fn: js.Function2[/* context */ Context, /* injectable */ T, T]): BindingWhenSyntax[T] = js.native
}

object BindingOnSyntax {
  @scala.inline
  def apply[T](onActivation: js.Function2[/* context */ Context, /* injectable */ T, T] => BindingWhenSyntax[T]): BindingOnSyntax[T] = {
    val __obj = js.Dynamic.literal(onActivation = js.Any.fromFunction1(onActivation))
    __obj.asInstanceOf[BindingOnSyntax[T]]
  }
  @scala.inline
  implicit class BindingOnSyntaxOps[Self <: BindingOnSyntax[_], T] (val x: Self with BindingOnSyntax[T]) extends AnyVal {
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
    def setOnActivation(value: js.Function2[/* context */ Context, /* injectable */ T, T] => BindingWhenSyntax[T]): Self = this.set("onActivation", js.Any.fromFunction1(value))
  }
  
}

