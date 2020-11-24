package typings.grammarkdown.mod

import typings.grammarkdown.grammarkdownNumbers.`-1`
import typings.grammarkdown.grammarkdownNumbers.`0`
import typings.grammarkdown.grammarkdownNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Position")
@js.native
object Position extends js.Object {
  
  def clone(position: typings.grammarkdown.typesMod.Position): typings.grammarkdown.typesMod.Position = js.native
  
  def compare(left: typings.grammarkdown.typesMod.Position, right: typings.grammarkdown.typesMod.Position): `1` | `0` | `-1` = js.native
  
  def create(line: Double, character: Double): typings.grammarkdown.typesMod.Position = js.native
  
  def equals(left: typings.grammarkdown.typesMod.Position, right: typings.grammarkdown.typesMod.Position): Boolean = js.native
}
