package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComparisonValue extends StObject {
  
  /** Type of comparison. Possible values are LESS_THAN or GREATER_THAN. */
  var comparisonType: js.UndefOr[String] = js.native
  
  /** Value used for this comparison. */
  var comparisonValue: js.UndefOr[String] = js.native
}
object ComparisonValue {
  
  @scala.inline
  def apply(): ComparisonValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComparisonValue]
  }
  
  @scala.inline
  implicit class ComparisonValueMutableBuilder[Self <: ComparisonValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonType(value: String): Self = StObject.set(x, "comparisonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonTypeUndefined: Self = StObject.set(x, "comparisonType", js.undefined)
    
    @scala.inline
    def setComparisonValue(value: String): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
  }
}
