package typings.leafletGridlayerGooglemutant.mod.gridLayer

import typings.leaflet.mod.TileLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMutantOptions extends TileLayerOptions {
  
  var continuousWorld: js.UndefOr[Boolean] = js.native
  
  /**
    * Google's map styles.
    */
  var styles: js.UndefOr[js.Array[GoogleMutantStyle]] = js.native
  
  /**
    * Google's map type. 'hybrid' is not really supported.
    */
  var `type`: js.UndefOr[GoogleMutantType] = js.native
}
object GoogleMutantOptions {
  
  @scala.inline
  def apply(): GoogleMutantOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMutantOptions]
  }
  
  @scala.inline
  implicit class GoogleMutantOptionsOps[Self <: GoogleMutantOptions] (val x: Self) extends AnyVal {
    
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
    def setContinuousWorld(value: Boolean): Self = this.set("continuousWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuousWorld: Self = this.set("continuousWorld", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: GoogleMutantStyle*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[GoogleMutantStyle]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setType(value: GoogleMutantType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
