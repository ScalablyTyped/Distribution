package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The default filter associated with a sheet.
  */
@js.native
trait SchemaBasicFilter extends StObject {
  
  /**
    * The criteria for showing/hiding values per column. The map&#39;s key is
    * the column index, and the value is the criteria for that column.
    */
  var criteria: js.UndefOr[StringDictionary[SchemaFilterCriteria]] = js.native
  
  /**
    * The range the filter covers.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SchemaSortSpec]] = js.native
}
object SchemaBasicFilter {
  
  @scala.inline
  def apply(): SchemaBasicFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicFilter]
  }
  
  @scala.inline
  implicit class SchemaBasicFilterMutableBuilder[Self <: SchemaBasicFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteria(value: StringDictionary[SchemaFilterCriteria]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
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
  }
}
