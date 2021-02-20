package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedItemChangedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the current selected data item.
    */
  var newItem: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get a reference to the previous selected data item.
    */
  var oldItem: js.UndefOr[js.Any] = js.native
}
object SelectedItemChangedEventUIParam {
  
  @scala.inline
  def apply(): SelectedItemChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemChangedEventUIParam]
  }
  
  @scala.inline
  implicit class SelectedItemChangedEventUIParamMutableBuilder[Self <: SelectedItemChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewItem(value: js.Any): Self = StObject.set(x, "newItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewItemUndefined: Self = StObject.set(x, "newItem", js.undefined)
    
    @scala.inline
    def setOldItem(value: js.Any): Self = StObject.set(x, "oldItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldItemUndefined: Self = StObject.set(x, "oldItem", js.undefined)
  }
}
