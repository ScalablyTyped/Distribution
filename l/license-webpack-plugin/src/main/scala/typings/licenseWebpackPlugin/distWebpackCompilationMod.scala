package typings.licenseWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.licenseWebpackPlugin.anon.Basename
import typings.licenseWebpackPlugin.anon.OptimizeChunkAssets
import typings.licenseWebpackPlugin.anon.ToJson
import typings.licenseWebpackPlugin.distChunkGraphMod.ChunkGraph
import typings.licenseWebpackPlugin.distWebpackChunkMod.WebpackChunk
import typings.licenseWebpackPlugin.distWebpackCompilerMod.WebpackCompiler
import typings.std.IterableIterator
import typings.webpackSources.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebpackCompilationMod {
  
  trait WebpackCompilation extends StObject {
    
    var assets: StringDictionary[Source]
    
    var chunkGraph: js.UndefOr[ChunkGraph] = js.undefined
    
    var chunks: IterableIterator[WebpackChunk]
    
    var compiler: WebpackCompiler
    
    var errors: js.Array[Any]
    
    def getPath(filename: String, data: Basename): String
    
    def getStats(): ToJson
    
    var hash: String
    
    var hooks: OptimizeChunkAssets
    
    var plugin: js.UndefOr[js.Function2[/* phase */ String, /* callback */ js.Function, Unit]] = js.undefined
    
    var warnings: js.Array[Any]
  }
  object WebpackCompilation {
    
    inline def apply(
      assets: StringDictionary[Source],
      chunks: IterableIterator[WebpackChunk],
      compiler: WebpackCompiler,
      errors: js.Array[Any],
      getPath: (String, Basename) => String,
      getStats: () => ToJson,
      hash: String,
      hooks: OptimizeChunkAssets,
      warnings: js.Array[Any]
    ): WebpackCompilation = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], getPath = js.Any.fromFunction2(getPath), getStats = js.Any.fromFunction0(getStats), hash = hash.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackCompilation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebpackCompilation] (val x: Self) extends AnyVal {
      
      inline def setAssets(value: StringDictionary[Source]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
      
      inline def setChunkGraphUndefined: Self = StObject.set(x, "chunkGraph", js.undefined)
      
      inline def setChunks(value: IterableIterator[WebpackChunk]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setCompiler(value: WebpackCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Any*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setGetPath(value: (String, Basename) => String): Self = StObject.set(x, "getPath", js.Any.fromFunction2(value))
      
      inline def setGetStats(value: () => ToJson): Self = StObject.set(x, "getStats", js.Any.fromFunction0(value))
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHooks(value: OptimizeChunkAssets): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: (/* phase */ String, /* callback */ js.Function) => Unit): Self = StObject.set(x, "plugin", js.Any.fromFunction2(value))
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setWarnings(value: js.Array[Any]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: Any*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait WebpackStatsOptions extends StObject {
    
    var all: js.UndefOr[Boolean] = js.undefined
    
    var cachedModules: js.UndefOr[Boolean] = js.undefined
    
    var chunkModules: js.UndefOr[Boolean] = js.undefined
    
    var chunks: js.UndefOr[Boolean] = js.undefined
    
    var dependentModules: js.UndefOr[Boolean] = js.undefined
    
    var nestedModules: js.UndefOr[Boolean] = js.undefined
  }
  object WebpackStatsOptions {
    
    inline def apply(): WebpackStatsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebpackStatsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebpackStatsOptions] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setCachedModules(value: Boolean): Self = StObject.set(x, "cachedModules", value.asInstanceOf[js.Any])
      
      inline def setCachedModulesUndefined: Self = StObject.set(x, "cachedModules", js.undefined)
      
      inline def setChunkModules(value: Boolean): Self = StObject.set(x, "chunkModules", value.asInstanceOf[js.Any])
      
      inline def setChunkModulesUndefined: Self = StObject.set(x, "chunkModules", js.undefined)
      
      inline def setChunks(value: Boolean): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
      
      inline def setDependentModules(value: Boolean): Self = StObject.set(x, "dependentModules", value.asInstanceOf[js.Any])
      
      inline def setDependentModulesUndefined: Self = StObject.set(x, "dependentModules", js.undefined)
      
      inline def setNestedModules(value: Boolean): Self = StObject.set(x, "nestedModules", value.asInstanceOf[js.Any])
      
      inline def setNestedModulesUndefined: Self = StObject.set(x, "nestedModules", js.undefined)
    }
  }
}
