package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distCoreMod.Position
import typings.grammarkdown.grammarkdownNumbers.`-1`
import typings.grammarkdown.grammarkdownNumbers.`0`
import typings.grammarkdown.grammarkdownNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Position")
@js.native
object PositionNs extends js.Object {
  def clone(position: Position): Position = js.native
  def compare(left: Position, right: Position): `1` | `0` | `-1` = js.native
  def create(line: Double, character: Double): Position = js.native
  def equals(left: Position, right: Position): Boolean = js.native
}

