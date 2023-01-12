package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index[ListItemType] extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var item: js.UndefOr[ListItemType] = js.undefined
}
object Index {
  
  inline def apply[ListItemType](): Index[ListItemType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Index[ListItemType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Index[?], ListItemType] (val x: Self & Index[ListItemType]) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setItem(value: ListItemType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
