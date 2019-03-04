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
    val __obj = js.Dynamic.literal(el = el, group = group, handle = handle, itemDimensions = itemDimensions, items = items, options = options, rootGroup = rootGroup, target = target)
  
    __obj.asInstanceOf[Container]
  }
}

