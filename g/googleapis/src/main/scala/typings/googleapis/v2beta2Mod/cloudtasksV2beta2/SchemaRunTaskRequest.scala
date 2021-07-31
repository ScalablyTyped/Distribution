package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for forcing a task to run now using RunTask.
  */
trait SchemaRunTaskRequest extends StObject {
  
  /**
    * The response_view specifies which subset of the Task will be returned. By
    * default response_view is BASIC; not all information is retrieved by
    * default because some data, such as payloads, might be desirable to return
    * only when needed because of its large size or because of the sensitivity
    * of data that it contains.  Authorization for FULL requires
    * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    * permission on the Task resource.
    */
  var responseView: js.UndefOr[String] = js.undefined
}
object SchemaRunTaskRequest {
  
  @scala.inline
  def apply(): SchemaRunTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunTaskRequest]
  }
  
  @scala.inline
  implicit class SchemaRunTaskRequestMutableBuilder[Self <: SchemaRunTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponseView(value: String): Self = StObject.set(x, "responseView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseViewUndefined: Self = StObject.set(x, "responseView", js.undefined)
  }
}
