package typings.jridgewellTraceMapping

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSourcemapSegmentMod {
  
  @JSImport("@jridgewell/trace-mapping/dist/types/sourcemap-segment", "COLUMN")
  @js.native
  val COLUMN: /* 0 */ Double = js.native
  
  @JSImport("@jridgewell/trace-mapping/dist/types/sourcemap-segment", "NAMES_INDEX")
  @js.native
  val NAMES_INDEX: /* 4 */ Double = js.native
  
  @JSImport("@jridgewell/trace-mapping/dist/types/sourcemap-segment", "REV_GENERATED_COLUMN")
  @js.native
  val REV_GENERATED_COLUMN: /* 2 */ Double = js.native
  
  @JSImport("@jridgewell/trace-mapping/dist/types/sourcemap-segment", "REV_GENERATED_LINE")
  @js.native
  val REV_GENERATED_LINE: /* 1 */ Double = js.native
  
  @JSImport("@jridgewell/trace-mapping/dist/types/sourcemap-segment", "SOURCES_INDEX")
  @js.native
  val SOURCES_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@jridgewell/trace-mapping/dist/types/sourcemap-segment", "SOURCE_COLUMN")
  @js.native
  val SOURCE_COLUMN: /* 3 */ Double = js.native
  
  @JSImport("@jridgewell/trace-mapping/dist/types/sourcemap-segment", "SOURCE_LINE")
  @js.native
  val SOURCE_LINE: /* 2 */ Double = js.native
  
  type GeneratedColumn = Double
  
  type GeneratedLine = Double
  
  type NamesIndex = Double
  
  type ReverseSegment = js.Tuple3[SourceColumn, GeneratedLine, GeneratedColumn]
  
  type SourceColumn = Double
  
  type SourceLine = Double
  
  type SourceMapSegment = js.Array[GeneratedColumn] | (js.Tuple4[GeneratedColumn, SourcesIndex, SourceLine, SourceColumn]) | (js.Tuple5[GeneratedColumn, SourcesIndex, SourceLine, SourceColumn, NamesIndex])
  
  type SourcesIndex = Double
}
