package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitServicePerimetersRequest extends StObject {
  
  /**
    * Optional. The etag for the version of the Access Policy that this commit operation is to be performed on. If, at the time of commit, the etag for the Access Policy stored in Access
    * Context Manager is different from the specified etag, then the commit operation will not be performed and the call will fail. This field is not required. If etag is not provided,
    * the operation will be performed as if a valid etag is provided.
    */
  var etag: js.UndefOr[String] = js.undefined
}
object CommitServicePerimetersRequest {
  
  inline def apply(): CommitServicePerimetersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitServicePerimetersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitServicePerimetersRequest] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
