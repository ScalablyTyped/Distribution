package typings.leafletEditable.leafletMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Add to the MapOptions.
  */
trait MapOptions extends StObject {
  
  /**
    * Options to pass to L.Editable when instanciating.
    */
  var editOptions: js.UndefOr[EditableOptions] = js.undefined
  
  /**
    * Class to be used as vertex, for path editing.
    */
  var editToolsClass: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Whether to create a L.Editable instance at map init or not.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
}
object MapOptions {
  
  inline def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  extension [Self <: MapOptions](x: Self) {
    
    inline def setEditOptions(value: EditableOptions): Self = StObject.set(x, "editOptions", value.asInstanceOf[js.Any])
    
    inline def setEditOptionsUndefined: Self = StObject.set(x, "editOptions", js.undefined)
    
    inline def setEditToolsClass(value: js.Object): Self = StObject.set(x, "editToolsClass", value.asInstanceOf[js.Any])
    
    inline def setEditToolsClassUndefined: Self = StObject.set(x, "editToolsClass", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
  }
}
