package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalletRecordOptions extends StObject {
  
  var retrieveTags: js.UndefOr[Boolean] = js.undefined
  
  var retrieveType: js.UndefOr[Boolean] = js.undefined
  
  var retrieveValue: js.UndefOr[Boolean] = js.undefined
}
object WalletRecordOptions {
  
  inline def apply(): WalletRecordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalletRecordOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WalletRecordOptions] (val x: Self) extends AnyVal {
    
    inline def setRetrieveTags(value: Boolean): Self = StObject.set(x, "retrieveTags", value.asInstanceOf[js.Any])
    
    inline def setRetrieveTagsUndefined: Self = StObject.set(x, "retrieveTags", js.undefined)
    
    inline def setRetrieveType(value: Boolean): Self = StObject.set(x, "retrieveType", value.asInstanceOf[js.Any])
    
    inline def setRetrieveTypeUndefined: Self = StObject.set(x, "retrieveType", js.undefined)
    
    inline def setRetrieveValue(value: Boolean): Self = StObject.set(x, "retrieveValue", value.asInstanceOf[js.Any])
    
    inline def setRetrieveValueUndefined: Self = StObject.set(x, "retrieveValue", js.undefined)
  }
}
