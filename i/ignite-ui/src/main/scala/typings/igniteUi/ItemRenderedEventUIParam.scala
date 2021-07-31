package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemRenderedEventUIParam extends StObject {
  
  /**
    * Used to get a reference of the item's index, if the layout is flow or vertical
    */
  var index: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get a reference to the rendered item
    */
  var item: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get a reference of item's settings, such as colspan ,rowspan, etc.
    */
  var itemData: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get reference to the igLayoutManager.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ItemRenderedEventUIParam {
  
  @scala.inline
  def apply(): ItemRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class ItemRenderedEventUIParamMutableBuilder[Self <: ItemRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: js.Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
