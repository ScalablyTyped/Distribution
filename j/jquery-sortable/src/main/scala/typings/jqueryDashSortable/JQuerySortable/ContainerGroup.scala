package typings.jqueryDashSortable.JQuerySortable

import typings.jqueryDashSortable.Anon_Bottom
import typings.jqueryDashSortable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerGroup extends js.Object {
  @JSName("$document")
  var $document: JQuery = js.native
  var containerDimensions: js.Array[Dimensions] = js.native
  var containers: js.Array[Container] = js.native
  var delayMet: Boolean = js.native
  var dragInitDone: Boolean = js.native
  var dragProxy: js.Any = js.native
  var dragging: Boolean = js.native
  var dropProxy: js.Any = js.native
  var item: JQuery = js.native
  var itemContainer: Container = js.native
  var lastAppendedItem: JQuery = js.native
  var lastPointer: Position = js.native
  var lastRelativePointer: Position = js.native
  var offsetParent: JQuery = js.native
  var options: Options = js.native
  var placeholder: JQuery = js.native
  var pointer: Position = js.native
  var relativePointer: Position = js.native
  var sameResultBox: Anon_Bottom = js.native
  var scrollProxy: js.Any = js.native
}

