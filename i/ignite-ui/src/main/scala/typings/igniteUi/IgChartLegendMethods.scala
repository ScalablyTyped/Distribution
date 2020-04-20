package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgChartLegendMethods extends js.Object {
  def destroy(): Unit
  def getLegend(): Unit
  /**
  	 * Returns the ID of the parent div element bounding the ruler and the tooltip container
  	 */
  def id(): String
}

object IgChartLegendMethods {
  @scala.inline
  def apply(destroy: () => Unit, getLegend: () => Unit, id: () => String): IgChartLegendMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getLegend = js.Any.fromFunction0(getLegend), id = js.Any.fromFunction0(id))
    __obj.asInstanceOf[IgChartLegendMethods]
  }
}

