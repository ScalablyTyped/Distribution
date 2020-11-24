package typings.jsuite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iconfig extends js.Object {
  
  var columns: js.UndefOr[String] = js.native
  
  var end: js.UndefOr[Double] = js.native
  
  var filterExpression: js.UndefOr[js.Any] = js.native
  
  var logging: js.UndefOr[Boolean] = js.native
  
  var maxUnitsUsage: js.UndefOr[Double] = js.native
  
  var recordType: js.UndefOr[String] = js.native
  
  var searchId: js.UndefOr[String] = js.native
  
  var smartConvert: js.UndefOr[Boolean] = js.native
  
  var start: js.UndefOr[Double] = js.native
}
object Iconfig {
  
  @scala.inline
  def apply(): Iconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Iconfig]
  }
  
  @scala.inline
  implicit class IconfigOps[Self <: Iconfig] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: String): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setFilterExpression(value: js.Any): Self = this.set("filterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterExpression: Self = this.set("filterExpression", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setMaxUnitsUsage(value: Double): Self = this.set("maxUnitsUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUnitsUsage: Self = this.set("maxUnitsUsage", js.undefined)
    
    @scala.inline
    def setRecordType(value: String): Self = this.set("recordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordType: Self = this.set("recordType", js.undefined)
    
    @scala.inline
    def setSearchId(value: String): Self = this.set("searchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchId: Self = this.set("searchId", js.undefined)
    
    @scala.inline
    def setSmartConvert(value: Boolean): Self = this.set("smartConvert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartConvert: Self = this.set("smartConvert", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
