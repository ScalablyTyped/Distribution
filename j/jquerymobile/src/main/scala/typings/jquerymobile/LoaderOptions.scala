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
  
  inline def apply(): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVisible(value: Boolean): Self = StObject.set(x, "textVisible", value.asInstanceOf[js.Any])
    
    inline def setTextVisibleUndefined: Self = StObject.set(x, "textVisible", js.undefined)
    
    inline def setTextonly(value: Boolean): Self = StObject.set(x, "textonly", value.asInstanceOf[js.Any])
    
    inline def setTextonlyUndefined: Self = StObject.set(x, "textonly", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
