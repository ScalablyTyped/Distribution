package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountsLinkResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountsLinkResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object AccountsLinkResponse {
  
  @scala.inline
  def apply(): AccountsLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsLinkResponse]
  }
  
  @scala.inline
  implicit class AccountsLinkResponseMutableBuilder[Self <: AccountsLinkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
