package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPathReportDimensionValue extends StObject {
  
  /**
    * The name of the dimension.
    */
  var dimensionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The possible ID's associated with the value if available.
    */
  var ids: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#pathReportDimensionValue.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Determines how the 'value' field is matched when filtering. If not specified, defaults to EXACT. If set to WILDCARD_EXPRESSION, '*' is allowed as a placeholder for variable length character sequences, and it can be escaped with a backslash. Note, only paid search dimensions ('dfa:paidSearch*') allow a matchType other than EXACT.
    */
  var matchType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The possible values of the dimension.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPathReportDimensionValue {
  
  inline def apply(): SchemaPathReportDimensionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathReportDimensionValue]
  }
  
  extension [Self <: SchemaPathReportDimensionValue](x: Self) {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameNull: Self = StObject.set(x, "dimensionName", null)
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsNull: Self = StObject.set(x, "ids", null)
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    inline def setMatchTypeNull: Self = StObject.set(x, "matchType", null)
    
    inline def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
