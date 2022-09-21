package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompensationInfo extends StObject {
  
  /**
    * Deprecated. Use entries instead. Optional. The amount of compensation or pay for the job. As an alternative, compensation_amount_min and compensation_amount_max may be used to define a range of compensation.
    */
  var amount: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * Output only. Annualized base compensation range. Computed as base compensation entry's CompensationEntry.compensation times CompensationEntry.expected_units_per_year. See CompensationEntry for explanation on compensation annualization.
    */
  var annualizedBaseCompensationRange: js.UndefOr[SchemaCompensationRange] = js.undefined
  
  /**
    * Output only. Annualized total compensation range. Computed as all compensation entries' CompensationEntry.compensation times CompensationEntry.expected_units_per_year. See CompensationEntry for explanation on compensation annualization.
    */
  var annualizedTotalCompensationRange: js.UndefOr[SchemaCompensationRange] = js.undefined
  
  /**
    * Optional. Job compensation information. At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as ** base compensation entry ** for the job.
    */
  var entries: js.UndefOr[js.Array[SchemaCompensationEntry]] = js.undefined
  
  /**
    * Deprecated. Use entries instead. Optional. An upper bound on a range for compensation or pay for the job. The currency type is specified in compensation_amount.
    */
  var max: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * Deprecated. Use entries instead. Optional. A lower bound on a range for compensation or pay for the job. The currency type is specified in compensation_amount.
    */
  var min: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * Deprecated. Use entries instead. Optional. Type of job compensation.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaCompensationInfo {
  
  inline def apply(): SchemaCompensationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationInfo]
  }
  
  extension [Self <: SchemaCompensationInfo](x: Self) {
    
    inline def setAmount(value: SchemaMoney): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setAnnualizedBaseCompensationRange(value: SchemaCompensationRange): Self = StObject.set(x, "annualizedBaseCompensationRange", value.asInstanceOf[js.Any])
    
    inline def setAnnualizedBaseCompensationRangeUndefined: Self = StObject.set(x, "annualizedBaseCompensationRange", js.undefined)
    
    inline def setAnnualizedTotalCompensationRange(value: SchemaCompensationRange): Self = StObject.set(x, "annualizedTotalCompensationRange", value.asInstanceOf[js.Any])
    
    inline def setAnnualizedTotalCompensationRangeUndefined: Self = StObject.set(x, "annualizedTotalCompensationRange", js.undefined)
    
    inline def setEntries(value: js.Array[SchemaCompensationEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaCompensationEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setMax(value: SchemaMoney): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: SchemaMoney): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
