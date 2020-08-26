package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows you to organize the date-time values in a source data column into
  * buckets based on selected parts of their date or time values. For example,
  * consider a pivot table showing sales transactions by date:
  * +----------+--------------+     | Date     | SUM of Sales |
  * +----------+--------------+     | 1/1/2017 |      $621.14 |     | 2/3/2017
  * |      $708.84 |     | 5/8/2017 |      $326.84 |     ...
  * +----------+--------------+ Applying a date-time group rule with a
  * DateTimeRuleType of YEAR_MONTH results in the following pivot table.
  * +--------------+--------------+     | Grouped Date | SUM of Sales |
  * +--------------+--------------+     | 2017-Jan     |   $53,731.78 |     |
  * 2017-Feb     |   $83,475.32 |     | 2017-Mar     |   $94,385.05 |     ...
  * +--------------+--------------+
  */
@js.native
trait SchemaDateTimeRule extends js.Object {
  /**
    * The type of date-time grouping to apply.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDateTimeRule {
  @scala.inline
  def apply(): SchemaDateTimeRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateTimeRule]
  }
  @scala.inline
  implicit class SchemaDateTimeRuleOps[Self <: SchemaDateTimeRule] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

