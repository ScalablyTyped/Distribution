package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlInspectionResult extends StObject {
  
  /**
    * Result of the AMP analysis. Absent if the page is not an AMP page.
    */
  var ampResult: js.UndefOr[SchemaAmpInspectionResult] = js.undefined
  
  /**
    * Result of the index status analysis.
    */
  var indexStatusResult: js.UndefOr[SchemaIndexStatusInspectionResult] = js.undefined
  
  /**
    * Link to Search Console URL inspection.
    */
  var inspectionResultLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Result of the Mobile usability analysis.
    */
  var mobileUsabilityResult: js.UndefOr[SchemaMobileUsabilityInspectionResult] = js.undefined
  
  /**
    * Result of the Rich Results analysis. Absent if there are no rich results found.
    */
  var richResultsResult: js.UndefOr[SchemaRichResultsInspectionResult] = js.undefined
}
object SchemaUrlInspectionResult {
  
  inline def apply(): SchemaUrlInspectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlInspectionResult]
  }
  
  extension [Self <: SchemaUrlInspectionResult](x: Self) {
    
    inline def setAmpResult(value: SchemaAmpInspectionResult): Self = StObject.set(x, "ampResult", value.asInstanceOf[js.Any])
    
    inline def setAmpResultUndefined: Self = StObject.set(x, "ampResult", js.undefined)
    
    inline def setIndexStatusResult(value: SchemaIndexStatusInspectionResult): Self = StObject.set(x, "indexStatusResult", value.asInstanceOf[js.Any])
    
    inline def setIndexStatusResultUndefined: Self = StObject.set(x, "indexStatusResult", js.undefined)
    
    inline def setInspectionResultLink(value: String): Self = StObject.set(x, "inspectionResultLink", value.asInstanceOf[js.Any])
    
    inline def setInspectionResultLinkNull: Self = StObject.set(x, "inspectionResultLink", null)
    
    inline def setInspectionResultLinkUndefined: Self = StObject.set(x, "inspectionResultLink", js.undefined)
    
    inline def setMobileUsabilityResult(value: SchemaMobileUsabilityInspectionResult): Self = StObject.set(x, "mobileUsabilityResult", value.asInstanceOf[js.Any])
    
    inline def setMobileUsabilityResultUndefined: Self = StObject.set(x, "mobileUsabilityResult", js.undefined)
    
    inline def setRichResultsResult(value: SchemaRichResultsInspectionResult): Self = StObject.set(x, "richResultsResult", value.asInstanceOf[js.Any])
    
    inline def setRichResultsResultUndefined: Self = StObject.set(x, "richResultsResult", js.undefined)
  }
}
