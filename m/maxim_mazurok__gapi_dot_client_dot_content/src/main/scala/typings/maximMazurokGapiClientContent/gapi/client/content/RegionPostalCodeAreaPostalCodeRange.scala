package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionPostalCodeAreaPostalCodeRange extends js.Object {
  
  /** Required. A postal code or a pattern of the form prefix* denoting the inclusive lower bound of the range defining the area. Examples values: "94108", "9410*", "9*". */
  var begin: js.UndefOr[String] = js.native
  
  /**
    * Optional. A postal code or a pattern of the form prefix* denoting the inclusive upper bound of the range defining the area. It must have the same length as postalCodeRangeBegin: if
    * postalCodeRangeBegin is a postal code then postalCodeRangeEnd must be a postal code too; if postalCodeRangeBegin is a pattern then postalCodeRangeEnd must be a pattern with the same
    * prefix length. Optional: if not set, then the area is defined as being all the postal codes matching postalCodeRangeBegin.
    */
  var end: js.UndefOr[String] = js.native
}
object RegionPostalCodeAreaPostalCodeRange {
  
  @scala.inline
  def apply(): RegionPostalCodeAreaPostalCodeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionPostalCodeAreaPostalCodeRange]
  }
  
  @scala.inline
  implicit class RegionPostalCodeAreaPostalCodeRangeOps[Self <: RegionPostalCodeAreaPostalCodeRange] (val x: Self) extends AnyVal {
    
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
    def setBegin(value: String): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
  }
}
