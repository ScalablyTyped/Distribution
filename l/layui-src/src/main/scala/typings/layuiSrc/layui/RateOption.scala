package typings.layuiSrc.layui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateOption extends js.Object {
  
  var choose: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var elem: js.UndefOr[String | HTMLElement] = js.native
  
  var half: js.UndefOr[Boolean] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var setText: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var text: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object RateOption {
  
  @scala.inline
  def apply(): RateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateOption]
  }
  
  @scala.inline
  implicit class RateOptionOps[Self <: RateOption] (val x: Self) extends AnyVal {
    
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
    def setChoose(value: /* value */ Double => Unit): Self = this.set("choose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChoose: Self = this.set("choose", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = this.set("elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElem: Self = this.set("elem", js.undefined)
    
    @scala.inline
    def setHalf(value: Boolean): Self = this.set("half", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHalf: Self = this.set("half", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setSetText(value: /* value */ Double => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetText: Self = this.set("setText", js.undefined)
    
    @scala.inline
    def setText(value: Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
