package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.webpackChunkModuleMod.WebpackChunkModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackInnerModuleIteratorMod {
  
  @JSImport("license-webpack-plugin/dist/WebpackInnerModuleIterator", "WebpackInnerModuleIterator")
  @js.native
  open class WebpackInnerModuleIterator protected () extends StObject {
    def this(requireResolve: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequireResolve */ Any) = this()
    
    def getActualFilename(): String | Null = js.native
    def getActualFilename(filename: String): String | Null = js.native
    
    /* private */ var internalCallback: Any = js.native
    
    def iterateModules(chunkModule: WebpackChunkModule, callback: js.Function1[/* module */ WebpackChunkModule, Unit]): Unit = js.native
    
    /* private */ var requireResolve: Any = js.native
  }
}
