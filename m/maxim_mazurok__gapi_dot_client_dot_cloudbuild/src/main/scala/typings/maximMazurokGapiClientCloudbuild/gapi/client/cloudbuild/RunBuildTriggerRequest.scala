package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunBuildTriggerRequest extends StObject {
  
  /** Required. ID of the project. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Source to build against this trigger. Branch and tag names cannot consist of regular expressions. */
  var source: js.UndefOr[RepoSource] = js.undefined
  
  /** Required. ID of the trigger. */
  var triggerId: js.UndefOr[String] = js.undefined
}
object RunBuildTriggerRequest {
  
  inline def apply(): RunBuildTriggerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunBuildTriggerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunBuildTriggerRequest] (val x: Self) extends AnyVal {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSource(value: RepoSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
  }
}
