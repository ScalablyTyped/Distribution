package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValueFilter extends StObject {
  
  /**
    * The `operator_name` applied to the query, such as *price_greater_than*.
    * The filter can work against both types of filters defined in the schema
    * for your data source: &lt;br/&gt;&lt;br/&gt; 1. `operator_name`, where
    * the query filters results by the property that matches the value.
    * &lt;br/&gt; 2. `greater_than_operator_name` or `less_than_operator_name`
    * in your schema. The query filters the results for the property values
    * that are greater than or less than  the supplied value in the query.
    */
  var operatorName: js.UndefOr[String] = js.undefined
  
  /**
    * The value to be compared with.
    */
  var value: js.UndefOr[SchemaValue] = js.undefined
}
object SchemaValueFilter {
  
  inline def apply(): SchemaValueFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValueFilter]
  }
  
  extension [Self <: SchemaValueFilter](x: Self) {
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    inline def setValue(value: SchemaValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
