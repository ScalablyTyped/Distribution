package typings.leafletGeosearch.mod

import typings.leafletGeosearch.leafletGeosearchNumbers.`0`
import typings.leafletGeosearch.leafletGeosearchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenStreetMapProviderOptionsOutputDetails extends js.Object {
  
  var addressdetails: js.UndefOr[`0` | `1`] = js.native
  
  var extratags: js.UndefOr[`0` | `1`] = js.native
  
  var namedetails: js.UndefOr[`0` | `1`] = js.native
}
object OpenStreetMapProviderOptionsOutputDetails {
  
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsOutputDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsOutputDetails]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderOptionsOutputDetailsOps[Self <: OpenStreetMapProviderOptionsOutputDetails] (val x: Self) extends AnyVal {
    
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
    def setAddressdetails(value: `0` | `1`): Self = this.set("addressdetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressdetails: Self = this.set("addressdetails", js.undefined)
    
    @scala.inline
    def setExtratags(value: `0` | `1`): Self = this.set("extratags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtratags: Self = this.set("extratags", js.undefined)
    
    @scala.inline
    def setNamedetails(value: `0` | `1`): Self = this.set("namedetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedetails: Self = this.set("namedetails", js.undefined)
  }
}
