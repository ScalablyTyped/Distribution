package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPostalCodeGroup extends js.Object {
  /**
    * The CLDR territory code of the country the postal code group applies to.
    * Required.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The name of the postal code group, referred to in headers. Required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A range of postal codes. Required.
    */
  var postalCodeRanges: js.UndefOr[js.Array[SchemaPostalCodeRange]] = js.native
}

object SchemaPostalCodeGroup {
  @scala.inline
  def apply(): SchemaPostalCodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalCodeGroup]
  }
  @scala.inline
  implicit class SchemaPostalCodeGroupOps[Self <: SchemaPostalCodeGroup] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPostalCodeRangesVarargs(value: SchemaPostalCodeRange*): Self = this.set("postalCodeRanges", js.Array(value :_*))
    @scala.inline
    def setPostalCodeRanges(value: js.Array[SchemaPostalCodeRange]): Self = this.set("postalCodeRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCodeRanges: Self = this.set("postalCodeRanges", js.undefined)
  }
  
}

