package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionControl extends StObject {
  
  /** For radio button, at most one of the items will be selected. */
  var items: js.UndefOr[js.Array[SelectionItem]] = js.undefined
  
  /** Label used to be displayed ahead of the selection control. It is optional. */
  var label: js.UndefOr[String] = js.undefined
  
  /** The name of the text field which is will be used in FormInput. */
  var name: js.UndefOr[String] = js.undefined
  
  /** If specified, form is submitted when selection changed. If not specified, developer will need to specify a separate button. */
  var onChange: js.UndefOr[FormAction] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SelectionControl {
  
  inline def apply(): SelectionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectionControl] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[SelectionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SelectionItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: FormAction): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
