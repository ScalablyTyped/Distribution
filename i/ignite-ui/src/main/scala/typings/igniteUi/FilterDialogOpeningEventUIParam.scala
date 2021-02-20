package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterDialogOpeningEventUIParam extends StObject {
  
  /**
    * Gets reference to the filtering dialog DOM element.
    */
  var dialog: js.UndefOr[String] = js.native
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object FilterDialogOpeningEventUIParam {
  
  @scala.inline
  def apply(): FilterDialogOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogOpeningEventUIParam]
  }
  
  @scala.inline
  implicit class FilterDialogOpeningEventUIParamMutableBuilder[Self <: FilterDialogOpeningEventUIParam] (val x: Self) extends AnyVal {
    
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
