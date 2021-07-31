package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelClickEventUIParam extends StObject {
  
  /**
    * Used to determine whether or not the label click should fire slice click event.
    */
  var allowSliceClick: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get reference to the slice object.
    */
  var item: js.UndefOr[js.Any] = js.undefined
}
object LabelClickEventUIParam {
  
  @scala.inline
  def apply(): LabelClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelClickEventUIParam]
  }
  
  @scala.inline
  implicit class LabelClickEventUIParamMutableBuilder[Self <: LabelClickEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSliceClick(value: js.Any): Self = StObject.set(x, "allowSliceClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSliceClickUndefined: Self = StObject.set(x, "allowSliceClick", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
