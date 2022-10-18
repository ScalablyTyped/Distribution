package typings.grammarkdown

import typings.grammarkdown.grammarkdownInts.`-1`
import typings.grammarkdown.grammarkdownInts.`0`
import typings.grammarkdown.grammarkdownInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait Position extends StObject {
    
    val character: Double
    
    val line: Double
  }
  object Position {
    
    inline def apply(character: Double, line: Double): Position = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @JSImport("grammarkdown/dist/types", "Position")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone_(position: Position): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(position.asInstanceOf[js.Any]).asInstanceOf[Position]
    
    inline def compare(left: Position, right: Position): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
    
    inline def create(line: Double, character: Double): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(line.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Position]
    
    inline def equals_(left: Position, right: Position): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    extension [Self <: Position](x: Self) {
      
      inline def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Range extends StObject {
    
    val end: Position
    
    val start: Position
  }
  object Range {
    
    inline def apply(end: Position, start: Position): Range = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @JSImport("grammarkdown/dist/types", "Range")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone_(range: Range): Range = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(range.asInstanceOf[js.Any]).asInstanceOf[Range]
    
    inline def collapseToEnd(range: Range): Range = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseToEnd")(range.asInstanceOf[js.Any]).asInstanceOf[Range]
    
    inline def collapseToStart(range: Range): Range = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseToStart")(range.asInstanceOf[js.Any]).asInstanceOf[Range]
    
    inline def contains(left: Range, right: Range): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def containsPosition(range: Range, position: Position): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsPosition")(range.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def create(start: Position, end: Position): Range = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Range]
    
    inline def equals_(left: Range, right: Range): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def intersects(left: Range, right: Range): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isCollapsed(range: Range): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollapsed")(range.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    extension [Self <: Range](x: Self) {
      
      inline def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextRange extends StObject {
    
    val end: Double
    
    val pos: Double
  }
  object TextRange {
    
    inline def apply(end: Double, pos: Double): TextRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextRange]
    }
    
    extension [Self <: TextRange](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
}
