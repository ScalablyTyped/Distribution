package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListThreadsResponse extends StObject {
  
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Estimated total number of results.
    */
  var resultSizeEstimate: js.UndefOr[Double] = js.native
  
  /**
    * List of threads. Note that each thread resource does not contain a list
    * of messages. The list of messages for a given thread can be fetched using
    * the threads.get method.
    */
  var threads: js.UndefOr[js.Array[SchemaThread]] = js.native
}
object SchemaListThreadsResponse {
  
  @scala.inline
  def apply(): SchemaListThreadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListThreadsResponse]
  }
  
  @scala.inline
  implicit class SchemaListThreadsResponseMutableBuilder[Self <: SchemaListThreadsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResultSizeEstimate(value: Double): Self = StObject.set(x, "resultSizeEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSizeEstimateUndefined: Self = StObject.set(x, "resultSizeEstimate", js.undefined)
    
    @scala.inline
    def setThreads(value: js.Array[SchemaThread]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    @scala.inline
    def setThreadsVarargs(value: SchemaThread*): Self = StObject.set(x, "threads", js.Array(value :_*))
  }
}
