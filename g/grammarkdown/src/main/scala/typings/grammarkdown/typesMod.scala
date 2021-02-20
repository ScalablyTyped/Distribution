package typings.grammarkdown

import typings.grammarkdown.grammarkdownNumbers.`-1`
import typings.grammarkdown.grammarkdownNumbers.`0`
import typings.grammarkdown.grammarkdownNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Position extends StObject {
    
    var character: Double = js.native
    
    var line: Double = js.native
  }
  object Position {
    
    @scala.inline
    def apply(character: Double, line: Double): Position = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @JSImport("grammarkdown/dist/types", "Position.clone")
    @js.native
    def clone_(position: Position): Position = js.native
    
    @JSImport("grammarkdown/dist/types", "Position.compare")
    @js.native
    def compare(left: Position, right: Position): `1` | `0` | `-1` = js.native
    
    @JSImport("grammarkdown/dist/types", "Position.create")
    @js.native
    def create(line: Double, character: Double): Position = js.native
    
    @JSImport("grammarkdown/dist/types", "Position.equals")
    @js.native
    def equals_(left: Position, right: Position): Boolean = js.native
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Range extends StObject {
    
    var end: Position = js.native
    
    var start: Position = js.native
  }
  object Range {
    
    @scala.inline
    def apply(end: Position, start: Position): Range = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @JSImport("grammarkdown/dist/types", "Range.clone")
    @js.native
    def clone_(range: Range): Range = js.native
    
    @JSImport("grammarkdown/dist/types", "Range.collapseToEnd")
    @js.native
    def collapseToEnd(range: Range): Range = js.native
    
    @JSImport("grammarkdown/dist/types", "Range.collapseToStart")
    @js.native
    def collapseToStart(range: Range): Range = js.native
    
    @JSImport("grammarkdown/dist/types", "Range.contains")
    @js.native
    def contains(left: Range, right: Range): Boolean = js.native
    
    @JSImport("grammarkdown/dist/types", "Range.containsPosition")
    @js.native
    def containsPosition(range: Range, position: Position): Boolean = js.native
    
    @JSImport("grammarkdown/dist/types", "Range.create")
    @js.native
    def create(start: Position, end: Position): Range = js.native
    
    @JSImport("grammarkdown/dist/types", "Range.equals")
    @js.native
    def equals_(left: Range, right: Range): Boolean = js.native
    
    @JSImport("grammarkdown/dist/types", "Range.intersects")
    @js.native
    def intersects(left: Range, right: Range): Boolean = js.native
    
    @JSImport("grammarkdown/dist/types", "Range.isCollapsed")
    @js.native
    def isCollapsed(range: Range): Boolean = js.native
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextRange extends StObject {
    
    var end: Double = js.native
    
    var pos: Double = js.native
  }
  object TextRange {
    
    @scala.inline
    def apply(end: Double, pos: Double): TextRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextRange]
    }
    
    @scala.inline
    implicit class TextRangeMutableBuilder[Self <: TextRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
}
