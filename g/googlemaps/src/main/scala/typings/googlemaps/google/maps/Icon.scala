package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure representing a Marker icon image.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon Maps JavaScript API}
  */
trait Icon extends StObject {
  
  /**
    * The position at which to anchor an image in correspondence to the
    * location of the marker on the map. By default, the anchor is located
    * along the center point of the bottom of the image.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.anchor Maps JavaScript API}
    */
  var anchor: js.UndefOr[Point] = js.undefined
  
  /**
    * The origin of the label relative to the top-left corner of the icon
    * image, if a label is supplied by the marker. By default, the origin is
    * located in the center point of the image.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.labelOrigin Maps JavaScript API}
    */
  var labelOrigin: js.UndefOr[Point] = js.undefined
  
  /**
    * The position of the image within a sprite, if any.
    * @default new google.maps.Point(0, 0)
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.origin Maps JavaScript API}
    */
  var origin: js.UndefOr[Point] = js.undefined
  
  /**
    * The size of the entire image after scaling, if any. Use this property to
    * stretch/shrink an image or a sprite.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.scaledSize Maps JavaScript API}
    */
  var scaledSize: js.UndefOr[Size] = js.undefined
  
  /**
    * The display size of the sprite or image. When using sprites, you must
    * specify the sprite size. If the size is not provided, it will be set when
    * the image loads.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.size Maps JavaScript API}
    */
  var size: js.UndefOr[Size] = js.undefined
  
  /**
    * The URL of the image or sprite sheet.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.url Maps JavaScript API}
    */
  var url: String
}
object Icon {
  
  inline def apply(url: String): Icon = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setAnchor(value: Point): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setLabelOrigin(value: Point): Self = StObject.set(x, "labelOrigin", value.asInstanceOf[js.Any])
    
    inline def setLabelOriginUndefined: Self = StObject.set(x, "labelOrigin", js.undefined)
    
    inline def setOrigin(value: Point): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setScaledSize(value: Size): Self = StObject.set(x, "scaledSize", value.asInstanceOf[js.Any])
    
    inline def setScaledSizeUndefined: Self = StObject.set(x, "scaledSize", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
