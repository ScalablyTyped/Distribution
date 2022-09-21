package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFilterSpec extends StObject {
  
  /**
    * The column index.
    */
  var columnIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Reference to a data source column.
    */
  var dataSourceColumnReference: js.UndefOr[SchemaDataSourceColumnReference] = js.undefined
  
  /**
    * The criteria for the column.
    */
  var filterCriteria: js.UndefOr[SchemaFilterCriteria] = js.undefined
}
object SchemaFilterSpec {
  
  inline def apply(): SchemaFilterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterSpec]
  }
  
  extension [Self <: SchemaFilterSpec](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexNull: Self = StObject.set(x, "columnIndex", null)
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setDataSourceColumnReference(value: SchemaDataSourceColumnReference): Self = StObject.set(x, "dataSourceColumnReference", value.asInstanceOf[js.Any])
    
    inline def setDataSourceColumnReferenceUndefined: Self = StObject.set(x, "dataSourceColumnReference", js.undefined)
    
    inline def setFilterCriteria(value: SchemaFilterCriteria): Self = StObject.set(x, "filterCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaUndefined: Self = StObject.set(x, "filterCriteria", js.undefined)
  }
}
