package typings.googleapis.tasksV1Mod.tasksV1

import typings.googleapis.anon.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTask extends StObject {
  
  /**
    * Completion date of the task (as a RFC 3339 timestamp). This field is omitted if the task has not been completed.
    */
  var completed: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Flag indicating whether the task has been deleted. The default is False.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Due date of the task (as a RFC 3339 timestamp). Optional. The due date only records date information; the time portion of the timestamp is discarded when setting the due date. It isn't possible to read or write the time that a task is due via the API.
    */
  var due: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Flag indicating whether the task is hidden. This is the case if the task had been marked completed when the task list was last cleared. The default is False. This field is read-only.
    */
  var hidden: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Task identifier.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the resource. This is always "tasks#task".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Collection of links. This collection is read-only.
    */
  var links: js.UndefOr[js.Array[Link] | Null] = js.undefined
  
  /**
    * Notes describing the task. Optional.
    */
  var notes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parent task identifier. This field is omitted if it is a top-level task. This field is read-only. Use the "move" method to move the task under a different parent or to the top level.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * String indicating the position of the task among its sibling tasks under the same parent task or at the top level. If this string is greater than another task's corresponding position string according to lexicographical ordering, the task is positioned after the other task under the same parent task (or at the top level). This field is read-only. Use the "move" method to move the task to another position.
    */
  var position: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL pointing to this task. Used to retrieve, update, or delete this task.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the task. This is either "needsAction" or "completed".
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of the task.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Last modification time of the task (as a RFC 3339 timestamp).
    */
  var updated: js.UndefOr[String | Null] = js.undefined
}
object SchemaTask {
  
  inline def apply(): SchemaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTask]
  }
  
  extension [Self <: SchemaTask](x: Self) {
    
    inline def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCompletedNull: Self = StObject.set(x, "completed", null)
    
    inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDue(value: String): Self = StObject.set(x, "due", value.asInstanceOf[js.Any])
    
    inline def setDueNull: Self = StObject.set(x, "due", null)
    
    inline def setDueUndefined: Self = StObject.set(x, "due", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenNull: Self = StObject.set(x, "hidden", null)
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksNull: Self = StObject.set(x, "links", null)
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
