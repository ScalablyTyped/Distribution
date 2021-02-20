package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliceClickedEventUIParam extends StObject {
  
  /**
    * Used to obtain index of clicked slice.
    */
  var index: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain reference to clicked slice item.
    */
  var item: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain reference to igFunnelChart.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to check if slice became selected.
    */
  var selected: js.UndefOr[js.Any] = js.native
}
object SliceClickedEventUIParam {
  
  @scala.inline
  def apply(): SliceClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliceClickedEventUIParam]
  }
  
  @scala.inline
  implicit class SliceClickedEventUIParamMutableBuilder[Self <: SliceClickedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: js.Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSelected(value: js.Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
