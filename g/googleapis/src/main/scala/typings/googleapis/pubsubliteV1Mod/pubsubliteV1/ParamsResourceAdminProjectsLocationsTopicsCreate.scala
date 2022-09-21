package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdminProjectsLocationsTopicsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent location in which to create the topic. Structured like `projects/{project_number\}/locations/{location\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTopic] = js.undefined
  
  /**
    * Required. The ID to use for the topic, which will become the final component of the topic's name. This value is structured like: `my-topic-name`.
    */
  var topicId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdminProjectsLocationsTopicsCreate {
  
  inline def apply(): ParamsResourceAdminProjectsLocationsTopicsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdminProjectsLocationsTopicsCreate]
  }
  
  extension [Self <: ParamsResourceAdminProjectsLocationsTopicsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaTopic): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
    
    inline def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
  }
}
