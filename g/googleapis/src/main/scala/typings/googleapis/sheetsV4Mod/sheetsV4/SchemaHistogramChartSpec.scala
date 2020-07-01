package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A &lt;a
  * href=&quot;/chart/interactive/docs/gallery/histogram&quot;&gt;histogram
  * chart&lt;/a&gt;. A histogram chart groups data items into bins, displaying
  * each bin as a column of stacked items.  Histograms are used to display the
  * distribution of a dataset.  Each column of items represents a range into
  * which those items fall.  The number of bins can be chosen automatically or
  * specified explicitly.
  */
@js.native
trait SchemaHistogramChartSpec extends js.Object {
  /**
    * By default the bucket size (the range of values stacked in a single
    * column) is chosen automatically, but it may be overridden here. E.g., A
    * bucket size of 1.5 results in buckets from 0 - 1.5, 1.5 - 3.0, etc.
    * Cannot be negative. This field is optional.
    */
  var bucketSize: js.UndefOr[Double] = js.native
  /**
    * The position of the chart legend.
    */
  var legendPosition: js.UndefOr[String] = js.native
  /**
    * The outlier percentile is used to ensure that outliers do not adversely
    * affect the calculation of bucket sizes.  For example, setting an outlier
    * percentile of 0.05 indicates that the top and bottom 5% of values when
    * calculating buckets.  The values are still included in the chart, they
    * will be added to the first or last buckets instead of their own buckets.
    * Must be between 0.0 and 0.5.
    */
  var outlierPercentile: js.UndefOr[Double] = js.native
  /**
    * The series for a histogram may be either a single series of values to be
    * bucketed or multiple series, each of the same length, containing the name
    * of the series followed by the values to be bucketed for that series.
    */
  var series: js.UndefOr[js.Array[SchemaHistogramSeries]] = js.native
  /**
    * Whether horizontal divider lines should be displayed between items in
    * each column.
    */
  var showItemDividers: js.UndefOr[Boolean] = js.native
}

object SchemaHistogramChartSpec {
  @scala.inline
  def apply(
    bucketSize: js.UndefOr[Double] = js.undefined,
    legendPosition: String = null,
    outlierPercentile: js.UndefOr[Double] = js.undefined,
    series: js.Array[SchemaHistogramSeries] = null,
    showItemDividers: js.UndefOr[Boolean] = js.undefined
  ): SchemaHistogramChartSpec = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bucketSize)) __obj.updateDynamic("bucketSize")(bucketSize.get.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(outlierPercentile)) __obj.updateDynamic("outlierPercentile")(outlierPercentile.get.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (!js.isUndefined(showItemDividers)) __obj.updateDynamic("showItemDividers")(showItemDividers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHistogramChartSpec]
  }
}

