package typings.googleapis.tasksV1Mod.tasksV1

import typings.googleapis.anon.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTask extends StObject {
  
  /**
    * Completion date of the task (as a RFC 3339 timestamp). This field is
    * omitted if the task has not been completed.
    */
  var completed: js.UndefOr[String] = js.native
  
  /**
    * Flag indicating whether the task has been deleted. The default if False.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Due date of the task (as a RFC 3339 timestamp). Optional.
    */
  var due: js.UndefOr[String] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Flag indicating whether the task is hidden. This is the case if the task
    * had been marked completed when the task list was last cleared. The
    * default is False. This field is read-only.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Task identifier.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Type of the resource. This is always &quot;tasks#task&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Collection of links. This collection is read-only.
    */
  var links: js.UndefOr[js.Array[Link]] = js.native
  
  /**
    * Notes describing the task. Optional.
    */
  var notes: js.UndefOr[String] = js.native
  
  /**
    * Parent task identifier. This field is omitted if it is a top-level task.
    * This field is read-only. Use the &quot;move&quot; method to move the task
    * under a different parent or to the top level.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * String indicating the position of the task among its sibling tasks under
    * the same parent task or at the top level. If this string is greater than
    * another task&#39;s corresponding position string according to
    * lexicographical ordering, the task is positioned after the other task
    * under the same parent task (or at the top level). This field is
    * read-only. Use the &quot;move&quot; method to move the task to another
    * position.
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * URL pointing to this task. Used to retrieve, update, or delete this task.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Status of the task. This is either &quot;needsAction&quot; or
    * &quot;completed&quot;.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Title of the task.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Last modification time of the task (as a RFC 3339 timestamp).
    */
  var updated: js.UndefOr[String] = js.native
}
object SchemaTask {
  
  @scala.inline
  def apply(): SchemaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTask]
  }
  
  @scala.inline
  implicit class SchemaTaskMutableBuilder[Self <: SchemaTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDue(value: String): Self = StObject.set(x, "due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueUndefined: Self = StObject.set(x, "due", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
