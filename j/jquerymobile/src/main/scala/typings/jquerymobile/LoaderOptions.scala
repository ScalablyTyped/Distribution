package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderOptions extends StObject {
  
  var html: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textVisible: js.UndefOr[Boolean] = js.undefined
  
  var textonly: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
}
object LoaderOptions {
  
  @scala.inline
  def apply(): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderOptions]
  }
  
  @scala.inline
  implicit class LoaderOptionsMutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVisible(value: Boolean): Self = StObject.set(x, "textVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextVisibleUndefined: Self = StObject.set(x, "textVisible", js.undefined)
    
    @scala.inline
    def setTextonly(value: Boolean): Self = StObject.set(x, "textonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextonlyUndefined: Self = StObject.set(x, "textonly", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
