package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionPostalCodeArea extends js.Object {
  
  /** Required. A range of postal codes. */
  var postalCodes: js.UndefOr[js.Array[RegionPostalCodeAreaPostalCodeRange]] = js.native
  
  /** Required. CLDR territory code or the country the postal code group applies to. */
  var regionCode: js.UndefOr[String] = js.native
}
object RegionPostalCodeArea {
  
  @scala.inline
  def apply(): RegionPostalCodeArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionPostalCodeArea]
  }
  
  @scala.inline
  implicit class RegionPostalCodeAreaOps[Self <: RegionPostalCodeArea] (val x: Self) extends AnyVal {
    
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
    def setPostalCodesVarargs(value: RegionPostalCodeAreaPostalCodeRange*): Self = this.set("postalCodes", js.Array(value :_*))
    
    @scala.inline
    def setPostalCodes(value: js.Array[RegionPostalCodeAreaPostalCodeRange]): Self = this.set("postalCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCodes: Self = this.set("postalCodes", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
  }
}
