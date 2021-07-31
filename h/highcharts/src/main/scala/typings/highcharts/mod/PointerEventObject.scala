package typings.highcharts.mod

import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerEventObject
  extends StObject
     with PointerEvent {
  
  /**
    * The X coordinate of the pointer interaction relative to the chart.
    */
  var chartX: Double = js.native
  
  /**
    * The Y coordinate of the pointer interaction relative to the chart.
    */
  var chartY: Double = js.native
}
