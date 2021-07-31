package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountLabel extends StObject {
  
  /** Output only. Immutable. The ID of account this label belongs to. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Description for this label. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Output only. Immutable. The ID of the label. */
  var labelId: js.UndefOr[String] = js.undefined
  
  /** The display name of this label. */
  var name: js.UndefOr[String] = js.undefined
}
object AccountLabel {
  
  @scala.inline
  def apply(): AccountLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLabel]
  }
  
  @scala.inline
  implicit class AccountLabelMutableBuilder[Self <: AccountLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
