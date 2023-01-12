package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimension extends StObject {
  
  /** One dimension can be the result of an expression of multiple dimensions. For example, dimension "country, city": concatenate(country, ", ", city). */
  var dimensionExpression: js.UndefOr[DimensionExpression] = js.undefined
  
  /**
    * The name of the dimension. See the [API Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions) for the list of dimension names. If
    * `dimensionExpression` is specified, `name` can be any string that you would like within the allowed character set. For example if a `dimensionExpression` concatenates `country` and
    * `city`, you could call that dimension `countryAndCity`. Dimension names that you choose must match the regular expression `^[a-zA-Z0-9_]$`. Dimensions are referenced by `name` in
    * `dimensionFilter`, `orderBys`, `dimensionExpression`, and `pivots`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object Dimension {
  
  inline def apply(): Dimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
    
    inline def setDimensionExpression(value: DimensionExpression): Self = StObject.set(x, "dimensionExpression", value.asInstanceOf[js.Any])
    
    inline def setDimensionExpressionUndefined: Self = StObject.set(x, "dimensionExpression", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
