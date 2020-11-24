package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownNumbers.`-1`
import typings.grammarkdown.grammarkdownNumbers.`0`
import typings.grammarkdown.grammarkdownNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Position")
@js.native
object Position extends js.Object {
  
  def clone(position: Position2): Position2 = js.native
  
  def compare(left: Position2, right: Position2): `1` | `0` | `-1` = js.native
  
  def create(line: Double, character: Double): Position2 = js.native
  
  def equals(left: Position2, right: Position2): Boolean = js.native
}
