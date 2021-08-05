package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyAuthenticationToken extends StObject {
  
  /** Name of the third-party authentication token. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Value of the third-party authentication token. This is a read-only, auto-generated field. */
  var value: js.UndefOr[String] = js.undefined
}
object ThirdPartyAuthenticationToken {
  
  inline def apply(): ThirdPartyAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyAuthenticationToken]
  }
  
  extension [Self <: ThirdPartyAuthenticationToken](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
