package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsClaimWebsiteResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountsClaimWebsiteResponse". */
  var kind: js.UndefOr[String] = js.native
}
object AccountsClaimWebsiteResponse {
  
  @scala.inline
  def apply(): AccountsClaimWebsiteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsClaimWebsiteResponse]
  }
  
  @scala.inline
  implicit class AccountsClaimWebsiteResponseMutableBuilder[Self <: AccountsClaimWebsiteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
