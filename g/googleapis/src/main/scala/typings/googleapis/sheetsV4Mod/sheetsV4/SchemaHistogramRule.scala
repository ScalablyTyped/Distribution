package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows you to organize the numeric values in a source data column into
  * buckets of a constant size. All values from HistogramRule.start to
  * HistogramRule.end are placed into groups of size HistogramRule.interval. In
  * addition, all values below HistogramRule.start are placed in one group, and
  * all values above HistogramRule.end are placed in another. Only
  * HistogramRule.interval is required, though if HistogramRule.start and
  * HistogramRule.end are both provided, HistogramRule.start must be less than
  * HistogramRule.end. For example, a pivot table showing average purchase
  * amount by age that has 50+ rows:      +-----+-------------------+     | Age
  * | AVERAGE of Amount |     +-----+-------------------+     | 16  | $27.13 |
  * | 17  |             $5.24 |     | 18  |            $20.15 |     ...
  * +-----+-------------------+ could be turned into a pivot table that looks
  * like the one below by applying a histogram group rule with a
  * HistogramRule.start of 25, an HistogramRule.interval of 20, and an
  * HistogramRule.end of 65.      +-------------+-------------------+     |
  * Grouped Age | AVERAGE of Amount |     +-------------+-------------------+
  * | &lt; 25        |            $19.34 |     | 25-45       | $31.43 |     |
  * 45-65       |            $35.87 |     | &gt; 65        |            $27.55
  * |     +-------------+-------------------+     | Grand Total | $29.12 |
  * +-------------+-------------------+
  */
@js.native
trait SchemaHistogramRule extends js.Object {
  
  /**
    * The maximum value at which items are placed into buckets of constant
    * size. Values above end are lumped into a single bucket. This field is
    * optional.
    */
  var end: js.UndefOr[Double] = js.native
  
  /**
    * The size of the buckets that are created. Must be positive.
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * The minimum value at which items are placed into buckets of constant
    * size. Values below start are lumped into a single bucket. This field is
    * optional.
    */
  var start: js.UndefOr[Double] = js.native
}
object SchemaHistogramRule {
  
  @scala.inline
  def apply(): SchemaHistogramRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramRule]
  }
  
  @scala.inline
  implicit class SchemaHistogramRuleOps[Self <: SchemaHistogramRule] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
