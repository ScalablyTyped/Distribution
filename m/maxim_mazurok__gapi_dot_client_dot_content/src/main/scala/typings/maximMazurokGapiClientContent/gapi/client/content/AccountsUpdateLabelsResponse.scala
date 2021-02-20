package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsUpdateLabelsResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountsUpdateLabelsResponse". */
  var kind: js.UndefOr[String] = js.native
}
object AccountsUpdateLabelsResponse {
  
  @scala.inline
  def apply(): AccountsUpdateLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsUpdateLabelsResponse]
  }
  
  @scala.inline
  implicit class AccountsUpdateLabelsResponseMutableBuilder[Self <: AccountsUpdateLabelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
