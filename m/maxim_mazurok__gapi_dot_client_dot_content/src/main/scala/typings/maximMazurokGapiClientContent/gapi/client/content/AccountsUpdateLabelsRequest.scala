package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsUpdateLabelsRequest extends StObject {
  
  /** The IDs of labels that should be assigned to the account. */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
}
object AccountsUpdateLabelsRequest {
  
  @scala.inline
  def apply(): AccountsUpdateLabelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsUpdateLabelsRequest]
  }
  
  @scala.inline
  implicit class AccountsUpdateLabelsRequestMutableBuilder[Self <: AccountsUpdateLabelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    @scala.inline
    def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value :_*))
  }
}
