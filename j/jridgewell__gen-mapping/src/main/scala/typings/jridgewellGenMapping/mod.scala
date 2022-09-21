package typings.jridgewellGenMapping

import typings.jridgewellGenMapping.anon.Content
import typings.jridgewellGenMapping.anon.Generated
import typings.jridgewellGenMapping.anon.Name
import typings.jridgewellGenMapping.typesMod.DecodedSourceMap
import typings.jridgewellGenMapping.typesMod.EncodedSourceMap
import typings.jridgewellGenMapping.typesMod.Mapping
import typings.jridgewellTraceMapping.typesMod.SourceMapInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jridgewell/gen-mapping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jridgewell/gen-mapping", "GenMapping")
  @js.native
  open class GenMapping () extends StObject {
    def this(hasFileSourceRoot: Options) = this()
    
    /* private */ var _mappings: Any = js.native
    
    /* private */ var _names: Any = js.native
    
    /* private */ var _sources: Any = js.native
    
    /* private */ var _sourcesContent: Any = js.native
    
    var file: js.UndefOr[String | Null] = js.native
    
    var sourceRoot: js.UndefOr[String | Null] = js.native
  }
  
  inline def addMapping(map: GenMapping, mapping: Content): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMapping")(map.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addMapping(map: GenMapping, mapping: Generated): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMapping")(map.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addMapping(map: GenMapping, mapping: Name): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMapping")(map.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addSegment(map: GenMapping, genLine: Double, genColumn: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSegment")(map.asInstanceOf[js.Any], genLine.asInstanceOf[js.Any], genColumn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addSegment(
    map: GenMapping,
    genLine: Double,
    genColumn: Double,
    source: String,
    sourceLine: Double,
    sourceColumn: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSegment")(map.asInstanceOf[js.Any], genLine.asInstanceOf[js.Any], genColumn.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceLine.asInstanceOf[js.Any], sourceColumn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addSegment(
    map: GenMapping,
    genLine: Double,
    genColumn: Double,
    source: String,
    sourceLine: Double,
    sourceColumn: Double,
    name: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSegment")(map.asInstanceOf[js.Any], genLine.asInstanceOf[js.Any], genColumn.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceLine.asInstanceOf[js.Any], sourceColumn.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addSegment(
    map: GenMapping,
    genLine: Double,
    genColumn: Double,
    source: String,
    sourceLine: Double,
    sourceColumn: Double,
    name: String,
    content: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSegment")(map.asInstanceOf[js.Any], genLine.asInstanceOf[js.Any], genColumn.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceLine.asInstanceOf[js.Any], sourceColumn.asInstanceOf[js.Any], name.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addSegment(
    map: GenMapping,
    genLine: Double,
    genColumn: Double,
    source: String,
    sourceLine: Double,
    sourceColumn: Double,
    name: Null,
    content: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSegment")(map.asInstanceOf[js.Any], genLine.asInstanceOf[js.Any], genColumn.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceLine.asInstanceOf[js.Any], sourceColumn.asInstanceOf[js.Any], name.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addSegment(
    map: GenMapping,
    genLine: Double,
    genColumn: Double,
    source: String,
    sourceLine: Double,
    sourceColumn: Double,
    name: Unit,
    content: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSegment")(map.asInstanceOf[js.Any], genLine.asInstanceOf[js.Any], genColumn.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceLine.asInstanceOf[js.Any], sourceColumn.asInstanceOf[js.Any], name.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@jridgewell/gen-mapping", "allMappings")
  @js.native
  def allMappings: js.Function1[/* map */ GenMapping, js.Array[Mapping]] = js.native
  inline def allMappings_=(x: js.Function1[/* map */ GenMapping, js.Array[Mapping]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allMappings")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/gen-mapping", "fromMap")
  @js.native
  def fromMap: js.Function1[/* input */ SourceMapInput, GenMapping] = js.native
  inline def fromMap_=(x: js.Function1[/* input */ SourceMapInput, GenMapping]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMap")(x.asInstanceOf[js.Any])
  
  inline def maybeAddMapping(map: GenMapping, mapping: Content): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeAddMapping")(map.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def maybeAddMapping(map: GenMapping, mapping: Generated): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeAddMapping")(map.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def maybeAddMapping(map: GenMapping, mapping: Name): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeAddMapping")(map.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def maybeAddSegment(map: GenMapping, genLine: Double, genColumn: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeAddSegment")(map.asInstanceOf[js.Any], genLine.asInstanceOf[js.Any], genColumn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def maybeAddSegment(
    map: GenMapping,
    genLine: Double,
    genColumn: Double,
    source: String,
    sourceLine: Double,
    sourceColumn: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeAddSegment")(map.asInstanceOf[js.Any], genLine.asInstanceOf[js.Any], genColumn.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceLine.asInstanceOf[js.Any], sourceColumn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def maybeAddSegment(
    map: GenMapping,
    genLine: Double,
    genColumn: Double,
    source: String,
    sourceLine: Double,
    sourceColumn: Double,
    name: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeAddSegment")(map.asInstanceOf[js.Any], genLine.asInstanceOf[js.Any], genColumn.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceLine.asInstanceOf[js.Any], sourceColumn.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def maybeAddSegment(
    map: GenMapping,
    genLine: Double,
    genColumn: Double,
    source: String,
    sourceLine: Double,
    sourceColumn: Double,
    name: String,
    content: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeAddSegment")(map.asInstanceOf[js.Any], genLine.asInstanceOf[js.Any], genColumn.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceLine.asInstanceOf[js.Any], sourceColumn.asInstanceOf[js.Any], name.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def maybeAddSegment(
    map: GenMapping,
    genLine: Double,
    genColumn: Double,
    source: String,
    sourceLine: Double,
    sourceColumn: Double,
    name: Null,
    content: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeAddSegment")(map.asInstanceOf[js.Any], genLine.asInstanceOf[js.Any], genColumn.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceLine.asInstanceOf[js.Any], sourceColumn.asInstanceOf[js.Any], name.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def maybeAddSegment(
    map: GenMapping,
    genLine: Double,
    genColumn: Double,
    source: String,
    sourceLine: Double,
    sourceColumn: Double,
    name: Unit,
    content: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeAddSegment")(map.asInstanceOf[js.Any], genLine.asInstanceOf[js.Any], genColumn.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceLine.asInstanceOf[js.Any], sourceColumn.asInstanceOf[js.Any], name.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@jridgewell/gen-mapping", "setSourceContent")
  @js.native
  def setSourceContent: js.Function3[/* map */ GenMapping, /* source */ String, /* content */ String | Null, Unit] = js.native
  inline def setSourceContent_=(x: js.Function3[/* map */ GenMapping, /* source */ String, /* content */ String | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setSourceContent")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/gen-mapping", "toDecodedMap")
  @js.native
  def toDecodedMap: js.Function1[/* map */ GenMapping, DecodedSourceMap] = js.native
  inline def toDecodedMap_=(x: js.Function1[/* map */ GenMapping, DecodedSourceMap]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toDecodedMap")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/gen-mapping", "toEncodedMap")
  @js.native
  def toEncodedMap: js.Function1[/* map */ GenMapping, EncodedSourceMap] = js.native
  inline def toEncodedMap_=(x: js.Function1[/* map */ GenMapping, EncodedSourceMap]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toEncodedMap")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    var file: js.UndefOr[String | Null] = js.undefined
    
    var sourceRoot: js.UndefOr[String | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileNull: Self = StObject.set(x, "file", null)
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootNull: Self = StObject.set(x, "sourceRoot", null)
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    }
  }
}
