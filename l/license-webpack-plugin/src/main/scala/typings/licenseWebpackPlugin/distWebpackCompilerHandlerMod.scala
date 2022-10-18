package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.distWebpackCompilerMod.WebpackCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebpackCompilerHandlerMod {
  
  trait WebpackCompilerHandler extends StObject {
    
    /* private */ var addBanner: Any
    
    /* private */ var additionalChunkModules: Any
    
    /* private */ var additionalModules: Any
    
    /* private */ var assetManager: Any
    
    /* private */ var chunkHandler: Any
    
    /* private */ var chunkIncludeTester: Any
    
    def handleCompiler(compiler: WebpackCompiler): Unit
    
    /* private */ var iterateChunks: Any
    
    /* private */ var iterateChunksForBanner: Any
    
    /* private */ var moduleCache: Any
    
    /* private */ var perChunkOutput: Any
    
    /* private */ var skipChildCompilers: Any
  }
  object WebpackCompilerHandler {
    
    inline def apply(
      addBanner: Any,
      additionalChunkModules: Any,
      additionalModules: Any,
      assetManager: Any,
      chunkHandler: Any,
      chunkIncludeTester: Any,
      handleCompiler: WebpackCompiler => Unit,
      iterateChunks: Any,
      iterateChunksForBanner: Any,
      moduleCache: Any,
      perChunkOutput: Any,
      skipChildCompilers: Any
    ): WebpackCompilerHandler = {
      val __obj = js.Dynamic.literal(addBanner = addBanner.asInstanceOf[js.Any], additionalChunkModules = additionalChunkModules.asInstanceOf[js.Any], additionalModules = additionalModules.asInstanceOf[js.Any], assetManager = assetManager.asInstanceOf[js.Any], chunkHandler = chunkHandler.asInstanceOf[js.Any], chunkIncludeTester = chunkIncludeTester.asInstanceOf[js.Any], handleCompiler = js.Any.fromFunction1(handleCompiler), iterateChunks = iterateChunks.asInstanceOf[js.Any], iterateChunksForBanner = iterateChunksForBanner.asInstanceOf[js.Any], moduleCache = moduleCache.asInstanceOf[js.Any], perChunkOutput = perChunkOutput.asInstanceOf[js.Any], skipChildCompilers = skipChildCompilers.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackCompilerHandler]
    }
    
    extension [Self <: WebpackCompilerHandler](x: Self) {
      
      inline def setAddBanner(value: Any): Self = StObject.set(x, "addBanner", value.asInstanceOf[js.Any])
      
      inline def setAdditionalChunkModules(value: Any): Self = StObject.set(x, "additionalChunkModules", value.asInstanceOf[js.Any])
      
      inline def setAdditionalModules(value: Any): Self = StObject.set(x, "additionalModules", value.asInstanceOf[js.Any])
      
      inline def setAssetManager(value: Any): Self = StObject.set(x, "assetManager", value.asInstanceOf[js.Any])
      
      inline def setChunkHandler(value: Any): Self = StObject.set(x, "chunkHandler", value.asInstanceOf[js.Any])
      
      inline def setChunkIncludeTester(value: Any): Self = StObject.set(x, "chunkIncludeTester", value.asInstanceOf[js.Any])
      
      inline def setHandleCompiler(value: WebpackCompiler => Unit): Self = StObject.set(x, "handleCompiler", js.Any.fromFunction1(value))
      
      inline def setIterateChunks(value: Any): Self = StObject.set(x, "iterateChunks", value.asInstanceOf[js.Any])
      
      inline def setIterateChunksForBanner(value: Any): Self = StObject.set(x, "iterateChunksForBanner", value.asInstanceOf[js.Any])
      
      inline def setModuleCache(value: Any): Self = StObject.set(x, "moduleCache", value.asInstanceOf[js.Any])
      
      inline def setPerChunkOutput(value: Any): Self = StObject.set(x, "perChunkOutput", value.asInstanceOf[js.Any])
      
      inline def setSkipChildCompilers(value: Any): Self = StObject.set(x, "skipChildCompilers", value.asInstanceOf[js.Any])
    }
  }
}
