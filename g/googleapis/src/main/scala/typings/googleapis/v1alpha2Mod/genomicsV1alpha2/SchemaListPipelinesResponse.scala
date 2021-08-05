package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response of ListPipelines. Contains at most `pageSize` pipelines. If it
  * contains `pageSize` pipelines, and more pipelines exist, then
  * `nextPageToken` will be populated and should be used as the `pageToken`
  * argument to a subsequent ListPipelines request.
  */
trait SchemaListPipelinesResponse extends StObject {
  
  /**
    * The token to use to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The matched pipelines.
    */
  var pipelines: js.UndefOr[js.Array[SchemaPipeline]] = js.undefined
}
object SchemaListPipelinesResponse {
  
  inline def apply(): SchemaListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPipelinesResponse]
  }
  
  extension [Self <: SchemaListPipelinesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPipelines(value: js.Array[SchemaPipeline]): Self = StObject.set(x, "pipelines", value.asInstanceOf[js.Any])
    
    inline def setPipelinesUndefined: Self = StObject.set(x, "pipelines", js.undefined)
    
    inline def setPipelinesVarargs(value: SchemaPipeline*): Self = StObject.set(x, "pipelines", js.Array(value :_*))
  }
}
