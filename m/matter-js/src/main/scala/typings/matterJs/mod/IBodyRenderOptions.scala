package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBodyRenderOptions extends StObject {
  
  /**
    * A String that defines the fill style to use when rendering the body (if a sprite is not defined). It is the same as when using a canvas, so it accepts CSS style property values.
    Default: a random colour
    */
  var fillStyle: js.UndefOr[String] = js.native
  
  /**
    * A Number that defines the line width to use when rendering the body outline (if a sprite is not defined). A value of 0 means no outline will be rendered.
    Default: 1.5
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /*
    * Sets the opacity. 1.0 is fully opaque. 0.0 is fully translucent
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * An `Object` that defines the sprite properties to use when rendering, if any.
    *
    * @property render.sprite
    * @type object
    */
  var sprite: js.UndefOr[IBodyRenderOptionsSprite] = js.native
  
  /**
    * A String that defines the stroke style to use when rendering the body outline (if a sprite is not defined). It is the same as when using a canvas, so it accepts CSS style property values.
    Default: a random colour
    */
  var strokeStyle: js.UndefOr[String] = js.native
  
  /**
    * A flag that indicates if the body should be rendered.
    *
    * @property render.visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object IBodyRenderOptions {
  
  @scala.inline
  def apply(): IBodyRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBodyRenderOptions]
  }
  
  @scala.inline
  implicit class IBodyRenderOptionsMutableBuilder[Self <: IBodyRenderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillStyle(value: String): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSprite(value: IBodyRenderOptionsSprite): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
    
    @scala.inline
    def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
