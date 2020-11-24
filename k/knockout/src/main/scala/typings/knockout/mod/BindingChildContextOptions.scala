package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingChildContextOptions[T] extends js.Object {
  
  var as: js.UndefOr[String] = js.native
  
  var extend: js.UndefOr[BindingContextExtendCallback[T]] = js.native
  
  var noChildContext: js.UndefOr[Boolean] = js.native
}
object BindingChildContextOptions {
  
  @scala.inline
  def apply[T](): BindingChildContextOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingChildContextOptions[T]]
  }
  
  @scala.inline
  implicit class BindingChildContextOptionsOps[Self <: BindingChildContextOptions[_], T] (val x: Self with BindingChildContextOptions[T]) extends AnyVal {
    
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
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setExtend(value: (/* self */ BindingContext[T], /* parentContext */ BindingContext[T] | Null, T) => Unit): Self = this.set("extend", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    
    @scala.inline
    def setNoChildContext(value: Boolean): Self = this.set("noChildContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoChildContext: Self = this.set("noChildContext", js.undefined)
  }
}
