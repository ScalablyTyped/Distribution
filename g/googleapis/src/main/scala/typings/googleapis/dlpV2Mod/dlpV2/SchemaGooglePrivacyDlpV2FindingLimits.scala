package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2FindingLimits extends StObject {
  
  /**
    * Configuration of findings limit given for specified infoTypes.
    */
  var maxFindingsPerInfoType: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeLimit]] = js.undefined
  
  /**
    * Max number of findings that will be returned for each item scanned. When set within `InspectJobConfig`, the maximum returned is 2000 regardless if this is set higher. When set within `InspectContentRequest`, this field is ignored.
    */
  var maxFindingsPerItem: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Max number of findings that will be returned per request/job. When set within `InspectContentRequest`, the maximum returned is 2000 regardless if this is set higher.
    */
  var maxFindingsPerRequest: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2FindingLimits {
  
  inline def apply(): SchemaGooglePrivacyDlpV2FindingLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FindingLimits]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2FindingLimits](x: Self) {
    
    inline def setMaxFindingsPerInfoType(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeLimit]): Self = StObject.set(x, "maxFindingsPerInfoType", value.asInstanceOf[js.Any])
    
    inline def setMaxFindingsPerInfoTypeUndefined: Self = StObject.set(x, "maxFindingsPerInfoType", js.undefined)
    
    inline def setMaxFindingsPerInfoTypeVarargs(value: SchemaGooglePrivacyDlpV2InfoTypeLimit*): Self = StObject.set(x, "maxFindingsPerInfoType", js.Array(value*))
    
    inline def setMaxFindingsPerItem(value: Double): Self = StObject.set(x, "maxFindingsPerItem", value.asInstanceOf[js.Any])
    
    inline def setMaxFindingsPerItemNull: Self = StObject.set(x, "maxFindingsPerItem", null)
    
    inline def setMaxFindingsPerItemUndefined: Self = StObject.set(x, "maxFindingsPerItem", js.undefined)
    
    inline def setMaxFindingsPerRequest(value: Double): Self = StObject.set(x, "maxFindingsPerRequest", value.asInstanceOf[js.Any])
    
    inline def setMaxFindingsPerRequestNull: Self = StObject.set(x, "maxFindingsPerRequest", null)
    
    inline def setMaxFindingsPerRequestUndefined: Self = StObject.set(x, "maxFindingsPerRequest", js.undefined)
  }
}
