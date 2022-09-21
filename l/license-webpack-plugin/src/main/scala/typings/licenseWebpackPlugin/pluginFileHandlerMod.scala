package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.fileHandlerMod.FileHandler
import typings.licenseWebpackPlugin.fileSystemMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginFileHandlerMod {
  
  @JSImport("license-webpack-plugin/dist/PluginFileHandler", "PluginFileHandler")
  @js.native
  open class PluginFileHandler protected ()
    extends StObject
       with FileHandler {
    def this(
      fileSystem: FileSystem,
      buildRoot: String,
      modulesDirectories: js.Array[String],
      excludedPackageTest: js.Function1[/* packageName */ String, Boolean]
    ) = this()
    def this(
      fileSystem: FileSystem,
      buildRoot: String,
      modulesDirectories: Null,
      excludedPackageTest: js.Function1[/* packageName */ String, Boolean]
    ) = this()
    
    /* private */ var buildRoot: Any = js.native
    
    /* private */ var cache: Any = js.native
    
    /* private */ var dirContainsValidPackageJson: Any = js.native
    
    /* private */ var fileSystem: Any = js.native
    
    /* private */ var findModuleDir: Any = js.native
    
    /* private */ var getModuleInternal: Any = js.native
    
    /* private */ var modulesDirectories: Any = js.native
    
    /* private */ var parsePackageJson: Any = js.native
  }
  object PluginFileHandler {
    
    @JSImport("license-webpack-plugin/dist/PluginFileHandler", "PluginFileHandler")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("license-webpack-plugin/dist/PluginFileHandler", "PluginFileHandler.PACKAGE_JSON")
    @js.native
    def PACKAGE_JSON: String = js.native
    inline def PACKAGE_JSON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PACKAGE_JSON")(x.asInstanceOf[js.Any])
  }
}
