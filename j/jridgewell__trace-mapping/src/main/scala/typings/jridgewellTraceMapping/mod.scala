package typings.jridgewellTraceMapping

import typings.jridgewellTraceMapping.anon.OmitDecodedSourceMapmappi
import typings.jridgewellTraceMapping.sourcemapSegmentMod.SourceMapSegment
import typings.jridgewellTraceMapping.typesMod.DecodedSourceMap
import typings.jridgewellTraceMapping.typesMod.EachMapping
import typings.jridgewellTraceMapping.typesMod.EncodedSourceMap
import typings.jridgewellTraceMapping.typesMod.GeneratedMapping
import typings.jridgewellTraceMapping.typesMod.InvalidGeneratedMapping
import typings.jridgewellTraceMapping.typesMod.InvalidOriginalMapping
import typings.jridgewellTraceMapping.typesMod.Needle
import typings.jridgewellTraceMapping.typesMod.OriginalMapping
import typings.jridgewellTraceMapping.typesMod.SectionedSourceMapInput
import typings.jridgewellTraceMapping.typesMod.SourceMap
import typings.jridgewellTraceMapping.typesMod.SourceMapInput
import typings.jridgewellTraceMapping.typesMod.SourceNeedle
import typings.jridgewellTraceMapping.typesMod._SourceMapInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jridgewell/trace-mapping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jridgewell/trace-mapping", "AnyMap")
  @js.native
  val AnyMap: typings.jridgewellTraceMapping.anyMapMod.AnyMap = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@jridgewell/trace-mapping", "AnyMap")
  @js.native
  open class AnyMapCls protected () extends TraceMap {
    def this(map: SectionedSourceMapInput) = this()
    def this(map: SectionedSourceMapInput, mapUrl: String) = this()
  }
  
  @JSImport("@jridgewell/trace-mapping", "GREATEST_LOWER_BOUND")
  @js.native
  val GREATEST_LOWER_BOUND: /* 1 */ Double = js.native
  
  @JSImport("@jridgewell/trace-mapping", "LEAST_UPPER_BOUND")
  @js.native
  val LEAST_UPPER_BOUND: /* -1 */ Double = js.native
  
  @JSImport("@jridgewell/trace-mapping", "TraceMap")
  @js.native
  open class TraceMap protected ()
    extends SourceMap
       with _SourceMapInput {
    def this(map: SourceMapInput) = this()
    def this(map: SourceMapInput, mapUrl: String) = this()
    
    /* private */ var _bySourceMemos: Any = js.native
    
    /* private */ var _bySources: Any = js.native
    
    /* private */ var _decoded: Any = js.native
    
    /* private */ var _decodedMemo: Any = js.native
    
    /* private */ var _encoded: Any = js.native
    
    @JSName("resolvedSources")
    var resolvedSources_TraceMap: js.Array[String] = js.native
  }
  
  @JSImport("@jridgewell/trace-mapping", "decodedMap")
  @js.native
  def decodedMap: js.Function1[/* map */ TraceMap, OmitDecodedSourceMapmappi] = js.native
  inline def decodedMap_=(x: js.Function1[/* map */ TraceMap, OmitDecodedSourceMapmappi]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodedMap")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/trace-mapping", "decodedMappings")
  @js.native
  def decodedMappings: js.Function1[/* map */ TraceMap, js.Array[js.Array[SourceMapSegment]]] = js.native
  inline def decodedMappings_=(x: js.Function1[/* map */ TraceMap, js.Array[js.Array[SourceMapSegment]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodedMappings")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/trace-mapping", "eachMapping")
  @js.native
  def eachMapping: js.Function2[/* map */ TraceMap, /* cb */ js.Function1[/* mapping */ EachMapping, Unit], Unit] = js.native
  inline def eachMapping_=(x: js.Function2[/* map */ TraceMap, /* cb */ js.Function1[/* mapping */ EachMapping, Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eachMapping")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/trace-mapping", "encodedMap")
  @js.native
  def encodedMap: js.Function1[/* map */ TraceMap, EncodedSourceMap] = js.native
  inline def encodedMap_=(x: js.Function1[/* map */ TraceMap, EncodedSourceMap]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodedMap")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/trace-mapping", "encodedMappings")
  @js.native
  def encodedMappings: js.Function1[/* map */ TraceMap, String] = js.native
  inline def encodedMappings_=(x: js.Function1[/* map */ TraceMap, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodedMappings")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/trace-mapping", "generatedPositionFor")
  @js.native
  def generatedPositionFor: js.Function2[
    /* map */ TraceMap, 
    /* needle */ SourceNeedle, 
    GeneratedMapping | InvalidGeneratedMapping
  ] = js.native
  inline def generatedPositionFor_=(
    x: js.Function2[
      /* map */ TraceMap, 
      /* needle */ SourceNeedle, 
      GeneratedMapping | InvalidGeneratedMapping
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generatedPositionFor")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/trace-mapping", "originalPositionFor")
  @js.native
  def originalPositionFor: js.Function2[/* map */ TraceMap, /* needle */ Needle, OriginalMapping | InvalidOriginalMapping] = js.native
  inline def originalPositionFor_=(x: js.Function2[/* map */ TraceMap, /* needle */ Needle, OriginalMapping | InvalidOriginalMapping]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("originalPositionFor")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/trace-mapping", "presortedDecodedMap")
  @js.native
  def presortedDecodedMap: js.Function2[/* map */ DecodedSourceMap, /* mapUrl */ js.UndefOr[String], TraceMap] = js.native
  inline def presortedDecodedMap_=(x: js.Function2[/* map */ DecodedSourceMap, /* mapUrl */ js.UndefOr[String], TraceMap]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("presortedDecodedMap")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/trace-mapping", "sourceContentFor")
  @js.native
  def sourceContentFor: js.Function2[/* map */ TraceMap, /* source */ String, String | Null] = js.native
  inline def sourceContentFor_=(x: js.Function2[/* map */ TraceMap, /* source */ String, String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sourceContentFor")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/trace-mapping", "traceSegment")
  @js.native
  def traceSegment: js.Function3[/* map */ TraceMap, /* line */ Double, /* column */ Double, SourceMapSegment | Null] = js.native
  inline def traceSegment_=(
    x: js.Function3[/* map */ TraceMap, /* line */ Double, /* column */ Double, SourceMapSegment | Null]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("traceSegment")(x.asInstanceOf[js.Any])
}
