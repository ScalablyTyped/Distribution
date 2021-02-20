package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterDialogMovingEventUIParam extends StObject {
  
  /**
    * Gets reference to filtering dialog DOM element.
    */
  var dialog: js.UndefOr[String] = js.native
  
  /**
    * Gets the original position of the groupby dialog div as { top, left } object, relative to the page.
    */
  var originalPosition: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the current position of the groupby dialog div as { top, left } object, relative to the page.
    */
  var position: js.UndefOr[js.Any] = js.native
}
object FilterDialogMovingEventUIParam {
  
  @scala.inline
  def apply(): FilterDialogMovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogMovingEventUIParam]
  }
  
  @scala.inline
  implicit class FilterDialogMovingEventUIParamMutableBuilder[Self <: FilterDialogMovingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialog(value: String): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
    
    @scala.inline
    def setOriginalPosition(value: js.Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPositionUndefined: Self = StObject.set(x, "originalPosition", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
