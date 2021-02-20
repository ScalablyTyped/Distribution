package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentCategory extends StObject {
  
  /** Account ID of this content category. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.native
  
  /** ID of this content category. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#contentCategory". */
  var kind: js.UndefOr[String] = js.native
  
  /** Name of this content category. This is a required field and must be less than 256 characters long and unique among content categories of the same account. */
  var name: js.UndefOr[String] = js.native
}
object ContentCategory {
  
  @scala.inline
  def apply(): ContentCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentCategory]
  }
  
  @scala.inline
  implicit class ContentCategoryMutableBuilder[Self <: ContentCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
