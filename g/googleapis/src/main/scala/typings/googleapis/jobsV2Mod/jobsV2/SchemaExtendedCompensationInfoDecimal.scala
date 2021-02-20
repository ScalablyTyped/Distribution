package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. See CompensationInfo.  Decimal number.
  */
@js.native
trait SchemaExtendedCompensationInfoDecimal extends StObject {
  
  /**
    * Micro (10^-6) units. The value must be between -999,999 and +999,999
    * inclusive. If `units` is positive, `micros` must be positive or zero. If
    * `units` is zero, `micros` can be positive, zero, or negative. If `units`
    * is negative, `micros` must be negative or zero. For example -1.75 is
    * represented as `units`=-1 and `micros`=-750,000.
    */
  var micros: js.UndefOr[Double] = js.native
  
  /**
    * Whole units.
    */
  var units: js.UndefOr[String] = js.native
}
object SchemaExtendedCompensationInfoDecimal {
  
  @scala.inline
  def apply(): SchemaExtendedCompensationInfoDecimal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationInfoDecimal]
  }
  
  @scala.inline
  implicit class SchemaExtendedCompensationInfoDecimalMutableBuilder[Self <: SchemaExtendedCompensationInfoDecimal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMicros(value: Double): Self = StObject.set(x, "micros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrosUndefined: Self = StObject.set(x, "micros", js.undefined)
    
    @scala.inline
    def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}
