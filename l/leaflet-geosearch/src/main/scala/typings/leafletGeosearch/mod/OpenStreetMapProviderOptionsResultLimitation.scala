package typings.leafletGeosearch.mod

import typings.leafletGeosearch.leafletGeosearchNumbers.`0`
import typings.leafletGeosearch.leafletGeosearchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenStreetMapProviderOptionsResultLimitation extends js.Object {
  
  var bounded: js.UndefOr[`0` | `1`] = js.native
  
  var countrycodes: js.UndefOr[String] = js.native
  
  var exclude_place_ids: js.UndefOr[String] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var viewbox: js.UndefOr[String] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
}
object OpenStreetMapProviderOptionsResultLimitation {
  
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsResultLimitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsResultLimitation]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderOptionsResultLimitationOps[Self <: OpenStreetMapProviderOptionsResultLimitation] (val x: Self) extends AnyVal {
    
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
    def setBounded(value: `0` | `1`): Self = this.set("bounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounded: Self = this.set("bounded", js.undefined)
    
    @scala.inline
    def setCountrycodes(value: String): Self = this.set("countrycodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountrycodes: Self = this.set("countrycodes", js.undefined)
    
    @scala.inline
    def setExclude_place_ids(value: String): Self = this.set("exclude_place_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude_place_ids: Self = this.set("exclude_place_ids", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setViewbox(value: String): Self = this.set("viewbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewbox: Self = this.set("viewbox", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
