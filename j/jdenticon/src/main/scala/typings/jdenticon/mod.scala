package typings.jdenticon

import typings.jdenticon.anon.Color
import typings.jdenticon.anon.Grayscale
import typings.jdenticon.jdenticonStrings.`2d`
import typings.jdenticon.jdenticonStrings.never
import typings.jdenticon.jdenticonStrings.observe
import typings.jdenticon.jdenticonStrings.once
import typings.node.Buffer
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jdenticon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def configure(): JdenticonConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[JdenticonConfig]
  @scala.inline
  def configure(newConfig: JdenticonConfig): JdenticonConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(newConfig.asInstanceOf[js.Any]).asInstanceOf[JdenticonConfig]
  
  @scala.inline
  def drawIcon(ctx: JdenticonCompatibleCanvasRenderingContext2D, hashOrValue: js.Any, size: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawIcon")(ctx.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def drawIcon(
    ctx: JdenticonCompatibleCanvasRenderingContext2D,
    hashOrValue: js.Any,
    size: Double,
    config: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawIcon")(ctx.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def drawIcon(
    ctx: JdenticonCompatibleCanvasRenderingContext2D,
    hashOrValue: js.Any,
    size: Double,
    config: JdenticonConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawIcon")(ctx.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toPng(hashOrValue: js.Any, size: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("toPng")(hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def toPng(hashOrValue: js.Any, size: Double, config: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("toPng")(hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def toPng(hashOrValue: js.Any, size: Double, config: JdenticonConfig): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("toPng")(hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def toSvg(hashOrValue: js.Any, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSvg")(hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toSvg(hashOrValue: js.Any, size: Double, config: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSvg")(hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toSvg(hashOrValue: js.Any, size: Double, config: JdenticonConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSvg")(hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def update(elementOrSelector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def update(elementOrSelector: String, hashOrValue: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def update(elementOrSelector: String, hashOrValue: js.Any, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def update(elementOrSelector: String, hashOrValue: js.Any, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def update(elementOrSelector: String, hashOrValue: Unit, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def update(elementOrSelector: String, hashOrValue: Unit, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def update(elementOrSelector: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def update(elementOrSelector: Element, hashOrValue: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def update(elementOrSelector: Element, hashOrValue: js.Any, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def update(elementOrSelector: Element, hashOrValue: js.Any, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def update(elementOrSelector: Element, hashOrValue: Unit, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def update(elementOrSelector: Element, hashOrValue: Unit, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def updateCanvas(elementOrSelector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def updateCanvas(elementOrSelector: String, hashOrValue: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateCanvas(elementOrSelector: String, hashOrValue: js.Any, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateCanvas(elementOrSelector: String, hashOrValue: js.Any, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateCanvas(elementOrSelector: String, hashOrValue: Unit, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateCanvas(elementOrSelector: String, hashOrValue: Unit, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateCanvas(elementOrSelector: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def updateCanvas(elementOrSelector: Element, hashOrValue: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateCanvas(elementOrSelector: Element, hashOrValue: js.Any, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateCanvas(elementOrSelector: Element, hashOrValue: js.Any, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateCanvas(elementOrSelector: Element, hashOrValue: Unit, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateCanvas(elementOrSelector: Element, hashOrValue: Unit, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def updateSvg(elementOrSelector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def updateSvg(elementOrSelector: String, hashOrValue: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateSvg(elementOrSelector: String, hashOrValue: js.Any, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateSvg(elementOrSelector: String, hashOrValue: js.Any, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateSvg(elementOrSelector: String, hashOrValue: Unit, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateSvg(elementOrSelector: String, hashOrValue: Unit, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateSvg(elementOrSelector: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def updateSvg(elementOrSelector: Element, hashOrValue: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateSvg(elementOrSelector: Element, hashOrValue: js.Any, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateSvg(elementOrSelector: Element, hashOrValue: js.Any, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateSvg(elementOrSelector: Element, hashOrValue: Unit, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateSvg(elementOrSelector: Element, hashOrValue: Unit, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("jdenticon", "version")
  @js.native
  val version: String = js.native
  
  trait JdenticonCompatibleCanvas extends StObject {
    
    @JSName("getContext")
    def getContext_2d(contextId: `2d`): JdenticonCompatibleCanvasRenderingContext2D | Null
    
    // HTMLCanvasElement
    val height: Double
    
    val width: Double
  }
  object JdenticonCompatibleCanvas {
    
    @scala.inline
    def apply(
      getContext: `2d` => JdenticonCompatibleCanvasRenderingContext2D | Null,
      height: Double,
      width: Double
    ): JdenticonCompatibleCanvas = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction1(getContext), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[JdenticonCompatibleCanvas]
    }
    
    @scala.inline
    implicit class JdenticonCompatibleCanvasMutableBuilder[Self <: JdenticonCompatibleCanvas] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetContext(value: `2d` => JdenticonCompatibleCanvasRenderingContext2D | Null): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JdenticonCompatibleCanvasRenderingContext2D extends StObject {
    
    // CanvasPath
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
    
    // CanvasDrawPath
    def beginPath(): Unit = js.native
    
    // CanvasRenderingContext2D
    val canvas: JdenticonCompatibleCanvas = js.native
    
    // CanvasRect
    def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    def closePath(): Unit = js.native
    
    def fill(): Unit = js.native
    
    def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    // CanvasFillStrokeStyles
    var fillStyle: js.Any = js.native
    
    def lineTo(x: Double, y: Double): Unit = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    // CanvasState
    def restore(): Unit = js.native
    
    def save(): Unit = js.native
    
    // CanvasTransform
    def translate(x: Double, y: Double): Unit = js.native
  }
  
  trait JdenticonConfig extends StObject {
    
    /**
      * Specifies the background color to be rendered behind the icon.
      * 
      * Supported syntaxes are:
      *  * `"#rgb"`
      *  * `"#rgba"`
      *  * `"#rrggbb"`
      *  * `"#rrggbbaa"`
      */
    var backColor: js.UndefOr[String] = js.undefined
    
    /**
      * Limits the possible hues in generated icons. The hues are specified as an array of hues in degrees. If the
      * option is omitted or an empty array is specified, all hues are allowed.
      */
    var hues: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Specifies the lightness of the generated icon.
      */
    var lightness: js.UndefOr[Color] = js.undefined
    
    /**
      * Specifies the padding surrounding the icon in percents in the range [0.0, 0.5).
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies when icons will be rendered.
      * 
      *  * `"never"` – icons are never rendered automatically. You need to call `jdenticon.update()` manually to
      *    render identicons.
      * 
      *  * `"once"` – icons are rendered once the page has loaded. Any dynamically inserted or modified icons will
      *    not be rendered unless `jdenticon.update()` is manually called.
      * 
      *  * `"observe"` – icons are rendered upon page load, and the DOM is monitored for new icons using a 
      *    `MutationObserver`. Use this if icons are inserted dynamically, e.g. by using Angular, React or 
      *    VanillaJS. This option behaves as `"once"` in IE<11.
      * 
      * @remarks
      * This option has no effect in Node environments.
      */
    var replaceMode: js.UndefOr[never | once | observe] = js.undefined
    
    /**
      * Specifies the saturation of the generated icon.
      * 
      * For backward compatibility a single number can be specified instead of a `{ color, grayscale }`
      * object. This single number refers to the saturation of colored shapes.
      */
    var saturation: js.UndefOr[Grayscale | Double] = js.undefined
  }
  object JdenticonConfig {
    
    @scala.inline
    def apply(): JdenticonConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JdenticonConfig]
    }
    
    @scala.inline
    implicit class JdenticonConfigMutableBuilder[Self <: JdenticonConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackColor(value: String): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackColorUndefined: Self = StObject.set(x, "backColor", js.undefined)
      
      @scala.inline
      def setHues(value: js.Array[Double]): Self = StObject.set(x, "hues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHuesUndefined: Self = StObject.set(x, "hues", js.undefined)
      
      @scala.inline
      def setHuesVarargs(value: Double*): Self = StObject.set(x, "hues", js.Array(value :_*))
      
      @scala.inline
      def setLightness(value: Color): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightnessUndefined: Self = StObject.set(x, "lightness", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setReplaceMode(value: never | once | observe): Self = StObject.set(x, "replaceMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceModeUndefined: Self = StObject.set(x, "replaceMode", js.undefined)
      
      @scala.inline
      def setSaturation(value: Grayscale | Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      /**
        * Specifies options for generated identicons.
        * 
        * See also {@link jdenticon.config} for Node usage.
        */
      var jdenticon_config: js.UndefOr[JdenticonConfig] = js.undefined
    }
    object Window {
      
      @scala.inline
      def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setJdenticon_config(value: JdenticonConfig): Self = StObject.set(x, "jdenticon_config", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJdenticon_configUndefined: Self = StObject.set(x, "jdenticon_config", js.undefined)
      }
    }
  }
}
