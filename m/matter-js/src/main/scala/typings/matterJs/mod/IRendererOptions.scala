package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRendererOptions extends StObject {
  
  /**
    * Sets scene background
    * @type string
    * default undefined
    */
  var background: js.UndefOr[String] = js.undefined
  
  /**
    * A flag that specifies if `render.bounds` should be used when rendering.
    *
    * @property options.hasBounds
    * @type boolean
    * @default false
    */
  var hasBounds: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The target height in pixels of the `render.canvas` to be created.
    *
    * @property options.height
    * @type number
    * @default 600
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The target width in pixels of the `render.canvas` to be created.
    *
    * @property options.width
    * @type number
    * @default 800
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets wireframe background if `render.options.wireframes` is enabled
    * @type string
    * default undefined
    */
  var wireframeBackground: js.UndefOr[String] = js.undefined
  
  /**
    * Render wireframes only
    * @type boolean
    * @default true
    */
  var wireframes: js.UndefOr[Boolean] = js.undefined
}
object IRendererOptions {
  
  @scala.inline
  def apply(): IRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRendererOptions]
  }
  
  @scala.inline
  implicit class IRendererOptionsMutableBuilder[Self <: IRendererOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setHasBounds(value: Boolean): Self = StObject.set(x, "hasBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBoundsUndefined: Self = StObject.set(x, "hasBounds", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWireframeBackground(value: String): Self = StObject.set(x, "wireframeBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWireframeBackgroundUndefined: Self = StObject.set(x, "wireframeBackground", js.undefined)
    
    @scala.inline
    def setWireframes(value: Boolean): Self = StObject.set(x, "wireframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWireframesUndefined: Self = StObject.set(x, "wireframes", js.undefined)
  }
}
