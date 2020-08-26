package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number format of a cell.
  */
@js.native
trait SchemaNumberFormat extends js.Object {
  /**
    * Pattern string used for formatting.  If not set, a default pattern based
    * on the user&#39;s locale will be used if necessary for the given type.
    * See the [Date and Number Formats guide](/sheets/api/guides/formats) for
    * more information about the supported patterns.
    */
  var pattern: js.UndefOr[String] = js.native
  /**
    * The type of the number format. When writing, this field must be set.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaNumberFormat {
  @scala.inline
  def apply(): SchemaNumberFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNumberFormat]
  }
  @scala.inline
  implicit class SchemaNumberFormatOps[Self <: SchemaNumberFormat] (val x: Self) extends AnyVal {
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
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

