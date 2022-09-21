package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBasicFilter extends StObject {
  
  /**
    * The criteria for showing/hiding values per column. The map's key is the column index, and the value is the criteria for that column. This field is deprecated in favor of filter_specs.
    */
  var criteria: js.UndefOr[StringDictionary[SchemaFilterCriteria] | Null] = js.undefined
  
  /**
    * The filter criteria per column. Both criteria and filter_specs are populated in responses. If both fields are specified in an update request, this field takes precedence.
    */
  var filterSpecs: js.UndefOr[js.Array[SchemaFilterSpec]] = js.undefined
  
  /**
    * The range the filter covers.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
  
  /**
    * The sort order per column. Later specifications are used when values are equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SchemaSortSpec]] = js.undefined
}
object SchemaBasicFilter {
  
  inline def apply(): SchemaBasicFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicFilter]
  }
  
  extension [Self <: SchemaBasicFilter](x: Self) {
    
    inline def setCriteria(value: StringDictionary[SchemaFilterCriteria]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaNull: Self = StObject.set(x, "criteria", null)
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setFilterSpecs(value: js.Array[SchemaFilterSpec]): Self = StObject.set(x, "filterSpecs", value.asInstanceOf[js.Any])
    
    inline def setFilterSpecsUndefined: Self = StObject.set(x, "filterSpecs", js.undefined)
    
    inline def setFilterSpecsVarargs(value: SchemaFilterSpec*): Self = StObject.set(x, "filterSpecs", js.Array(value*))
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSortSpecs(value: js.Array[SchemaSortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
    
    inline def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
    
    inline def setSortSpecsVarargs(value: SchemaSortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value*))
  }
}
