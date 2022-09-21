package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceQueriesRun
  extends StObject
     with StandardParameters {
  
  /**
    * Required. ID of query to run.
    */
  var queryId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRunQueryRequest] = js.undefined
  
  /**
    * Whether the query should be run synchronously. When true, this method will not return until the query has finished running. When false or not specified, this method will return immediately.
    */
  var synchronous: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceQueriesRun {
  
  inline def apply(): ParamsResourceQueriesRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQueriesRun]
  }
  
  extension [Self <: ParamsResourceQueriesRun](x: Self) {
    
    inline def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
    
    inline def setRequestBody(value: SchemaRunQueryRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
    
    inline def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
  }
}
