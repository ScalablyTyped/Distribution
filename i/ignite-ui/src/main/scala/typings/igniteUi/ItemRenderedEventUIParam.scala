package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemRenderedEventUIParam extends StObject {
  
  /**
    * Used to get a reference of the item's index, if the layout is flow or vertical
    */
  var index: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get a reference to the rendered item
    */
  var item: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get a reference of item's settings, such as colspan ,rowspan, etc.
    */
  var itemData: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get reference to the igLayoutManager.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ItemRenderedEventUIParam {
  
  inline def apply(): ItemRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemRenderedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
