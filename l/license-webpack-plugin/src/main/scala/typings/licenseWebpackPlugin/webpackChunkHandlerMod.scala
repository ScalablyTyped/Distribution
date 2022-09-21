package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.licenseIdentifiedModuleMod.LicenseIdentifiedModule
import typings.licenseWebpackPlugin.moduleCacheMod.ModuleCache
import typings.licenseWebpackPlugin.webpackChunkMod.WebpackChunk
import typings.licenseWebpackPlugin.webpackCompilationMod.WebpackCompilation
import typings.licenseWebpackPlugin.webpackStatsMod.WebpackStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackChunkHandlerMod {
  
  @js.native
  trait WebpackChunkHandler extends StObject {
    
    def processChunk(compilation: WebpackCompilation, chunk: WebpackChunk, moduleCache: ModuleCache): Unit = js.native
    def processChunk(
      compilation: WebpackCompilation,
      chunk: WebpackChunk,
      moduleCache: ModuleCache,
      stats: WebpackStats
    ): Unit = js.native
    
    def processModule(
      compilation: WebpackCompilation,
      chunk: WebpackChunk,
      moduleCache: ModuleCache,
      module: LicenseIdentifiedModule
    ): Unit = js.native
  }
}
