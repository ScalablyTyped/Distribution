package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentCategory extends StObject {
  
  /** Account ID of this content category. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** ID of this content category. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#contentCategory". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of this content category. This is a required field and must be less than 256 characters long and unique among content categories of the same account. */
  var name: js.UndefOr[String] = js.undefined
}
object ContentCategory {
  
  inline def apply(): ContentCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentCategory]
  }
  
  extension [Self <: ContentCategory](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
