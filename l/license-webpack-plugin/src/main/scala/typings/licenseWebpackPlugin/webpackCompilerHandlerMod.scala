package typings.licenseWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.licenseWebpackPlugin.assetManagerMod.AssetManager
import typings.licenseWebpackPlugin.chunkIncludeExcludeTesterMod.ChunkIncludeExcludeTester
import typings.licenseWebpackPlugin.moduleCacheMod.ModuleCache
import typings.licenseWebpackPlugin.moduleMod.Module
import typings.licenseWebpackPlugin.webpackChunkHandlerMod.WebpackChunkHandler
import typings.licenseWebpackPlugin.webpackCompilerMod.WebpackCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackCompilerHandlerMod {
  
  @JSImport("license-webpack-plugin/dist/WebpackCompilerHandler", "WebpackCompilerHandler")
  @js.native
  open class WebpackCompilerHandler protected () extends StObject {
    def this(
      chunkIncludeTester: ChunkIncludeExcludeTester,
      chunkHandler: WebpackChunkHandler,
      assetManager: AssetManager,
      moduleCache: ModuleCache,
      addBanner: Boolean,
      perChunkOutput: Boolean,
      additionalChunkModules: StringDictionary[js.Array[Module]],
      additionalModules: js.Array[Module],
      skipChildCompilers: Boolean
    ) = this()
    
    /* private */ var addBanner: Any = js.native
    
    /* private */ var additionalChunkModules: Any = js.native
    
    /* private */ var additionalModules: Any = js.native
    
    /* private */ var assetManager: Any = js.native
    
    /* private */ var chunkHandler: Any = js.native
    
    /* private */ var chunkIncludeTester: Any = js.native
    
    def handleCompiler(compiler: WebpackCompiler): Unit = js.native
    
    /* private */ var iterateChunks: Any = js.native
    
    /* private */ var iterateChunksForBanner: Any = js.native
    
    /* private */ var moduleCache: Any = js.native
    
    /* private */ var perChunkOutput: Any = js.native
    
    /* private */ var skipChildCompilers: Any = js.native
  }
  object WebpackCompilerHandler {
    
    @JSImport("license-webpack-plugin/dist/WebpackCompilerHandler", "WebpackCompilerHandler")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("license-webpack-plugin/dist/WebpackCompilerHandler", "WebpackCompilerHandler.PROCESS_ASSETS_STAGE_ADDITIONS")
    @js.native
    def PROCESS_ASSETS_STAGE_ADDITIONS: Double = js.native
    inline def PROCESS_ASSETS_STAGE_ADDITIONS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_ADDITIONS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("license-webpack-plugin/dist/WebpackCompilerHandler", "WebpackCompilerHandler.PROCESS_ASSETS_STAGE_REPORT")
    @js.native
    def PROCESS_ASSETS_STAGE_REPORT: Double = js.native
    inline def PROCESS_ASSETS_STAGE_REPORT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_REPORT")(x.asInstanceOf[js.Any])
  }
}
