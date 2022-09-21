package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleImageInterface extends StObject {
  
  /**
  	 * @property {Uint8Array | Uint8ClampedArray} data
  	 */
  var data: js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray
  
  /**
  	 * @property {number} height
  	 */
  var height: Double
  
  /**
  	 * Optional method called when the layer has been added to the Map with {@link Map#addImage}.
  	 *
  	 * @function
  	 * @memberof StyleImageInterface
  	 * @instance
  	 * @name onAdd
  	 * @param {Map} map The Map this custom layer was just added to.
  	 */
  var onAdd: js.UndefOr[js.Function2[/* map */ Map, /* id */ String, scala.Unit]] = js.undefined
  
  /**
  	 * Optional method called when the icon is removed from the map with {@link Map#removeImage}.
  	 * This gives the image a chance to clean up resources and event listeners.
  	 *
  	 * @function
  	 * @memberof StyleImageInterface
  	 * @instance
  	 * @name onRemove
  	 */
  var onRemove: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  
  /**
  	 * This method is called once before every frame where the icon will be used.
  	 * The method can optionally update the image's `data` member with a new image.
  	 *
  	 * If the method updates the image it must return `true` to commit the change.
  	 * If the method returns `false` or nothing the image is assumed to not have changed.
  	 *
  	 * If updates are infrequent it maybe easier to use {@link Map#updateImage} to update
  	 * the image instead of implementing this method.
  	 *
  	 * @function
  	 * @memberof StyleImageInterface
  	 * @instance
  	 * @name render
  	 * @return {boolean} `true` if this method updated the image. `false` if the image was not changed.
  	 */
  var render: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /**
  	 * @property {number} width
  	 */
  var width: Double
}
object StyleImageInterface {
  
  inline def apply(data: js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray, height: Double, width: Double): StyleImageInterface = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleImageInterface]
  }
  
  extension [Self <: StyleImageInterface](x: Self) {
    
    inline def setData(value: js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOnAdd(value: (/* map */ Map, /* id */ String) => scala.Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction2(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnRemove(value: () => scala.Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction0(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setRender(value: () => Boolean): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
