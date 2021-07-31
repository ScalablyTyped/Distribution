package typings.jqueryWatermark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatermarkOptions extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  // If true, plugin will detect and use native browser support for watermarks, if available. (e.g., WebKit's placeholder attribute.)
  var hideBeforeUnload: js.UndefOr[Boolean] = js.undefined
  
  // Default class name for all watermarks
  var useNative: js.UndefOr[Boolean] = js.undefined
}
object WatermarkOptions {
  
  @scala.inline
  def apply(): WatermarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatermarkOptions]
  }
  
  @scala.inline
  implicit class WatermarkOptionsMutableBuilder[Self <: WatermarkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setHideBeforeUnload(value: Boolean): Self = StObject.set(x, "hideBeforeUnload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideBeforeUnloadUndefined: Self = StObject.set(x, "hideBeforeUnload", js.undefined)
    
    @scala.inline
    def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
  }
}
