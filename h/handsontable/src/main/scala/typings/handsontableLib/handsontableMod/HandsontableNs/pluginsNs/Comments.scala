package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comments extends Base {
  var contextMenuEvent: scala.Boolean = js.native
  var displayDelay: scala.Double = js.native
  var editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.CommentEditor = js.native
  var eventManager: EventManager = js.native
  var mouseDown: scala.Boolean = js.native
  var range: CommentsRangeObject = js.native
  var timer: js.Any = js.native
  def clearRange(): scala.Unit = js.native
  def getComment(): java.lang.String = js.native
  def getCommentMeta(row: scala.Double, column: scala.Double, property: java.lang.String): js.Any = js.native
  def hide(): scala.Unit = js.native
  def refreshEditor(): scala.Unit = js.native
  def refreshEditor(force: scala.Boolean): scala.Unit = js.native
  def removeComment(): scala.Unit = js.native
  def removeComment(forceRender: scala.Boolean): scala.Unit = js.native
  def removeCommentAtCell(row: scala.Double, col: scala.Double): scala.Unit = js.native
  def removeCommentAtCell(row: scala.Double, col: scala.Double, forceRender: scala.Boolean): scala.Unit = js.native
  def setComment(value: java.lang.String): scala.Unit = js.native
  def setCommentAtCell(row: scala.Double, col: scala.Double, value: java.lang.String): scala.Unit = js.native
  def setRange(range: CommentsRangeObject): scala.Unit = js.native
  def show(): scala.Boolean = js.native
  def showAtCell(row: scala.Double, col: scala.Double): scala.Boolean = js.native
  def targetIsCellWithComment(event: stdLib.Event): scala.Boolean = js.native
  def targetIsCommentTextArea(event: stdLib.Event): scala.Boolean = js.native
  def updateCommentMeta(row: scala.Double, column: scala.Double, metaObject: js.Object): scala.Unit = js.native
}

