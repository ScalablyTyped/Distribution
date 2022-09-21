package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Results that matched the filter criteria and were accessible to the caller. Results are always in descending order of pipeline creation date.
    */
  var pipelines: js.UndefOr[js.Array[SchemaGoogleCloudDatapipelinesV1Pipeline]] = js.undefined
}
object SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse {
  
  inline def apply(): SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPipelines(value: js.Array[SchemaGoogleCloudDatapipelinesV1Pipeline]): Self = StObject.set(x, "pipelines", value.asInstanceOf[js.Any])
    
    inline def setPipelinesUndefined: Self = StObject.set(x, "pipelines", js.undefined)
    
    inline def setPipelinesVarargs(value: SchemaGoogleCloudDatapipelinesV1Pipeline*): Self = StObject.set(x, "pipelines", js.Array(value*))
  }
}
