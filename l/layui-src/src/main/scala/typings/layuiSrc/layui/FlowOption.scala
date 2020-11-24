package typings.layuiSrc.layui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowOption extends js.Object {
  
  var done: js.UndefOr[
    js.Function2[
      /* page */ Double, 
      /* next */ js.Function2[/* html */ String, /* isMore */ Boolean, Unit], 
      Unit
    ]
  ] = js.native
  
  var elem: js.UndefOr[String | HTMLElement] = js.native
  
  var end: js.UndefOr[String] = js.native
  
  var isAuto: js.UndefOr[Boolean] = js.native
  
  var isLazyimg: js.UndefOr[Boolean] = js.native
  
  var mb: js.UndefOr[Double] = js.native
  
  var scrollElem: js.UndefOr[String | HTMLElement] = js.native
}
object FlowOption {
  
  @scala.inline
  def apply(): FlowOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowOption]
  }
  
  @scala.inline
  implicit class FlowOptionOps[Self <: FlowOption] (val x: Self) extends AnyVal {
    
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
    def setDone(
      value: (/* page */ Double, /* next */ js.Function2[/* html */ String, /* isMore */ Boolean, Unit]) => Unit
    ): Self = this.set("done", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = this.set("elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElem: Self = this.set("elem", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setIsAuto(value: Boolean): Self = this.set("isAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAuto: Self = this.set("isAuto", js.undefined)
    
    @scala.inline
    def setIsLazyimg(value: Boolean): Self = this.set("isLazyimg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLazyimg: Self = this.set("isLazyimg", js.undefined)
    
    @scala.inline
    def setMb(value: Double): Self = this.set("mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMb: Self = this.set("mb", js.undefined)
    
    @scala.inline
    def setScrollElem(value: String | HTMLElement): Self = this.set("scrollElem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollElem: Self = this.set("scrollElem", js.undefined)
  }
}
