package typings.heremaps.H.service.Platform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used to create default layers
  * @property tileSize {number=} - tile size to be queried from the HERE Map Tile API, default is 256
  * @property ppi {number=} - 'ppi' parameter to use when querying tiles, default is not specified
  * @property lg {string=} - optional primary language parameter, default is not specified
  * @property lg2 {string=} - optional secondary language parameter, default is not specified
  * @property style {string=} - optional 'style' parameter to use when querying map tiles, default is not specified
  * @property pois {boolean=} - indicates if pois are displayed on the map
  * @property crossOrigin {(string | boolean=)} - indicates if CORS headers should be used for default layers, if false is specified, CORS headers are not set, defaults to 'anonymous'.
  * Be aware that storing of content is not possible if crossOrigin is not set to true (see H.Map#storeContent).
  */
@js.native
trait DefaultLayersOptions extends js.Object {
  
  var crossOrigin: js.UndefOr[String | Boolean] = js.native
  
  var lg: js.UndefOr[String] = js.native
  
  var lg2: js.UndefOr[String] = js.native
  
  var pois: js.UndefOr[Boolean] = js.native
  
  var ppi: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var tileSize: js.UndefOr[Double] = js.native
}
object DefaultLayersOptions {
  
  @scala.inline
  def apply(): DefaultLayersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultLayersOptions]
  }
  
  @scala.inline
  implicit class DefaultLayersOptionsOps[Self <: DefaultLayersOptions] (val x: Self) extends AnyVal {
    
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
    def setCrossOrigin(value: String | Boolean): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    
    @scala.inline
    def setLg(value: String): Self = this.set("lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLg: Self = this.set("lg", js.undefined)
    
    @scala.inline
    def setLg2(value: String): Self = this.set("lg2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLg2: Self = this.set("lg2", js.undefined)
    
    @scala.inline
    def setPois(value: Boolean): Self = this.set("pois", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePois: Self = this.set("pois", js.undefined)
    
    @scala.inline
    def setPpi(value: Double): Self = this.set("ppi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePpi: Self = this.set("ppi", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
  }
}
