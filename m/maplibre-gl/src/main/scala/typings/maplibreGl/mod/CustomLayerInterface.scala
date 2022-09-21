package typings.maplibreGl.mod

import typings.glMatrix.mod.mat4
import typings.maplibreGl.maplibreGlStrings.`2d`
import typings.maplibreGl.maplibreGlStrings.`3d`
import typings.maplibreGl.maplibreGlStrings.custom
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLayerInterface extends StObject {
  
  /**
  	 * @property {string} id A unique layer id.
  	 */
  var id: String
  
  /**
  	 * Optional method called when the layer has been added to the Map with {@link Map#addLayer}. This
  	 * gives the layer a chance to initialize gl resources and register event listeners.
  	 *
  	 * @function
  	 * @memberof CustomLayerInterface
  	 * @instance
  	 * @name onAdd
  	 * @param {Map} map The Map this custom layer was just added to.
  	 * @param {WebGLRenderingContext} gl The gl context for the map.
  	 */
  var onAdd: js.UndefOr[js.Function2[/* map */ Map, /* gl */ WebGLRenderingContext, scala.Unit]] = js.undefined
  
  /**
  	 * Optional method called when the layer has been removed from the Map with {@link Map#removeLayer}. This
  	 * gives the layer a chance to clean up gl resources and event listeners.
  	 *
  	 * @function
  	 * @memberof CustomLayerInterface
  	 * @instance
  	 * @name onRemove
  	 * @param {Map} map The Map this custom layer was just added to.
  	 * @param {WebGLRenderingContext} gl The gl context for the map.
  	 */
  var onRemove: js.UndefOr[js.Function2[/* map */ Map, /* gl */ WebGLRenderingContext, scala.Unit]] = js.undefined
  
  /**
  	 * Optional method called during a render frame to allow a layer to prepare resources or render into a texture.
  	 *
  	 * The layer cannot make any assumptions about the current GL state and must bind a framebuffer before rendering.
  	 *
  	 * @function
  	 * @memberof CustomLayerInterface
  	 * @instance
  	 * @name prerender
  	 * @param {WebGLRenderingContext} gl The map's gl context.
  	 * @param {mat4} matrix The map's camera matrix. It projects spherical mercator
  	 * coordinates to gl coordinates. The mercator coordinate `[0, 0]` represents the
  	 * top left corner of the mercator world and `[1, 1]` represents the bottom right corner. When
  	 * the `renderingMode` is `"3d"`, the z coordinate is conformal. A box with identical x, y, and z
  	 * lengths in mercator units would be rendered as a cube. {@link MercatorCoordinate}.fromLngLat
  	 * can be used to project a `LngLat` to a mercator coordinate.
  	 */
  var prerender: js.UndefOr[CustomRenderMethod] = js.undefined
  
  /**
  	 * Called during a render frame allowing the layer to draw into the GL context.
  	 *
  	 * The layer can assume blending and depth state is set to allow the layer to properly
  	 * blend and clip other layers. The layer cannot make any other assumptions about the
  	 * current GL state.
  	 *
  	 * If the layer needs to render to a texture, it should implement the `prerender` method
  	 * to do this and only use the `render` method for drawing directly into the main framebuffer.
  	 *
  	 * The blend function is set to `gl.blendFunc(gl.ONE, gl.ONE_MINUS_SRC_ALPHA)`. This expects
  	 * colors to be provided in premultiplied alpha form where the `r`, `g` and `b` values are already
  	 * multiplied by the `a` value. If you are unable to provide colors in premultiplied form you
  	 * may want to change the blend function to
  	 * `gl.blendFuncSeparate(gl.SRC_ALPHA, gl.ONE_MINUS_SRC_ALPHA, gl.ONE, gl.ONE_MINUS_SRC_ALPHA)`.
  	 *
  	 * @function
  	 * @memberof CustomLayerInterface
  	 * @instance
  	 * @name render
  	 * @param {WebGLRenderingContext} gl The map's gl context.
  	 * @param {Array<number>} matrix The map's camera matrix. It projects spherical mercator
  	 * coordinates to gl coordinates. The spherical mercator coordinate `[0, 0]` represents the
  	 * top left corner of the mercator world and `[1, 1]` represents the bottom right corner. When
  	 * the `renderingMode` is `"3d"`, the z coordinate is conformal. A box with identical x, y, and z
  	 * lengths in mercator units would be rendered as a cube. {@link MercatorCoordinate}.fromLngLat
  	 * can be used to project a `LngLat` to a mercator coordinate.
  	 */
  def render(gl: WebGLRenderingContext, matrix: mat4): scala.Unit
  /**
  	 * Called during a render frame allowing the layer to draw into the GL context.
  	 *
  	 * The layer can assume blending and depth state is set to allow the layer to properly
  	 * blend and clip other layers. The layer cannot make any other assumptions about the
  	 * current GL state.
  	 *
  	 * If the layer needs to render to a texture, it should implement the `prerender` method
  	 * to do this and only use the `render` method for drawing directly into the main framebuffer.
  	 *
  	 * The blend function is set to `gl.blendFunc(gl.ONE, gl.ONE_MINUS_SRC_ALPHA)`. This expects
  	 * colors to be provided in premultiplied alpha form where the `r`, `g` and `b` values are already
  	 * multiplied by the `a` value. If you are unable to provide colors in premultiplied form you
  	 * may want to change the blend function to
  	 * `gl.blendFuncSeparate(gl.SRC_ALPHA, gl.ONE_MINUS_SRC_ALPHA, gl.ONE, gl.ONE_MINUS_SRC_ALPHA)`.
  	 *
  	 * @function
  	 * @memberof CustomLayerInterface
  	 * @instance
  	 * @name render
  	 * @param {WebGLRenderingContext} gl The map's gl context.
  	 * @param {Array<number>} matrix The map's camera matrix. It projects spherical mercator
  	 * coordinates to gl coordinates. The spherical mercator coordinate `[0, 0]` represents the
  	 * top left corner of the mercator world and `[1, 1]` represents the bottom right corner. When
  	 * the `renderingMode` is `"3d"`, the z coordinate is conformal. A box with identical x, y, and z
  	 * lengths in mercator units would be rendered as a cube. {@link MercatorCoordinate}.fromLngLat
  	 * can be used to project a `LngLat` to a mercator coordinate.
  	 */
  @JSName("render")
  var render_Original: CustomRenderMethod
  
  /**
  	 * @property {string} renderingMode Either `"2d"` or `"3d"`. Defaults to `"2d"`.
  	 */
  var renderingMode: js.UndefOr[`2d` | `3d`] = js.undefined
  
  /**
  	 * @property {string} type The layer's type. Must be `"custom"`.
  	 */
  var `type`: custom
}
object CustomLayerInterface {
  
  inline def apply(id: String, render: (/* gl */ WebGLRenderingContext, /* matrix */ mat4) => scala.Unit): CustomLayerInterface = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[CustomLayerInterface]
  }
  
  extension [Self <: CustomLayerInterface](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnAdd(value: (/* map */ Map, /* gl */ WebGLRenderingContext) => scala.Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction2(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnRemove(value: (/* map */ Map, /* gl */ WebGLRenderingContext) => scala.Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setPrerender(value: (/* gl */ WebGLRenderingContext, /* matrix */ mat4) => scala.Unit): Self = StObject.set(x, "prerender", js.Any.fromFunction2(value))
    
    inline def setPrerenderUndefined: Self = StObject.set(x, "prerender", js.undefined)
    
    inline def setRender(value: (/* gl */ WebGLRenderingContext, /* matrix */ mat4) => scala.Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    
    inline def setRenderingMode(value: `2d` | `3d`): Self = StObject.set(x, "renderingMode", value.asInstanceOf[js.Any])
    
    inline def setRenderingModeUndefined: Self = StObject.set(x, "renderingMode", js.undefined)
    
    inline def setType(value: custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
