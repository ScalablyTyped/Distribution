package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2InspectDataSourceDetails extends StObject {
  
  /**
    * The configuration used for this job.
    */
  var requestedOptions: js.UndefOr[SchemaGooglePrivacyDlpV2RequestedOptions] = js.undefined
  
  /**
    * A summary of the outcome of this inspection job.
    */
  var result: js.UndefOr[SchemaGooglePrivacyDlpV2Result] = js.undefined
}
object SchemaGooglePrivacyDlpV2InspectDataSourceDetails {
  
  inline def apply(): SchemaGooglePrivacyDlpV2InspectDataSourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectDataSourceDetails]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2InspectDataSourceDetails](x: Self) {
    
    inline def setRequestedOptions(value: SchemaGooglePrivacyDlpV2RequestedOptions): Self = StObject.set(x, "requestedOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestedOptionsUndefined: Self = StObject.set(x, "requestedOptions", js.undefined)
    
    inline def setResult(value: SchemaGooglePrivacyDlpV2Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
