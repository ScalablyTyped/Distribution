package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPivotFilterSpec extends StObject {
  
  /**
    * The column offset of the source range.
    */
  var columnOffsetIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The reference to the data source column.
    */
  var dataSourceColumnReference: js.UndefOr[SchemaDataSourceColumnReference] = js.undefined
  
  /**
    * The criteria for the column.
    */
  var filterCriteria: js.UndefOr[SchemaPivotFilterCriteria] = js.undefined
}
object SchemaPivotFilterSpec {
  
  inline def apply(): SchemaPivotFilterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotFilterSpec]
  }
  
  extension [Self <: SchemaPivotFilterSpec](x: Self) {
    
    inline def setColumnOffsetIndex(value: Double): Self = StObject.set(x, "columnOffsetIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnOffsetIndexNull: Self = StObject.set(x, "columnOffsetIndex", null)
    
    inline def setColumnOffsetIndexUndefined: Self = StObject.set(x, "columnOffsetIndex", js.undefined)
    
    inline def setDataSourceColumnReference(value: SchemaDataSourceColumnReference): Self = StObject.set(x, "dataSourceColumnReference", value.asInstanceOf[js.Any])
    
    inline def setDataSourceColumnReferenceUndefined: Self = StObject.set(x, "dataSourceColumnReference", js.undefined)
    
    inline def setFilterCriteria(value: SchemaPivotFilterCriteria): Self = StObject.set(x, "filterCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaUndefined: Self = StObject.set(x, "filterCriteria", js.undefined)
  }
}
