package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchMessages extends StObject {
  
  var checked: js.UndefOr[String] = js.undefined
  
  var unchecked: js.UndefOr[String] = js.undefined
}
object SwitchMessages {
  
  @scala.inline
  def apply(): SwitchMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchMessages]
  }
  
  @scala.inline
  implicit class SwitchMessagesMutableBuilder[Self <: SwitchMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setUnchecked(value: String): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedUndefined: Self = StObject.set(x, "unchecked", js.undefined)
  }
}
