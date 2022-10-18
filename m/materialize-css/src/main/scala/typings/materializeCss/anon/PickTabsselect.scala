package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Tabs, 'select'> */
trait PickTabsselect extends StObject {
  
  def select(tabId: String): Unit
  @JSName("select")
  var select_Original: js.Function1[/* tabId */ String, Unit]
}
object PickTabsselect {
  
  inline def apply(select: /* tabId */ String => Unit): PickTabsselect = {
    val __obj = js.Dynamic.literal(select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[PickTabsselect]
  }
  
  extension [Self <: PickTabsselect](x: Self) {
    
    inline def setSelect(value: /* tabId */ String => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
  }
}
