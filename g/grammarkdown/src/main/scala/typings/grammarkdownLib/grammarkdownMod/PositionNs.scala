package typings
package grammarkdownLib.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Position")
@js.native
object PositionNs extends js.Object {
  def clone(position: grammarkdownLib.distCoreMod.Position): grammarkdownLib.distCoreMod.Position = js.native
  def compare(left: grammarkdownLib.distCoreMod.Position, right: grammarkdownLib.distCoreMod.Position): grammarkdownLib.grammarkdownLibNumbers.`1` | grammarkdownLib.grammarkdownLibNumbers.`0` | grammarkdownLib.grammarkdownLibNumbers.`-1` = js.native
  def create(line: scala.Double, character: scala.Double): grammarkdownLib.distCoreMod.Position = js.native
  def equals(left: grammarkdownLib.distCoreMod.Position, right: grammarkdownLib.distCoreMod.Position): scala.Boolean = js.native
}

