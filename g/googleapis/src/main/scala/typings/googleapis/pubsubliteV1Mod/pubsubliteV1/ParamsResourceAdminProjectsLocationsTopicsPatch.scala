package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdminProjectsLocationsTopicsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the topic. Structured like: projects/{project_number\}/locations/{location\}/topics/{topic_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTopic] = js.undefined
  
  /**
    * Required. A mask specifying the topic fields to change.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdminProjectsLocationsTopicsPatch {
  
  inline def apply(): ParamsResourceAdminProjectsLocationsTopicsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdminProjectsLocationsTopicsPatch]
  }
  
  extension [Self <: ParamsResourceAdminProjectsLocationsTopicsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaTopic): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
