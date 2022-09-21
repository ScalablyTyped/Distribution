package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTopicstatsProjectsLocationsTopicsComputetimecursor
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaComputeTimeCursorRequest] = js.undefined
  
  /**
    * Required. The topic for which we should compute the cursor.
    */
  var topic: js.UndefOr[String] = js.undefined
}
object ParamsResourceTopicstatsProjectsLocationsTopicsComputetimecursor {
  
  inline def apply(): ParamsResourceTopicstatsProjectsLocationsTopicsComputetimecursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTopicstatsProjectsLocationsTopicsComputetimecursor]
  }
  
  extension [Self <: ParamsResourceTopicstatsProjectsLocationsTopicsComputetimecursor](x: Self) {
    
    inline def setRequestBody(value: SchemaComputeTimeCursorRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
