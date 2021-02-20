package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @see {@link MarkerOptions} */
@js.native
trait ReadonlyMarkerOptions extends StObject {
  
  /** @see {@link MarkerOptions#anchorPoint} */
  val anchorPoint: js.UndefOr[Point] = js.native
  
  /** @see {@link MarkerOptions#animation} */
  val animation: js.UndefOr[Animation] = js.native
  
  /** @see {@link MarkerOptions#clickable} */
  val clickable: js.UndefOr[Boolean] = js.native
  
  /** @see {@link MarkerOptions#crossOnDrag} */
  val crossOnDrag: js.UndefOr[Boolean] = js.native
  
  /** @see {@link MarkerOptions#cursor} */
  val cursor: js.UndefOr[String] = js.native
  
  /** @see {@link MarkerOptions#draggable} */
  val draggable: js.UndefOr[Boolean] = js.native
  
  /** @see {@link MarkerOptions#icon} */
  val icon: js.UndefOr[String | ReadonlyIcon | ReadonlySymbol] = js.native
  
  /** @see {@link MarkerOptions#label} */
  val label: js.UndefOr[String | ReadonlyMarkerLabel] = js.native
  
  /** @see {@link MarkerOptions#map} */
  val map: js.UndefOr[Map[Element] | StreetViewPanorama] = js.native
  
  /** @see {@link MarkerOptions#opacity} */
  val opacity: js.UndefOr[Double] = js.native
  
  /** @see {@link MarkerOptions#optimized} */
  val optimized: js.UndefOr[Boolean] = js.native
  
  /** @see {@link MarkerOptions#place} */
  val place: js.UndefOr[Place] = js.native
  
  /** @see {@link MarkerOptions#position} */
  val position: js.UndefOr[LatLng | ReadonlyLatLngLiteral] = js.native
  
  /** @see {@link MarkerOptions#shape} */
  val shape: js.UndefOr[MarkerShape] = js.native
  
  /** @see {@link MarkerOptions#title} */
  val title: js.UndefOr[String] = js.native
  
  /** @see {@link MarkerOptions#visible} */
  val visible: js.UndefOr[Boolean] = js.native
  
  /** @see {@link MarkerOptions#zIndex} */
  val zIndex: js.UndefOr[Double] = js.native
}
object ReadonlyMarkerOptions {
  
  @scala.inline
  def apply(): ReadonlyMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyMarkerOptions]
  }
  
  @scala.inline
  implicit class ReadonlyMarkerOptionsMutableBuilder[Self <: ReadonlyMarkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorPoint(value: Point): Self = StObject.set(x, "anchorPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorPointUndefined: Self = StObject.set(x, "anchorPoint", js.undefined)
    
    @scala.inline
    def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    @scala.inline
    def setCrossOnDrag(value: Boolean): Self = StObject.set(x, "crossOnDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOnDragUndefined: Self = StObject.set(x, "crossOnDrag", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setIcon(value: String | ReadonlyIcon | ReadonlySymbol): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: String | ReadonlyMarkerLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMap(value: Map[Element] | StreetViewPanorama): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOptimized(value: Boolean): Self = StObject.set(x, "optimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizedUndefined: Self = StObject.set(x, "optimized", js.undefined)
    
    @scala.inline
    def setPlace(value: Place): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
    
    @scala.inline
    def setPosition(value: LatLng | ReadonlyLatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShape(value: MarkerShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
