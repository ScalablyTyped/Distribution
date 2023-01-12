package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceAccessLevelsRequest extends StObject {
  
  /** Required. The desired Access Levels that should replace all existing Access Levels in the Access Policy. */
  var accessLevels: js.UndefOr[js.Array[AccessLevel]] = js.undefined
  
  /**
    * Optional. The etag for the version of the Access Policy that this replace operation is to be performed on. If, at the time of replace, the etag for the Access Policy stored in
    * Access Context Manager is different from the specified etag, then the replace operation will not be performed and the call will fail. This field is not required. If etag is not
    * provided, the operation will be performed as if a valid etag is provided.
    */
  var etag: js.UndefOr[String] = js.undefined
}
object ReplaceAccessLevelsRequest {
  
  inline def apply(): ReplaceAccessLevelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAccessLevelsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplaceAccessLevelsRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessLevels(value: js.Array[AccessLevel]): Self = StObject.set(x, "accessLevels", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelsUndefined: Self = StObject.set(x, "accessLevels", js.undefined)
    
    inline def setAccessLevelsVarargs(value: AccessLevel*): Self = StObject.set(x, "accessLevels", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
