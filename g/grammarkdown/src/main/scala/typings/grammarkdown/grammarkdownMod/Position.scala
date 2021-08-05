package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownNumbers.`-1`
import typings.grammarkdown.grammarkdownNumbers.`0`
import typings.grammarkdown.grammarkdownNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Position {
  
  @JSImport("grammarkdown/dist/grammarkdown", "Position")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_(position: Position2): Position2 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(position.asInstanceOf[js.Any]).asInstanceOf[Position2]
  
  inline def compare(left: Position2, right: Position2): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  inline def create(line: Double, character: Double): Position2 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(line.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Position2]
  
  inline def equals_(left: Position2, right: Position2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
