package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExtendedCompensationFilter extends StObject {
  
  /**
    * Optional. Compensation range.
    */
  var compensationRange: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.undefined
  
  /**
    * Required. Specify desired `base compensation entry's` ExtendedCompensationInfo.CompensationUnit.
    */
  var compensationUnits: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Specify currency in 3-letter [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html) format. If unspecified, jobs are returned regardless of currency.
    */
  var currency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Whether to include jobs whose compensation range is unspecified.
    */
  var includeJobWithUnspecifiedCompensationRange: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Type of filter.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaExtendedCompensationFilter {
  
  inline def apply(): SchemaExtendedCompensationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationFilter]
  }
  
  extension [Self <: SchemaExtendedCompensationFilter](x: Self) {
    
    inline def setCompensationRange(value: SchemaExtendedCompensationInfoCompensationRange): Self = StObject.set(x, "compensationRange", value.asInstanceOf[js.Any])
    
    inline def setCompensationRangeUndefined: Self = StObject.set(x, "compensationRange", js.undefined)
    
    inline def setCompensationUnits(value: js.Array[String]): Self = StObject.set(x, "compensationUnits", value.asInstanceOf[js.Any])
    
    inline def setCompensationUnitsNull: Self = StObject.set(x, "compensationUnits", null)
    
    inline def setCompensationUnitsUndefined: Self = StObject.set(x, "compensationUnits", js.undefined)
    
    inline def setCompensationUnitsVarargs(value: String*): Self = StObject.set(x, "compensationUnits", js.Array(value*))
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setIncludeJobWithUnspecifiedCompensationRange(value: Boolean): Self = StObject.set(x, "includeJobWithUnspecifiedCompensationRange", value.asInstanceOf[js.Any])
    
    inline def setIncludeJobWithUnspecifiedCompensationRangeNull: Self = StObject.set(x, "includeJobWithUnspecifiedCompensationRange", null)
    
    inline def setIncludeJobWithUnspecifiedCompensationRangeUndefined: Self = StObject.set(x, "includeJobWithUnspecifiedCompensationRange", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
