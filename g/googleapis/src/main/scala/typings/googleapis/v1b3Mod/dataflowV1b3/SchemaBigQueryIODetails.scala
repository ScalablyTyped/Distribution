package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for a BigQuery connector used by the job.
  */
trait SchemaBigQueryIODetails extends StObject {
  
  /**
    * Dataset accessed in the connection.
    */
  var dataset: js.UndefOr[String] = js.undefined
  
  /**
    * Project accessed in the connection.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Query used to access data in the connection.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Table accessed in the connection.
    */
  var table: js.UndefOr[String] = js.undefined
}
object SchemaBigQueryIODetails {
  
  inline def apply(): SchemaBigQueryIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryIODetails]
  }
  
  extension [Self <: SchemaBigQueryIODetails](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
