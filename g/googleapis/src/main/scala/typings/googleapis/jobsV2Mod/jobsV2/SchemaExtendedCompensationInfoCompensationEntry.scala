package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExtendedCompensationInfoCompensationEntry extends StObject {
  
  /**
    * Optional. Monetary amount.
    */
  var amount: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.undefined
  
  /**
    * Optional. Compensation description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Expected number of units paid each year. If not specified, when Job.employment_types is FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080 - DAILY: 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
    */
  var expectedUnitsPerYear: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.undefined
  
  /**
    * Optional. Compensation range.
    */
  var range: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.undefined
  
  /**
    * Required. Compensation type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Frequency of the specified amount. Default is CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED.
    */
  var unit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Indicates compensation amount and range are unset.
    */
  var unspecified: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaExtendedCompensationInfoCompensationEntry {
  
  inline def apply(): SchemaExtendedCompensationInfoCompensationEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationInfoCompensationEntry]
  }
  
  extension [Self <: SchemaExtendedCompensationInfoCompensationEntry](x: Self) {
    
    inline def setAmount(value: SchemaExtendedCompensationInfoDecimal): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpectedUnitsPerYear(value: SchemaExtendedCompensationInfoDecimal): Self = StObject.set(x, "expectedUnitsPerYear", value.asInstanceOf[js.Any])
    
    inline def setExpectedUnitsPerYearUndefined: Self = StObject.set(x, "expectedUnitsPerYear", js.undefined)
    
    inline def setRange(value: SchemaExtendedCompensationInfoCompensationRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUnspecified(value: Boolean): Self = StObject.set(x, "unspecified", value.asInstanceOf[js.Any])
    
    inline def setUnspecifiedNull: Self = StObject.set(x, "unspecified", null)
    
    inline def setUnspecifiedUndefined: Self = StObject.set(x, "unspecified", js.undefined)
  }
}
