package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.webpackChunkMod.WebpackChunk
import typings.licenseWebpackPlugin.webpackChunkModuleMod.WebpackChunkModule
import typings.licenseWebpackPlugin.webpackCompilationMod.WebpackCompilation
import typings.licenseWebpackPlugin.webpackStatsMod.WebpackStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackChunkModuleIteratorMod {
  
  @JSImport("license-webpack-plugin/dist/WebpackChunkModuleIterator", "WebpackChunkModuleIterator")
  @js.native
  open class WebpackChunkModuleIterator () extends StObject {
    
    def iterateModules(
      compilation: WebpackCompilation,
      chunk: WebpackChunk,
      stats: Unit,
      callback: js.Function1[/* module */ WebpackChunkModule, Unit]
    ): Unit = js.native
    def iterateModules(
      compilation: WebpackCompilation,
      chunk: WebpackChunk,
      stats: WebpackStats,
      callback: js.Function1[/* module */ WebpackChunkModule, Unit]
    ): Unit = js.native
    
    /* private */ var statsIterator: Any = js.native
  }
}
