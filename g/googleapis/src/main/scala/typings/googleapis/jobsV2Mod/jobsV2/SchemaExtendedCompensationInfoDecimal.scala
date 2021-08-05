package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. See CompensationInfo.  Decimal number.
  */
trait SchemaExtendedCompensationInfoDecimal extends StObject {
  
  /**
    * Micro (10^-6) units. The value must be between -999,999 and +999,999
    * inclusive. If `units` is positive, `micros` must be positive or zero. If
    * `units` is zero, `micros` can be positive, zero, or negative. If `units`
    * is negative, `micros` must be negative or zero. For example -1.75 is
    * represented as `units`=-1 and `micros`=-750,000.
    */
  var micros: js.UndefOr[Double] = js.undefined
  
  /**
    * Whole units.
    */
  var units: js.UndefOr[String] = js.undefined
}
object SchemaExtendedCompensationInfoDecimal {
  
  inline def apply(): SchemaExtendedCompensationInfoDecimal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationInfoDecimal]
  }
  
  extension [Self <: SchemaExtendedCompensationInfoDecimal](x: Self) {
    
    inline def setMicros(value: Double): Self = StObject.set(x, "micros", value.asInstanceOf[js.Any])
    
    inline def setMicrosUndefined: Self = StObject.set(x, "micros", js.undefined)
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}
