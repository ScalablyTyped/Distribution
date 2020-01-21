package typings.grammarkdown.mod

import typings.grammarkdown.grammarkdownNumbers.`-1`
import typings.grammarkdown.grammarkdownNumbers.`0`
import typings.grammarkdown.grammarkdownNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Position")
@js.native
object Position extends js.Object {
  def clone(position: typings.grammarkdown.coreMod.Position): typings.grammarkdown.coreMod.Position = js.native
  def compare(left: typings.grammarkdown.coreMod.Position, right: typings.grammarkdown.coreMod.Position): `1` | `0` | `-1` = js.native
  def create(line: Double, character: Double): typings.grammarkdown.coreMod.Position = js.native
  def equals(left: typings.grammarkdown.coreMod.Position, right: typings.grammarkdown.coreMod.Position): Boolean = js.native
}

