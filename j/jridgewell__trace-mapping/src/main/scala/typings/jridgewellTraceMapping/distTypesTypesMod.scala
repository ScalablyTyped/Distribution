package typings.jridgewellTraceMapping

import typings.jridgewellTraceMapping.anon.Column
import typings.jridgewellTraceMapping.distTypesSourcemapSegmentMod.SourceMapSegment
import typings.jridgewellTraceMapping.jridgewellTraceMappingInts.`3`
import typings.jridgewellTraceMapping.mod.TraceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  /* note: abstract class */ @JSImport("@jridgewell/trace-mapping/dist/types/types", "SourceMap")
  @js.native
  open class SourceMap () extends StObject {
    
    var file: js.UndefOr[String | Null] = js.native
    
    var names: js.Array[String] = js.native
    
    var resolvedSources: js.Array[String | Null] = js.native
    
    var sourceRoot: js.UndefOr[String] = js.native
    
    var sources: js.Array[String | Null] = js.native
    
    var sourcesContent: js.UndefOr[js.Array[String | Null]] = js.native
    
    var version: `3` = js.native
  }
  
  type Bias = /* 1 */ Double
  
  trait DecodedSourceMap
    extends StObject
       with SourceMapV3 {
    
    var mappings: js.Array[js.Array[SourceMapSegment]]
  }
  object DecodedSourceMap {
    
    inline def apply(
      mappings: js.Array[js.Array[SourceMapSegment]],
      names: js.Array[String],
      sources: js.Array[String | Null]
    ): DecodedSourceMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = 3)
      __obj.asInstanceOf[DecodedSourceMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodedSourceMap] (val x: Self) extends AnyVal {
      
      inline def setMappings(value: js.Array[js.Array[SourceMapSegment]]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setMappingsVarargs(value: js.Array[SourceMapSegment]*): Self = StObject.set(x, "mappings", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jridgewellTraceMapping.anon.GeneratedColumn
    - typings.jridgewellTraceMapping.anon.GeneratedLine
  */
  trait EachMapping extends StObject
  object EachMapping {
    
    inline def GeneratedColumn(
      generatedColumn: Double,
      generatedLine: Double,
      name: Null,
      originalColumn: Null,
      originalLine: Null,
      source: Null
    ): typings.jridgewellTraceMapping.anon.GeneratedColumn = {
      val __obj = js.Dynamic.literal(generatedColumn = generatedColumn.asInstanceOf[js.Any], generatedLine = generatedLine.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalColumn = originalColumn.asInstanceOf[js.Any], originalLine = originalLine.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jridgewellTraceMapping.anon.GeneratedColumn]
    }
    
    inline def GeneratedLine(generatedColumn: Double, generatedLine: Double, originalColumn: Double, originalLine: Double): typings.jridgewellTraceMapping.anon.GeneratedLine = {
      val __obj = js.Dynamic.literal(generatedColumn = generatedColumn.asInstanceOf[js.Any], generatedLine = generatedLine.asInstanceOf[js.Any], originalColumn = originalColumn.asInstanceOf[js.Any], originalLine = originalLine.asInstanceOf[js.Any], name = null, source = null)
      __obj.asInstanceOf[typings.jridgewellTraceMapping.anon.GeneratedLine]
    }
  }
  
  trait EncodedSourceMap
    extends StObject
       with SourceMapV3 {
    
    var mappings: String
  }
  object EncodedSourceMap {
    
    inline def apply(mappings: String, names: js.Array[String], sources: js.Array[String | Null]): EncodedSourceMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = 3)
      __obj.asInstanceOf[EncodedSourceMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncodedSourceMap] (val x: Self) extends AnyVal {
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeneratedMapping extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object GeneratedMapping {
    
    inline def apply(column: Double, line: Double): GeneratedMapping = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratedMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeneratedMapping] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidGeneratedMapping extends StObject {
    
    var column: Null
    
    var line: Null
  }
  object InvalidGeneratedMapping {
    
    inline def apply(column: Null, line: Null): InvalidGeneratedMapping = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidGeneratedMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidGeneratedMapping] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Null): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Null): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidOriginalMapping extends StObject {
    
    var column: Null
    
    var line: Null
    
    var name: Null
    
    var source: Null
  }
  object InvalidOriginalMapping {
    
    inline def apply(column: Null, line: Null, name: Null, source: Null): InvalidOriginalMapping = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidOriginalMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidOriginalMapping] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Null): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Null): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: Null): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Null): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Needle extends StObject {
    
    var bias: js.UndefOr[Bias] = js.undefined
    
    var column: Double
    
    var line: Double
  }
  object Needle {
    
    inline def apply(column: Double, line: Double): Needle = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Needle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Needle] (val x: Self) extends AnyVal {
      
      inline def setBias(value: Bias): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait OriginalMapping extends StObject {
    
    var column: Double
    
    var line: Double
    
    var name: String | Null
    
    var source: String | Null
  }
  object OriginalMapping {
    
    inline def apply(column: Double, line: Double): OriginalMapping = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = null, source = null)
      __obj.asInstanceOf[OriginalMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OriginalMapping] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Array<infer V> ? std.Array<V> | std.Readonly<std.Array<V>> | @jridgewell/trace-mapping.@jridgewell/trace-mapping/dist/types/types.RoArray<V> | std.Readonly<@jridgewell/trace-mapping.@jridgewell/trace-mapping/dist/types/types.RoArray<V>> : T extends object ? T | std.Readonly<T> | @jridgewell/trace-mapping.@jridgewell/trace-mapping/dist/types/types.RoObject<T> | std.Readonly<@jridgewell/trace-mapping.@jridgewell/trace-mapping/dist/types/types.RoObject<T>> : T
    }}}
    */
  type Ro[T] = T
  
  type RoArray[T] = js.Array[Ro[T]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: T[K] | @jridgewell/trace-mapping.@jridgewell/trace-mapping/dist/types/types.Ro<T[K]>}
    }}}
    */
  @js.native
  trait RoObject[T] extends StObject
  
  trait Section extends StObject {
    
    var map: EncodedSourceMap | DecodedSourceMap | SectionedSourceMap
    
    var offset: Column
  }
  object Section {
    
    inline def apply(map: EncodedSourceMap | DecodedSourceMap | SectionedSourceMap, offset: Column): Section = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Section]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Section] (val x: Self) extends AnyVal {
      
      inline def setMap(value: EncodedSourceMap | DecodedSourceMap | SectionedSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Column): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait SectionedSourceMap extends StObject {
    
    var file: js.UndefOr[String | Null] = js.undefined
    
    var sections: js.Array[Section]
    
    var version: `3`
  }
  object SectionedSourceMap {
    
    inline def apply(sections: js.Array[Section]): SectionedSourceMap = {
      val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any], version = 3)
      __obj.asInstanceOf[SectionedSourceMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SectionedSourceMap] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileNull: Self = StObject.set(x, "file", null)
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setSections(value: js.Array[Section]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      inline def setSectionsVarargs(value: Section*): Self = StObject.set(x, "sections", js.Array(value*))
      
      inline def setVersion(value: `3`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type SectionedSourceMapInput = SourceMapInput | Ro[SectionedSourceMap]
  
  type SourceMapInput = String | (Ro[DecodedSourceMap | EncodedSourceMap]) | TraceMap
  
  trait SourceMapV3 extends StObject {
    
    var file: js.UndefOr[String | Null] = js.undefined
    
    var names: js.Array[String]
    
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    var sources: js.Array[String | Null]
    
    var sourcesContent: js.UndefOr[js.Array[String | Null]] = js.undefined
    
    var version: `3`
  }
  object SourceMapV3 {
    
    inline def apply(names: js.Array[String], sources: js.Array[String | Null]): SourceMapV3 = {
      val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = 3)
      __obj.asInstanceOf[SourceMapV3]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceMapV3] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileNull: Self = StObject.set(x, "file", null)
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSources(value: js.Array[String | Null]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String | Null]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      inline def setSourcesContentVarargs(value: (String | Null)*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: (String | Null)*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVersion(value: `3`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceNeedle extends StObject {
    
    var bias: js.UndefOr[Bias] = js.undefined
    
    var column: Double
    
    var line: Double
    
    var source: String
  }
  object SourceNeedle {
    
    inline def apply(column: Double, line: Double, source: String): SourceNeedle = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceNeedle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceNeedle] (val x: Self) extends AnyVal {
      
      inline def setBias(value: Bias): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
