package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object highchartsMod {
  type AreaSplineChart = AreaChart
  type AreaSplineRangeChart = AreaRangeChart
  /**
    * Type equivalent to the 'Color' type mentioned throughout the documentation.
    */
  type Color = java.lang.String | Gradient
  type ColumnChart = BarChart
  type DataSeriesMapping = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type DateFormatSpecifiers = org.scalablytyped.runtime.StringDictionary[js.Function1[/* timestamp */ scala.Double, java.lang.String]]
}
