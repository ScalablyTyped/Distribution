package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1SessionEventQueryDetail extends StObject {
  
  /**
    * The data processed by the query.
    */
  var dataProcessedBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time taken for execution of the query.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Query Execution engine.
    */
  var engine: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique Query id identifying the query.
    */
  var queryId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The query text executed.
    */
  var queryText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size of results the query produced.
    */
  var resultSizeBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1SessionEventQueryDetail {
  
  inline def apply(): SchemaGoogleCloudDataplexV1SessionEventQueryDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1SessionEventQueryDetail]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1SessionEventQueryDetail](x: Self) {
    
    inline def setDataProcessedBytes(value: String): Self = StObject.set(x, "dataProcessedBytes", value.asInstanceOf[js.Any])
    
    inline def setDataProcessedBytesNull: Self = StObject.set(x, "dataProcessedBytes", null)
    
    inline def setDataProcessedBytesUndefined: Self = StObject.set(x, "dataProcessedBytes", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineNull: Self = StObject.set(x, "engine", null)
    
    inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    inline def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdNull: Self = StObject.set(x, "queryId", null)
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
    
    inline def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
    
    inline def setQueryTextNull: Self = StObject.set(x, "queryText", null)
    
    inline def setQueryTextUndefined: Self = StObject.set(x, "queryText", js.undefined)
    
    inline def setResultSizeBytes(value: String): Self = StObject.set(x, "resultSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setResultSizeBytesNull: Self = StObject.set(x, "resultSizeBytes", null)
    
    inline def setResultSizeBytesUndefined: Self = StObject.set(x, "resultSizeBytes", js.undefined)
  }
}
