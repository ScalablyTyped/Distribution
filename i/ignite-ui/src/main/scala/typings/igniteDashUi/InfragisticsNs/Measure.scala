package typings.igniteDashUi.InfragisticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.Measure")
@js.native
class Measure () extends js.Object {
  /**
  	 * Returns the aggregator type that identifies how a measure was derived. It is a value from the $.ig.AggregatorType enumeration.
  	 *
  	 *             $.ig.AggregatorType.prototype.unknown = 0;
  	 *             The aggregated function is undefined.
  	 *
  	 *             $.ig.AggregatorType.prototype.sum = 1;
  	 *             The aggregated function adds all values.
  	 *
  	 *             $.ig.AggregatorType.prototype.count = 2;
  	 *             The aggregated function will count the number of the values.
  	 *
  	 *             $.ig.AggregatorType.prototype.min = 3;
  	 *             The aggregated function will returns the smallest value.
  	 *
  	 *             $.ig.AggregatorType.prototype.max = 4;
  	 *             The aggregated function will returns the largest value.
  	 *
  	 *             $.ig.AggregatorType.prototype.average = 5;
  	 *             The aggregated function will returns the average of cells value.
  	 *
  	 *             $.ig.AggregatorType.prototype.variance = 6;
  	 *             The aggregated function will estimates variance based on the sample.
  	 *
  	 *             $.ig.AggregatorType.prototype.std = 7;
  	 *             The aggregated function will estimates the standart deviation based on sample.
  	 *
  	 *             $.ig.AggregatorType.prototype.distinctCount = 8;
  	 *             The aggregated function will returns the number of distinct, nonempty tuples in a set.
  	 *
  	 *             $.ig.AggregatorType.prototype.none = 9;
  	 *             No aggregation performed.
  	 *
  	 *             $.ig.AggregatorType.prototype.averageOfChildren = 10;
  	 *             The aggregated function will returns the average of the measure's children.
  	 *
  	 *             $.ig.AggregatorType.prototype.firstNonEmpty = 13;
  	 *             The aggregated function will returns the measure's first nonempty member.
  	 *
  	 *             $.ig.AggregatorType.prototype.lastNonEmpty = 14;
  	 *             The aggregated function will returns the measure's last nonempty member.
  	 *
  	 *             $.ig.AggregatorType.prototype.byAccount = 15;
  	 *             Aggregated by the aggregation function associated with the specified account type of an attribute in an account dimension.
  	 *
  	 *             $.ig.AggregatorType.prototype.calculated = 127;
  	 *             The aggregated function will returns the result derived from a formula.
  	 *
  	 * @param value
  	 */
  def aggregatorType(value: js.Object): Double = js.native
  /**
  	 * Returns the caption of the measure used when displaying the name of the measure to the user.
  	 *
  	 * @param value
  	 */
  def caption(value: js.Object): String = js.native
  /**
  	 * Returns the default format string for the measure.
  	 *
  	 * @param value
  	 */
  def defaultFormatString(value: js.Object): String = js.native
  /**
  	 * Returns a user-friendly description of the measure.
  	 *
  	 * @param value
  	 */
  def description(value: js.Object): String = js.native
  /**
  	 * Returns the measure display folder path to be used when displaying the measure in the user interface.
  	 *             Folder names will be separated by a semicolon (;). Nested folders are indicated by a backslash (\).
  	 *
  	 * @param value
  	 */
  def measureDisplayFolder(value: js.Object): String = js.native
  /**
  	 * Returns the name of the measure group this measure belongs to.
  	 *
  	 * @param value
  	 */
  def measureGroupName(value: js.Object): String = js.native
  /**
  	 * Returns the name of the measure.
  	 *
  	 * @param value
  	 */
  def name(value: js.Object): String = js.native
  /**
  	 * Returns the unique name of the measure.
  	 *
  	 * @param value
  	 */
  def uniqueName(value: js.Object): String = js.native
}

