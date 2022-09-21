package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTopicstatsProjectsLocationsTopicsComputeheadcursor
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaComputeHeadCursorRequest] = js.undefined
  
  /**
    * Required. The topic for which we should compute the head cursor.
    */
  var topic: js.UndefOr[String] = js.undefined
}
object ParamsResourceTopicstatsProjectsLocationsTopicsComputeheadcursor {
  
  inline def apply(): ParamsResourceTopicstatsProjectsLocationsTopicsComputeheadcursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTopicstatsProjectsLocationsTopicsComputeheadcursor]
  }
  
  extension [Self <: ParamsResourceTopicstatsProjectsLocationsTopicsComputeheadcursor](x: Self) {
    
    inline def setRequestBody(value: SchemaComputeHeadCursorRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
