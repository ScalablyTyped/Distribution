package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnUnfixedEventUIParam extends StObject {
  
  /**
    * Gets the columnKey or the columnIndex.
    */
  var columnIdentifier: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets whether header cell has children(use this argument ONLY when multi-column-headers are enabled).
    */
  var isGroupHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets a reference to the widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ColumnUnfixedEventUIParam {
  
  inline def apply(): ColumnUnfixedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnUnfixedEventUIParam]
  }
  
  extension [Self <: ColumnUnfixedEventUIParam](x: Self) {
    
    inline def setColumnIdentifier(value: js.Any): Self = StObject.set(x, "columnIdentifier", value.asInstanceOf[js.Any])
    
    inline def setColumnIdentifierUndefined: Self = StObject.set(x, "columnIdentifier", js.undefined)
    
    inline def setIsGroupHeader(value: Boolean): Self = StObject.set(x, "isGroupHeader", value.asInstanceOf[js.Any])
    
    inline def setIsGroupHeaderUndefined: Self = StObject.set(x, "isGroupHeader", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
