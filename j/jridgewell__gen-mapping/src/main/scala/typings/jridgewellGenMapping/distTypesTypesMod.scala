package typings.jridgewellGenMapping

import typings.jridgewellGenMapping.distTypesSourcemapSegmentMod.SourceMapSegment
import typings.jridgewellGenMapping.jridgewellGenMappingInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.jridgewellGenMapping.anon.Original
    - typings.jridgewellGenMapping.anon.Source
    - typings.jridgewellGenMapping.anon.GeneratedName
  */
  trait Mapping extends StObject
  object Mapping {
    
    inline def GeneratedName(generated: Pos, name: Unit, original: Pos, source: String): typings.jridgewellGenMapping.anon.GeneratedName = {
      val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jridgewellGenMapping.anon.GeneratedName]
    }
    
    inline def Original(generated: Pos, name: Unit, original: Unit, source: Unit): typings.jridgewellGenMapping.anon.Original = {
      val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jridgewellGenMapping.anon.Original]
    }
    
    inline def Source(generated: Pos, name: String, original: Pos, source: String): typings.jridgewellGenMapping.anon.Source = {
      val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jridgewellGenMapping.anon.Source]
    }
  }
  
  trait Pos extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Pos {
    
    inline def apply(column: Double, line: Double): Pos = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pos]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pos] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
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
}
