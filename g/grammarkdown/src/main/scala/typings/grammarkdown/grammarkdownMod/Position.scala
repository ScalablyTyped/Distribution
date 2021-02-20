package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownNumbers.`-1`
import typings.grammarkdown.grammarkdownNumbers.`0`
import typings.grammarkdown.grammarkdownNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Position {
  
  @JSImport("grammarkdown/dist/grammarkdown", "Position.clone")
  @js.native
  def clone_(position: Position2): Position2 = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "Position.compare")
  @js.native
  def compare(left: Position2, right: Position2): `1` | `0` | `-1` = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "Position.create")
  @js.native
  def create(line: Double, character: Double): Position2 = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "Position.equals")
  @js.native
  def equals_(left: Position2, right: Position2): Boolean = js.native
}
