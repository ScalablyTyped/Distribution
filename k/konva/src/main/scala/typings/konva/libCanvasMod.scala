package typings.konva

import typings.konva.libContextMod.Context
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCanvasMod {
  
  @JSImport("konva/lib/Canvas", "Canvas")
  @js.native
  open class Canvas protected () extends StObject {
    def this(config: ICanvasConfig) = this()
    
    var _canvas: HTMLCanvasElement = js.native
    
    var context: Context = js.native
    
    def getContext(): Context = js.native
    
    def getHeight(): Double = js.native
    
    def getPixelRatio(): Double = js.native
    
    def getWidth(): Double = js.native
    
    var height: Double = js.native
    
    var isCache: Boolean = js.native
    
    var pixelRatio: Double = js.native
    
    def setHeight(height: Any): Unit = js.native
    
    def setPixelRatio(pixelRatio: Any): Unit = js.native
    
    def setSize(width: Any, height: Any): Unit = js.native
    
    def setWidth(width: Any): Unit = js.native
    
    def toDataURL(mimeType: Any, quality: Any): String = js.native
    
    var width: Double = js.native
  }
  
  @JSImport("konva/lib/Canvas", "HitCanvas")
  @js.native
  open class HitCanvas () extends Canvas {
    def this(config: ICanvasConfig) = this()
    
    var hitCanvas: Boolean = js.native
  }
  
  @JSImport("konva/lib/Canvas", "SceneCanvas")
  @js.native
  open class SceneCanvas () extends Canvas {
    def this(config: ICanvasConfig) = this()
  }
  
  trait ICanvasConfig extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ICanvasConfig {
    
    inline def apply(): ICanvasConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICanvasConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICanvasConfig] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
