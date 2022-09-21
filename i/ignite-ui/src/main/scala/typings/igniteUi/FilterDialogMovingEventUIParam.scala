package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDialogMovingEventUIParam extends StObject {
  
  /**
    * Gets reference to filtering dialog DOM element.
    */
  var dialog: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the original position of the groupby dialog div as { top, left } object, relative to the page.
    */
  var originalPosition: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the current position of the groupby dialog div as { top, left } object, relative to the page.
    */
  var position: js.UndefOr[Any] = js.undefined
}
object FilterDialogMovingEventUIParam {
  
  inline def apply(): FilterDialogMovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogMovingEventUIParam]
  }
  
  extension [Self <: FilterDialogMovingEventUIParam](x: Self) {
    
    inline def setDialog(value: String): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
    
    inline def setOriginalPosition(value: Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    inline def setOriginalPositionUndefined: Self = StObject.set(x, "originalPosition", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
