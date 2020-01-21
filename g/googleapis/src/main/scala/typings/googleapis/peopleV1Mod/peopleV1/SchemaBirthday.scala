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
  def apply(date: SchemaDate = null, metadata: SchemaFieldMetadata = null, text: String = null): SchemaBirthday = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBirthday]
  }
}

