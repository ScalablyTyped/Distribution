package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenuOpeningEventUIParam extends StObject {
  
  /**
    * Get the [area](ig.spreadsheet.SpreadsheetContextMenuArea) for which the menu is being displayed.
    */
  var menuArea: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ContextMenuOpeningEventUIParam {
  
  inline def apply(): ContextMenuOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuOpeningEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextMenuOpeningEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setMenuArea(value: String): Self = StObject.set(x, "menuArea", value.asInstanceOf[js.Any])
    
    inline def setMenuAreaUndefined: Self = StObject.set(x, "menuArea", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
