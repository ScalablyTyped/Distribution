package typings.indySdk.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalletRecord extends StObject {
  
  var id: String
  
  var tags: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object WalletRecord {
  
  inline def apply(id: String): WalletRecord = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WalletRecord] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTags(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
