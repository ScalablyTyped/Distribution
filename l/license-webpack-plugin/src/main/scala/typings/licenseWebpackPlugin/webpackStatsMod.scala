package typings.licenseWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackStatsMod {
  
  trait WebpackStats extends StObject {
    
    var chunks: js.Array[WebpackStatsChunk]
  }
  object WebpackStats {
    
    inline def apply(chunks: js.Array[WebpackStatsChunk]): WebpackStats = {
      val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackStats]
    }
    
    extension [Self <: WebpackStats](x: Self) {
      
      inline def setChunks(value: js.Array[WebpackStatsChunk]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksVarargs(value: WebpackStatsChunk*): Self = StObject.set(x, "chunks", js.Array(value*))
    }
  }
  
  trait WebpackStatsChunk extends StObject {
    
    var modules: js.Array[WebpackStatsModule]
    
    var names: js.Array[String]
  }
  object WebpackStatsChunk {
    
    inline def apply(modules: js.Array[WebpackStatsModule], names: js.Array[String]): WebpackStatsChunk = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackStatsChunk]
    }
    
    extension [Self <: WebpackStatsChunk](x: Self) {
      
      inline def setModules(value: js.Array[WebpackStatsModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesVarargs(value: WebpackStatsModule*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    }
  }
  
  trait WebpackStatsModule extends StObject {
    
    var identifier: String
    
    var modules: js.UndefOr[js.Array[WebpackStatsModule]] = js.undefined
  }
  object WebpackStatsModule {
    
    inline def apply(identifier: String): WebpackStatsModule = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackStatsModule]
    }
    
    extension [Self <: WebpackStatsModule](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setModules(value: js.Array[WebpackStatsModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setModulesVarargs(value: WebpackStatsModule*): Self = StObject.set(x, "modules", js.Array(value*))
    }
  }
}
