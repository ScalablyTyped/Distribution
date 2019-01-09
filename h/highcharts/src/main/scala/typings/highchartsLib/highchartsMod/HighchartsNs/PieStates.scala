package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- highchartsLib.highchartsMod.HighchartsNs.LineStates because var conflicts: enabled, halo. Inlined animation, lineWidth, lineWidthPlus, marker */ trait PieStates extends BarStates {
  /**
    * Animation setting for hovering the graph in line-type series.
    * @default { "duration": 50 }
    * @since 5.0.8
    */
  var animation: js.UndefOr[scala.Boolean | Animation] = js.undefined
  /**
    * Pixel with of the graph line.
    * @default 2
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The additional line width for the graph of a hovered series.
    * @default 1
    * @since 4.0.3
    */
  var lineWidthPlus: js.UndefOr[scala.Double] = js.undefined
  var marker: js.UndefOr[Marker] = js.undefined
}

