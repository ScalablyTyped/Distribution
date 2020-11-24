package typings.leafletPolylinedecorator.mod.Symbol

import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowHeadOptions extends js.Object {
  
  var headAngle: js.UndefOr[Double] = js.native
  
  var pathOptions: js.UndefOr[PathOptions] = js.native
  
  var pixelSize: js.UndefOr[Double] = js.native
  
  var polygon: js.UndefOr[Boolean] = js.native
}
object ArrowHeadOptions {
  
  @scala.inline
  def apply(): ArrowHeadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowHeadOptions]
  }
  
  @scala.inline
  implicit class ArrowHeadOptionsOps[Self <: ArrowHeadOptions] (val x: Self) extends AnyVal {
    
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
    def setHeadAngle(value: Double): Self = this.set("headAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadAngle: Self = this.set("headAngle", js.undefined)
    
    @scala.inline
    def setPathOptions(value: PathOptions): Self = this.set("pathOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathOptions: Self = this.set("pathOptions", js.undefined)
    
    @scala.inline
    def setPixelSize(value: Double): Self = this.set("pixelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelSize: Self = this.set("pixelSize", js.undefined)
    
    @scala.inline
    def setPolygon(value: Boolean): Self = this.set("polygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygon: Self = this.set("polygon", js.undefined)
  }
}
