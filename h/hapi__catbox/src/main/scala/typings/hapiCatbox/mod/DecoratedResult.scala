package typings.hapiCatbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecoratedResult[T] extends js.Object {
  
  var cached: PolicyGetCachedOptions[T] = js.native
  
  var report: PolicyGetReportLog = js.native
  
  var value: T = js.native
}
object DecoratedResult {
  
  @scala.inline
  def apply[T](cached: PolicyGetCachedOptions[T], report: PolicyGetReportLog, value: T): DecoratedResult[T] = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratedResult[T]]
  }
  
  @scala.inline
  implicit class DecoratedResultOps[Self <: DecoratedResult[_], T] (val x: Self with DecoratedResult[T]) extends AnyVal {
    
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
    def setCached(value: PolicyGetCachedOptions[T]): Self = this.set("cached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReport(value: PolicyGetReportLog): Self = this.set("report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
