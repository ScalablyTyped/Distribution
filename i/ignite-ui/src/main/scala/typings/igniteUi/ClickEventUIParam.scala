package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickEventUIParam extends StObject {
  
  /**
    * Used to get a reference the igSplitButton element.
    */
  var item: js.UndefOr[Any] = js.undefined
}
object ClickEventUIParam {
  
  inline def apply(): ClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickEventUIParam]
  }
  
  extension [Self <: ClickEventUIParam](x: Self) {
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
