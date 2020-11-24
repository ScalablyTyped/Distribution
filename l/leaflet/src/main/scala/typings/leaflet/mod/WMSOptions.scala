package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMSOptions extends TileLayerOptions {
  
  var crs: js.UndefOr[CRS] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var layers: js.UndefOr[String] = js.native
  
  var styles: js.UndefOr[String] = js.native
  
  var transparent: js.UndefOr[Boolean] = js.native
  
  var uppercase: js.UndefOr[Boolean] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object WMSOptions {
  
  @scala.inline
  def apply(): WMSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMSOptions]
  }
  
  @scala.inline
  implicit class WMSOptionsOps[Self <: WMSOptions] (val x: Self) extends AnyVal {
    
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
    def setCrs(value: CRS): Self = this.set("crs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrs: Self = this.set("crs", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLayers(value: String): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setStyles(value: String): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    
    @scala.inline
    def setUppercase(value: Boolean): Self = this.set("uppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUppercase: Self = this.set("uppercase", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
