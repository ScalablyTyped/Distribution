package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedTasksAnnotationData extends StObject {
  
  var assigneeChange: js.UndefOr[AppsDynamiteSharedTasksAnnotationDataAssigneeChange] = js.undefined
  
  var completionChange: js.UndefOr[Any] = js.undefined
  
  var creation: js.UndefOr[Any] = js.undefined
  
  var deletionChange: js.UndefOr[Any] = js.undefined
  
  /** ID of task. Will be used to create deep links to Tasks. */
  var taskId: js.UndefOr[String] = js.undefined
  
  /** Task properties after the update has been applied. */
  var taskProperties: js.UndefOr[AppsDynamiteSharedTasksAnnotationDataTaskProperties] = js.undefined
  
  var userDefinedMessage: js.UndefOr[Any] = js.undefined
}
object AppsDynamiteSharedTasksAnnotationData {
  
  inline def apply(): AppsDynamiteSharedTasksAnnotationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedTasksAnnotationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedTasksAnnotationData] (val x: Self) extends AnyVal {
    
    inline def setAssigneeChange(value: AppsDynamiteSharedTasksAnnotationDataAssigneeChange): Self = StObject.set(x, "assigneeChange", value.asInstanceOf[js.Any])
    
    inline def setAssigneeChangeUndefined: Self = StObject.set(x, "assigneeChange", js.undefined)
    
    inline def setCompletionChange(value: Any): Self = StObject.set(x, "completionChange", value.asInstanceOf[js.Any])
    
    inline def setCompletionChangeUndefined: Self = StObject.set(x, "completionChange", js.undefined)
    
    inline def setCreation(value: Any): Self = StObject.set(x, "creation", value.asInstanceOf[js.Any])
    
    inline def setCreationUndefined: Self = StObject.set(x, "creation", js.undefined)
    
    inline def setDeletionChange(value: Any): Self = StObject.set(x, "deletionChange", value.asInstanceOf[js.Any])
    
    inline def setDeletionChangeUndefined: Self = StObject.set(x, "deletionChange", js.undefined)
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    inline def setTaskProperties(value: AppsDynamiteSharedTasksAnnotationDataTaskProperties): Self = StObject.set(x, "taskProperties", value.asInstanceOf[js.Any])
    
    inline def setTaskPropertiesUndefined: Self = StObject.set(x, "taskProperties", js.undefined)
    
    inline def setUserDefinedMessage(value: Any): Self = StObject.set(x, "userDefinedMessage", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedMessageUndefined: Self = StObject.set(x, "userDefinedMessage", js.undefined)
  }
}
