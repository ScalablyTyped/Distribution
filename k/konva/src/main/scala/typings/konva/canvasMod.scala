package typings.konva

import typings.konva.contextMod.Context
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasMod {
  
  @JSImport("konva/types/Canvas", "Canvas")
  @js.native
  class Canvas protected () extends StObject {
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
    
    def setHeight(height: js.Any): Unit = js.native
    
    def setPixelRatio(pixelRatio: js.Any): Unit = js.native
    
    def setSize(width: js.Any, height: js.Any): Unit = js.native
    
    def setWidth(width: js.Any): Unit = js.native
    
    def toDataURL(mimeType: js.Any, quality: js.Any): String = js.native
    
    var width: Double = js.native
  }
  
  @JSImport("konva/types/Canvas", "HitCanvas")
  @js.native
  class HitCanvas () extends Canvas {
    def this(config: ICanvasConfig) = this()
    
    var hitCanvas: Boolean = js.native
  }
  
  @JSImport("konva/types/Canvas", "SceneCanvas")
  @js.native
  class SceneCanvas () extends Canvas {
    def this(config: ICanvasConfig) = this()
  }
  
  @js.native
  trait ICanvasConfig extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var pixelRatio: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object ICanvasConfig {
    
    @scala.inline
    def apply(): ICanvasConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICanvasConfig]
    }
    
    @scala.inline
    implicit class ICanvasConfigMutableBuilder[Self <: ICanvasConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
