package typings.mapboxGl.anon

import typings.mapboxGl.mod.PositionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FitBoundsOptions extends js.Object {
  
  var fitBoundsOptions: js.UndefOr[typings.mapboxGl.mod.FitBoundsOptions] = js.native
  
  var positionOptions: js.UndefOr[PositionOptions] = js.native
  
  var showAccuracyCircle: js.UndefOr[Boolean] = js.native
  
  var showUserLocation: js.UndefOr[Boolean] = js.native
  
  var trackUserLocation: js.UndefOr[Boolean] = js.native
}
object FitBoundsOptions {
  
  @scala.inline
  def apply(): FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitBoundsOptions]
  }
  
  @scala.inline
  implicit class FitBoundsOptionsOps[Self <: FitBoundsOptions] (val x: Self) extends AnyVal {
    
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
    def setFitBoundsOptions(value: typings.mapboxGl.mod.FitBoundsOptions): Self = this.set("fitBoundsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitBoundsOptions: Self = this.set("fitBoundsOptions", js.undefined)
    
    @scala.inline
    def setPositionOptions(value: PositionOptions): Self = this.set("positionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionOptions: Self = this.set("positionOptions", js.undefined)
    
    @scala.inline
    def setShowAccuracyCircle(value: Boolean): Self = this.set("showAccuracyCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAccuracyCircle: Self = this.set("showAccuracyCircle", js.undefined)
    
    @scala.inline
    def setShowUserLocation(value: Boolean): Self = this.set("showUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowUserLocation: Self = this.set("showUserLocation", js.undefined)
    
    @scala.inline
    def setTrackUserLocation(value: Boolean): Self = this.set("trackUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackUserLocation: Self = this.set("trackUserLocation", js.undefined)
  }
}
