package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. See CompensationInfo.  A compensation entry that represents one
  * component of compensation, such as base pay, bonus, or other compensation
  * type.  Annualization: One compensation entry can be annualized if - it
  * contains valid amount or range. - and its expected_units_per_year is set or
  * can be derived. Its annualized range is determined as (amount or range)
  * times expected_units_per_year.
  */
@js.native
trait SchemaExtendedCompensationInfoCompensationEntry extends StObject {
  
  /**
    * Optional.  Monetary amount.
    */
  var amount: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.native
  
  /**
    * Optional.  Compensation description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Optional.  Expected number of units paid each year. If not specified,
    * when Job.employment_types is FULLTIME, a default value is inferred based
    * on unit. Default values: - HOURLY: 2080 - DAILY: 260 - WEEKLY: 52 -
    * MONTHLY: 12 - ANNUAL: 1
    */
  var expectedUnitsPerYear: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.native
  
  /**
    * Optional.  Compensation range.
    */
  var range: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.native
  
  /**
    * Required.  Compensation type.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Optional.  Frequency of the specified amount.  Default is
    * CompensationUnit.OTHER_COMPENSATION_UNIT.
    */
  var unit: js.UndefOr[String] = js.native
  
  /**
    * Optional.  Indicates compensation amount and range are unset.
    */
  var unspecified: js.UndefOr[Boolean] = js.native
}
object SchemaExtendedCompensationInfoCompensationEntry {
  
  @scala.inline
  def apply(): SchemaExtendedCompensationInfoCompensationEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationInfoCompensationEntry]
  }
  
  @scala.inline
  implicit class SchemaExtendedCompensationInfoCompensationEntryMutableBuilder[Self <: SchemaExtendedCompensationInfoCompensationEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: SchemaExtendedCompensationInfoDecimal): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpectedUnitsPerYear(value: SchemaExtendedCompensationInfoDecimal): Self = StObject.set(x, "expectedUnitsPerYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedUnitsPerYearUndefined: Self = StObject.set(x, "expectedUnitsPerYear", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaExtendedCompensationInfoCompensationRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setUnspecified(value: Boolean): Self = StObject.set(x, "unspecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnspecifiedUndefined: Self = StObject.set(x, "unspecified", js.undefined)
  }
}
