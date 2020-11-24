package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingInSyntax[T] extends js.Object {
  
  def inRequestScope(): BindingWhenOnSyntax[T] = js.native
  
  def inSingletonScope(): BindingWhenOnSyntax[T] = js.native
  
  def inTransientScope(): BindingWhenOnSyntax[T] = js.native
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
  
  @scala.inline
  implicit class BindingInSyntaxOps[Self <: BindingInSyntax[_], T] (val x: Self with BindingInSyntax[T]) extends AnyVal {
    
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
    def setInRequestScope(value: () => BindingWhenOnSyntax[T]): Self = this.set("inRequestScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInSingletonScope(value: () => BindingWhenOnSyntax[T]): Self = this.set("inSingletonScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInTransientScope(value: () => BindingWhenOnSyntax[T]): Self = this.set("inTransientScope", js.Any.fromFunction0(value))
  }
}
