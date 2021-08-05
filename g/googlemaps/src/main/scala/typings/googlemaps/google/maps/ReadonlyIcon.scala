package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @see {@link Icon} */
trait ReadonlyIcon extends StObject {
  
  /** @see {@link Icon#anchor} */
  val anchor: js.UndefOr[Point] = js.undefined
  
  /** @see {@link Icon#labelOrigin} */
  val labelOrigin: js.UndefOr[Point] = js.undefined
  
  /** @see {@link Icon#origin} */
  val origin: js.UndefOr[Point] = js.undefined
  
  /** @see {@link Icon#scaledSize} */
  val scaledSize: js.UndefOr[Size] = js.undefined
  
  /** @see {@link Icon#size} */
  val size: js.UndefOr[Size] = js.undefined
  
  /** @see {@link Icon#url} */
  val url: String
}
object ReadonlyIcon {
  
  inline def apply(url: String): ReadonlyIcon = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIcon]
  }
  
  extension [Self <: ReadonlyIcon](x: Self) {
    
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
