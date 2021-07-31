package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionExpression extends StObject {
  
  /** Used to combine dimension values to a single dimension. For example, dimension "country, city": concatenate(country, ", ", city). */
  var concatenate: js.UndefOr[ConcatenateExpression] = js.undefined
  
  /** Used to convert a dimension value to lower case. */
  var lowerCase: js.UndefOr[CaseExpression] = js.undefined
  
  /** Used to convert a dimension value to upper case. */
  var upperCase: js.UndefOr[CaseExpression] = js.undefined
}
object DimensionExpression {
  
  @scala.inline
  def apply(): DimensionExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionExpression]
  }
  
  @scala.inline
  implicit class DimensionExpressionMutableBuilder[Self <: DimensionExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConcatenate(value: ConcatenateExpression): Self = StObject.set(x, "concatenate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcatenateUndefined: Self = StObject.set(x, "concatenate", js.undefined)
    
    @scala.inline
    def setLowerCase(value: CaseExpression): Self = StObject.set(x, "lowerCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerCaseUndefined: Self = StObject.set(x, "lowerCase", js.undefined)
    
    @scala.inline
    def setUpperCase(value: CaseExpression): Self = StObject.set(x, "upperCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperCaseUndefined: Self = StObject.set(x, "upperCase", js.undefined)
  }
}
