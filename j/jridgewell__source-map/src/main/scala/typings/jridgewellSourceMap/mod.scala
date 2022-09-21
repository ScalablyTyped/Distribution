package typings.jridgewellSourceMap

import typings.jridgewellGenMapping.mod.GenMapping
import typings.jridgewellGenMapping.typesMod.DecodedSourceMap
import typings.jridgewellGenMapping.typesMod.EncodedSourceMap
import typings.jridgewellSourceMap.anon.TypeofmaybeAddMapping
import typings.jridgewellTraceMapping.typesMod.InvalidOriginalMapping
import typings.jridgewellTraceMapping.typesMod.Needle
import typings.jridgewellTraceMapping.typesMod.OriginalMapping
import typings.jridgewellTraceMapping.typesMod.SourceMapInput
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jridgewell/source-map", "SourceMapConsumer")
  @js.native
  open class SourceMapConsumer protected () extends StObject {
    def this(
      map: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<@jridgewell/trace-mapping.@jridgewell/trace-mapping/dist/types/any-map.AnyMap>[0] */ js.Any,
      mapUrl: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@jridgewell/trace-mapping.@jridgewell/trace-mapping/dist/types/any-map.AnyMap>[1] */ js.Any
    ) = this()
    
    /* private */ var _map: Any = js.native
    
    def destroy(): Unit = js.native
    
    var file: js.UndefOr[String | Null] = js.native
    
    var names: js.Array[String] = js.native
    
    @JSName("originalPositionFor")
    def originalPositionFor_1(
      needle: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(map : @jridgewell/trace-mapping.@jridgewell/trace-mapping.TraceMap, needle : @jridgewell/trace-mapping.@jridgewell/trace-mapping/dist/types/types.Needle): @jridgewell/trace-mapping.@jridgewell/trace-mapping/dist/types/types.OriginalMapping | @jridgewell/trace-mapping.@jridgewell/trace-mapping/dist/types/types.InvalidOriginalMapping>[1] */ js.Any
    ): ReturnType[
        js.Function2[
          /* map */ typings.jridgewellTraceMapping.mod.TraceMap, 
          /* needle */ Needle, 
          OriginalMapping | InvalidOriginalMapping
        ]
      ] = js.native
    
    var sourceRoot: js.UndefOr[String] = js.native
    
    var sources: js.Array[String | Null] = js.native
    
    var sourcesContent: js.UndefOr[js.Array[String | Null]] = js.native
  }
  
  @JSImport("@jridgewell/source-map", "SourceMapGenerator")
  @js.native
  open class SourceMapGenerator protected () extends StObject {
    def this(opts: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (): @jridgewell/gen-mapping.@jridgewell/gen-mapping.GenMapping>[0] */ js.Any) = this()
    
    /* private */ var _map: Any = js.native
    
    @JSName("addMapping")
    def addMapping_1(
      mapping: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@jridgewell/source-map.anon.TypeofmaybeAddMapping>[1] */ js.Any
    ): ReturnType[TypeofmaybeAddMapping] = js.native
    
    def setSourceContent(
      source: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(map : @jridgewell/gen-mapping.@jridgewell/gen-mapping.GenMapping, source : string, content : string | null): void>[1] */ js.Any,
      content: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(map : @jridgewell/gen-mapping.@jridgewell/gen-mapping.GenMapping, source : string, content : string | null): void>[2] */ js.Any
    ): ReturnType[
        js.Function3[/* map */ GenMapping, /* source */ String, /* content */ String | Null, Unit]
      ] = js.native
    
    def toDecodedMap(): ReturnType[js.Function1[/* map */ GenMapping, DecodedSourceMap]] = js.native
    
    def toJSON(): ReturnType[js.Function1[/* map */ GenMapping, EncodedSourceMap]] = js.native
  }
  
  @JSImport("@jridgewell/source-map", "TraceMap")
  @js.native
  open class TraceMap protected ()
    extends typings.jridgewellTraceMapping.mod.TraceMap {
    def this(map: SourceMapInput) = this()
    def this(map: SourceMapInput, mapUrl: String) = this()
  }
}
