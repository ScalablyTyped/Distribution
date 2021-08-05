package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Filter on job compensation type and amount.
  */
trait SchemaCompensationFilter extends StObject {
  
  /**
    * Optional.  Whether to include jobs whose compensation range is
    * unspecified.
    */
  var includeJobsWithUnspecifiedCompensationRange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.  Compensation range.
    */
  var range: js.UndefOr[SchemaCompensationRange] = js.undefined
  
  /**
    * Required.  Type of filter.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Required.  Specify desired `base compensation entry&#39;s`
    * CompensationInfo.CompensationUnit.
    */
  var units: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaCompensationFilter {
  
  inline def apply(): SchemaCompensationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationFilter]
  }
  
  extension [Self <: SchemaCompensationFilter](x: Self) {
    
    inline def setIncludeJobsWithUnspecifiedCompensationRange(value: Boolean): Self = StObject.set(x, "includeJobsWithUnspecifiedCompensationRange", value.asInstanceOf[js.Any])
    
    inline def setIncludeJobsWithUnspecifiedCompensationRangeUndefined: Self = StObject.set(x, "includeJobsWithUnspecifiedCompensationRange", js.undefined)
    
    inline def setRange(value: SchemaCompensationRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnits(value: js.Array[String]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setUnitsVarargs(value: String*): Self = StObject.set(x, "units", js.Array(value :_*))
  }
}
