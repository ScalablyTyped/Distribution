package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var bounds: js.UndefOr[Bounds] = js.undefined
  /**
    * The canvas element to render to. If not specified, one will be created if `render.element` has been specified.
    *
    * @property canvas
    * @type HTMLCanvasElement
    * @default null
    */
  var canvas: js.UndefOr[stdLib.HTMLCanvasElement] = js.undefined
  /**
    * The 2d rendering context from the `render.canvas` element.
    *
    * @property context
    * @type CanvasRenderingContext2D
    */
  var context: js.UndefOr[stdLib.CanvasRenderingContext2D] = js.undefined
  /**
    * A back-reference to the `Matter.Render` module.
    *
    * @property controller
    * @type render
    */
  var controller: js.UndefOr[js.Any] = js.undefined
  /**
    * A reference to the element where the canvas is to be inserted (if `render.canvas` has not been specified)
    *
    * @property element
    * @type HTMLElement
    * @default null
    * @deprecated
    */
  var element: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /**
    * A reference to the `Matter.Engine` instance to be used.
    *
    * @property engine
    * @type engine
    */
  var engine: Engine
  /**
    * The configuration options of the renderer.
    *
    * @property options
    * @type {}
    */
  var options: js.UndefOr[IRendererOptions] = js.undefined
  /**
    * The sprite texture cache.
    *
    * @property textures
    * @type {}
    */
  var textures: js.UndefOr[js.Any] = js.undefined
}

object IRenderDefinition {
  @scala.inline
  def apply(
    engine: Engine,
    bounds: Bounds = null,
    canvas: stdLib.HTMLCanvasElement = null,
    context: stdLib.CanvasRenderingContext2D = null,
    controller: js.Any = null,
    element: stdLib.HTMLElement = null,
    options: IRendererOptions = null,
    textures: js.Any = null
  ): IRenderDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("engine")(engine)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (canvas != null) __obj.updateDynamic("canvas")(canvas)
    if (context != null) __obj.updateDynamic("context")(context)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (element != null) __obj.updateDynamic("element")(element)
    if (options != null) __obj.updateDynamic("options")(options)
    if (textures != null) __obj.updateDynamic("textures")(textures)
    __obj.asInstanceOf[IRenderDefinition]
  }
}

