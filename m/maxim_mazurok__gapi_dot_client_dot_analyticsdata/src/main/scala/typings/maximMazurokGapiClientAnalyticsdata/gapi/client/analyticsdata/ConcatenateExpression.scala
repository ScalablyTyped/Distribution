package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcatenateExpression extends StObject {
  
  /**
    * The delimiter placed between dimension names. Delimiters are often single characters such as "|" or "," but can be longer strings. If a dimension value contains the delimiter, both
    * will be present in response with no distinction. For example if dimension 1 value = "US,FR", dimension 2 value = "JP", and delimiter = ",", then the response will contain
    * "US,FR,JP".
    */
  var delimiter: js.UndefOr[String] = js.undefined
  
  /** Names of dimensions. The names must refer back to names in the dimensions field of the request. */
  var dimensionNames: js.UndefOr[js.Array[String]] = js.undefined
}
object ConcatenateExpression {
  
  @scala.inline
  def apply(): ConcatenateExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcatenateExpression]
  }
  
  @scala.inline
  implicit class ConcatenateExpressionMutableBuilder[Self <: ConcatenateExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setDimensionNames(value: js.Array[String]): Self = StObject.set(x, "dimensionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionNamesUndefined: Self = StObject.set(x, "dimensionNames", js.undefined)
    
    @scala.inline
    def setDimensionNamesVarargs(value: String*): Self = StObject.set(x, "dimensionNames", js.Array(value :_*))
  }
}
