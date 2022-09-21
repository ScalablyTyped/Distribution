package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGridLayout extends StObject {
  
  /**
    * The number of columns into which the view's width is divided. If omitted or set to zero, a system default will be used while rendering.
    */
  var columns: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The informational elements that are arranged into the columns row-first.
    */
  var widgets: js.UndefOr[js.Array[SchemaWidget]] = js.undefined
}
object SchemaGridLayout {
  
  inline def apply(): SchemaGridLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGridLayout]
  }
  
  extension [Self <: SchemaGridLayout](x: Self) {
    
    inline def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setWidgets(value: js.Array[SchemaWidget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
    
    inline def setWidgetsVarargs(value: SchemaWidget*): Self = StObject.set(x, "widgets", js.Array(value*))
  }
}
