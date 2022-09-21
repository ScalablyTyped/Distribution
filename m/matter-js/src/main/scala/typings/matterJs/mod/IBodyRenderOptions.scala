package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBodyRenderOptions extends StObject {
  
  /**
    * A String that defines the fill style to use when rendering the body (if a sprite is not defined). It is the same as when using a canvas, so it accepts CSS style property values.
    Default: a random colour
    */
  var fillStyle: js.UndefOr[String] = js.undefined
  
  /**
    * A Number that defines the line width to use when rendering the body outline (if a sprite is not defined). A value of 0 means no outline will be rendered.
    Default: 1.5
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /*
    * Sets the opacity. 1.0 is fully opaque. 0.0 is fully translucent
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * An `Object` that defines the sprite properties to use when rendering, if any.
    *
    * @property render.sprite
    * @type {IBodyRenderOptionsSprite | undefined}
    */
  var sprite: js.UndefOr[IBodyRenderOptionsSprite] = js.undefined
  
  /**
    * A String that defines the stroke style to use when rendering the body outline (if a sprite is not defined). It is the same as when using a canvas, so it accepts CSS style property values.
    Default: a random colour
    */
  var strokeStyle: js.UndefOr[String] = js.undefined
  
  /**
    * A flag that indicates if the body should be rendered.
    *
    * @property render.visible
    * @type {boolean | undefined}
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object IBodyRenderOptions {
  
  inline def apply(): IBodyRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBodyRenderOptions]
  }
  
  extension [Self <: IBodyRenderOptions](x: Self) {
    
    inline def setFillStyle(value: String): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    
    inline def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSprite(value: IBodyRenderOptionsSprite): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
    
    inline def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
    
    inline def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
