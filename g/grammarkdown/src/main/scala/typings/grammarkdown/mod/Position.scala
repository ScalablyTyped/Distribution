package typings.grammarkdown.mod

import typings.grammarkdown.grammarkdownNumbers.`-1`
import typings.grammarkdown.grammarkdownNumbers.`0`
import typings.grammarkdown.grammarkdownNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Position {
  
  @JSImport("grammarkdown", "Position")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_(position: typings.grammarkdown.typesMod.Position): typings.grammarkdown.typesMod.Position = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(position.asInstanceOf[js.Any]).asInstanceOf[typings.grammarkdown.typesMod.Position]
  
  inline def compare(left: typings.grammarkdown.typesMod.Position, right: typings.grammarkdown.typesMod.Position): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  inline def create(line: Double, character: Double): typings.grammarkdown.typesMod.Position = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(line.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[typings.grammarkdown.typesMod.Position]
  
  inline def equals_(left: typings.grammarkdown.typesMod.Position, right: typings.grammarkdown.typesMod.Position): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
