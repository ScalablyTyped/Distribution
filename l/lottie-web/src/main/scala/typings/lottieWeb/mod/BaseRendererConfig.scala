package typings.lottieWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseRendererConfig extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var imagePreserveAspectRatio: js.UndefOr[String] = js.undefined
}
object BaseRendererConfig {
  
  inline def apply(): BaseRendererConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRendererConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseRendererConfig] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setImagePreserveAspectRatio(value: String): Self = StObject.set(x, "imagePreserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setImagePreserveAspectRatioUndefined: Self = StObject.set(x, "imagePreserveAspectRatio", js.undefined)
  }
}
