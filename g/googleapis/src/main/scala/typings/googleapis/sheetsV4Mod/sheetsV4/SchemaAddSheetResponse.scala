package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a sheet.
  */
@js.native
trait SchemaAddSheetResponse extends js.Object {
  /**
    * The properties of the newly added sheet.
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.native
}

object SchemaAddSheetResponse {
  @scala.inline
  def apply(): SchemaAddSheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddSheetResponse]
  }
  @scala.inline
  implicit class SchemaAddSheetResponseOps[Self <: SchemaAddSheetResponse] (val x: Self) extends AnyVal {
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
    def setProperties(value: SchemaSheetProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

