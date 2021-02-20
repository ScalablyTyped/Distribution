package typings.grammarkdown.mod

import typings.grammarkdown.grammarkdownNumbers.`-1`
import typings.grammarkdown.grammarkdownNumbers.`0`
import typings.grammarkdown.grammarkdownNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Position {
  
  @JSImport("grammarkdown", "Position.clone")
  @js.native
  def clone_(position: typings.grammarkdown.typesMod.Position): typings.grammarkdown.typesMod.Position = js.native
  
  @JSImport("grammarkdown", "Position.compare")
  @js.native
  def compare(left: typings.grammarkdown.typesMod.Position, right: typings.grammarkdown.typesMod.Position): `1` | `0` | `-1` = js.native
  
  @JSImport("grammarkdown", "Position.create")
  @js.native
  def create(line: Double, character: Double): typings.grammarkdown.typesMod.Position = js.native
  
  @JSImport("grammarkdown", "Position.equals")
  @js.native
  def equals_(left: typings.grammarkdown.typesMod.Position, right: typings.grammarkdown.typesMod.Position): Boolean = js.native
}
