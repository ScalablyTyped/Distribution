package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait SchemaHistogramRule extends StObject {
  
  /**
    * The maximum value at which items are placed into buckets of constant
    * size. Values above end are lumped into a single bucket. This field is
    * optional.
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    * The size of the buckets that are created. Must be positive.
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum value at which items are placed into buckets of constant
    * size. Values below start are lumped into a single bucket. This field is
    * optional.
    */
  var start: js.UndefOr[Double] = js.undefined
}
object SchemaHistogramRule {
  
  @scala.inline
  def apply(): SchemaHistogramRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramRule]
  }
  
  @scala.inline
  implicit class SchemaHistogramRuleMutableBuilder[Self <: SchemaHistogramRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
