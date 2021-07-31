package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueFilter extends StObject {
  
  /**
    * The `operator_name` applied to the query, such as *price_greater_than*. The filter can work against both types of filters defined in the schema for your data source: 1.
    * `operator_name`, where the query filters results by the property that matches the value. 2. `greater_than_operator_name` or `less_than_operator_name` in your schema. The query
    * filters the results for the property values that are greater than or less than the supplied value in the query.
    */
  var operatorName: js.UndefOr[String] = js.undefined
  
  /** The value to be compared with. */
  var value: js.UndefOr[Value] = js.undefined
}
object ValueFilter {
  
  @scala.inline
  def apply(): ValueFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueFilter]
  }
  
  @scala.inline
  implicit class ValueFilterMutableBuilder[Self <: ValueFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
