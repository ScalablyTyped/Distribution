package typings.grammarkdown.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  var end: Position = js.native
  var start: Position = js.native
}

@JSImport("grammarkdown/dist/core", "Range")
@js.native
object Range extends js.Object {
  def clone(range: Range): Range = js.native
  def collapseToEnd(range: Range): Range = js.native
  def collapseToStart(range: Range): Range = js.native
  def contains(left: Range, right: Range): Boolean = js.native
  def containsPosition(range: Range, position: Position): Boolean = js.native
  def create(start: Position, end: Position): Range = js.native
  def equals(left: Range, right: Range): Boolean = js.native
  def intersects(left: Range, right: Range): Boolean = js.native
  def isCollapsed(range: Range): Boolean = js.native
}

