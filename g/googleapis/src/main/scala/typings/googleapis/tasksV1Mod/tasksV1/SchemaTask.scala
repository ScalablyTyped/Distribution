package typings.googleapis.tasksV1Mod.tasksV1

import typings.googleapis.anon.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTask extends StObject {
  
  /**
    * Completion date of the task (as a RFC 3339 timestamp). This field is
    * omitted if the task has not been completed.
    */
  var completed: js.UndefOr[String] = js.undefined
  
  /**
    * Flag indicating whether the task has been deleted. The default if False.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Due date of the task (as a RFC 3339 timestamp). Optional.
    */
  var due: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Flag indicating whether the task is hidden. This is the case if the task
    * had been marked completed when the task list was last cleared. The
    * default is False. This field is read-only.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Task identifier.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the resource. This is always &quot;tasks#task&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Collection of links. This collection is read-only.
    */
  var links: js.UndefOr[js.Array[Link]] = js.undefined
  
  /**
    * Notes describing the task. Optional.
    */
  var notes: js.UndefOr[String] = js.undefined
  
  /**
    * Parent task identifier. This field is omitted if it is a top-level task.
    * This field is read-only. Use the &quot;move&quot; method to move the task
    * under a different parent or to the top level.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * String indicating the position of the task among its sibling tasks under
    * the same parent task or at the top level. If this string is greater than
    * another task&#39;s corresponding position string according to
    * lexicographical ordering, the task is positioned after the other task
    * under the same parent task (or at the top level). This field is
    * read-only. Use the &quot;move&quot; method to move the task to another
    * position.
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * URL pointing to this task. Used to retrieve, update, or delete this task.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the task. This is either &quot;needsAction&quot; or
    * &quot;completed&quot;.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the task.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Last modification time of the task (as a RFC 3339 timestamp).
    */
  var updated: js.UndefOr[String] = js.undefined
}
object SchemaTask {
  
  inline def apply(): SchemaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTask]
  }
  
  extension [Self <: SchemaTask](x: Self) {
    
    inline def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDue(value: String): Self = StObject.set(x, "due", value.asInstanceOf[js.Any])
    
    inline def setDueUndefined: Self = StObject.set(x, "due", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
