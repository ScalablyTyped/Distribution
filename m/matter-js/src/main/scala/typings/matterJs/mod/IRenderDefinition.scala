package typings.matterJs.mod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRenderDefinition extends js.Object {
  /**
    * A `Bounds` object that specifies the drawing view region.
    * Rendering will be automatically transformed and scaled to fit within the canvas size (`render.options.width` and `render.options.height`).
    * This allows for creating views that can pan or zoom around the scene.
    * You must also set `render.options.hasBounds` to `true` to enable bounded rendering.
    *
    * @property bounds
    * @type bounds
    */
  var bounds: js.UndefOr[Bounds] = js.native
  /**
    * The canvas element to render to. If not specified, one will be created if `render.element` has been specified.
    *
    * @property canvas
    * @type HTMLCanvasElement
    * @default null
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.native
  /**
    * The 2d rendering context from the `render.canvas` element.
    *
    * @property context
    * @type CanvasRenderingContext2D
    */
  var context: js.UndefOr[CanvasRenderingContext2D] = js.native
  /**
    * A back-reference to the `Matter.Render` module.
    *
    * @property controller
    * @type render
    */
  var controller: js.UndefOr[js.Any] = js.native
  /**
    * A reference to the element where the canvas is to be inserted (if `render.canvas` has not been specified)
    *
    * @property element
    * @type HTMLElement
    * @default null
    * @deprecated
    */
  var element: js.UndefOr[HTMLElement] = js.native
  /**
    * A reference to the `Matter.Engine` instance to be used.
    *
    * @property engine
    * @type engine
    */
  var engine: Engine = js.native
  /**
    * The configuration options of the renderer.
    *
    * @property options
    * @type {}
    */
  var options: js.UndefOr[IRendererOptions] = js.native
  /**
    * The sprite texture cache.
    *
    * @property textures
    * @type {}
    */
  var textures: js.UndefOr[js.Any] = js.native
}

object IRenderDefinition {
  @scala.inline
  def apply(engine: Engine): IRenderDefinition = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderDefinition]
  }
  @scala.inline
  implicit class IRenderDefinitionOps[Self <: IRenderDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEngine(value: Engine): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounds(value: Bounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setCanvas(value: HTMLCanvasElement): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    @scala.inline
    def setContext(value: CanvasRenderingContext2D): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setController(value: js.Any): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setOptions(value: IRendererOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setTextures(value: js.Any): Self = this.set("textures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextures: Self = this.set("textures", js.undefined)
  }
  
}

