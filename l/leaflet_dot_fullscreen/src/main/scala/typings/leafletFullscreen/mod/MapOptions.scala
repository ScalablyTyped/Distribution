package typings.leafletFullscreen.mod

import typings.leafletFullscreen.mod.Control_.FullscreenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapOptions extends js.Object {
  
  var fullscreenControl: js.UndefOr[Boolean] = js.native
  
  var fullscreenControlOptions: js.UndefOr[FullscreenOptions] = js.native
}
object MapOptions {
  
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    
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
    def setFullscreenControl(value: Boolean): Self = this.set("fullscreenControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreenControl: Self = this.set("fullscreenControl", js.undefined)
    
    @scala.inline
    def setFullscreenControlOptions(value: FullscreenOptions): Self = this.set("fullscreenControlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreenControlOptions: Self = this.set("fullscreenControlOptions", js.undefined)
  }
}
