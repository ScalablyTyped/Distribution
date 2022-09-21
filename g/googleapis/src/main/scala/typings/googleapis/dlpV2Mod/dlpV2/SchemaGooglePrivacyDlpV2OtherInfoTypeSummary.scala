package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2OtherInfoTypeSummary extends StObject {
  
  /**
    * Approximate percentage of non-null rows that contained data detected by this infotype.
    */
  var estimatedPrevalence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The other infoType.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.undefined
}
object SchemaGooglePrivacyDlpV2OtherInfoTypeSummary {
  
  inline def apply(): SchemaGooglePrivacyDlpV2OtherInfoTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2OtherInfoTypeSummary]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2OtherInfoTypeSummary](x: Self) {
    
    inline def setEstimatedPrevalence(value: Double): Self = StObject.set(x, "estimatedPrevalence", value.asInstanceOf[js.Any])
    
    inline def setEstimatedPrevalenceNull: Self = StObject.set(x, "estimatedPrevalence", null)
    
    inline def setEstimatedPrevalenceUndefined: Self = StObject.set(x, "estimatedPrevalence", js.undefined)
    
    inline def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    inline def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
  }
}
