package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailsHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var onToggle: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
}
object DetailsHTMLAttributes {
  
  @scala.inline
  def apply[T](): DetailsHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class DetailsHTMLAttributesOps[Self <: DetailsHTMLAttributes[_], T] (val x: Self with DetailsHTMLAttributes[T]) extends AnyVal {
    
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
    def setOnToggle(value: /* event */ Event => Unit): Self = this.set("onToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
}
