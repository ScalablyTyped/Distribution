package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocoderControlOptions
  extends typings.leaflet.mod.ControlOptions {
  
  var keepOpen: js.UndefOr[Boolean] = js.native
}
object GeocoderControlOptions {
  
  @scala.inline
  def apply(): GeocoderControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderControlOptions]
  }
  
  @scala.inline
  implicit class GeocoderControlOptionsOps[Self <: GeocoderControlOptions] (val x: Self) extends AnyVal {
    
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
    def setKeepOpen(value: Boolean): Self = this.set("keepOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepOpen: Self = this.set("keepOpen", js.undefined)
  }
}
