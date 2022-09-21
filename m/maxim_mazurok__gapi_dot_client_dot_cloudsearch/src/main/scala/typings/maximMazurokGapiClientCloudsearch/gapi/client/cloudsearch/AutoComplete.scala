package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoComplete extends StObject {
  
  var items: js.UndefOr[js.Array[AutoCompleteItem]] = js.undefined
}
object AutoComplete {
  
  inline def apply(): AutoComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoComplete]
  }
  
  extension [Self <: AutoComplete](x: Self) {
    
    inline def setItems(value: js.Array[AutoCompleteItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: AutoCompleteItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
