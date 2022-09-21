package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompensationFilter extends StObject {
  
  /**
    * If set to true, jobs with unspecified compensation range fields are included.
    */
  var includeJobsWithUnspecifiedCompensationRange: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Compensation range.
    */
  var range: js.UndefOr[SchemaCompensationRange] = js.undefined
  
  /**
    * Required. Type of filter.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Specify desired `base compensation entry's` CompensationInfo.CompensationUnit.
    */
  var units: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCompensationFilter {
  
  inline def apply(): SchemaCompensationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationFilter]
  }
  
  extension [Self <: SchemaCompensationFilter](x: Self) {
    
    inline def setIncludeJobsWithUnspecifiedCompensationRange(value: Boolean): Self = StObject.set(x, "includeJobsWithUnspecifiedCompensationRange", value.asInstanceOf[js.Any])
    
    inline def setIncludeJobsWithUnspecifiedCompensationRangeNull: Self = StObject.set(x, "includeJobsWithUnspecifiedCompensationRange", null)
    
    inline def setIncludeJobsWithUnspecifiedCompensationRangeUndefined: Self = StObject.set(x, "includeJobsWithUnspecifiedCompensationRange", js.undefined)
    
    inline def setRange(value: SchemaCompensationRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnits(value: js.Array[String]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsNull: Self = StObject.set(x, "units", null)
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setUnitsVarargs(value: String*): Self = StObject.set(x, "units", js.Array(value*))
  }
}
