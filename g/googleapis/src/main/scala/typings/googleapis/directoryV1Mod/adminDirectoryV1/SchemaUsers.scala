package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template for List Users operation in Apps Directory API.
  */
trait SchemaUsers extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Token used to access next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Event that triggered this response (only used in case of Push Response)
    */
  var trigger_event: js.UndefOr[String] = js.undefined
  
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
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTrigger_event(value: String): Self = StObject.set(x, "trigger_event", value.asInstanceOf[js.Any])
    
    inline def setTrigger_eventUndefined: Self = StObject.set(x, "trigger_event", js.undefined)
    
    inline def setUsers(value: js.Array[SchemaUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: SchemaUser*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
