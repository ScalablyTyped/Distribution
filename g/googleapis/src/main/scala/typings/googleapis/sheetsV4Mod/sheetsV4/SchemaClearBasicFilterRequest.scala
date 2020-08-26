package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Clears the basic filter, if any exists on the sheet.
  */
@js.native
trait SchemaClearBasicFilterRequest extends js.Object {
  /**
    * The sheet ID on which the basic filter should be cleared.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object SchemaClearBasicFilterRequest {
  @scala.inline
  def apply(): SchemaClearBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClearBasicFilterRequest]
  }
  @scala.inline
  implicit class SchemaClearBasicFilterRequestOps[Self <: SchemaClearBasicFilterRequest] (val x: Self) extends AnyVal {
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
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
  }
  
}

