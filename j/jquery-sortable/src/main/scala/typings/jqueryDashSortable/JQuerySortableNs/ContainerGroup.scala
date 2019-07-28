package typings.jqueryDashSortable.JQuerySortableNs

import typings.jqueryDashSortable.Anon_Bottom
import typings.jqueryDashSortable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerGroup extends js.Object {
  @JSName("$document")
  var $document: JQuery
  var containerDimensions: js.Array[Dimensions]
  var containers: js.Array[Container]
  var delayMet: Boolean
  var dragInitDone: Boolean
  var dragProxy: js.Any
  var dragging: Boolean
  var dropProxy: js.Any
  var item: JQuery
  var itemContainer: Container
  var lastAppendedItem: JQuery
  var lastPointer: Position
  var lastRelativePointer: Position
  var offsetParent: JQuery
  var options: Options
  var placeholder: JQuery
  var pointer: Position
  var relativePointer: Position
  var sameResultBox: Anon_Bottom
  var scrollProxy: js.Any
}

object ContainerGroup {
  @scala.inline
  def apply(
    $document: JQuery,
    containerDimensions: js.Array[Dimensions],
    containers: js.Array[Container],
    delayMet: Boolean,
    dragInitDone: Boolean,
    dragProxy: js.Any,
    dragging: Boolean,
    dropProxy: js.Any,
    item: JQuery,
    itemContainer: Container,
    lastAppendedItem: JQuery,
    lastPointer: Position,
    lastRelativePointer: Position,
    offsetParent: JQuery,
    options: Options,
    placeholder: JQuery,
    pointer: Position,
    relativePointer: Position,
    sameResultBox: Anon_Bottom,
    scrollProxy: js.Any
  ): ContainerGroup = {
    val __obj = js.Dynamic.literal($document = $document, containerDimensions = containerDimensions, containers = containers, delayMet = delayMet, dragInitDone = dragInitDone, dragProxy = dragProxy, dragging = dragging, dropProxy = dropProxy, item = item, itemContainer = itemContainer, lastAppendedItem = lastAppendedItem, lastPointer = lastPointer, lastRelativePointer = lastRelativePointer, offsetParent = offsetParent, options = options, placeholder = placeholder, pointer = pointer, relativePointer = relativePointer, sameResultBox = sameResultBox, scrollProxy = scrollProxy)
  
    __obj.asInstanceOf[ContainerGroup]
  }
}

