package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedMessageIntegrationPayload extends StObject {
  
  /** Pantheon project number used to identify the calling app. */
  var projectNumber: js.UndefOr[String] = js.undefined
  
  var tasksMessageIntegrationPayload: js.UndefOr[Any] = js.undefined
  
  /** An enum indicating which 1P application's payload this is. This field is required to add 1P payload. */
  var `type`: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedMessageIntegrationPayload {
  
  inline def apply(): AppsDynamiteSharedMessageIntegrationPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedMessageIntegrationPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedMessageIntegrationPayload] (val x: Self) extends AnyVal {
    
    inline def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    inline def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
    
    inline def setTasksMessageIntegrationPayload(value: Any): Self = StObject.set(x, "tasksMessageIntegrationPayload", value.asInstanceOf[js.Any])
    
    inline def setTasksMessageIntegrationPayloadUndefined: Self = StObject.set(x, "tasksMessageIntegrationPayload", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
