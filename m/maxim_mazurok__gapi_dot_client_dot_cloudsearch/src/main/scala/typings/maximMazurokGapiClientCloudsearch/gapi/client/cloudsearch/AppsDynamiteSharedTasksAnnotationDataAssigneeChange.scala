package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedTasksAnnotationDataAssigneeChange extends StObject {
  
  /** Obfuscated user ID of previous assignee. Not set if the task was originally not assigned. */
  var oldAssignee: js.UndefOr[AppsDynamiteUserId] = js.undefined
}
object AppsDynamiteSharedTasksAnnotationDataAssigneeChange {
  
  inline def apply(): AppsDynamiteSharedTasksAnnotationDataAssigneeChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedTasksAnnotationDataAssigneeChange]
  }
  
  extension [Self <: AppsDynamiteSharedTasksAnnotationDataAssigneeChange](x: Self) {
    
    inline def setOldAssignee(value: AppsDynamiteUserId): Self = StObject.set(x, "oldAssignee", value.asInstanceOf[js.Any])
    
    inline def setOldAssigneeUndefined: Self = StObject.set(x, "oldAssignee", js.undefined)
  }
}
