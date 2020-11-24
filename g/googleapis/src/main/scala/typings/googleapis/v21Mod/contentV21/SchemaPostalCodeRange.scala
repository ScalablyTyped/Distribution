package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPostalCodeRange extends js.Object {
  
  /**
    * A postal code or a pattern of the form prefix* denoting the inclusive
    * lower bound of the range defining the area. Examples values:
    * &quot;94108&quot;, &quot;9410*&quot;, &quot;9*&quot;. Required.
    */
  var postalCodeRangeBegin: js.UndefOr[String] = js.native
  
  /**
    * A postal code or a pattern of the form prefix* denoting the inclusive
    * upper bound of the range defining the area. It must have the same length
    * as postalCodeRangeBegin: if postalCodeRangeBegin is a postal code then
    * postalCodeRangeEnd must be a postal code too; if postalCodeRangeBegin is
    * a pattern then postalCodeRangeEnd must be a pattern with the same prefix
    * length. Optional: if not set, then the area is defined as being all the
    * postal codes matching postalCodeRangeBegin.
    */
  var postalCodeRangeEnd: js.UndefOr[String] = js.native
}
object SchemaPostalCodeRange {
  
  @scala.inline
  def apply(): SchemaPostalCodeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalCodeRange]
  }
  
  @scala.inline
  implicit class SchemaPostalCodeRangeOps[Self <: SchemaPostalCodeRange] (val x: Self) extends AnyVal {
    
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
    def setPostalCodeRangeBegin(value: String): Self = this.set("postalCodeRangeBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCodeRangeBegin: Self = this.set("postalCodeRangeBegin", js.undefined)
    
    @scala.inline
    def setPostalCodeRangeEnd(value: String): Self = this.set("postalCodeRangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCodeRangeEnd: Self = this.set("postalCodeRangeEnd", js.undefined)
  }
}
