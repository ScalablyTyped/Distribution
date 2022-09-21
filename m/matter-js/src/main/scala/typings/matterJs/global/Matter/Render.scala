package typings.matterJs.global.Matter

import typings.matterJs.mod.IRenderDefinition
import typings.matterJs.mod.IRenderLookAtObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Render")
@js.native
open class Render ()
  extends typings.matterJs.mod.Render
/* static members */
object Render {
  
  @JSGlobal("Matter.Render")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new renderer. The options parameter is an object that specifies any properties you wish to override the defaults.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {any} [options]
    * @returns {render} A new renderer
    */
  inline def create(options: IRenderDefinition): typings.matterJs.mod.Render = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Render]
  
  inline def lookAt(render: typings.matterJs.mod.Render, objects: js.Array[IRenderLookAtObject]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookAt")(render.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lookAt(
    render: typings.matterJs.mod.Render,
    objects: js.Array[IRenderLookAtObject],
    padding: Unit,
    center: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookAt")(render.asInstanceOf[js.Any], objects.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lookAt(
    render: typings.matterJs.mod.Render,
    objects: js.Array[IRenderLookAtObject],
    padding: typings.matterJs.mod.Vector
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookAt")(render.asInstanceOf[js.Any], objects.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lookAt(
    render: typings.matterJs.mod.Render,
    objects: js.Array[IRenderLookAtObject],
    padding: typings.matterJs.mod.Vector,
    center: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookAt")(render.asInstanceOf[js.Any], objects.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Positions and sizes the viewport around the given object bounds.
    * @method lookAt
    * @param {Render} render
    * @param {IRenderLookAtObject | IRenderLookAtObject[]} objects
    * @param {Vector} padding
    * @param {boolean} center
    */
  inline def lookAt(render: typings.matterJs.mod.Render, objects: IRenderLookAtObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookAt")(render.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lookAt(render: typings.matterJs.mod.Render, objects: IRenderLookAtObject, padding: Unit, center: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookAt")(render.asInstanceOf[js.Any], objects.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lookAt(
    render: typings.matterJs.mod.Render,
    objects: IRenderLookAtObject,
    padding: typings.matterJs.mod.Vector
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookAt")(render.asInstanceOf[js.Any], objects.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lookAt(
    render: typings.matterJs.mod.Render,
    objects: IRenderLookAtObject,
    padding: typings.matterJs.mod.Vector,
    center: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookAt")(render.asInstanceOf[js.Any], objects.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Continuously updates the render canvas on the `requestAnimationFrame` event.
    * @method run
    * @param {render} render
    */
  inline def run(render: typings.matterJs.mod.Render): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(render.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the pixel ratio of the renderer and updates the canvas.
    * To automatically detect the correct ratio, pass the string `'auto'` for `pixelRatio`.
    * @method setPixelRatio
    * @param {render} render
    * @param {number} pixelRatio
    */
  inline def setPixelRatio(render: typings.matterJs.mod.Render, pixelRatio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPixelRatio")(render.asInstanceOf[js.Any], pixelRatio.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Ends execution of `Render.run` on the given `render`, by canceling the animation frame request event loop.
    * @method stop
    * @param {render} render
    */
  inline def stop(render: typings.matterJs.mod.Render): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(render.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Renders the given `engine`'s `Matter.World` object.
    * This is the entry point for all rendering and should be called every time the scene changes.
    * @method world
    * @param {engine} engine
    */
  inline def world(render: typings.matterJs.mod.Render): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("world")(render.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
