package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.fileHandlerMod.FileHandler
import typings.licenseWebpackPlugin.fileSystemMod.FileSystem
import typings.licenseWebpackPlugin.licensePolicyMod.LicensePolicy
import typings.licenseWebpackPlugin.licenseTextReaderMod.LicenseTextReader
import typings.licenseWebpackPlugin.licenseTypeIdentifierMod.LicenseTypeIdentifier
import typings.licenseWebpackPlugin.loggerMod.Logger
import typings.licenseWebpackPlugin.webpackChunkHandlerMod.WebpackChunkHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginChunkReadHandlerMod {
  
  @JSImport("license-webpack-plugin/dist/PluginChunkReadHandler", "PluginChunkReadHandler")
  @js.native
  open class PluginChunkReadHandler protected ()
    extends StObject
       with WebpackChunkHandler {
    def this(
      logger: Logger,
      fileHandler: FileHandler,
      licenseTypeIdentifier: LicenseTypeIdentifier,
      licenseTextReader: LicenseTextReader,
      licensePolicy: LicensePolicy,
      fileSystem: FileSystem
    ) = this()
    
    /* private */ var extractIdentifiedModule: Any = js.native
    
    /* private */ var fileHandler: Any = js.native
    
    /* private */ var fileSystem: Any = js.native
    
    /* private */ var getPackageJson: Any = js.native
    
    /* private */ var innerModuleIterator: Any = js.native
    
    /* private */ var licensePolicy: Any = js.native
    
    /* private */ var licenseTextReader: Any = js.native
    
    /* private */ var licenseTypeIdentifier: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var moduleIterator: Any = js.native
  }
}
