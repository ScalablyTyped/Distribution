package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnChooserButtonApplyClickEventUIParam extends StObject {
  
  /**
    * Gets a reference to the Column Chooser element. This is a jQuery object.
    */
  var columnChooserElement: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the array of columns identifiers which should be hidden.
    */
  var columnsToHide: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets the array of columns identifiers which should be shown.
    */
  var columnsToShow: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ColumnChooserButtonApplyClickEventUIParam {
  
  inline def apply(): ColumnChooserButtonApplyClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnChooserButtonApplyClickEventUIParam]
  }
  
  extension [Self <: ColumnChooserButtonApplyClickEventUIParam](x: Self) {
    
    inline def setColumnChooserElement(value: String): Self = StObject.set(x, "columnChooserElement", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserElementUndefined: Self = StObject.set(x, "columnChooserElement", js.undefined)
    
    inline def setColumnsToHide(value: js.Array[Any]): Self = StObject.set(x, "columnsToHide", value.asInstanceOf[js.Any])
    
    inline def setColumnsToHideUndefined: Self = StObject.set(x, "columnsToHide", js.undefined)
    
    inline def setColumnsToHideVarargs(value: Any*): Self = StObject.set(x, "columnsToHide", js.Array(value*))
    
    inline def setColumnsToShow(value: js.Array[Any]): Self = StObject.set(x, "columnsToShow", value.asInstanceOf[js.Any])
    
    inline def setColumnsToShowUndefined: Self = StObject.set(x, "columnsToShow", js.undefined)
    
    inline def setColumnsToShowVarargs(value: Any*): Self = StObject.set(x, "columnsToShow", js.Array(value*))
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
