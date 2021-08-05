package typings.googleapis.tasksV1Mod.tasksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTasksList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Upper bound for a task's completion date (as a RFC 3339 timestamp) to
    * filter by. Optional. The default is not to filter by completion date.
    */
  var completedMax: js.UndefOr[String] = js.undefined
  
  /**
    * Lower bound for a task's completion date (as a RFC 3339 timestamp) to
    * filter by. Optional. The default is not to filter by completion date.
    */
  var completedMin: js.UndefOr[String] = js.undefined
  
  /**
    * Upper bound for a task's due date (as a RFC 3339 timestamp) to filter by.
    * Optional. The default is not to filter by due date.
    */
  var dueMax: js.UndefOr[String] = js.undefined
  
  /**
    * Lower bound for a task's due date (as a RFC 3339 timestamp) to filter by.
    * Optional. The default is not to filter by due date.
    */
  var dueMin: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of task lists returned on one page. Optional. The default
    * is 20 (max allowed: 100).
    */
  var maxResults: js.UndefOr[String] = js.undefined
  
  /**
    * Token specifying the result page to return. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Flag indicating whether completed tasks are returned in the result.
    * Optional. The default is True.
    */
  var showCompleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Flag indicating whether deleted tasks are returned in the result.
    * Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Flag indicating whether hidden tasks are returned in the result.
    * Optional. The default is False.
    */
  var showHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Task list identifier.
    */
  var tasklist: js.UndefOr[String] = js.undefined
  
  /**
    * Lower bound for a task's last modification time (as a RFC 3339 timestamp)
    * to filter by. Optional. The default is not to filter by last modification
    * time.
    */
  var updatedMin: js.UndefOr[String] = js.undefined
}
object ParamsResourceTasksList {
  
  inline def apply(): ParamsResourceTasksList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTasksList]
  }
  
  extension [Self <: ParamsResourceTasksList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCompletedMax(value: String): Self = StObject.set(x, "completedMax", value.asInstanceOf[js.Any])
    
    inline def setCompletedMaxUndefined: Self = StObject.set(x, "completedMax", js.undefined)
    
    inline def setCompletedMin(value: String): Self = StObject.set(x, "completedMin", value.asInstanceOf[js.Any])
    
    inline def setCompletedMinUndefined: Self = StObject.set(x, "completedMin", js.undefined)
    
    inline def setDueMax(value: String): Self = StObject.set(x, "dueMax", value.asInstanceOf[js.Any])
    
    inline def setDueMaxUndefined: Self = StObject.set(x, "dueMax", js.undefined)
    
    inline def setDueMin(value: String): Self = StObject.set(x, "dueMin", value.asInstanceOf[js.Any])
    
    inline def setDueMinUndefined: Self = StObject.set(x, "dueMin", js.undefined)
    
    inline def setMaxResults(value: String): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setShowCompleted(value: Boolean): Self = StObject.set(x, "showCompleted", value.asInstanceOf[js.Any])
    
    inline def setShowCompletedUndefined: Self = StObject.set(x, "showCompleted", js.undefined)
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    inline def setShowHidden(value: Boolean): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
    
    inline def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
    
    inline def setTasklist(value: String): Self = StObject.set(x, "tasklist", value.asInstanceOf[js.Any])
    
    inline def setTasklistUndefined: Self = StObject.set(x, "tasklist", js.undefined)
    
    inline def setUpdatedMin(value: String): Self = StObject.set(x, "updatedMin", value.asInstanceOf[js.Any])
    
    inline def setUpdatedMinUndefined: Self = StObject.set(x, "updatedMin", js.undefined)
  }
}
