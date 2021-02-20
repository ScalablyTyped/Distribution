package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckValidCredsResponse extends StObject {
  
  /** If set to `true`, the credentials exist and are valid. */
  var hasValidCreds: js.UndefOr[Boolean] = js.native
}
object CheckValidCredsResponse {
  
  @scala.inline
  def apply(): CheckValidCredsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckValidCredsResponse]
  }
  
  @scala.inline
  implicit class CheckValidCredsResponseMutableBuilder[Self <: CheckValidCredsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasValidCreds(value: Boolean): Self = StObject.set(x, "hasValidCreds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasValidCredsUndefined: Self = StObject.set(x, "hasValidCreds", js.undefined)
  }
}
