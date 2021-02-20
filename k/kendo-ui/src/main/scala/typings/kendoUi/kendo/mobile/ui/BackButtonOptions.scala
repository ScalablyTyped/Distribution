package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackButtonOptions extends StObject {
  
  var click: js.UndefOr[js.Function1[/* e */ BackButtonClickEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object BackButtonOptions {
  
  @scala.inline
  def apply(): BackButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackButtonOptions]
  }
  
  @scala.inline
  implicit class BackButtonOptionsMutableBuilder[Self <: BackButtonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: /* e */ BackButtonClickEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
