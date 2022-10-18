package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.distLicenseIdentifiedModuleMod.LicenseIdentifiedModule
import typings.licenseWebpackPlugin.distModuleCacheMod.ModuleCache
import typings.licenseWebpackPlugin.distWebpackChunkMod.WebpackChunk
import typings.licenseWebpackPlugin.distWebpackCompilationMod.WebpackCompilation
import typings.licenseWebpackPlugin.distWebpackStatsMod.WebpackStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebpackChunkHandlerMod {
  
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
