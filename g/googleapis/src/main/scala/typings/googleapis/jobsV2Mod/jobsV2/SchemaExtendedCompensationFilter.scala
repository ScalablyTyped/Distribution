package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. Always use CompensationFilter.  Input only.  Filter on job
  * compensation type and amount.
  */
trait SchemaExtendedCompensationFilter extends StObject {
  
  /**
    * Optional.  Compensation range.
    */
  var compensationRange: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.undefined
  
  /**
    * Required.  Specify desired `base compensation entry&#39;s`
    * ExtendedCompensationInfo.CompensationUnit.
    */
  var compensationUnits: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional.  Specify currency in 3-letter [ISO
    * 4217](https://www.iso.org/iso-4217-currency-codes.html) format. If
    * unspecified, jobs are returned regardless of currency.
    */
  var currency: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.  Whether to include jobs whose compensation range is
    * unspecified.
    */
  var includeJobWithUnspecifiedCompensationRange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required.  Type of filter.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaExtendedCompensationFilter {
  
  @scala.inline
  def apply(): SchemaExtendedCompensationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationFilter]
  }
  
  @scala.inline
  implicit class SchemaExtendedCompensationFilterMutableBuilder[Self <: SchemaExtendedCompensationFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompensationRange(value: SchemaExtendedCompensationInfoCompensationRange): Self = StObject.set(x, "compensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompensationRangeUndefined: Self = StObject.set(x, "compensationRange", js.undefined)
    
    @scala.inline
    def setCompensationUnits(value: js.Array[String]): Self = StObject.set(x, "compensationUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompensationUnitsUndefined: Self = StObject.set(x, "compensationUnits", js.undefined)
    
    @scala.inline
    def setCompensationUnitsVarargs(value: String*): Self = StObject.set(x, "compensationUnits", js.Array(value :_*))
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setIncludeJobWithUnspecifiedCompensationRange(value: Boolean): Self = StObject.set(x, "includeJobWithUnspecifiedCompensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeJobWithUnspecifiedCompensationRangeUndefined: Self = StObject.set(x, "includeJobWithUnspecifiedCompensationRange", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
