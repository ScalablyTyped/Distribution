package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Dimensions](https://support.google.com/analytics/answer/1033861) are
  * attributes of your data. For example, the dimension `ga:city` indicates the
  * city, for example, &quot;Paris&quot; or &quot;New York&quot;, from which a
  * session originates.
  */
trait SchemaDimension extends StObject {
  
  /**
    * If non-empty, we place dimension values into buckets after string to
    * int64. Dimension values that are not the string representation of an
    * integral value will be converted to zero.  The bucket values have to be
    * in increasing order.  Each bucket is closed on the lower end, and open on
    * the upper end. The &quot;first&quot; bucket includes all values less than
    * the first boundary, the &quot;last&quot; bucket includes all values up to
    * infinity. Dimension values that fall in a bucket get transformed to a new
    * dimension value. For example, if one gives a list of &quot;0, 1, 3, 4,
    * 7&quot;, then we return the following buckets:  - bucket #1: values &lt;
    * 0, dimension value &quot;&lt;0&quot; - bucket #2: values in [0,1),
    * dimension value &quot;0&quot; - bucket #3: values in [1,3), dimension
    * value &quot;1-2&quot; - bucket #4: values in [3,4), dimension value
    * &quot;3&quot; - bucket #5: values in [4,7), dimension value
    * &quot;4-6&quot; - bucket #6: values &gt;= 7, dimension value
    * &quot;7+&quot;  NOTE: If you are applying histogram mutation on any
    * dimension, and using that dimension in sort, you will want to use the
    * sort type `HISTOGRAM_BUCKET` for that purpose. Without that the dimension
    * values will be sorted according to dictionary (lexicographic) order. For
    * example the ascending dictionary order is:     &quot;&lt;50&quot;,
    * &quot;1001+&quot;, &quot;121-1000&quot;, &quot;50-120&quot;  And the
    * ascending `HISTOGRAM_BUCKET` order is:     &quot;&lt;50&quot;,
    * &quot;50-120&quot;, &quot;121-1000&quot;, &quot;1001+&quot;  The client
    * has to explicitly request `&quot;orderType&quot;:
    * &quot;HISTOGRAM_BUCKET&quot;` for a histogram-mutated dimension.
    */
  var histogramBuckets: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Name of the dimension to fetch, for example `ga:browser`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaDimension {
  
  inline def apply(): SchemaDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimension]
  }
  
  extension [Self <: SchemaDimension](x: Self) {
    
    inline def setHistogramBuckets(value: js.Array[String]): Self = StObject.set(x, "histogramBuckets", value.asInstanceOf[js.Any])
    
    inline def setHistogramBucketsUndefined: Self = StObject.set(x, "histogramBuckets", js.undefined)
    
    inline def setHistogramBucketsVarargs(value: String*): Self = StObject.set(x, "histogramBuckets", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
