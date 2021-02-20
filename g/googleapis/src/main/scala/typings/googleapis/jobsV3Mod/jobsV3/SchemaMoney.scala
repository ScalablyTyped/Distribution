package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an amount of money with its currency type.
  */
@js.native
trait SchemaMoney extends StObject {
  
  /**
    * The 3-letter currency code defined in ISO 4217.
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * Number of nano (10^-9) units of the amount. The value must be between
    * -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos`
    * must be positive or zero. If `units` is zero, `nanos` can be positive,
    * zero, or negative. If `units` is negative, `nanos` must be negative or
    * zero. For example $-1.75 is represented as `units`=-1 and
    * `nanos`=-750,000,000.
    */
  var nanos: js.UndefOr[Double] = js.native
  
  /**
    * The whole units of the amount. For example if `currencyCode` is
    * `&quot;USD&quot;`, then 1 unit is one US dollar.
    */
  var units: js.UndefOr[String] = js.native
}
object SchemaMoney {
  
  @scala.inline
  def apply(): SchemaMoney = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoney]
  }
  
  @scala.inline
  implicit class SchemaMoneyMutableBuilder[Self <: SchemaMoney] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    @scala.inline
    def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}
