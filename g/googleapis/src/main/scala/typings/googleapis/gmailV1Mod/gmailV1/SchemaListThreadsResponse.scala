package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListThreadsResponse extends StObject {
  
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Estimated total number of results.
    */
  var resultSizeEstimate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * List of threads. Note that each thread resource does not contain a list of `messages`. The list of `messages` for a given thread can be fetched using the threads.get method.
    */
  var threads: js.UndefOr[js.Array[SchemaThread]] = js.undefined
}
object SchemaListThreadsResponse {
  
  inline def apply(): SchemaListThreadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListThreadsResponse]
  }
  
  extension [Self <: SchemaListThreadsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResultSizeEstimate(value: Double): Self = StObject.set(x, "resultSizeEstimate", value.asInstanceOf[js.Any])
    
    inline def setResultSizeEstimateNull: Self = StObject.set(x, "resultSizeEstimate", null)
    
    inline def setResultSizeEstimateUndefined: Self = StObject.set(x, "resultSizeEstimate", js.undefined)
    
    inline def setThreads(value: js.Array[SchemaThread]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    inline def setThreadsVarargs(value: SchemaThread*): Self = StObject.set(x, "threads", js.Array(value*))
  }
}
