package typings.jsJoda.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToDate extends js.Object {
  
  def toDate(): Date = js.native
  
  def toEpochMilli(): Double = js.native
}
object ToDate {
  
  @scala.inline
  def apply(toDate: () => Date, toEpochMilli: () => Double): ToDate = {
    val __obj = js.Dynamic.literal(toDate = js.Any.fromFunction0(toDate), toEpochMilli = js.Any.fromFunction0(toEpochMilli))
    __obj.asInstanceOf[ToDate]
  }
  
  @scala.inline
  implicit class ToDateOps[Self <: ToDate] (val x: Self) extends AnyVal {
    
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
    def setToDate(value: () => Date): Self = this.set("toDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToEpochMilli(value: () => Double): Self = this.set("toEpochMilli", js.Any.fromFunction0(value))
  }
}
