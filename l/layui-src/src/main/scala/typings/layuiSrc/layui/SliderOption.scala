package typings.layuiSrc.layui

import typings.layuiSrc.layuiSrcStrings.default
import typings.layuiSrc.layuiSrcStrings.vertical
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderOption extends js.Object {
  
  var change: js.UndefOr[js.Function1[/* value */ Double | js.Array[Double], String]] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var elem: js.UndefOr[String | HTMLElement] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var input: js.UndefOr[Boolean] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var mix: js.UndefOr[Double] = js.native
  
  var range: js.UndefOr[Boolean] = js.native
  
  var setTips: js.UndefOr[js.Function1[/* value */ Double | js.Array[Double], String]] = js.native
  
  var showstep: js.UndefOr[Boolean] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var tips: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[default | vertical] = js.native
  
  var value: js.UndefOr[Double | js.Array[Double]] = js.native
}
object SliderOption {
  
  @scala.inline
  def apply(): SliderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOption]
  }
  
  @scala.inline
  implicit class SliderOptionOps[Self <: SliderOption] (val x: Self) extends AnyVal {
    
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
    def setChange(value: /* value */ Double | js.Array[Double] => String): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = this.set("elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElem: Self = this.set("elem", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInput(value: Boolean): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMix(value: Double): Self = this.set("mix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMix: Self = this.set("mix", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setSetTips(value: /* value */ Double | js.Array[Double] => String): Self = this.set("setTips", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTips: Self = this.set("setTips", js.undefined)
    
    @scala.inline
    def setShowstep(value: Boolean): Self = this.set("showstep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowstep: Self = this.set("showstep", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTips(value: Boolean): Self = this.set("tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTips: Self = this.set("tips", js.undefined)
    
    @scala.inline
    def setType(value: default | vertical): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Double | js.Array[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
