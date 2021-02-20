package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAccountKeysListResponse extends StObject {
  
  /** The service account credentials. */
  var serviceAccountKey: js.UndefOr[js.Array[ServiceAccountKey]] = js.native
}
object ServiceAccountKeysListResponse {
  
  @scala.inline
  def apply(): ServiceAccountKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccountKeysListResponse]
  }
  
  @scala.inline
  implicit class ServiceAccountKeysListResponseMutableBuilder[Self <: ServiceAccountKeysListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceAccountKey(value: js.Array[ServiceAccountKey]): Self = StObject.set(x, "serviceAccountKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountKeyUndefined: Self = StObject.set(x, "serviceAccountKey", js.undefined)
    
    @scala.inline
    def setServiceAccountKeyVarargs(value: ServiceAccountKey*): Self = StObject.set(x, "serviceAccountKey", js.Array(value :_*))
  }
}
