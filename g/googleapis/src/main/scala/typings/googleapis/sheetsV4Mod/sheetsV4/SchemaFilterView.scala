package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A filter view.
  */
trait SchemaFilterView extends StObject {
  
  /**
    * The criteria for showing/hiding values per column. The map&#39;s key is
    * the column index, and the value is the criteria for that column.
    */
  var criteria: js.UndefOr[StringDictionary[SchemaFilterCriteria]] = js.undefined
  
  /**
    * The ID of the filter view.
    */
  var filterViewId: js.UndefOr[Double] = js.undefined
  
  /**
    * The named range this filter view is backed by, if any.  When writing,
    * only one of range or named_range_id may be set.
    */
  var namedRangeId: js.UndefOr[String] = js.undefined
  
  /**
    * The range this filter view covers.  When writing, only one of range or
    * named_range_id may be set.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
  
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SchemaSortSpec]] = js.undefined
  
  /**
    * The name of the filter view.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaFilterView {
  
  inline def apply(): SchemaFilterView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterView]
  }
  
  extension [Self <: SchemaFilterView](x: Self) {
    
    inline def setCriteria(value: StringDictionary[SchemaFilterCriteria]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setFilterViewId(value: Double): Self = StObject.set(x, "filterViewId", value.asInstanceOf[js.Any])
    
    inline def setFilterViewIdUndefined: Self = StObject.set(x, "filterViewId", js.undefined)
    
    inline def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    inline def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSortSpecs(value: js.Array[SchemaSortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
    
    inline def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
    
    inline def setSortSpecsVarargs(value: SchemaSortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value :_*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
