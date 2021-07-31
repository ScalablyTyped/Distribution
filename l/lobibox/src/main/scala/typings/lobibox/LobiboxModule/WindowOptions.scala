package typings.lobibox.LobiboxModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowOptions
  extends StObject
     with MessageBoxesOptions {
  
  // Override default option
  var autoload: js.UndefOr[Boolean] = js.undefined
  
  var content: js.UndefOr[js.Any] = js.undefined
  
  @JSName("height")
  var height_WindowOptions: js.UndefOr[js.Any] = js.undefined
  
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
  
  @scala.inline
  def apply(): WindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowOptions]
  }
  
  @scala.inline
  implicit class WindowOptionsMutableBuilder[Self <: WindowOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoload(value: Boolean): Self = StObject.set(x, "autoload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoloadUndefined: Self = StObject.set(x, "autoload", js.undefined)
    
    @scala.inline
    def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLoadMethod(value: String): Self = StObject.set(x, "loadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadMethodUndefined: Self = StObject.set(x, "loadMethod", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setShowAfterLoad(value: Boolean): Self = StObject.set(x, "showAfterLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAfterLoadUndefined: Self = StObject.set(x, "showAfterLoad", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
