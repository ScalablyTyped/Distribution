package typings.grammarkdown

import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.typesMod.Position
import typings.grammarkdown.typesMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineOffsetMapMod {
  
  @JSImport("grammarkdown/dist/lineOffsetMap", "LineOffsetMap")
  @js.native
  class LineOffsetMap () extends StObject {
    
    /* private */ var generatedFilesLineOffsets: js.Any = js.native
    
    def getEffectiveFilenameAtPosition(sourceFile: String, position: Position): String = js.native
    /**
      * Gets the effective filename of a raw position within a source file, taking into account `@line` directives.
      */
    def getEffectiveFilenameAtPosition(sourceFile: SourceFile, position: Position): String = js.native
    
    def getEffectivePosition(sourceFile: String, position: Position): Position = js.native
    /**
      * Gets the effective position of a raw position within a source file, taking into account `@line` directives.
      */
    def getEffectivePosition(sourceFile: SourceFile, position: Position): Position = js.native
    
    def getEffectiveRange(sourceFile: String, range: Range): Range = js.native
    /**
      * Gets the effective range of a raw range within a source file, taking into account `@line` directives.
      */
    def getEffectiveRange(sourceFile: SourceFile, range: Range): Range = js.native
    
    def getRawFilenameAtEffectivePosition(filename: String, position: Position): String = js.native
    
    def getRawPositionFromEffectivePosition(filename: String, position: Position): Position = js.native
    
    def getRawRangeFromEffectiveRange(filename: String, range: Range): Range = js.native
    
    /* private */ var sourceFilesLineOffsets: js.Any = js.native
  }
}
