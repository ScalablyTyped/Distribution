package typings.jridgewellTraceMapping

import typings.jridgewellTraceMapping.distTypesSourcemapSegmentMod.SourceMapSegment
import typings.jridgewellTraceMapping.distTypesTypesMod.EachMapping
import typings.jridgewellTraceMapping.jridgewellTraceMappingInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    inline def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeneratedColumn
    extends StObject
       with EachMapping {
    
    var generatedColumn: Double
    
    var generatedLine: Double
    
    var name: Null
    
    var originalColumn: Null
    
    var originalLine: Null
    
    var source: Null
  }
  object GeneratedColumn {
    
    inline def apply(
      generatedColumn: Double,
      generatedLine: Double,
      name: Null,
      originalColumn: Null,
      originalLine: Null,
      source: Null
    ): GeneratedColumn = {
      val __obj = js.Dynamic.literal(generatedColumn = generatedColumn.asInstanceOf[js.Any], generatedLine = generatedLine.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalColumn = originalColumn.asInstanceOf[js.Any], originalLine = originalLine.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratedColumn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeneratedColumn] (val x: Self) extends AnyVal {
      
      inline def setGeneratedColumn(value: Double): Self = StObject.set(x, "generatedColumn", value.asInstanceOf[js.Any])
      
      inline def setGeneratedLine(value: Double): Self = StObject.set(x, "generatedLine", value.asInstanceOf[js.Any])
      
      inline def setName(value: Null): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOriginalColumn(value: Null): Self = StObject.set(x, "originalColumn", value.asInstanceOf[js.Any])
      
      inline def setOriginalLine(value: Null): Self = StObject.set(x, "originalLine", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Null): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeneratedLine
    extends StObject
       with EachMapping {
    
    var generatedColumn: Double
    
    var generatedLine: Double
    
    var name: String | Null
    
    var originalColumn: Double
    
    var originalLine: Double
    
    var source: String | Null
  }
  object GeneratedLine {
    
    inline def apply(generatedColumn: Double, generatedLine: Double, originalColumn: Double, originalLine: Double): GeneratedLine = {
      val __obj = js.Dynamic.literal(generatedColumn = generatedColumn.asInstanceOf[js.Any], generatedLine = generatedLine.asInstanceOf[js.Any], originalColumn = originalColumn.asInstanceOf[js.Any], originalLine = originalLine.asInstanceOf[js.Any], name = null, source = null)
      __obj.asInstanceOf[GeneratedLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeneratedLine] (val x: Self) extends AnyVal {
      
      inline def setGeneratedColumn(value: Double): Self = StObject.set(x, "generatedColumn", value.asInstanceOf[js.Any])
      
      inline def setGeneratedLine(value: Double): Self = StObject.set(x, "generatedLine", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setOriginalColumn(value: Double): Self = StObject.set(x, "originalColumn", value.asInstanceOf[js.Any])
      
      inline def setOriginalLine(value: Double): Self = StObject.set(x, "originalLine", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
    }
  }
  
  /* Inlined std.Omit<@jridgewell/trace-mapping.@jridgewell/trace-mapping/dist/types/types.DecodedSourceMap, 'mappings'> & {  mappings :std.Array<std.Array<@jridgewell/trace-mapping.@jridgewell/trace-mapping/dist/types/sourcemap-segment.SourceMapSegment>>} */
  trait OmitDecodedSourceMapmappi extends StObject {
    
    var file: js.UndefOr[String | Null] = js.undefined
    
    var mappings: js.Array[js.Array[SourceMapSegment]]
    
    var names: js.Array[String]
    
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    var sources: js.Array[String | Null]
    
    var sourcesContent: js.UndefOr[js.Array[String | Null]] = js.undefined
    
    var version: `3`
  }
  object OmitDecodedSourceMapmappi {
    
    inline def apply(
      mappings: js.Array[js.Array[SourceMapSegment]],
      names: js.Array[String],
      sources: js.Array[String | Null]
    ): OmitDecodedSourceMapmappi = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = 3)
      __obj.asInstanceOf[OmitDecodedSourceMapmappi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitDecodedSourceMapmappi] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileNull: Self = StObject.set(x, "file", null)
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setMappings(value: js.Array[js.Array[SourceMapSegment]]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setMappingsVarargs(value: js.Array[SourceMapSegment]*): Self = StObject.set(x, "mappings", js.Array(value*))
      
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
}
