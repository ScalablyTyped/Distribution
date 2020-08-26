package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates properties of the supplied banded range.
  */
@js.native
trait SchemaUpdateBandingRequest extends js.Object {
  /**
    * The banded range to update with the new properties.
    */
  var bandedRange: js.UndefOr[SchemaBandedRange] = js.native
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `bandedRange` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
}

object SchemaUpdateBandingRequest {
  @scala.inline
  def apply(): SchemaUpdateBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateBandingRequest]
  }
  @scala.inline
  implicit class SchemaUpdateBandingRequestOps[Self <: SchemaUpdateBandingRequest] (val x: Self) extends AnyVal {
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
    def setBandedRange(value: SchemaBandedRange): Self = this.set("bandedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandedRange: Self = this.set("bandedRange", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

