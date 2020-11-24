package typings.jsxPdf.anon

import typings.jsxPdf.mod.global.JSX.Child
import typings.jsxPdf.mod.global.JSX.DynamicChild
import typings.jsxPdf.mod.global.JSX.Element
import typings.pdfmake.interfacesMod.ContextPageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<{}> */
@js.native
trait Ele extends js.Object {
  
  var children: DynamicChild = js.native
}
object Ele {
  
  @scala.inline
  def apply(children: DynamicChild): Ele = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ele]
  }
  
  @scala.inline
  implicit class EleOps[Self <: Ele] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: Element*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = this.set("children", js.Any.fromFunction3(value))
    
    @scala.inline
    def setChildren(value: DynamicChild): Self = this.set("children", value.asInstanceOf[js.Any])
  }
}
