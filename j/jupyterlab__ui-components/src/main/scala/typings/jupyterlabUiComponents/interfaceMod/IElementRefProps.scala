package typings.jupyterlabUiComponents.interfaceMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IElementRefProps[E /* <: HTMLElement */] extends js.Object {
  
  /** Ref handler to access the instance of the internal HTML element. */
  var elementRef: js.UndefOr[js.Function1[/* ref */ E | Null, Unit]] = js.native
}
object IElementRefProps {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](): IElementRefProps[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementRefProps[E]]
  }
  
  @scala.inline
  implicit class IElementRefPropsOps[Self <: IElementRefProps[_], E /* <: HTMLElement */] (val x: Self with IElementRefProps[E]) extends AnyVal {
    
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
    def setElementRef(value: /* ref */ E | Null => Unit): Self = this.set("elementRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteElementRef: Self = this.set("elementRef", js.undefined)
  }
}
