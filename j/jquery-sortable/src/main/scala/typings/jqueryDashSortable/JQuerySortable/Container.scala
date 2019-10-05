package typings.jqueryDashSortable.JQuerySortable

import typings.jqueryDashSortable.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var el: JQuery
  var group: ContainerGroup
  var handle: String
  var itemDimensions: js.Array[Dimensions]
  var items: js.Array[HTMLElement]
  var options: Options
  var rootGroup: ContainerGroup
  var target: JQuery
}

object Container {
  @scala.inline
  def apply(
    el: JQuery,
    group: ContainerGroup,
    handle: String,
    itemDimensions: js.Array[Dimensions],
    items: js.Array[HTMLElement],
    options: Options,
    rootGroup: ContainerGroup,
    target: JQuery
  ): Container = {
    val __obj = js.Dynamic.literal(el = el, group = group, handle = handle, itemDimensions = itemDimensions, items = items, options = options, rootGroup = rootGroup, target = target)
  
    __obj.asInstanceOf[Container]
  }
}

