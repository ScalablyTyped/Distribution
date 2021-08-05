package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabeledItem extends StObject {
  
  /** Internal id associated with the item. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Display string as entered by user. */
  var name: js.UndefOr[String] = js.undefined
}
object LabeledItem {
  
  inline def apply(): LabeledItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabeledItem]
  }
  
  extension [Self <: LabeledItem](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
