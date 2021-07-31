package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabStripOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ TabStripSelectEvent, Unit]] = js.undefined
  
  var selectedIndex: js.UndefOr[Double] = js.undefined
}
object TabStripOptions {
  
  @scala.inline
  def apply(): TabStripOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabStripOptions]
  }
  
  @scala.inline
  implicit class TabStripOptionsMutableBuilder[Self <: TabStripOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ TabStripSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
  }
}
