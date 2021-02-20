package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A filter view.
  */
@js.native
trait SchemaFilterView extends StObject {
  
  /**
    * The criteria for showing/hiding values per column. The map&#39;s key is
    * the column index, and the value is the criteria for that column.
    */
  var criteria: js.UndefOr[StringDictionary[SchemaFilterCriteria]] = js.native
  
  /**
    * The ID of the filter view.
    */
  var filterViewId: js.UndefOr[Double] = js.native
  
  /**
    * The named range this filter view is backed by, if any.  When writing,
    * only one of range or named_range_id may be set.
    */
  var namedRangeId: js.UndefOr[String] = js.native
  
  /**
    * The range this filter view covers.  When writing, only one of range or
    * named_range_id may be set.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SchemaSortSpec]] = js.native
  
  /**
    * The name of the filter view.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaFilterView {
  
  @scala.inline
  def apply(): SchemaFilterView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterView]
  }
  
  @scala.inline
  implicit class SchemaFilterViewMutableBuilder[Self <: SchemaFilterView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteria(value: StringDictionary[SchemaFilterCriteria]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setFilterViewId(value: Double): Self = StObject.set(x, "filterViewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterViewIdUndefined: Self = StObject.set(x, "filterViewId", js.undefined)
    
    @scala.inline
    def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setSortSpecs(value: js.Array[SchemaSortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
    
    @scala.inline
    def setSortSpecsVarargs(value: SchemaSortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
