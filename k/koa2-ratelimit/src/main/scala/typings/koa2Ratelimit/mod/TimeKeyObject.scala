package typings.koa2Ratelimit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in koa2-ratelimit.koa2-ratelimit.TimeKey ]:? number} */
@js.native
trait TimeKeyObject extends js.Object {
  
  var day: js.UndefOr[Double] = js.native
  
  var hour: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var month: js.UndefOr[Double] = js.native
  
  var ms: js.UndefOr[Double] = js.native
  
  var sec: js.UndefOr[Double] = js.native
  
  var week: js.UndefOr[Double] = js.native
  
  var year: js.UndefOr[Double] = js.native
}
object TimeKeyObject {
  
  @scala.inline
  def apply(): TimeKeyObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeKeyObject]
  }
  
  @scala.inline
  implicit class TimeKeyObjectOps[Self <: TimeKeyObject] (val x: Self) extends AnyVal {
    
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
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setMs(value: Double): Self = this.set("ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMs: Self = this.set("ms", js.undefined)
    
    @scala.inline
    def setSec(value: Double): Self = this.set("sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSec: Self = this.set("sec", js.undefined)
    
    @scala.inline
    def setWeek(value: Double): Self = this.set("week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
