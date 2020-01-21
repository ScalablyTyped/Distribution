package typings.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Range")
@js.native
object Range extends js.Object {
  def clone(range: typings.grammarkdown.coreMod.Range): typings.grammarkdown.coreMod.Range = js.native
  def collapseToEnd(range: typings.grammarkdown.coreMod.Range): typings.grammarkdown.coreMod.Range = js.native
  def collapseToStart(range: typings.grammarkdown.coreMod.Range): typings.grammarkdown.coreMod.Range = js.native
  def contains(left: typings.grammarkdown.coreMod.Range, right: typings.grammarkdown.coreMod.Range): Boolean = js.native
  def containsPosition(range: typings.grammarkdown.coreMod.Range, position: typings.grammarkdown.coreMod.Position): Boolean = js.native
  def create(start: typings.grammarkdown.coreMod.Position, end: typings.grammarkdown.coreMod.Position): typings.grammarkdown.coreMod.Range = js.native
  def equals(left: typings.grammarkdown.coreMod.Range, right: typings.grammarkdown.coreMod.Range): Boolean = js.native
  def intersects(left: typings.grammarkdown.coreMod.Range, right: typings.grammarkdown.coreMod.Range): Boolean = js.native
  def isCollapsed(range: typings.grammarkdown.coreMod.Range): Boolean = js.native
}

