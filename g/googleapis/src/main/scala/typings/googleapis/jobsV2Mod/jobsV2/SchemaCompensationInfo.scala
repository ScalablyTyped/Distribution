package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Job compensation details.
  */
trait SchemaCompensationInfo extends StObject {
  
  /**
    * Deprecated. Use entries instead.  Optional.  The amount of compensation
    * or pay for the job. As an alternative, compensation_amount_min and
    * compensation_amount_max may be used to define a range of compensation.
    */
  var amount: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * Output only.  Annualized base compensation range. Computed as base
    * compensation entry&#39;s CompensationEntry.compensation times
    * CompensationEntry.expected_units_per_year.  See CompensationEntry for
    * explanation on compensation annualization.
    */
  var annualizedBaseCompensationRange: js.UndefOr[SchemaCompensationRange] = js.undefined
  
  /**
    * Output only.  Annualized total compensation range. Computed as all
    * compensation entries&#39; CompensationEntry.compensation times
    * CompensationEntry.expected_units_per_year.  See CompensationEntry for
    * explanation on compensation annualization.
    */
  var annualizedTotalCompensationRange: js.UndefOr[SchemaCompensationRange] = js.undefined
  
  /**
    * Optional.  Job compensation information.  At most one entry can be of
    * type CompensationInfo.CompensationType.BASE, which is referred as ** base
    * compensation entry ** for the job.
    */
  var entries: js.UndefOr[js.Array[SchemaCompensationEntry]] = js.undefined
  
  /**
    * Deprecated. Use entries instead.  Optional.  An upper bound on a range
    * for compensation or pay for the job. The currency type is specified in
    * compensation_amount.
    */
  var max: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * Deprecated. Use entries instead.  Optional.  A lower bound on a range for
    * compensation or pay for the job. The currency type is specified in
    * compensation_amount.
    */
  var min: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * Deprecated. Use entries instead.  Optional.  Type of job compensation.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaCompensationInfo {
  
  @scala.inline
  def apply(): SchemaCompensationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationInfo]
  }
  
  @scala.inline
  implicit class SchemaCompensationInfoMutableBuilder[Self <: SchemaCompensationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: SchemaMoney): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setAnnualizedBaseCompensationRange(value: SchemaCompensationRange): Self = StObject.set(x, "annualizedBaseCompensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnualizedBaseCompensationRangeUndefined: Self = StObject.set(x, "annualizedBaseCompensationRange", js.undefined)
    
    @scala.inline
    def setAnnualizedTotalCompensationRange(value: SchemaCompensationRange): Self = StObject.set(x, "annualizedTotalCompensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnualizedTotalCompensationRangeUndefined: Self = StObject.set(x, "annualizedTotalCompensationRange", js.undefined)
    
    @scala.inline
    def setEntries(value: js.Array[SchemaCompensationEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaCompensationEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setMax(value: SchemaMoney): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: SchemaMoney): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
