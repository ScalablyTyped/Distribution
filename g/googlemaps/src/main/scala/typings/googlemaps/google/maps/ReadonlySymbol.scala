package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @see {@link Symbol} */
trait ReadonlySymbol extends StObject {
  
  /** @see {@link Symbol#anchor} */
  val anchor: js.UndefOr[Point] = js.undefined
  
  /** @see {@link Symbol#fillColor} */
  val fillColor: js.UndefOr[String] = js.undefined
  
  /** @see {@link Symbol#fillOpacity} */
  val fillOpacity: js.UndefOr[Double] = js.undefined
  
  /** @see {@link Symbol#labelOrigin} */
  val labelOrigin: js.UndefOr[Point] = js.undefined
  
  /** @see {@link Symbol#path} */
  val path: SymbolPath | String
  
  /** @see {@link Symbol#rotation} */
  val rotation: js.UndefOr[Double] = js.undefined
  
  /** @see {@link Symbol#scale} */
  val scale: js.UndefOr[Double] = js.undefined
  
  /** @see {@link Symbol#strokeColor} */
  val strokeColor: js.UndefOr[String] = js.undefined
  
  /** @see {@link Symbol#strokeOpacity} */
  val strokeOpacity: js.UndefOr[Double] = js.undefined
  
  /** @see {@link Symbol#strokeWeight} */
  val strokeWeight: js.UndefOr[Double] = js.undefined
}
object ReadonlySymbol {
  
  @scala.inline
  def apply(path: SymbolPath | String): ReadonlySymbol = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySymbol]
  }
  
  @scala.inline
  implicit class ReadonlySymbolMutableBuilder[Self <: ReadonlySymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Point): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setLabelOrigin(value: Point): Self = StObject.set(x, "labelOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOriginUndefined: Self = StObject.set(x, "labelOrigin", js.undefined)
    
    @scala.inline
    def setPath(value: SymbolPath | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
  }
}
