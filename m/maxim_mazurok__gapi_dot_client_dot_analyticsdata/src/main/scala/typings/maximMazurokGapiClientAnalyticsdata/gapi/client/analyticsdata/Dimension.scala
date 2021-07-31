package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimension extends StObject {
  
  /** One dimension can be the result of an expression of multiple dimensions. For example, dimension "country, city": concatenate(country, ", ", city). */
  var dimensionExpression: js.UndefOr[DimensionExpression] = js.undefined
  
  /**
    * The name of the dimension. See the [API Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions) for the list of dimension names. If
    * `dimensionExpression` is specified, `name` can be any string that you would like. For example if a `dimensionExpression` concatenates `country` and `city`, you could call that
    * dimension `countryAndCity`. Dimensions are referenced by `name` in `dimensionFilter`, `orderBys`, `dimensionExpression`, and `pivots`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object Dimension {
  
  @scala.inline
  def apply(): Dimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimension]
  }
  
  @scala.inline
  implicit class DimensionMutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionExpression(value: DimensionExpression): Self = StObject.set(x, "dimensionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionExpressionUndefined: Self = StObject.set(x, "dimensionExpression", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
