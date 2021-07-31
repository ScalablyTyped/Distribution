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
  
  @scala.inline
  def apply(): ThirdPartyAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyAuthenticationToken]
  }
  
  @scala.inline
  implicit class ThirdPartyAuthenticationTokenMutableBuilder[Self <: ThirdPartyAuthenticationToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
