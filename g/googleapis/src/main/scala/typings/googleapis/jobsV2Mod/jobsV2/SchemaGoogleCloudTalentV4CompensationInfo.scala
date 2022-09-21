package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudTalentV4CompensationInfo extends StObject {
  
  /**
    * Output only. Annualized base compensation range. Computed as base compensation entry's CompensationEntry.amount times CompensationEntry.expected_units_per_year. See CompensationEntry for explanation on compensation annualization.
    */
  var annualizedBaseCompensationRange: js.UndefOr[SchemaGoogleCloudTalentV4CompensationInfoCompensationRange] = js.undefined
  
  /**
    * Output only. Annualized total compensation range. Computed as all compensation entries' CompensationEntry.amount times CompensationEntry.expected_units_per_year. See CompensationEntry for explanation on compensation annualization.
    */
  var annualizedTotalCompensationRange: js.UndefOr[SchemaGoogleCloudTalentV4CompensationInfoCompensationRange] = js.undefined
  
  /**
    * Job compensation information. At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as **base compensation entry** for the job.
    */
  var entries: js.UndefOr[js.Array[SchemaGoogleCloudTalentV4CompensationInfoCompensationEntry]] = js.undefined
}
object SchemaGoogleCloudTalentV4CompensationInfo {
  
  inline def apply(): SchemaGoogleCloudTalentV4CompensationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudTalentV4CompensationInfo]
  }
  
  extension [Self <: SchemaGoogleCloudTalentV4CompensationInfo](x: Self) {
    
    inline def setAnnualizedBaseCompensationRange(value: SchemaGoogleCloudTalentV4CompensationInfoCompensationRange): Self = StObject.set(x, "annualizedBaseCompensationRange", value.asInstanceOf[js.Any])
    
    inline def setAnnualizedBaseCompensationRangeUndefined: Self = StObject.set(x, "annualizedBaseCompensationRange", js.undefined)
    
    inline def setAnnualizedTotalCompensationRange(value: SchemaGoogleCloudTalentV4CompensationInfoCompensationRange): Self = StObject.set(x, "annualizedTotalCompensationRange", value.asInstanceOf[js.Any])
    
    inline def setAnnualizedTotalCompensationRangeUndefined: Self = StObject.set(x, "annualizedTotalCompensationRange", js.undefined)
    
    inline def setEntries(value: js.Array[SchemaGoogleCloudTalentV4CompensationInfoCompensationEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaGoogleCloudTalentV4CompensationInfoCompensationEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
