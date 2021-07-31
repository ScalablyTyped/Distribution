package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Tabs, 'select'> */
trait PickTabsselect extends StObject {
  
  var select: js.UndefOr[js.Any] = js.undefined
}
object PickTabsselect {
  
  @scala.inline
  def apply(): PickTabsselect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTabsselect]
  }
  
  @scala.inline
  implicit class PickTabsselectMutableBuilder[Self <: PickTabsselect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelect(value: js.Any): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
