package typings.leafletEditable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Leaflet.Editable add options and events to the `L.Map` object.
  * See `Editable` events for the list of events fired on the Map.
  */
trait Map extends StObject {
  
  /**
    * Options to pass to L.Editable when instanciating.
    */
  var editOptions: EditableOptions
  
  /**
    * Edit tools instance.
    */
  var editTools: Editable
  
  /**
    * Whether to create a L.Editable instance at map init or not.
    */
  var editable: Boolean
}
object Map {
  
  inline def apply(editOptions: EditableOptions, editTools: Editable, editable: Boolean): Map = {
    val __obj = js.Dynamic.literal(editOptions = editOptions.asInstanceOf[js.Any], editTools = editTools.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  extension [Self <: Map](x: Self) {
    
    inline def setEditOptions(value: EditableOptions): Self = StObject.set(x, "editOptions", value.asInstanceOf[js.Any])
    
    inline def setEditTools(value: Editable): Self = StObject.set(x, "editTools", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
  }
}
