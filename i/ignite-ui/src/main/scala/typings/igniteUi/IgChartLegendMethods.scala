package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgChartLegendMethods extends js.Object {
  def destroy(): Unit = js.native
  def getLegend(): Unit = js.native
  /**
    * Returns the ID of the parent div element bounding the ruler and the tooltip container
    */
  def id(): String = js.native
}

object IgChartLegendMethods {
  @scala.inline
  def apply(destroy: () => Unit, getLegend: () => Unit, id: () => String): IgChartLegendMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getLegend = js.Any.fromFunction0(getLegend), id = js.Any.fromFunction0(id))
    __obj.asInstanceOf[IgChartLegendMethods]
  }
  @scala.inline
  implicit class IgChartLegendMethodsOps[Self <: IgChartLegendMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLegend(value: () => Unit): Self = this.set("getLegend", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: () => String): Self = this.set("id", js.Any.fromFunction0(value))
  }
  
}

