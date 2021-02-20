package typings.hermesProfileTransformer

import typings.hermesProfileTransformer.anon.Mappings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMapMod {
  
  @js.native
  trait SourceMap extends StObject {
    
    var mappings: String = js.native
    
    var names: js.Array[String] = js.native
    
    var sourceContent: js.Array[String] = js.native
    
    var sources: js.Array[String] = js.native
    
    var version: String = js.native
    
    var x_facebook_sources: js.Array[Mappings] | Null = js.native
  }
  object SourceMap {
    
    @scala.inline
    def apply(
      mappings: String,
      names: js.Array[String],
      sourceContent: js.Array[String],
      sources: js.Array[String],
      version: String
    ): SourceMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sourceContent = sourceContent.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMap]
    }
    
    @scala.inline
    implicit class SourceMapMutableBuilder[Self <: SourceMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setSourceContent(value: js.Array[String]): Self = StObject.set(x, "sourceContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceContentVarargs(value: String*): Self = StObject.set(x, "sourceContent", js.Array(value :_*))
      
      @scala.inline
      def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX_facebook_sources(value: js.Array[Mappings]): Self = StObject.set(x, "x_facebook_sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX_facebook_sourcesNull: Self = StObject.set(x, "x_facebook_sources", null)
      
      @scala.inline
      def setX_facebook_sourcesVarargs(value: Mappings*): Self = StObject.set(x, "x_facebook_sources", js.Array(value :_*))
    }
  }
}
