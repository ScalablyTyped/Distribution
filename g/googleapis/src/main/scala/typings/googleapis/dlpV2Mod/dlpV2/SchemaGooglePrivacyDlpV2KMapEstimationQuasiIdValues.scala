package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues extends StObject {
  
  /**
    * The estimated anonymity for these quasi-identifier values.
    */
  var estimatedAnonymity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The quasi-identifier values.
    */
  var quasiIdsValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.undefined
}
object SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues {
  
  inline def apply(): SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues](x: Self) {
    
    inline def setEstimatedAnonymity(value: String): Self = StObject.set(x, "estimatedAnonymity", value.asInstanceOf[js.Any])
    
    inline def setEstimatedAnonymityNull: Self = StObject.set(x, "estimatedAnonymity", null)
    
    inline def setEstimatedAnonymityUndefined: Self = StObject.set(x, "estimatedAnonymity", js.undefined)
    
    inline def setQuasiIdsValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = StObject.set(x, "quasiIdsValues", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsValuesUndefined: Self = StObject.set(x, "quasiIdsValues", js.undefined)
    
    inline def setQuasiIdsValuesVarargs(value: SchemaGooglePrivacyDlpV2Value*): Self = StObject.set(x, "quasiIdsValues", js.Array(value*))
  }
}
