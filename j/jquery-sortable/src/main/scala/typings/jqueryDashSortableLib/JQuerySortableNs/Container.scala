package typings
package jqueryDashSortableLib.JQuerySortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var el: jqueryDashSortableLib.JQuery
  var group: ContainerGroup
  var handle: java.lang.String
  var itemDimensions: js.Array[Dimensions]
  var items: js.Array[stdLib.HTMLElement]
  var options: Options
  var rootGroup: ContainerGroup
  var target: jqueryDashSortableLib.JQuery
}

object Container {
  @scala.inline
  def apply(
    el: jqueryDashSortableLib.JQuery,
    group: ContainerGroup,
    handle: java.lang.String,
    itemDimensions: js.Array[Dimensions],
    items: js.Array[stdLib.HTMLElement],
    options: Options,
    rootGroup: ContainerGroup,
    target: jqueryDashSortableLib.JQuery
  ): Container = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("el")(el)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("handle")(handle)
    __obj.updateDynamic("itemDimensions")(itemDimensions)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("rootGroup")(rootGroup)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Container]
  }
}

