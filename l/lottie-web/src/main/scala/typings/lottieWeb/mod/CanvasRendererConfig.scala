package typings.lottieWeb.mod

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasRendererConfig
  extends StObject
     with BaseRendererConfig {
  
  var clearCanvas: js.UndefOr[Boolean] = js.undefined
  
  var context: js.UndefOr[CanvasRenderingContext2D] = js.undefined
  
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  
  var progressiveLoad: js.UndefOr[Boolean] = js.undefined
}
object CanvasRendererConfig {
  
  inline def apply(): CanvasRendererConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasRendererConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasRendererConfig] (val x: Self) extends AnyVal {
    
    inline def setClearCanvas(value: Boolean): Self = StObject.set(x, "clearCanvas", value.asInstanceOf[js.Any])
    
    inline def setClearCanvasUndefined: Self = StObject.set(x, "clearCanvas", js.undefined)
    
    inline def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    inline def setProgressiveLoad(value: Boolean): Self = StObject.set(x, "progressiveLoad", value.asInstanceOf[js.Any])
    
    inline def setProgressiveLoadUndefined: Self = StObject.set(x, "progressiveLoad", js.undefined)
  }
}
