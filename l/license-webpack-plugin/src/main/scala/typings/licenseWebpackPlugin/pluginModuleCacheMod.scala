package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.licenseIdentifiedModuleMod.LicenseIdentifiedModule
import typings.licenseWebpackPlugin.moduleCacheMod.ModuleCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginModuleCacheMod {
  
  @JSImport("license-webpack-plugin/dist/PluginModuleCache", "PluginModuleCache")
  @js.native
  open class PluginModuleCache ()
    extends StObject
       with ModuleCache {
    
    /* CompleteClass */
    override def alreadySeenForChunk(chunkName: String, packageName: String): Boolean = js.native
    
    /* private */ var chunkCache: Any = js.native
    
    /* private */ var chunkSeenCache: Any = js.native
    
    /* CompleteClass */
    override def getAllModules(): js.Array[LicenseIdentifiedModule] = js.native
    
    /* CompleteClass */
    override def getAllModulesForChunk(chunkName: String): js.Array[LicenseIdentifiedModule] = js.native
    
    /* CompleteClass */
    override def getModule(packageName: String): LicenseIdentifiedModule | Null = js.native
    
    /* CompleteClass */
    override def markSeenForChunk(chunkName: String, packageName: String): Unit = js.native
    
    /* CompleteClass */
    override def registerModule(chunkName: String, module: LicenseIdentifiedModule): Unit = js.native
    
    /* private */ var totalCache: Any = js.native
  }
}
