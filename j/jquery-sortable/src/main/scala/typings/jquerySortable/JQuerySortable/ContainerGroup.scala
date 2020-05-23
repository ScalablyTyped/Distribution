package typings.jquerySortable.JQuerySortable

import typings.jquerySortable.JQuery
import typings.jquerySortable.anon.Bottom
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
  var sameResultBox: Bottom
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
    sameResultBox: Bottom,
    scrollProxy: js.Any
  ): ContainerGroup = {
    val __obj = js.Dynamic.literal($document = $document.asInstanceOf[js.Any], containerDimensions = containerDimensions.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], delayMet = delayMet.asInstanceOf[js.Any], dragInitDone = dragInitDone.asInstanceOf[js.Any], dragProxy = dragProxy.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dropProxy = dropProxy.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemContainer = itemContainer.asInstanceOf[js.Any], lastAppendedItem = lastAppendedItem.asInstanceOf[js.Any], lastPointer = lastPointer.asInstanceOf[js.Any], lastRelativePointer = lastRelativePointer.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], relativePointer = relativePointer.asInstanceOf[js.Any], sameResultBox = sameResultBox.asInstanceOf[js.Any], scrollProxy = scrollProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerGroup]
  }
}

