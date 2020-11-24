package typings.leafletDraw.mod.DrawOptions

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leafletDraw.anon.PolylineOptionsclickableb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineOptions extends SimpleShapeOptions {
  
  /**
    * Determines if line segments can cross.
    *
    * @default true
    */
  var allowIntersection: js.UndefOr[Boolean] = js.native
  
  /**
    * Configuration options for the error that displays if an intersection is detected.
    *
    * @default { color: '#b00b00', timeout: 2500 }
    */
  var drawError: js.UndefOr[DrawErrorOptions] = js.native
  
  /**
    * To change distance calculation
    *
    * @default 1
    */
  var factor: js.UndefOr[Double] = js.native
  
  /**
    * When not metric, to use feet instead of yards for display.
    *
    * @default true
    */
  var feet: js.UndefOr[Boolean] = js.native
  
  /**
    * Distance in pixels between each guide dash.
    *
    * @default 20
    */
  var guidelineDistance: js.UndefOr[Double] = js.native
  
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  
  /**
    * The maximum length of the guide line
    *
    * @default 4000
    */
  var maxGuideLineLength: js.UndefOr[Double] = js.native
  
  /**
    * Once this number of points are placed, finish shape
    *
    * @default 0
    */
  var maxPoints: js.UndefOr[Double] = js.native
  
  /**
    * Determines which measurement system (metric or imperial) is used.
    *
    * @default true
    */
  var metric: js.UndefOr[Boolean] = js.native
  
  /**
    * When not metric, not feet use nautic mile for display
    *
    * @default false
    */
  var nautic: js.UndefOr[Boolean] = js.native
  
  /**
    * The options used when drawing the polyline/polygon on the map.
    *
    * @default { stroke: true, color: '#3388ff', weight: 4, opacity: 0.5, fill: false, clickable: true }
    */
  var shapeOptions: js.UndefOr[PolylineOptionsclickableb] = js.native
  
  /**
    * Whether to display distance in the tooltip
    *
    * @default true
    */
  var showLength: js.UndefOr[Boolean] = js.native
  
  var touchIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  
  /**
    * This should be a high number to ensure that you can draw over all other layers on the map.
    *
    * @default 2000
    */
  var zIndexOffset: js.UndefOr[Double] = js.native
}
object PolylineOptions {
  
  @scala.inline
  def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptions]
  }
  
  @scala.inline
  implicit class PolylineOptionsOps[Self <: PolylineOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowIntersection(value: Boolean): Self = this.set("allowIntersection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowIntersection: Self = this.set("allowIntersection", js.undefined)
    
    @scala.inline
    def setDrawError(value: DrawErrorOptions): Self = this.set("drawError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawError: Self = this.set("drawError", js.undefined)
    
    @scala.inline
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    
    @scala.inline
    def setFeet(value: Boolean): Self = this.set("feet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeet: Self = this.set("feet", js.undefined)
    
    @scala.inline
    def setGuidelineDistance(value: Double): Self = this.set("guidelineDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuidelineDistance: Self = this.set("guidelineDistance", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon_[IconOptions] | DivIcon_): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setMaxGuideLineLength(value: Double): Self = this.set("maxGuideLineLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxGuideLineLength: Self = this.set("maxGuideLineLength", js.undefined)
    
    @scala.inline
    def setMaxPoints(value: Double): Self = this.set("maxPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPoints: Self = this.set("maxPoints", js.undefined)
    
    @scala.inline
    def setMetric(value: Boolean): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    
    @scala.inline
    def setNautic(value: Boolean): Self = this.set("nautic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNautic: Self = this.set("nautic", js.undefined)
    
    @scala.inline
    def setShapeOptions(value: PolylineOptionsclickableb): Self = this.set("shapeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeOptions: Self = this.set("shapeOptions", js.undefined)
    
    @scala.inline
    def setShowLength(value: Boolean): Self = this.set("showLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLength: Self = this.set("showLength", js.undefined)
    
    @scala.inline
    def setTouchIcon(value: Icon_[IconOptions] | DivIcon_): Self = this.set("touchIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchIcon: Self = this.set("touchIcon", js.undefined)
    
    @scala.inline
    def setZIndexOffset(value: Double): Self = this.set("zIndexOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndexOffset: Self = this.set("zIndexOffset", js.undefined)
  }
}
