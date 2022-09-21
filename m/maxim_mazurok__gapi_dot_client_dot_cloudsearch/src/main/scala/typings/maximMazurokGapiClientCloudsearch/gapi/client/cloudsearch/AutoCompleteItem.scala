package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCompleteItem extends StObject {
  
  var text: js.UndefOr[String] = js.undefined
}
object AutoCompleteItem {
  
  inline def apply(): AutoCompleteItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteItem]
  }
  
  extension [Self <: AutoCompleteItem](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
