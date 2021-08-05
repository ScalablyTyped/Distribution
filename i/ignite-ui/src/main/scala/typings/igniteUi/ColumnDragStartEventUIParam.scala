package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDragStartEventUIParam extends StObject {
  
  /**
    * Gets the column index of the column being dragged.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the column key of the column being dragged.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the orginal th being dragged.
    */
  var header: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to cloned DOM element that's actually being dragged.
    */
  var helper: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the widget.
    */
  var owner: js.UndefOr[String] = js.undefined
}
object ColumnDragStartEventUIParam {
  
  inline def apply(): ColumnDragStartEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDragStartEventUIParam]
  }
  
  extension [Self <: ColumnDragStartEventUIParam](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHelper(value: String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    inline def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
