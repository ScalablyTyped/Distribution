package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GriddleRenderProperties extends StObject {
  
  var columnProperties: js.UndefOr[PropertyBag[ColumnRenderProperties]] = js.undefined
  
  var rowProperties: js.UndefOr[RowRenderProperties] = js.undefined
}
object GriddleRenderProperties {
  
  inline def apply(): GriddleRenderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleRenderProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GriddleRenderProperties] (val x: Self) extends AnyVal {
    
    inline def setColumnProperties(value: PropertyBag[ColumnRenderProperties]): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
    
    inline def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
    
    inline def setRowProperties(value: RowRenderProperties): Self = StObject.set(x, "rowProperties", value.asInstanceOf[js.Any])
    
    inline def setRowPropertiesUndefined: Self = StObject.set(x, "rowProperties", js.undefined)
  }
}
