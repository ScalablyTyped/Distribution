package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddleRenderProperties extends StObject {
  
  var columnProperties: js.UndefOr[PropertyBag[ColumnRenderProperties]] = js.native
  
  var rowProperties: js.UndefOr[RowRenderProperties] = js.native
}
object GriddleRenderProperties {
  
  @scala.inline
  def apply(): GriddleRenderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleRenderProperties]
  }
  
  @scala.inline
  implicit class GriddleRenderPropertiesMutableBuilder[Self <: GriddleRenderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnProperties(value: PropertyBag[ColumnRenderProperties]): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
    
    @scala.inline
    def setRowProperties(value: RowRenderProperties): Self = StObject.set(x, "rowProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowPropertiesUndefined: Self = StObject.set(x, "rowProperties", js.undefined)
  }
}
