package typings.googleapis.cloudtasksV2Mod.cloudtasksV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing tasks using ListTasks.
  */
trait SchemaListTasksResponse extends StObject {
  
  /**
    * A token to retrieve next page of results.  To return the next page of
    * results, call ListTasks with this value as the page_token.  If the
    * next_page_token is empty, there are no more results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of tasks.
    */
  var tasks: js.UndefOr[js.Array[SchemaTask]] = js.undefined
}
object SchemaListTasksResponse {
  
  @scala.inline
  def apply(): SchemaListTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTasksResponse]
  }
  
  @scala.inline
  implicit class SchemaListTasksResponseMutableBuilder[Self <: SchemaListTasksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTasks(value: js.Array[SchemaTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    @scala.inline
    def setTasksVarargs(value: SchemaTask*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
