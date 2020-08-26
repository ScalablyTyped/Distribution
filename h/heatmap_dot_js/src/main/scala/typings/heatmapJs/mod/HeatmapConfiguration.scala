package typings.heatmapJs.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapConfiguration[V /* <: String */, X /* <: String */, Y /* <: String */] extends BaseHeatmapConfiguration[V] {
  /**
    * A DOM node where the heatmap canvas should be appended (heatmap will adapt to
    * the node's size)
    */
  var container: HTMLElement = js.native
  /**
    * The property name of your x coordinate in a datapoint
    * Default value: 'x'
    */
  var xField: js.UndefOr[X] = js.native
  /**
    * The property name of your y coordinate in a datapoint
    * Default value: 'y'
    */
  var yField: js.UndefOr[Y] = js.native
}

object HeatmapConfiguration {
  @scala.inline
  def apply[/* <: java.lang.String */ V, /* <: java.lang.String */ X, /* <: java.lang.String */ Y](container: HTMLElement): HeatmapConfiguration[V, X, Y] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapConfiguration[V, X, Y]]
  }
  @scala.inline
  implicit class HeatmapConfigurationOps[Self <: HeatmapConfiguration[_, _, _], /* <: java.lang.String */ V, /* <: java.lang.String */ X, /* <: java.lang.String */ Y] (val x: Self with (HeatmapConfiguration[V, X, Y])) extends AnyVal {
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
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setXField(value: X): Self = this.set("xField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXField: Self = this.set("xField", js.undefined)
    @scala.inline
    def setYField(value: Y): Self = this.set("yField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYField: Self = this.set("yField", js.undefined)
  }
  
}

