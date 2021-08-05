package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransitTable extends StObject {
  
  /**
    * A list of postal group names. The last value can be &quot;all other
    * locations&quot;. Example: [&quot;zone 1&quot;, &quot;zone 2&quot;,
    * &quot;all other locations&quot;]. The referred postal code groups must
    * match the delivery country of the service.
    */
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var rows: js.UndefOr[js.Array[SchemaTransitTableTransitTimeRow]] = js.undefined
  
  /**
    * A list of transit time labels. The last value can be &quot;all other
    * labels&quot;. Example: [&quot;food&quot;, &quot;electronics&quot;,
    * &quot;all other labels&quot;].
    */
  var transitTimeLabels: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaTransitTable {
  
  inline def apply(): SchemaTransitTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransitTable]
  }
  
  extension [Self <: SchemaTransitTable](x: Self) {
    
    inline def setPostalCodeGroupNames(value: js.Array[String]): Self = StObject.set(x, "postalCodeGroupNames", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeGroupNamesUndefined: Self = StObject.set(x, "postalCodeGroupNames", js.undefined)
    
    inline def setPostalCodeGroupNamesVarargs(value: String*): Self = StObject.set(x, "postalCodeGroupNames", js.Array(value :_*))
    
    inline def setRows(value: js.Array[SchemaTransitTableTransitTimeRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaTransitTableTransitTimeRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    inline def setTransitTimeLabels(value: js.Array[String]): Self = StObject.set(x, "transitTimeLabels", value.asInstanceOf[js.Any])
    
    inline def setTransitTimeLabelsUndefined: Self = StObject.set(x, "transitTimeLabels", js.undefined)
    
    inline def setTransitTimeLabelsVarargs(value: String*): Self = StObject.set(x, "transitTimeLabels", js.Array(value :_*))
  }
}
