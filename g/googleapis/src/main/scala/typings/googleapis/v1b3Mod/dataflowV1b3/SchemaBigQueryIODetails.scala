package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBigQueryIODetails extends StObject {
  
  /**
    * Dataset accessed in the connection.
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Project accessed in the connection.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Query used to access data in the connection.
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Table accessed in the connection.
    */
  var table: js.UndefOr[String | Null] = js.undefined
}
object SchemaBigQueryIODetails {
  
  inline def apply(): SchemaBigQueryIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryIODetails]
  }
  
  extension [Self <: SchemaBigQueryIODetails](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetNull: Self = StObject.set(x, "dataset", null)
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableNull: Self = StObject.set(x, "table", null)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
