package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CohortsRange extends js.Object {
  
  /** For daily cohorts, this will be the end day offset. For weekly cohorts, this will be the week offset. */
  var endOffset: js.UndefOr[Double] = js.native
  
  /** Reporting date range for each cohort is calculated based on these three fields. */
  var granularity: js.UndefOr[String] = js.native
  
  /** For daily cohorts, this will be the start day offset. For weekly cohorts, this will be the week offset. */
  var startOffset: js.UndefOr[Double] = js.native
}
object CohortsRange {
  
  @scala.inline
  def apply(): CohortsRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CohortsRange]
  }
  
  @scala.inline
  implicit class CohortsRangeOps[Self <: CohortsRange] (val x: Self) extends AnyVal {
    
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
    def setEndOffset(value: Double): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOffset: Self = this.set("endOffset", js.undefined)
    
    @scala.inline
    def setGranularity(value: String): Self = this.set("granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    
    @scala.inline
    def setStartOffset(value: Double): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOffset: Self = this.set("startOffset", js.undefined)
  }
}
