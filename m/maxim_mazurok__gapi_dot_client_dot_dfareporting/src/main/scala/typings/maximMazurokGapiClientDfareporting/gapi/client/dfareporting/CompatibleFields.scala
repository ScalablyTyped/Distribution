package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompatibleFields extends StObject {
  
  /** Contains items that are compatible to be selected for a report of type "CROSS_DIMENSION_REACH". */
  var crossDimensionReachReportCompatibleFields: js.UndefOr[CrossDimensionReachReportCompatibleFields] = js.undefined
  
  /** Contains items that are compatible to be selected for a report of type "FLOODLIGHT". */
  var floodlightReportCompatibleFields: js.UndefOr[FloodlightReportCompatibleFields] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#compatibleFields. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Contains items that are compatible to be selected for a report of type "PATH_ATTRIBUTION". */
  var pathAttributionReportCompatibleFields: js.UndefOr[PathReportCompatibleFields] = js.undefined
  
  /** Contains items that are compatible to be selected for a report of type "PATH". */
  var pathReportCompatibleFields: js.UndefOr[PathReportCompatibleFields] = js.undefined
  
  /** Contains items that are compatible to be selected for a report of type "PATH_TO_CONVERSION". */
  var pathToConversionReportCompatibleFields: js.UndefOr[PathToConversionReportCompatibleFields] = js.undefined
  
  /** Contains items that are compatible to be selected for a report of type "REACH". */
  var reachReportCompatibleFields: js.UndefOr[ReachReportCompatibleFields] = js.undefined
  
  /** Contains items that are compatible to be selected for a report of type "STANDARD". */
  var reportCompatibleFields: js.UndefOr[ReportCompatibleFields] = js.undefined
}
object CompatibleFields {
  
  @scala.inline
  def apply(): CompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleFields]
  }
  
  @scala.inline
  implicit class CompatibleFieldsMutableBuilder[Self <: CompatibleFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossDimensionReachReportCompatibleFields(value: CrossDimensionReachReportCompatibleFields): Self = StObject.set(x, "crossDimensionReachReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossDimensionReachReportCompatibleFieldsUndefined: Self = StObject.set(x, "crossDimensionReachReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setFloodlightReportCompatibleFields(value: FloodlightReportCompatibleFields): Self = StObject.set(x, "floodlightReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightReportCompatibleFieldsUndefined: Self = StObject.set(x, "floodlightReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPathAttributionReportCompatibleFields(value: PathReportCompatibleFields): Self = StObject.set(x, "pathAttributionReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathAttributionReportCompatibleFieldsUndefined: Self = StObject.set(x, "pathAttributionReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setPathReportCompatibleFields(value: PathReportCompatibleFields): Self = StObject.set(x, "pathReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathReportCompatibleFieldsUndefined: Self = StObject.set(x, "pathReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setPathToConversionReportCompatibleFields(value: PathToConversionReportCompatibleFields): Self = StObject.set(x, "pathToConversionReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathToConversionReportCompatibleFieldsUndefined: Self = StObject.set(x, "pathToConversionReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setReachReportCompatibleFields(value: ReachReportCompatibleFields): Self = StObject.set(x, "reachReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachReportCompatibleFieldsUndefined: Self = StObject.set(x, "reachReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setReportCompatibleFields(value: ReportCompatibleFields): Self = StObject.set(x, "reportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportCompatibleFieldsUndefined: Self = StObject.set(x, "reportCompatibleFields", js.undefined)
  }
}
