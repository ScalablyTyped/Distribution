package typings.highcharts.mapMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends js.Object {
  
  var pointPadding: js.UndefOr[Double] = js.native
  
  /**
    * In Highmaps, when data is loaded from GeoJSON, the GeoJSON item's
    * properies are copied over here.
    */
  var properties: js.Any = js.native
  
  var value: js.UndefOr[Double | Null] = js.native
  
  /**
    * Highmaps only. Zoom in on the point using the global animation.
    */
  def zoomTo(): Unit = js.native
}
object Point {
  
  @scala.inline
  def apply(properties: js.Any, zoomTo: () => Unit): Point = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], zoomTo = js.Any.fromFunction0(zoomTo))
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    
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
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomTo(value: () => Unit): Self = this.set("zoomTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPointPadding(value: Double): Self = this.set("pointPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointPadding: Self = this.set("pointPadding", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
