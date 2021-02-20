package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @see {@link Icon} */
@js.native
trait ReadonlyIcon extends StObject {
  
  /** @see {@link Icon#anchor} */
  val anchor: js.UndefOr[Point] = js.native
  
  /** @see {@link Icon#labelOrigin} */
  val labelOrigin: js.UndefOr[Point] = js.native
  
  /** @see {@link Icon#origin} */
  val origin: js.UndefOr[Point] = js.native
  
  /** @see {@link Icon#scaledSize} */
  val scaledSize: js.UndefOr[Size] = js.native
  
  /** @see {@link Icon#size} */
  val size: js.UndefOr[Size] = js.native
  
  /** @see {@link Icon#url} */
  val url: String = js.native
}
object ReadonlyIcon {
  
  @scala.inline
  def apply(url: String): ReadonlyIcon = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIcon]
  }
  
  @scala.inline
  implicit class ReadonlyIconMutableBuilder[Self <: ReadonlyIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Point): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setLabelOrigin(value: Point): Self = StObject.set(x, "labelOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOriginUndefined: Self = StObject.set(x, "labelOrigin", js.undefined)
    
    @scala.inline
    def setOrigin(value: Point): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setScaledSize(value: Size): Self = StObject.set(x, "scaledSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaledSizeUndefined: Self = StObject.set(x, "scaledSize", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
