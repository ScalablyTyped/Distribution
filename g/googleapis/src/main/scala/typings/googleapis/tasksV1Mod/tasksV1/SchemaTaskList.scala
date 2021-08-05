package typings.googleapis.tasksV1Mod.tasksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTaskList extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Task list identifier.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the resource. This is always &quot;tasks#taskList&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * URL pointing to this task list. Used to retrieve, update, or delete this
    * task list.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the task list.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Last modification time of the task list (as a RFC 3339 timestamp).
    */
  var updated: js.UndefOr[String] = js.undefined
}
object SchemaTaskList {
  
  inline def apply(): SchemaTaskList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTaskList]
  }
  
  extension [Self <: SchemaTaskList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
