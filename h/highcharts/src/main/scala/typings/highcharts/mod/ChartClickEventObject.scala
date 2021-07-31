package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartClickEventObject
  extends StObject
     with PointerEventObject {
  
  /**
    * Information about the x-axis on the clicked spot.
    */
  var xAxis: js.Array[ChartClickEventAxisObject] = js.native
  
  /**
    * Information about the y-axis on the clicked spot.
    */
  var yAxis: js.Array[ChartClickEventAxisObject] = js.native
  
  /**
    * Information about the z-axis on the clicked spot.
    */
  var zAxis: js.UndefOr[js.Array[ChartClickEventAxisObject]] = js.native
}
