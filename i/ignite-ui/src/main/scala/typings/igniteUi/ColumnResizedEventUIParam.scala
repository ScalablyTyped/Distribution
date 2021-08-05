package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnResizedEventUIParam extends StObject {
  
  /**
    * Gets the resized column index.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the resized column key.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the final column width after resizing.
    */
  var newWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the original column width.
    */
  var originalWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets a reference to the GridResizing widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ColumnResizedEventUIParam {
  
  inline def apply(): ColumnResizedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnResizedEventUIParam]
  }
  
  extension [Self <: ColumnResizedEventUIParam](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setNewWidth(value: Double): Self = StObject.set(x, "newWidth", value.asInstanceOf[js.Any])
    
    inline def setNewWidthUndefined: Self = StObject.set(x, "newWidth", js.undefined)
    
    inline def setOriginalWidth(value: Double): Self = StObject.set(x, "originalWidth", value.asInstanceOf[js.Any])
    
    inline def setOriginalWidthUndefined: Self = StObject.set(x, "originalWidth", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
