package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Tabs, 'select'> */
trait PickTabsselect extends StObject {
  
  var select: js.UndefOr[Any] = js.undefined
}
object PickTabsselect {
  
  inline def apply(): PickTabsselect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTabsselect]
  }
  
  extension [Self <: PickTabsselect](x: Self) {
    
    inline def setSelect(value: Any): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
