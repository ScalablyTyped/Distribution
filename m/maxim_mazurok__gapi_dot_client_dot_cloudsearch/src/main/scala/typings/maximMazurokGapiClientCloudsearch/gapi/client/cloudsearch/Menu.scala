package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  var items: js.UndefOr[js.Array[MenuItem]] = js.undefined
  
  /** Label used to be displayed ahead of the menu. It is optional. */
  var label: js.UndefOr[String] = js.undefined
  
  /** The name of the text field which is will be used in FormInput. */
  var name: js.UndefOr[String] = js.undefined
  
  /** If specified, form is submitted when selection changed. If not specified, developer will need to specify a separate button. */
  var onChange: js.UndefOr[FormAction] = js.undefined
}
object Menu {
  
  inline def apply(): Menu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Menu]
  }
  
  extension [Self <: Menu](x: Self) {
    
    inline def setItems(value: js.Array[MenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: MenuItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: FormAction): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
