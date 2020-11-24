package typings.leafletDraw.mod.DrawOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleMarkerOptions extends js.Object {
  
  /**
    * Whether you can click the circle marker.
    *
    * @default true
    */
  var clickable: js.UndefOr[Boolean] = js.native
  
  /**
    * The stroke color of the circle marker.
    *
    * @default '#3388ff'
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Whether to fill the circle marker with color.
    *
    * @default true
    */
  var fill: js.UndefOr[Boolean] = js.native
  
  /**
    * The fill color of the circle marker. Defaults to the value of the color option.
    *
    * @default null
    */
  var fillColor: js.UndefOr[String] = js.native
  
  /**
    * The opacity of the circle marker.
    *
    * @default 0.2
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  
  /**
    * The stroke opacity of the circle marker.
    *
    * @default 0.5
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Whether to draw stroke around the circle marker.
    *
    * @default true
    */
  var stroke: js.UndefOr[Boolean] = js.native
  
  /**
    * The stroke width in pixels of the circle marker.
    *
    * @default 4
    */
  var weight: js.UndefOr[Double] = js.native
  
  /**
    * This should be a high number to ensure that you can draw over all other layers on the map.
    *
    * @default 2000
    */
  var zIndexOffset: js.UndefOr[Double] = js.native
}
object CircleMarkerOptions {
  
  @scala.inline
  def apply(): CircleMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleMarkerOptions]
  }
  
  @scala.inline
  implicit class CircleMarkerOptionsOps[Self <: CircleMarkerOptions] (val x: Self) extends AnyVal {
    
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
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: Boolean): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    
    @scala.inline
    def setZIndexOffset(value: Double): Self = this.set("zIndexOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndexOffset: Self = this.set("zIndexOffset", js.undefined)
  }
}
