package typings.jdenticon

import org.scalablytyped.runtime.Shortcut
import typings.jdenticon.anon.Color
import typings.jdenticon.anon.Grayscale
import typings.jdenticon.jdenticonStrings.`2d`
import typings.jdenticon.jdenticonStrings.never
import typings.jdenticon.jdenticonStrings.observe
import typings.jdenticon.jdenticonStrings.once
import typings.jdenticon.umdMod.global.Jdenticon
import typings.node.Buffer
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object umdMod extends Shortcut {
  
  @JSImport("jdenticon/types/umd", JSImport.Namespace)
  @js.native
  val ^ : Jdenticon = js.native
  
  type _To = Jdenticon
  
  /* This means you don't have to write `^`, but can instead just say `umdMod.foo` */
  override def _to: Jdenticon = ^
  
  /**
    * Jdenticon
    * https://github.com/dmester/jdenticon
    * Copyright © Daniel Mester Pirttijärvi
    */
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      /**
        * Renders an indenticon for all matching supported elements.
        * 
        * @param hashOrValue A hexadecimal hash string or any value that will be hashed by Jdenticon. If not 
        * specified the `data-jdenticon-hash` and `data-jdenticon-value` attributes of each element will be
        * evaluated.
        * @param config Optional configuration. If specified, this configuration object overrides any global
        * configuration in its entirety. For backward compatibility a padding value in the range [0.0, 0.5) can be
        * specified in place of a configuration object.
        */
      def jdenticon(): Unit = js.native
      def jdenticon(hashOrValue: js.Any): Unit = js.native
      def jdenticon(hashOrValue: js.Any, config: Double): Unit = js.native
      def jdenticon(hashOrValue: js.Any, config: JdenticonConfig): Unit = js.native
      def jdenticon(hashOrValue: Unit, config: Double): Unit = js.native
      def jdenticon(hashOrValue: Unit, config: JdenticonConfig): Unit = js.native
    }
    
    @js.native
    trait Jdenticon extends StObject {
      
      /**
        * Updates all canvas elements with the `data-jdenticon-hash` or `data-jdenticon-value` attribute.
        * 
        * @remarks
        * This method is only available in the browser. Calling this method on Node.js will throw an error.
        */
      def apply(): Unit = js.native
      
      /**
        * Gets the current global style configuration.
        */
      def configure(): JdenticonConfig = js.native
      /**
        * Specifies the color options for the generated icons. This is the only supported method of setting identicon
        * styles when used in a Node environment.
        * 
        * In browsers {@link jdenticon_config} is the prefered way of setting an identicon style to avoid a race
        * condition where the style is set before the Jdenticon lib has loaded, leading to an unhandled error.
        */
      def configure(newConfig: JdenticonConfig): JdenticonConfig = js.native
      
      /**
        * Draws an identicon to a context.
        * @param ctx Canvas context on which the icon will be drawn at location (0, 0).
        * @param hashOrValue A hexadecimal hash string or any value that will be hashed by Jdenticon.
        * @param size Icon size in pixels.
        * @param config Optional configuration. If specified, this configuration object overrides any global
        * configuration in its entirety. For backward compatibility a padding value in the range [0.0, 0.5) can be
        * specified in place of a configuration object.
        */
      def drawIcon(ctx: JdenticonCompatibleCanvasRenderingContext2D, hashOrValue: js.Any, size: Double): Unit = js.native
      def drawIcon(
        ctx: JdenticonCompatibleCanvasRenderingContext2D,
        hashOrValue: js.Any,
        size: Double,
        config: Double
      ): Unit = js.native
      def drawIcon(
        ctx: JdenticonCompatibleCanvasRenderingContext2D,
        hashOrValue: js.Any,
        size: Double,
        config: JdenticonConfig
      ): Unit = js.native
      
      /**
        * Draws an identicon as PNG.
        * 
        * @remarks
        * This method is not available in the browser.
        * 
        * @param hashOrValue A hexadecimal hash string or any value that will be hashed by Jdenticon.
        * @param size Icon size in pixels.
        * @param config Optional configuration. If specified, this configuration object overrides any global
        * configuration in its entirety. For backward compatibility a padding value in the range [0.0, 0.5) can be
        * specified in place of a configuration object.
        * @returns PNG data
        */
      def toPng(hashOrValue: js.Any, size: Double): Buffer = js.native
      def toPng(hashOrValue: js.Any, size: Double, config: Double): Buffer = js.native
      def toPng(hashOrValue: js.Any, size: Double, config: JdenticonConfig): Buffer = js.native
      
      /**
        * Draws an identicon as an SVG string.
        * @param hashOrValue A hexadecimal hash string or any value that will be hashed by Jdenticon.
        * @param size Icon size in pixels.
        * @param config Optional configuration. If specified, this configuration object overrides any global
        * configuration in its entirety. For backward compatibility a padding value in the range [0.0, 0.5) can be
        * specified in place of a configuration object.
        * @returns SVG string
        */
      def toSvg(hashOrValue: js.Any, size: Double): String = js.native
      def toSvg(hashOrValue: js.Any, size: Double, config: Double): String = js.native
      def toSvg(hashOrValue: js.Any, size: Double, config: JdenticonConfig): String = js.native
      
      def update(elementOrSelector: String): Unit = js.native
      def update(elementOrSelector: String, hashOrValue: js.Any): Unit = js.native
      def update(elementOrSelector: String, hashOrValue: js.Any, config: Double): Unit = js.native
      def update(elementOrSelector: String, hashOrValue: js.Any, config: JdenticonConfig): Unit = js.native
      def update(elementOrSelector: String, hashOrValue: Unit, config: Double): Unit = js.native
      def update(elementOrSelector: String, hashOrValue: Unit, config: JdenticonConfig): Unit = js.native
      /**
        * Updates the identicon in the specified canvas or svg elements.
        * 
        * @remarks
        * This method is only available in the browser. Calling this method on Node.js will throw an error.
        * 
        * @param elementOrSelector Specifies the container in which the icon is rendered as a DOM element of the type
        * `<svg>` or `<canvas>`, or a CSS selector to such an element.
        * @param hash Optional hash or value to be rendered. If not specified, the `data-jdenticon-hash` or
        * `data-jdenticon-value` attribute will be evaluated.
        * @param config Optional configuration. If specified, this configuration object overrides any global
        * configuration in its entirety. For backward compatibility a padding value in the range [0.0, 0.5) can be
        * specified in place of a configuration object.
        */
      def update(elementOrSelector: Element): Unit = js.native
      def update(elementOrSelector: Element, hashOrValue: js.Any): Unit = js.native
      def update(elementOrSelector: Element, hashOrValue: js.Any, config: Double): Unit = js.native
      def update(elementOrSelector: Element, hashOrValue: js.Any, config: JdenticonConfig): Unit = js.native
      def update(elementOrSelector: Element, hashOrValue: Unit, config: Double): Unit = js.native
      def update(elementOrSelector: Element, hashOrValue: Unit, config: JdenticonConfig): Unit = js.native
      
      def updateCanvas(elementOrSelector: String): Unit = js.native
      def updateCanvas(elementOrSelector: String, hashOrValue: js.Any): Unit = js.native
      def updateCanvas(elementOrSelector: String, hashOrValue: js.Any, config: Double): Unit = js.native
      def updateCanvas(elementOrSelector: String, hashOrValue: js.Any, config: JdenticonConfig): Unit = js.native
      def updateCanvas(elementOrSelector: String, hashOrValue: Unit, config: Double): Unit = js.native
      def updateCanvas(elementOrSelector: String, hashOrValue: Unit, config: JdenticonConfig): Unit = js.native
      /**
        * Updates the identicon in the specified `<canvas>` elements.
        * 
        * @remarks
        * This method is only available in the browser. Calling this method on Node.js will throw an error.
        * 
        * @param elementOrSelector Specifies the container in which the icon is rendered as a DOM element of the type
        *    `<canvas>`, or a CSS selector to such an element.
        * @param hashOrValue Optional hash or value to be rendered. If not specified, the `data-jdenticon-hash` or
        *    `data-jdenticon-value` attribute will be evaluated.
        * @param config Optional configuration. If specified, this configuration object overrides any
        *    global configuration in its entirety. For backward compatibility a padding value in the range [0.0, 0.5) can be
        *    specified in place of a configuration object.
        */
      def updateCanvas(elementOrSelector: Element): Unit = js.native
      def updateCanvas(elementOrSelector: Element, hashOrValue: js.Any): Unit = js.native
      def updateCanvas(elementOrSelector: Element, hashOrValue: js.Any, config: Double): Unit = js.native
      def updateCanvas(elementOrSelector: Element, hashOrValue: js.Any, config: JdenticonConfig): Unit = js.native
      def updateCanvas(elementOrSelector: Element, hashOrValue: Unit, config: Double): Unit = js.native
      def updateCanvas(elementOrSelector: Element, hashOrValue: Unit, config: JdenticonConfig): Unit = js.native
      
      def updateSvg(elementOrSelector: String): Unit = js.native
      def updateSvg(elementOrSelector: String, hashOrValue: js.Any): Unit = js.native
      def updateSvg(elementOrSelector: String, hashOrValue: js.Any, config: Double): Unit = js.native
      def updateSvg(elementOrSelector: String, hashOrValue: js.Any, config: JdenticonConfig): Unit = js.native
      def updateSvg(elementOrSelector: String, hashOrValue: Unit, config: Double): Unit = js.native
      def updateSvg(elementOrSelector: String, hashOrValue: Unit, config: JdenticonConfig): Unit = js.native
      /**
        * Updates the identicon in the specified `<svg>` elements.
        * 
        * @remarks
        * This method is only available in the browser. Calling this method on Node.js will throw an error.
        * 
        * @param elementOrSelector Specifies the container in which the icon is rendered as a DOM element of the type
        *    `<svg>`, or a CSS selector to such an element.
        * @param hashOrValue Optional hash or value to be rendered. If not specified, the `data-jdenticon-hash` or
        *    `data-jdenticon-value` attribute will be evaluated.
        * @param config Optional configuration. If specified, this configuration object overrides any
        *    global configuration in its entirety. For backward compatibility a padding value in the range [0.0, 0.5) can be
        *    specified in place of a configuration object.
        */
      def updateSvg(elementOrSelector: Element): Unit = js.native
      def updateSvg(elementOrSelector: Element, hashOrValue: js.Any): Unit = js.native
      def updateSvg(elementOrSelector: Element, hashOrValue: js.Any, config: Double): Unit = js.native
      def updateSvg(elementOrSelector: Element, hashOrValue: js.Any, config: JdenticonConfig): Unit = js.native
      def updateSvg(elementOrSelector: Element, hashOrValue: Unit, config: Double): Unit = js.native
      def updateSvg(elementOrSelector: Element, hashOrValue: Unit, config: JdenticonConfig): Unit = js.native
      
      /**
        * Specifies the version of the Jdenticon package in use.
        */
      val version: String = js.native
    }
    
    /**
      * This is a subset of `HTMLCanvasElement` to allow using incomplete canvas implementations, 
      * like `canvas-renderer`.
      */
    trait JdenticonCompatibleCanvas extends StObject {
      
      @JSName("getContext")
      def getContext_2d(contextId: `2d`): JdenticonCompatibleCanvasRenderingContext2D | Null
      
      // HTMLCanvasElement
      val height: Double
      
      val width: Double
    }
    object JdenticonCompatibleCanvas {
      
      inline def apply(
        getContext: `2d` => JdenticonCompatibleCanvasRenderingContext2D | Null,
        height: Double,
        width: Double
      ): JdenticonCompatibleCanvas = {
        val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction1(getContext), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[JdenticonCompatibleCanvas]
      }
      
      extension [Self <: JdenticonCompatibleCanvas](x: Self) {
        
        inline def setGetContext(value: `2d` => JdenticonCompatibleCanvasRenderingContext2D | Null): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * This is a subset of `CanvasRenderingContext2D` to allow using incomplete canvas implementations, 
      * like `canvas-renderer`.
      */
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
      
      inline def apply(): JdenticonConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JdenticonConfig]
      }
      
      extension [Self <: JdenticonConfig](x: Self) {
        
        inline def setBackColor(value: String): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
        
        inline def setBackColorUndefined: Self = StObject.set(x, "backColor", js.undefined)
        
        inline def setHues(value: js.Array[Double]): Self = StObject.set(x, "hues", value.asInstanceOf[js.Any])
        
        inline def setHuesUndefined: Self = StObject.set(x, "hues", js.undefined)
        
        inline def setHuesVarargs(value: Double*): Self = StObject.set(x, "hues", js.Array(value :_*))
        
        inline def setLightness(value: Color): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
        
        inline def setLightnessUndefined: Self = StObject.set(x, "lightness", js.undefined)
        
        inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
        
        inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
        
        inline def setReplaceMode(value: never | once | observe): Self = StObject.set(x, "replaceMode", value.asInstanceOf[js.Any])
        
        inline def setReplaceModeUndefined: Self = StObject.set(x, "replaceMode", js.undefined)
        
        inline def setSaturation(value: Grayscale | Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
        
        inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
      }
    }
    
    trait Window extends StObject {
      
      /**
        * Specifies options for generated identicons.
        * 
        * See also {@link jdenticon.config} for Node usage.
        */
      var jdenticon_config: js.UndefOr[JdenticonConfig] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setJdenticon_config(value: JdenticonConfig): Self = StObject.set(x, "jdenticon_config", value.asInstanceOf[js.Any])
        
        inline def setJdenticon_configUndefined: Self = StObject.set(x, "jdenticon_config", js.undefined)
      }
    }
  }
}
