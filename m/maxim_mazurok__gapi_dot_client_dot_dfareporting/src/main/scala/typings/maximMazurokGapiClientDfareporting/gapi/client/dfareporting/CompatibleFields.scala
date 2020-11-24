package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompatibleFields extends js.Object {
  
  /** Contains items that are compatible to be selected for a report of type "CROSS_DIMENSION_REACH". */
  var crossDimensionReachReportCompatibleFields: js.UndefOr[CrossDimensionReachReportCompatibleFields] = js.native
  
  /** Contains items that are compatible to be selected for a report of type "FLOODLIGHT". */
  var floodlightReportCompatibleFields: js.UndefOr[FloodlightReportCompatibleFields] = js.native
  
  /** The kind of resource this is, in this case dfareporting#compatibleFields. */
  var kind: js.UndefOr[String] = js.native
  
  /** Contains items that are compatible to be selected for a report of type "PATH_ATTRIBUTION". */
  var pathAttributionReportCompatibleFields: js.UndefOr[PathReportCompatibleFields] = js.native
  
  /** Contains items that are compatible to be selected for a report of type "PATH". */
  var pathReportCompatibleFields: js.UndefOr[PathReportCompatibleFields] = js.native
  
  /** Contains items that are compatible to be selected for a report of type "PATH_TO_CONVERSION". */
  var pathToConversionReportCompatibleFields: js.UndefOr[PathToConversionReportCompatibleFields] = js.native
  
  /** Contains items that are compatible to be selected for a report of type "REACH". */
  var reachReportCompatibleFields: js.UndefOr[ReachReportCompatibleFields] = js.native
  
  /** Contains items that are compatible to be selected for a report of type "STANDARD". */
  var reportCompatibleFields: js.UndefOr[ReportCompatibleFields] = js.native
}
object CompatibleFields {
  
  @scala.inline
  def apply(): CompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleFields]
  }
  
  @scala.inline
  implicit class CompatibleFieldsOps[Self <: CompatibleFields] (val x: Self) extends AnyVal {
    
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
    def setCrossDimensionReachReportCompatibleFields(value: CrossDimensionReachReportCompatibleFields): Self = this.set("crossDimensionReachReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossDimensionReachReportCompatibleFields: Self = this.set("crossDimensionReachReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setFloodlightReportCompatibleFields(value: FloodlightReportCompatibleFields): Self = this.set("floodlightReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightReportCompatibleFields: Self = this.set("floodlightReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPathAttributionReportCompatibleFields(value: PathReportCompatibleFields): Self = this.set("pathAttributionReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathAttributionReportCompatibleFields: Self = this.set("pathAttributionReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setPathReportCompatibleFields(value: PathReportCompatibleFields): Self = this.set("pathReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathReportCompatibleFields: Self = this.set("pathReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setPathToConversionReportCompatibleFields(value: PathToConversionReportCompatibleFields): Self = this.set("pathToConversionReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathToConversionReportCompatibleFields: Self = this.set("pathToConversionReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setReachReportCompatibleFields(value: ReachReportCompatibleFields): Self = this.set("reachReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReachReportCompatibleFields: Self = this.set("reachReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setReportCompatibleFields(value: ReportCompatibleFields): Self = this.set("reportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportCompatibleFields: Self = this.set("reportCompatibleFields", js.undefined)
  }
}
