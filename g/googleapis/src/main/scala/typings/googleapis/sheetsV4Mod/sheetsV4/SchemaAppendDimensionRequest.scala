package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Appends rows or columns to the end of a sheet.
  */
@js.native
trait SchemaAppendDimensionRequest extends js.Object {
  /**
    * Whether rows or columns should be appended.
    */
  var dimension: js.UndefOr[String] = js.native
  /**
    * The number of rows or columns to append.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The sheet to append rows or columns to.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object SchemaAppendDimensionRequest {
  @scala.inline
  def apply(): SchemaAppendDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppendDimensionRequest]
  }
  @scala.inline
  implicit class SchemaAppendDimensionRequestOps[Self <: SchemaAppendDimensionRequest] (val x: Self) extends AnyVal {
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
    def setDimension(value: String): Self = this.set("dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
  }
  
}

