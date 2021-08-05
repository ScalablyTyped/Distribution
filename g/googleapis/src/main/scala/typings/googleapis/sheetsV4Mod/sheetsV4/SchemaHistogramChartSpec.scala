package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A &lt;a
  * href=&quot;/chart/interactive/docs/gallery/histogram&quot;&gt;histogram
  * chart&lt;/a&gt;. A histogram chart groups data items into bins, displaying
  * each bin as a column of stacked items.  Histograms are used to display the
  * distribution of a dataset.  Each column of items represents a range into
  * which those items fall.  The number of bins can be chosen automatically or
  * specified explicitly.
  */
trait SchemaHistogramChartSpec extends StObject {
  
  /**
    * By default the bucket size (the range of values stacked in a single
    * column) is chosen automatically, but it may be overridden here. E.g., A
    * bucket size of 1.5 results in buckets from 0 - 1.5, 1.5 - 3.0, etc.
    * Cannot be negative. This field is optional.
    */
  var bucketSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The position of the chart legend.
    */
  var legendPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The outlier percentile is used to ensure that outliers do not adversely
    * affect the calculation of bucket sizes.  For example, setting an outlier
    * percentile of 0.05 indicates that the top and bottom 5% of values when
    * calculating buckets.  The values are still included in the chart, they
    * will be added to the first or last buckets instead of their own buckets.
    * Must be between 0.0 and 0.5.
    */
  var outlierPercentile: js.UndefOr[Double] = js.undefined
  
  /**
    * The series for a histogram may be either a single series of values to be
    * bucketed or multiple series, each of the same length, containing the name
    * of the series followed by the values to be bucketed for that series.
    */
  var series: js.UndefOr[js.Array[SchemaHistogramSeries]] = js.undefined
  
  /**
    * Whether horizontal divider lines should be displayed between items in
    * each column.
    */
  var showItemDividers: js.UndefOr[Boolean] = js.undefined
}
object SchemaHistogramChartSpec {
  
  inline def apply(): SchemaHistogramChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramChartSpec]
  }
  
  extension [Self <: SchemaHistogramChartSpec](x: Self) {
    
    inline def setBucketSize(value: Double): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    inline def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    inline def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    inline def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    inline def setOutlierPercentile(value: Double): Self = StObject.set(x, "outlierPercentile", value.asInstanceOf[js.Any])
    
    inline def setOutlierPercentileUndefined: Self = StObject.set(x, "outlierPercentile", js.undefined)
    
    inline def setSeries(value: js.Array[SchemaHistogramSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: SchemaHistogramSeries*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    inline def setShowItemDividers(value: Boolean): Self = StObject.set(x, "showItemDividers", value.asInstanceOf[js.Any])
    
    inline def setShowItemDividersUndefined: Self = StObject.set(x, "showItemDividers", js.undefined)
  }
}
