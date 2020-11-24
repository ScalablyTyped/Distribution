package typings.leafletDraw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle extends js.Object {
  
  var circle: String = js.native
  
  var circlemarker: String = js.native
  
  var marker: String = js.native
  
  var polygon: String = js.native
  
  var polyline: String = js.native
  
  var rectangle: String = js.native
}
object Circle {
  
  @scala.inline
  def apply(
    circle: String,
    circlemarker: String,
    marker: String,
    polygon: String,
    polyline: String,
    rectangle: String
  ): Circle = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], circlemarker = circlemarker.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
  
  @scala.inline
  implicit class CircleOps[Self <: Circle] (val x: Self) extends AnyVal {
    
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
    def setCircle(value: String): Self = this.set("circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCirclemarker(value: String): Self = this.set("circlemarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygon(value: String): Self = this.set("polygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolyline(value: String): Self = this.set("polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangle(value: String): Self = this.set("rectangle", value.asInstanceOf[js.Any])
  }
}
