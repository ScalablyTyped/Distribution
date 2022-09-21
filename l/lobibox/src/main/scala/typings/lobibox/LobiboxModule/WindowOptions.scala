package typings.lobibox.LobiboxModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowOptions
  extends StObject
     with MessageBoxesOptions {
  
  // Override default option
  var autoload: js.UndefOr[Boolean] = js.undefined
  
  var content: js.UndefOr[Any] = js.undefined
  
  @JSName("height")
  var height_WindowOptions: js.UndefOr[Any] = js.undefined
  
  // Auto load from given url when window is created
  var loadMethod: js.UndefOr[String] = js.undefined
  
  // Show window after content is loaded or show and then load content
  var params: js.UndefOr[js.Object] = js.undefined
  
  // Ajax method to load content
  var showAfterLoad: js.UndefOr[Boolean] = js.undefined
  
  // HTML Content of window
  var url: js.UndefOr[String] = js.undefined
}
object WindowOptions {
  
  inline def apply(): WindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowOptions]
  }
  
  extension [Self <: WindowOptions](x: Self) {
    
    inline def setAutoload(value: Boolean): Self = StObject.set(x, "autoload", value.asInstanceOf[js.Any])
    
    inline def setAutoloadUndefined: Self = StObject.set(x, "autoload", js.undefined)
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLoadMethod(value: String): Self = StObject.set(x, "loadMethod", value.asInstanceOf[js.Any])
    
    inline def setLoadMethodUndefined: Self = StObject.set(x, "loadMethod", js.undefined)
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setShowAfterLoad(value: Boolean): Self = StObject.set(x, "showAfterLoad", value.asInstanceOf[js.Any])
    
    inline def setShowAfterLoadUndefined: Self = StObject.set(x, "showAfterLoad", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
