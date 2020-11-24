package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @see {@link MarkerOptions} */
@js.native
trait ReadonlyMarkerOptions extends js.Object {
  
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
  implicit class ReadonlyMarkerOptionsOps[Self <: ReadonlyMarkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnchorPoint(value: Point): Self = this.set("anchorPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorPoint: Self = this.set("anchorPoint", js.undefined)
    
    @scala.inline
    def setAnimation(value: Animation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    
    @scala.inline
    def setCrossOnDrag(value: Boolean): Self = this.set("crossOnDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOnDrag: Self = this.set("crossOnDrag", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setIcon(value: String | ReadonlyIcon | ReadonlySymbol): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLabel(value: String | ReadonlyMarkerLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMap(value: Map[Element] | StreetViewPanorama): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOptimized(value: Boolean): Self = this.set("optimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimized: Self = this.set("optimized", js.undefined)
    
    @scala.inline
    def setPlace(value: Place): Self = this.set("place", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlace: Self = this.set("place", js.undefined)
    
    @scala.inline
    def setPosition(value: LatLng | ReadonlyLatLngLiteral): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShape(value: MarkerShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
