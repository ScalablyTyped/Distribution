package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenuOpeningEventUIParam extends StObject {
  
  /**
    * Get the [area](ig.spreadsheet.SpreadsheetContextMenuArea) for which the menu is being displayed.
    */
  var menuArea: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ContextMenuOpeningEventUIParam {
  
  @scala.inline
  def apply(): ContextMenuOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuOpeningEventUIParam]
  }
  
  @scala.inline
  implicit class ContextMenuOpeningEventUIParamMutableBuilder[Self <: ContextMenuOpeningEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMenuArea(value: String): Self = StObject.set(x, "menuArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuAreaUndefined: Self = StObject.set(x, "menuArea", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
