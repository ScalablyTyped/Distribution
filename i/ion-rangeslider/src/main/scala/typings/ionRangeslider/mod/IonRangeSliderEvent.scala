package typings.ionRangeslider.mod

import typings.ionRangeslider.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonRangeSliderEvent extends js.Object {
  
   // MAX values
  var from: Double = js.native
  
   // FROM value
  var from_percent: Double = js.native
  
   // MAX prettified (if used)
  var from_pretty: String = js.native
  
   // FROM value in percents
  var from_value: Double = js.native
  
  var input: JQuery = js.native
  
   // MIN value
  var max: Double = js.native
  
   // MIN prettified (if used)
  var max_pretty: String = js.native
  
   // jQuery-link to sliders container
  var min: Double = js.native
  
   // TO index in values array (if used)
  var min_pretty: String = js.native
  
   // jQuery-link to input
  var slider: JQuery = js.native
  
   // FROM index in values array (if used)
  var to: Double = js.native
  
   // TO value
  var to_percent: Double = js.native
  
   // FROM prettified (if used)
  var to_pretty: String = js.native
  
   // TO value in percents
  var to_value: Double = js.native
}
object IonRangeSliderEvent {
  
  @scala.inline
  def apply(
    from: Double,
    from_percent: Double,
    from_pretty: String,
    from_value: Double,
    input: JQuery,
    max: Double,
    max_pretty: String,
    min: Double,
    min_pretty: String,
    slider: JQuery,
    to: Double,
    to_percent: Double,
    to_pretty: String,
    to_value: Double
  ): IonRangeSliderEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], from_percent = from_percent.asInstanceOf[js.Any], from_pretty = from_pretty.asInstanceOf[js.Any], from_value = from_value.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], max_pretty = max_pretty.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], min_pretty = min_pretty.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], to_percent = to_percent.asInstanceOf[js.Any], to_pretty = to_pretty.asInstanceOf[js.Any], to_value = to_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRangeSliderEvent]
  }
  
  @scala.inline
  implicit class IonRangeSliderEventOps[Self <: IonRangeSliderEvent] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom_percent(value: Double): Self = this.set("from_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom_pretty(value: String): Self = this.set("from_pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom_value(value: Double): Self = this.set("from_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: JQuery): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_pretty(value: String): Self = this.set("max_pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_pretty(value: String): Self = this.set("min_pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlider(value: JQuery): Self = this.set("slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo_percent(value: Double): Self = this.set("to_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo_pretty(value: String): Self = this.set("to_pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo_value(value: Double): Self = this.set("to_value", value.asInstanceOf[js.Any])
  }
}
