package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly Filtering reasons for this creative during a period of a single
  * day (from midnight to midnight Pacific).
  */
@js.native
trait SchemaFilteringStats extends js.Object {
  
  /**
    * The day during which the data was collected. The data is collected from
    * 00:00:00 to 23:59:59 PT. During switches from PST to PDT and back, the
    * day may contain 23 or 25 hours of data instead of the usual 24.
    */
  var date: js.UndefOr[SchemaDate] = js.native
  
  /**
    * The set of filtering reasons for this date.
    */
  var reasons: js.UndefOr[js.Array[SchemaReason]] = js.native
}
object SchemaFilteringStats {
  
  @scala.inline
  def apply(): SchemaFilteringStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilteringStats]
  }
  
  @scala.inline
  implicit class SchemaFilteringStatsOps[Self <: SchemaFilteringStats] (val x: Self) extends AnyVal {
    
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
    def setDate(value: SchemaDate): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setReasonsVarargs(value: SchemaReason*): Self = this.set("reasons", js.Array(value :_*))
    
    @scala.inline
    def setReasons(value: js.Array[SchemaReason]): Self = this.set("reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasons: Self = this.set("reasons", js.undefined)
  }
}
