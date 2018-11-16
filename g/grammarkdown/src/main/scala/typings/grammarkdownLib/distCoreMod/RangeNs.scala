package typings
package grammarkdownLib.distCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/core", "Range")
@js.native
object RangeNs extends js.Object {
  def clone(range: grammarkdownLib.distCoreMod.Range): grammarkdownLib.distCoreMod.Range = js.native
  def collapseToEnd(range: grammarkdownLib.distCoreMod.Range): grammarkdownLib.distCoreMod.Range = js.native
  def collapseToStart(range: grammarkdownLib.distCoreMod.Range): grammarkdownLib.distCoreMod.Range = js.native
  def contains(left: grammarkdownLib.distCoreMod.Range, right: grammarkdownLib.distCoreMod.Range): scala.Boolean = js.native
  def containsPosition(range: grammarkdownLib.distCoreMod.Range, position: grammarkdownLib.distCoreMod.Position): scala.Boolean = js.native
  def create(start: grammarkdownLib.distCoreMod.Position, end: grammarkdownLib.distCoreMod.Position): grammarkdownLib.distCoreMod.Range = js.native
  def equals(left: grammarkdownLib.distCoreMod.Range, right: grammarkdownLib.distCoreMod.Range): scala.Boolean = js.native
  def intersects(left: grammarkdownLib.distCoreMod.Range, right: grammarkdownLib.distCoreMod.Range): scala.Boolean = js.native
  def isCollapsed(range: grammarkdownLib.distCoreMod.Range): scala.Boolean = js.native
}

