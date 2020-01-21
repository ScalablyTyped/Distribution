package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An optional setting on a PivotGroup that defines buckets for the values in
  * the source data column rather than breaking out each individual value. Only
  * one PivotGroup with a group rule may be added for each column in the source
  * data, though on any given column you may add both a PivotGroup that has a
  * rule and a PivotGroup that does not.
  */
@js.native
trait SchemaPivotGroupRule extends js.Object {
  /**
    * A DateTimeRule.
    */
  var dateTimeRule: js.UndefOr[SchemaDateTimeRule] = js.native
  /**
    * A HistogramRule.
    */
  var histogramRule: js.UndefOr[SchemaHistogramRule] = js.native
  /**
    * A ManualRule.
    */
  var manualRule: js.UndefOr[SchemaManualRule] = js.native
}

object SchemaPivotGroupRule {
  @scala.inline
  def apply(
    dateTimeRule: SchemaDateTimeRule = null,
    histogramRule: SchemaHistogramRule = null,
    manualRule: SchemaManualRule = null
  ): SchemaPivotGroupRule = {
    val __obj = js.Dynamic.literal()
    if (dateTimeRule != null) __obj.updateDynamic("dateTimeRule")(dateTimeRule.asInstanceOf[js.Any])
    if (histogramRule != null) __obj.updateDynamic("histogramRule")(histogramRule.asInstanceOf[js.Any])
    if (manualRule != null) __obj.updateDynamic("manualRule")(manualRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPivotGroupRule]
  }
}

