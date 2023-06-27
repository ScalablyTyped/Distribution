package typings.matterJs.mod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRenderDefinition extends StObject {
  
  /**
    * A `Bounds` object that specifies the drawing view region.
    * Rendering will be automatically transformed and scaled to fit within the canvas size (`render.options.width` and `render.options.height`).
    * This allows for creating views that can pan or zoom around the scene.
    * You must also set `render.options.hasBounds` to `true` to enable bounded rendering.
    *
    */
  var bounds: js.UndefOr[Bounds] = js.undefined
  
  /**
    * The canvas element to render to. If not specified, one will be created if `render.element` has been specified.
    *
    * @default null
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  
  /**
    * The 2d rendering context from the `render.canvas` element.
    *
    */
  var context: js.UndefOr[CanvasRenderingContext2D] = js.undefined
  
  /**
    * A back-reference to the `Matter.Render` module.
    *
    */
  var controller: js.UndefOr[Any] = js.undefined
  
  /**
    * A reference to the element where the canvas is to be inserted (if `render.canvas` has not been specified)
    *
    * @default null
    * @deprecated
    */
  var element: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * A reference to the `Matter.Engine` instance to be used.
    *
    */
  var engine: Engine
  
  /**
    * The configuration options of the renderer.
    *
    */
  var options: js.UndefOr[IRendererOptions] = js.undefined
  
  /**
    * The sprite texture cache.
    *
    */
  var textures: js.UndefOr[Any] = js.undefined
}
object IRenderDefinition {
  
  inline def apply(engine: Engine): IRenderDefinition = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRenderDefinition] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setController(value: Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEngine(value: Engine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: IRendererOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setTextures(value: Any): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    inline def setTexturesUndefined: Self = StObject.set(x, "textures", js.undefined)
  }
}
