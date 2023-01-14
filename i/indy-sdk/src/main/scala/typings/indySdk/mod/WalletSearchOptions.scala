package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalletSearchOptions
  extends StObject
     with WalletRecordOptions {
  
  var retrieveRecords: js.UndefOr[Boolean] = js.undefined
  
  var retrieveTotalCount: js.UndefOr[Boolean] = js.undefined
}
object WalletSearchOptions {
  
  inline def apply(): WalletSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalletSearchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WalletSearchOptions] (val x: Self) extends AnyVal {
    
    inline def setRetrieveRecords(value: Boolean): Self = StObject.set(x, "retrieveRecords", value.asInstanceOf[js.Any])
    
    inline def setRetrieveRecordsUndefined: Self = StObject.set(x, "retrieveRecords", js.undefined)
    
    inline def setRetrieveTotalCount(value: Boolean): Self = StObject.set(x, "retrieveTotalCount", value.asInstanceOf[js.Any])
    
    inline def setRetrieveTotalCountUndefined: Self = StObject.set(x, "retrieveTotalCount", js.undefined)
  }
}
