package typings
package jqueryDashSortableLib.JQuerySortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerGroup extends js.Object {
  @JSName("$document")
  var $document: jqueryDashSortableLib.JQuery
  var containerDimensions: js.Array[Dimensions]
  var containers: js.Array[Container]
  var delayMet: scala.Boolean
  var dragInitDone: scala.Boolean
  var dragProxy: js.Any
  var dragging: scala.Boolean
  var dropProxy: js.Any
  var item: jqueryDashSortableLib.JQuery
  var itemContainer: Container
  var lastAppendedItem: jqueryDashSortableLib.JQuery
  var lastPointer: Position
  var lastRelativePointer: Position
  var offsetParent: jqueryDashSortableLib.JQuery
  var options: Options
  var placeholder: jqueryDashSortableLib.JQuery
  var pointer: Position
  var relativePointer: Position
  var sameResultBox: jqueryDashSortableLib.Anon_Bottom
  var scrollProxy: js.Any
}

object ContainerGroup {
  @scala.inline
  def apply(
    $document: jqueryDashSortableLib.JQuery,
    containerDimensions: js.Array[Dimensions],
    containers: js.Array[Container],
    delayMet: scala.Boolean,
    dragInitDone: scala.Boolean,
    dragProxy: js.Any,
    dragging: scala.Boolean,
    dropProxy: js.Any,
    item: jqueryDashSortableLib.JQuery,
    itemContainer: Container,
    lastAppendedItem: jqueryDashSortableLib.JQuery,
    lastPointer: Position,
    lastRelativePointer: Position,
    offsetParent: jqueryDashSortableLib.JQuery,
    options: Options,
    placeholder: jqueryDashSortableLib.JQuery,
    pointer: Position,
    relativePointer: Position,
    sameResultBox: jqueryDashSortableLib.Anon_Bottom,
    scrollProxy: js.Any
  ): ContainerGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$document")($document)
    __obj.updateDynamic("containerDimensions")(containerDimensions)
    __obj.updateDynamic("containers")(containers)
    __obj.updateDynamic("delayMet")(delayMet)
    __obj.updateDynamic("dragInitDone")(dragInitDone)
    __obj.updateDynamic("dragProxy")(dragProxy)
    __obj.updateDynamic("dragging")(dragging)
    __obj.updateDynamic("dropProxy")(dropProxy)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("itemContainer")(itemContainer)
    __obj.updateDynamic("lastAppendedItem")(lastAppendedItem)
    __obj.updateDynamic("lastPointer")(lastPointer)
    __obj.updateDynamic("lastRelativePointer")(lastRelativePointer)
    __obj.updateDynamic("offsetParent")(offsetParent)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("placeholder")(placeholder)
    __obj.updateDynamic("pointer")(pointer)
    __obj.updateDynamic("relativePointer")(relativePointer)
    __obj.updateDynamic("sameResultBox")(sameResultBox)
    __obj.updateDynamic("scrollProxy")(scrollProxy)
    __obj.asInstanceOf[ContainerGroup]
  }
}

