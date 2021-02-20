package typings.googleapis.tasksV1Mod.tasksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTaskLists extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Collection of task lists.
    */
  var items: js.UndefOr[js.Array[SchemaTaskList]] = js.native
  
  /**
    * Type of the resource. This is always &quot;tasks#taskLists&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Token that can be used to request the next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaTaskLists {
  
  @scala.inline
  def apply(): SchemaTaskLists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTaskLists]
  }
  
  @scala.inline
  implicit class SchemaTaskListsMutableBuilder[Self <: SchemaTaskLists] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaTaskList]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaTaskList*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
