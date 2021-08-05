package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The default filter associated with a sheet.
  */
trait SchemaBasicFilter extends StObject {
  
  /**
    * The criteria for showing/hiding values per column. The map&#39;s key is
    * the column index, and the value is the criteria for that column.
    */
  var criteria: js.UndefOr[StringDictionary[SchemaFilterCriteria]] = js.undefined
  
  /**
    * The range the filter covers.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
  
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
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
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSortSpecs(value: js.Array[SchemaSortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
    
    inline def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
    
    inline def setSortSpecsVarargs(value: SchemaSortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value :_*))
  }
}
