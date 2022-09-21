package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.fileSystemMod.FileSystem
import typings.licenseWebpackPlugin.licenseFilesOverridesMod.LicenseFileOverrides
import typings.licenseWebpackPlugin.licenseTextOverridesMod.LicenseTextOverrides
import typings.licenseWebpackPlugin.loggerMod.Logger
import typings.licenseWebpackPlugin.moduleMod.Module
import typings.licenseWebpackPlugin.webpackCompilationMod.WebpackCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object licenseTextReaderMod {
  
  @JSImport("license-webpack-plugin/dist/LicenseTextReader", "LicenseTextReader")
  @js.native
  open class LicenseTextReader protected () extends StObject {
    def this(
      logger: Logger,
      fileSystem: FileSystem,
      fileOverrides: LicenseFileOverrides,
      textOverrides: LicenseTextOverrides,
      templateDir: String,
      handleMissingLicenseText: js.Function2[/* packageName */ String, /* licenseType */ String | Null, String | Null]
    ) = this()
    def this(
      logger: Logger,
      fileSystem: FileSystem,
      fileOverrides: LicenseFileOverrides,
      textOverrides: LicenseTextOverrides,
      templateDir: Unit,
      handleMissingLicenseText: js.Function2[/* packageName */ String, /* licenseType */ String | Null, String | Null]
    ) = this()
    
    /* private */ var fileOverrides: Any = js.native
    
    /* private */ var fileSystem: Any = js.native
    
    /* private */ var guessLicenseFilename: Any = js.native
    
    /* private */ var handleMissingLicenseText: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    def readLicense(compilation: WebpackCompilation, module: Module): String | Null = js.native
    def readLicense(compilation: WebpackCompilation, module: Module, licenseType: String): String | Null = js.native
    
    def readText(directory: String, filename: String): String = js.native
    
    /* private */ var templateDir: Any = js.native
    
    /* private */ var textOverrides: Any = js.native
  }
}
