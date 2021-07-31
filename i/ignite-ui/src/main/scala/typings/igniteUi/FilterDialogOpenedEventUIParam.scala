package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDialogOpenedEventUIParam extends StObject {
  
  /**
    * Gets reference to the filtering dialog DOM element.
    */
  var dialog: js.UndefOr[String] = js.undefined
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object FilterDialogOpenedEventUIParam {
  
  @scala.inline
  def apply(): FilterDialogOpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogOpenedEventUIParam]
  }
  
  @scala.inline
  implicit class FilterDialogOpenedEventUIParamMutableBuilder[Self <: FilterDialogOpenedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialog(value: String): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
