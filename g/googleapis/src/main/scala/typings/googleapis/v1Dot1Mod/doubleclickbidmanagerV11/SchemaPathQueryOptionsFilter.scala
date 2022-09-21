package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPathQueryOptionsFilter extends StObject {
  
  /**
    * Dimension the filter is applied to.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates how the filter should be matched to the value.
    */
  var `match`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value to filter on.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPathQueryOptionsFilter {
  
  inline def apply(): SchemaPathQueryOptionsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathQueryOptionsFilter]
  }
  
  extension [Self <: SchemaPathQueryOptionsFilter](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchNull: Self = StObject.set(x, "match", null)
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
