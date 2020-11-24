package typings.jqueryRateit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateItOptions extends js.Object {
  
  var backingfld: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var ispreset: js.UndefOr[Boolean] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[RateItMode] = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var resetable: js.UndefOr[Boolean] = js.native
  
  var starheight: js.UndefOr[Double] = js.native
  
  var starwidth: js.UndefOr[Double] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object RateItOptions {
  
  @scala.inline
  def apply(): RateItOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateItOptions]
  }
  
  @scala.inline
  implicit class RateItOptionsOps[Self <: RateItOptions] (val x: Self) extends AnyVal {
    
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
    def setBackingfld(value: String): Self = this.set("backingfld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackingfld: Self = this.set("backingfld", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIspreset(value: Boolean): Self = this.set("ispreset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIspreset: Self = this.set("ispreset", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMode(value: RateItMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setResetable(value: Boolean): Self = this.set("resetable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetable: Self = this.set("resetable", js.undefined)
    
    @scala.inline
    def setStarheight(value: Double): Self = this.set("starheight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarheight: Self = this.set("starheight", js.undefined)
    
    @scala.inline
    def setStarwidth(value: Double): Self = this.set("starwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarwidth: Self = this.set("starwidth", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
