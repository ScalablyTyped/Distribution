package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2InspectResult extends StObject {
  
  /**
    * List of findings for an item.
    */
  var findings: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Finding]] = js.undefined
  
  /**
    * If true, then this item might have more findings than were returned, and the findings returned are an arbitrary subset of all findings. The findings list might be truncated because the input items were too large, or because the server reached the maximum amount of resources allowed for a single API call. For best results, divide the input into smaller batches.
    */
  var findingsTruncated: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2InspectResult {
  
  inline def apply(): SchemaGooglePrivacyDlpV2InspectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectResult]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2InspectResult](x: Self) {
    
    inline def setFindings(value: js.Array[SchemaGooglePrivacyDlpV2Finding]): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsTruncated(value: Boolean): Self = StObject.set(x, "findingsTruncated", value.asInstanceOf[js.Any])
    
    inline def setFindingsTruncatedNull: Self = StObject.set(x, "findingsTruncated", null)
    
    inline def setFindingsTruncatedUndefined: Self = StObject.set(x, "findingsTruncated", js.undefined)
    
    inline def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    inline def setFindingsVarargs(value: SchemaGooglePrivacyDlpV2Finding*): Self = StObject.set(x, "findings", js.Array(value*))
  }
}
