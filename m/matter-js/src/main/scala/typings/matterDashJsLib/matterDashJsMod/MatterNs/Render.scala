package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Render extends js.Object {
  /**
    * A `Bounds` object that specifies the drawing view region.
    * Rendering will be automatically transformed and scaled to fit within the canvas size (`render.options.width` and `render.options.height`).
    * This allows for creating views that can pan or zoom around the scene.
    * You must also set `render.options.hasBounds` to `true` to enable bounded rendering.
    *
    * @property bounds
    * @type bounds
    */
  var bounds: Bounds
  /**
    * The canvas element to render to. If not specified, one will be created if `render.element` has been specified.
    *
    * @property canvas
    * @type HTMLCanvasElement
    * @default null
    */
  var canvas: stdLib.HTMLCanvasElement
  /**
    * The 2d rendering context from the `render.canvas` element.
    *
    * @property context
    * @type CanvasRenderingContext2D
    */
  var context: stdLib.CanvasRenderingContext2D
  /**
    * A back-reference to the `Matter.Render` module.
    *
    * @property controller
    * @type render
    */
  var controller: js.Any
  /**
    * A reference to the element where the canvas is to be inserted (if `render.canvas` has not been specified)
    *
    * @property element
    * @type HTMLElement
    * @default null
    */
  var element: stdLib.HTMLElement
  /**
    * The configuration options of the renderer.
    *
    * @property options
    * @type {}
    */
  var options: IRendererOptions
  /**
    * The sprite texture cache.
    *
    * @property textures
    * @type {}
    */
  var textures: js.Any
}

object Render {
  @scala.inline
  def apply(
    bounds: Bounds,
    canvas: stdLib.HTMLCanvasElement,
    context: stdLib.CanvasRenderingContext2D,
    controller: js.Any,
    element: stdLib.HTMLElement,
    options: IRendererOptions,
    textures: js.Any
  ): Render = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("canvas")(canvas)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("controller")(controller)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("textures")(textures)
    __obj.asInstanceOf[Render]
  }
}

