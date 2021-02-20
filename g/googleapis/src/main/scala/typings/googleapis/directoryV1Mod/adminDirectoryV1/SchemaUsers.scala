package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template for List Users operation in Apps Directory API.
  */
@js.native
trait SchemaUsers extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Token used to access next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Event that triggered this response (only used in case of Push Response)
    */
  var trigger_event: js.UndefOr[String] = js.native
  
  /**
    * List of user objects.
    */
  var users: js.UndefOr[js.Array[SchemaUser]] = js.native
}
object SchemaUsers {
  
  @scala.inline
  def apply(): SchemaUsers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsers]
  }
  
  @scala.inline
  implicit class SchemaUsersMutableBuilder[Self <: SchemaUsers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTrigger_event(value: String): Self = StObject.set(x, "trigger_event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger_eventUndefined: Self = StObject.set(x, "trigger_event", js.undefined)
    
    @scala.inline
    def setUsers(value: js.Array[SchemaUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: SchemaUser*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
