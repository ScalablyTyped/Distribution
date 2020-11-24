package typings.jqrangeslider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQRangeSliderOptions extends js.Object {
  
   // speed of the wheel scrolling
  var arrows: js.UndefOr[Boolean] = js.native
  
   // fade out length when displaying value labels (only when valueLabels = "change")
  var delayOut: js.UndefOr[Double] = js.native
  
   // when to show value labels: "show" (always), "hide" (never) and "change" (only if slider changed)
  var durationIn: js.UndefOr[Double] = js.native
  
   // fade in length when displaying value labels (only when valueLabels = "change")
  var durationOut: js.UndefOr[Double] = js.native
  
   // show handles and make them clearly select the range. Warning: must be used with 'minimum' and must not be used with 'scale'
  var enabled: js.UndefOr[Boolean] = js.native
  
   // duration labels are shown after the user changed its values (only when valueLabels = "change")
  var range: js.UndefOr[Boolean | JQRangeSliderRangeLength] = js.native
  
   // configure a read-only slider
  var scales: js.UndefOr[js.Array[jQRangeSliderScale]] = js.native
  
   // lets you specify minimum and/or maximum range length
  var symmetricPositionning: js.UndefOr[Boolean] = js.native
  
   // hide the arrows or not
  var valueLabels: js.UndefOr[String] = js.native
  
  var wheelMode: js.UndefOr[String] = js.native
  
   // function of the wheel, "zoom", "scroll" or null
  var wheelSpeed: js.UndefOr[Double] = js.native
}
object JQRangeSliderOptions {
  
  @scala.inline
  def apply(): JQRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQRangeSliderOptions]
  }
  
  @scala.inline
  implicit class JQRangeSliderOptionsOps[Self <: JQRangeSliderOptions] (val x: Self) extends AnyVal {
    
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
    def setArrows(value: Boolean): Self = this.set("arrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    
    @scala.inline
    def setDelayOut(value: Double): Self = this.set("delayOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayOut: Self = this.set("delayOut", js.undefined)
    
    @scala.inline
    def setDurationIn(value: Double): Self = this.set("durationIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationIn: Self = this.set("durationIn", js.undefined)
    
    @scala.inline
    def setDurationOut(value: Double): Self = this.set("durationOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationOut: Self = this.set("durationOut", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean | JQRangeSliderRangeLength): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setScalesVarargs(value: jQRangeSliderScale*): Self = this.set("scales", js.Array(value :_*))
    
    @scala.inline
    def setScales(value: js.Array[jQRangeSliderScale]): Self = this.set("scales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScales: Self = this.set("scales", js.undefined)
    
    @scala.inline
    def setSymmetricPositionning(value: Boolean): Self = this.set("symmetricPositionning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymmetricPositionning: Self = this.set("symmetricPositionning", js.undefined)
    
    @scala.inline
    def setValueLabels(value: String): Self = this.set("valueLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueLabels: Self = this.set("valueLabels", js.undefined)
    
    @scala.inline
    def setWheelMode(value: String): Self = this.set("wheelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheelMode: Self = this.set("wheelMode", js.undefined)
    
    @scala.inline
    def setWheelSpeed(value: Double): Self = this.set("wheelSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheelSpeed: Self = this.set("wheelSpeed", js.undefined)
  }
}
