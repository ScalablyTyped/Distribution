package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediationReportSpecDimensionFilter extends js.Object {
  
  /** Applies the filter criterion to the specified dimension. */
  var dimension: js.UndefOr[String] = js.native
  
  /** Matches a row if its value for the specified dimension is in one of the values specified in this condition. */
  var matchesAny: js.UndefOr[StringList] = js.native
}
object MediationReportSpecDimensionFilter {
  
  @scala.inline
  def apply(): MediationReportSpecDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediationReportSpecDimensionFilter]
  }
  
  @scala.inline
  implicit class MediationReportSpecDimensionFilterOps[Self <: MediationReportSpecDimensionFilter] (val x: Self) extends AnyVal {
    
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
    def setDimension(value: String): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    
    @scala.inline
    def setMatchesAny(value: StringList): Self = this.set("matchesAny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchesAny: Self = this.set("matchesAny", js.undefined)
  }
}
