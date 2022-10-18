package typings.grammarkdown.mod

import typings.grammarkdown.grammarkdownInts.`-1`
import typings.grammarkdown.grammarkdownInts.`0`
import typings.grammarkdown.grammarkdownInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Position {
  
  @JSImport("grammarkdown", "Position")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_(position: typings.grammarkdown.distTypesMod.Position): typings.grammarkdown.distTypesMod.Position = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(position.asInstanceOf[js.Any]).asInstanceOf[typings.grammarkdown.distTypesMod.Position]
  
  inline def compare(
    left: typings.grammarkdown.distTypesMod.Position,
    right: typings.grammarkdown.distTypesMod.Position
  ): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
  
  inline def create(line: Double, character: Double): typings.grammarkdown.distTypesMod.Position = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(line.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[typings.grammarkdown.distTypesMod.Position]
  
  inline def equals_(
    left: typings.grammarkdown.distTypesMod.Position,
    right: typings.grammarkdown.distTypesMod.Position
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
