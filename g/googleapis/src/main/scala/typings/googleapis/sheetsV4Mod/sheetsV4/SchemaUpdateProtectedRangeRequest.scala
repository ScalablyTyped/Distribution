package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates an existing protected range with the specified protectedRangeId.
  */
@js.native
trait SchemaUpdateProtectedRangeRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `protectedRange` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The protected range to update with the new properties.
    */
  var protectedRange: js.UndefOr[SchemaProtectedRange] = js.native
}

object SchemaUpdateProtectedRangeRequest {
  @scala.inline
  def apply(): SchemaUpdateProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateProtectedRangeRequest]
  }
  @scala.inline
  implicit class SchemaUpdateProtectedRangeRequestOps[Self <: SchemaUpdateProtectedRangeRequest] (val x: Self) extends AnyVal {
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setProtectedRange(value: SchemaProtectedRange): Self = this.set("protectedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtectedRange: Self = this.set("protectedRange", js.undefined)
  }
  
}

