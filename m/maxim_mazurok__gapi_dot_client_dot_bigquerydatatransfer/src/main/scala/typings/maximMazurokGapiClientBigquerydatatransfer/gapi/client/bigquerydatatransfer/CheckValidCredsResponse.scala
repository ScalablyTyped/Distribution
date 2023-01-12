package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckValidCredsResponse extends StObject {
  
  /** If set to `true`, the credentials exist and are valid. */
  var hasValidCreds: js.UndefOr[Boolean] = js.undefined
}
object CheckValidCredsResponse {
  
  inline def apply(): CheckValidCredsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckValidCredsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckValidCredsResponse] (val x: Self) extends AnyVal {
    
    inline def setHasValidCreds(value: Boolean): Self = StObject.set(x, "hasValidCreds", value.asInstanceOf[js.Any])
    
    inline def setHasValidCredsUndefined: Self = StObject.set(x, "hasValidCreds", js.undefined)
  }
}
