package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distCoreMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Range")
@js.native
object Range extends js.Object {
  def clone(range: typings.grammarkdown.distCoreMod.Range): typings.grammarkdown.distCoreMod.Range = js.native
  def collapseToEnd(range: typings.grammarkdown.distCoreMod.Range): typings.grammarkdown.distCoreMod.Range = js.native
  def collapseToStart(range: typings.grammarkdown.distCoreMod.Range): typings.grammarkdown.distCoreMod.Range = js.native
  def contains(left: typings.grammarkdown.distCoreMod.Range, right: typings.grammarkdown.distCoreMod.Range): Boolean = js.native
  def containsPosition(range: typings.grammarkdown.distCoreMod.Range, position: Position): Boolean = js.native
  def create(start: Position, end: Position): typings.grammarkdown.distCoreMod.Range = js.native
  def equals(left: typings.grammarkdown.distCoreMod.Range, right: typings.grammarkdown.distCoreMod.Range): Boolean = js.native
  def intersects(left: typings.grammarkdown.distCoreMod.Range, right: typings.grammarkdown.distCoreMod.Range): Boolean = js.native
  def isCollapsed(range: typings.grammarkdown.distCoreMod.Range): Boolean = js.native
}

