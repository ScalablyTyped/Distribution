package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s birthday. At least one of the `date` and `text` fields are
  * specified. The `date` and `text` fields typically represent the same date,
  * but are not guaranteed to.
  */
@js.native
trait SchemaBirthday extends js.Object {
  /**
    * The date of the birthday.
    */
  var date: js.UndefOr[SchemaDate] = js.native
  /**
    * Metadata about the birthday.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * A free-form string representing the user&#39;s birthday.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaBirthday {
  @scala.inline
  def apply(): SchemaBirthday = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBirthday]
  }
  @scala.inline
  implicit class SchemaBirthdayOps[Self <: SchemaBirthday] (val x: Self) extends AnyVal {
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
    def setDate(value: SchemaDate): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

