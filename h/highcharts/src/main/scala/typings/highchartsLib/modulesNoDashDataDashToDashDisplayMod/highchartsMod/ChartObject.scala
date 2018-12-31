package typings
package highchartsLib.modulesNoDashDataDashToDashDisplayMod.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartObject extends js.Object {
  /**
    * Returns true if there are data points within the plot area now
    * @return If chart has any data.
    * @since 3.0.8
    */
  def hasData(): scala.Boolean = js.native
  /**
    * Hide the 'No data to display' message added by the no-data-to-display plugin.
    * @since 3.0.8
    */
  def hideNoData(): scala.Unit = js.native
  /**
    * Display a no-data message.
    * @param message An optional message to show in place of the default one
    * @since 3.0.8
    */
  def showNoData(): scala.Unit = js.native
  def showNoData(message: java.lang.String): scala.Unit = js.native
}

