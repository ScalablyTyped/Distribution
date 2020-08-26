package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The holds for a matter.
  */
@js.native
trait SchemaListExportsResponse extends js.Object {
  /**
    * The list of exports.
    */
  var exports: js.UndefOr[js.Array[SchemaExport]] = js.native
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListExportsResponse {
  @scala.inline
  def apply(): SchemaListExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListExportsResponse]
  }
  @scala.inline
  implicit class SchemaListExportsResponseOps[Self <: SchemaListExportsResponse] (val x: Self) extends AnyVal {
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
    def setExportsVarargs(value: SchemaExport*): Self = this.set("exports", js.Array(value :_*))
    @scala.inline
    def setExports(value: js.Array[SchemaExport]): Self = this.set("exports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExports: Self = this.set("exports", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

