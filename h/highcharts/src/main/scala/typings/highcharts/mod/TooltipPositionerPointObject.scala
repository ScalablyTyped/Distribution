package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipPositionerPointObject extends Point {
  
  /**
    * If `tooltip.split` option is enabled and positioner is called for each of
    * the boxes separately, this property indicates the call on the xAxis
    * header, which is not a point itself.
    */
  var isHeader: Boolean = js.native
  
  /**
    * The reference point relative to the plot area. Add chart.plotLeft to get
    * the full coordinates.
    */
  var plotX: Double = js.native
  
  /**
    * The reference point relative to the plot area. Add chart.plotTop to get
    * the full coordinates.
    */
  var plotY: Double = js.native
}
