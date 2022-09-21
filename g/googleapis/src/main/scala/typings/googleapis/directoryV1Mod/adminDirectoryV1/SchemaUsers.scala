package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUsers extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Token used to access next page of this result.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Event that triggered this response (only used in case of Push Response)
    */
  var trigger_event: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of user objects.
    */
  var users: js.UndefOr[js.Array[SchemaUser]] = js.undefined
}
object SchemaUsers {
  
  inline def apply(): SchemaUsers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsers]
  }
  
  extension [Self <: SchemaUsers](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTrigger_event(value: String): Self = StObject.set(x, "trigger_event", value.asInstanceOf[js.Any])
    
    inline def setTrigger_eventNull: Self = StObject.set(x, "trigger_event", null)
    
    inline def setTrigger_eventUndefined: Self = StObject.set(x, "trigger_event", js.undefined)
    
    inline def setUsers(value: js.Array[SchemaUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: SchemaUser*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
