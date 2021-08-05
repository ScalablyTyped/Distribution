package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of downloading accounts in batch.
  */
trait SchemaDownloadAccountResponse extends StObject {
  
  /**
    * The fixed string &quot;identitytoolkit#DownloadAccountResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The next page token. To be used in a subsequent request to return the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The user accounts data.
    */
  var users: js.UndefOr[js.Array[SchemaUserInfo]] = js.undefined
}
object SchemaDownloadAccountResponse {
  
  inline def apply(): SchemaDownloadAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadAccountResponse]
  }
  
  extension [Self <: SchemaDownloadAccountResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUsers(value: js.Array[SchemaUserInfo]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: SchemaUserInfo*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
