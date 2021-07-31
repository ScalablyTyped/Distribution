package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFixingEventUIParam extends StObject {
  
  /**
    * Gets the columnKey or the columnIndex.
    */
  var columnIdentifier: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets whether the header cell has children(use this argument ONLY when multi-column-headers are enabled).
    */
  var isGroupHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets a reference to the widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ColumnFixingEventUIParam {
  
  @scala.inline
  def apply(): ColumnFixingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFixingEventUIParam]
  }
  
  @scala.inline
  implicit class ColumnFixingEventUIParamMutableBuilder[Self <: ColumnFixingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIdentifier(value: js.Any): Self = StObject.set(x, "columnIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIdentifierUndefined: Self = StObject.set(x, "columnIdentifier", js.undefined)
    
    @scala.inline
    def setIsGroupHeader(value: Boolean): Self = StObject.set(x, "isGroupHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroupHeaderUndefined: Self = StObject.set(x, "isGroupHeader", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
