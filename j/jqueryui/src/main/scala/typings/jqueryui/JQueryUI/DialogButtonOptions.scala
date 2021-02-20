package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogButtonOptions
  extends /* attr */ StringDictionary[js.Any] {
  
  var click: js.UndefOr[js.Function1[/* eventObject */ JQueryEventObject, _]] = js.native
  
  var icons: js.UndefOr[js.Any] = js.native
  
  var showText: js.UndefOr[String | Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object DialogButtonOptions {
  
  @scala.inline
  def apply(): DialogButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogButtonOptions]
  }
  
  @scala.inline
  implicit class DialogButtonOptionsMutableBuilder[Self <: DialogButtonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: /* eventObject */ JQueryEventObject => _): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setIcons(value: js.Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setShowText(value: String | Boolean): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
