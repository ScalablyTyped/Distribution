package typings.jupyterlabUiComponents.anon

import typings.luminoVirtualdom.anon.Attrs
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@lumino/virtualdom.@lumino/virtualdom.VirtualElement.IRenderer> */
@js.native
trait PartialIRenderer extends js.Object {
  
  var render: js.UndefOr[js.Function1[/* host */ HTMLElement, Unit]] = js.native
  
  var unrender: js.UndefOr[js.Function2[/* host */ HTMLElement, /* options */ js.UndefOr[Attrs], Unit]] = js.native
}
object PartialIRenderer {
  
  @scala.inline
  def apply(): PartialIRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIRenderer]
  }
  
  @scala.inline
  implicit class PartialIRendererOps[Self <: PartialIRenderer] (val x: Self) extends AnyVal {
    
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
    def setRender(value: /* host */ HTMLElement => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setUnrender(value: (/* host */ HTMLElement, /* options */ js.UndefOr[Attrs]) => Unit): Self = this.set("unrender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUnrender: Self = this.set("unrender", js.undefined)
  }
}
