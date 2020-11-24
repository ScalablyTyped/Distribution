package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.click
import typings.mapboxGl.mapboxGlStrings.contextmenu
import typings.mapboxGl.mapboxGlStrings.dblclick
import typings.mapboxGl.mapboxGlStrings.mousedown
import typings.mapboxGl.mapboxGlStrings.mouseenter
import typings.mapboxGl.mapboxGlStrings.mouseleave
import typings.mapboxGl.mapboxGlStrings.mousemove
import typings.mapboxGl.mapboxGlStrings.mouseout
import typings.mapboxGl.mapboxGlStrings.mouseover
import typings.mapboxGl.mapboxGlStrings.mouseup
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mapbox-gl.mapbox-gl.MapMouseEvent & {  features :std.Array<mapbox-gl.mapbox-gl.MapboxGeoJSONFeature> | undefined} */
@js.native
trait MapLayerMouseEvent extends js.Object {
  
  var defaultPrevented: Boolean = js.native
  
  var features: js.UndefOr[js.Array[MapboxGeoJSONFeature]] = js.native
  
  var lngLat: LngLat = js.native
  
  var originalEvent: MouseEvent = js.native
  
  var point: Point = js.native
  
  def preventDefault(): Unit = js.native
  
  var target: Map = js.native
  
  var `type`: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu = js.native
}
object MapLayerMouseEvent {
  
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    lngLat: LngLat,
    originalEvent: MouseEvent,
    point: Point,
    preventDefault: () => Unit,
    target: Map,
    `type`: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu
  ): MapLayerMouseEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], lngLat = lngLat.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerMouseEvent]
  }
  
  @scala.inline
  implicit class MapLayerMouseEventOps[Self <: MapLayerMouseEvent] (val x: Self) extends AnyVal {
    
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
    def setDefaultPrevented(value: Boolean): Self = this.set("defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLngLat(value: LngLat): Self = this.set("lngLat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: MouseEvent): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: Map): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesVarargs(value: MapboxGeoJSONFeature*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[MapboxGeoJSONFeature]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
  }
}
