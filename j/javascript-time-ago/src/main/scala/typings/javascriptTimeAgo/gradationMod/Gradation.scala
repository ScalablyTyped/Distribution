package typings.javascriptTimeAgo.gradationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gradation extends js.Object {
  
  var factor: js.UndefOr[Double] = js.native
  
  var granularity: js.UndefOr[Double] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
  
  var threshold_for_day: js.UndefOr[Double] = js.native
  
  var threshold_for_hour: js.UndefOr[Double] = js.native
  
  var threshold_for_minute: js.UndefOr[Double] = js.native
  
  var threshold_for_month: js.UndefOr[Double] = js.native
  
  var threshold_for_now: js.UndefOr[Double] = js.native
  
  var threshold_for_second: js.UndefOr[Double] = js.native
  
  var threshold_for_week: js.UndefOr[Double] = js.native
  
  var threshold_for_year: js.UndefOr[Double] = js.native
  
  var unit: js.UndefOr[Unit] = js.native
}
object Gradation {
  
  @scala.inline
  def apply(): Gradation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gradation]
  }
  
  @scala.inline
  implicit class GradationOps[Self <: Gradation] (val x: Self) extends AnyVal {
    
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
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    
    @scala.inline
    def setGranularity(value: Double): Self = this.set("granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    
    @scala.inline
    def setThreshold_for_day(value: Double): Self = this.set("threshold_for_day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold_for_day: Self = this.set("threshold_for_day", js.undefined)
    
    @scala.inline
    def setThreshold_for_hour(value: Double): Self = this.set("threshold_for_hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold_for_hour: Self = this.set("threshold_for_hour", js.undefined)
    
    @scala.inline
    def setThreshold_for_minute(value: Double): Self = this.set("threshold_for_minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold_for_minute: Self = this.set("threshold_for_minute", js.undefined)
    
    @scala.inline
    def setThreshold_for_month(value: Double): Self = this.set("threshold_for_month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold_for_month: Self = this.set("threshold_for_month", js.undefined)
    
    @scala.inline
    def setThreshold_for_now(value: Double): Self = this.set("threshold_for_now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold_for_now: Self = this.set("threshold_for_now", js.undefined)
    
    @scala.inline
    def setThreshold_for_second(value: Double): Self = this.set("threshold_for_second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold_for_second: Self = this.set("threshold_for_second", js.undefined)
    
    @scala.inline
    def setThreshold_for_week(value: Double): Self = this.set("threshold_for_week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold_for_week: Self = this.set("threshold_for_week", js.undefined)
    
    @scala.inline
    def setThreshold_for_year(value: Double): Self = this.set("threshold_for_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold_for_year: Self = this.set("threshold_for_year", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
