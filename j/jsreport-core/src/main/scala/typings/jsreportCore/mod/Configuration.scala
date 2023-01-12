package typings.jsreportCore.mod

import typings.jsreportCore.anon.AllowedModules
import typings.jsreportCore.anon.DataDirectory
import typings.jsreportCore.anon.Provider
import typings.jsreportCore.anon.SecretKey
import typings.jsreportCore.anon.Silent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  /** @default false */
  var allowLocalFilesAccess: js.UndefOr[Boolean] = js.undefined
  
  /** specifies directory of the script that was used to start node.js, this value is mostly metadata that is useful for your own code inside jsreport scripts */
  var appDirectory: js.UndefOr[String] = js.undefined
  
  /** specifies if after some interval jsreport should automatically clean up temporary files generated while rendering reports */
  var autoTempCleanup: js.UndefOr[Boolean] = js.undefined
  
  var blobStorage: js.UndefOr[DataDirectory] = js.undefined
  
  var connectionString: js.UndefOr[String] = js.undefined
  
  /** specifies if jsreport should discover/search installed extensions in project and use them automatically */
  var discover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * option that enables passing a custom report timeout per request using req.options.timeout. this enables that the caller of the report generation control the report timeout so enable it
    * only when you trust the caller
    * @default false
    */
  var enableRequestReportTimeout: js.UndefOr[Boolean] = js.undefined
  
  var encryption: js.UndefOr[SecretKey] = js.undefined
  
  var extensions: js.UndefOr[Any] = js.undefined
  
  var extensionsList: js.UndefOr[js.Array[String]] = js.undefined
  
  var httpPort: js.UndefOr[Double] = js.undefined
  
  /**
    * specifies if jsreport should load configuration values from external sources (cli args, env vars, configuration files) or not
    * @default getDefaultLoadConfig()
    */
  var loadConfig: js.UndefOr[Boolean] = js.undefined
  
  var logger: js.UndefOr[Silent] = js.undefined
  
  /** @default true */
  var migrateEntitySetsToFolders: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[Any] = js.undefined
  
  /** global single timeout that controls how much a report generation should wait before it times out */
  var reportTimeout: js.UndefOr[Double] = js.undefined
  
  /** specifies where is the application root and where jsreport searches for extensions */
  var rootDirectory: js.UndefOr[String] = js.undefined
  
  var store: js.UndefOr[Provider] = js.undefined
  
  /**
    * specifies where jsreport stores temporary files used by the conversion pipelineDef
    * @default getDefaultTempDirectory()
    */
  var tempDirectory: js.UndefOr[String] = js.undefined
  
  var templatingEngines: js.UndefOr[AllowedModules] = js.undefined
  
  /**
    * wheter if jsreport should read list of extensions from a previous generated cache or if it should crawl and try to search extensions again, set it to false when you want to always
    * force crawling node_modules when searching for extensions while starting jsreport
    * @default true
    */
  var useExtensionsLocationCache: js.UndefOr[Boolean] = js.undefined
}
object Configuration {
  
  inline def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    inline def setAllowLocalFilesAccess(value: Boolean): Self = StObject.set(x, "allowLocalFilesAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowLocalFilesAccessUndefined: Self = StObject.set(x, "allowLocalFilesAccess", js.undefined)
    
    inline def setAppDirectory(value: String): Self = StObject.set(x, "appDirectory", value.asInstanceOf[js.Any])
    
    inline def setAppDirectoryUndefined: Self = StObject.set(x, "appDirectory", js.undefined)
    
    inline def setAutoTempCleanup(value: Boolean): Self = StObject.set(x, "autoTempCleanup", value.asInstanceOf[js.Any])
    
    inline def setAutoTempCleanupUndefined: Self = StObject.set(x, "autoTempCleanup", js.undefined)
    
    inline def setBlobStorage(value: DataDirectory): Self = StObject.set(x, "blobStorage", value.asInstanceOf[js.Any])
    
    inline def setBlobStorageUndefined: Self = StObject.set(x, "blobStorage", js.undefined)
    
    inline def setConnectionString(value: String): Self = StObject.set(x, "connectionString", value.asInstanceOf[js.Any])
    
    inline def setConnectionStringUndefined: Self = StObject.set(x, "connectionString", js.undefined)
    
    inline def setDiscover(value: Boolean): Self = StObject.set(x, "discover", value.asInstanceOf[js.Any])
    
    inline def setDiscoverUndefined: Self = StObject.set(x, "discover", js.undefined)
    
    inline def setEnableRequestReportTimeout(value: Boolean): Self = StObject.set(x, "enableRequestReportTimeout", value.asInstanceOf[js.Any])
    
    inline def setEnableRequestReportTimeoutUndefined: Self = StObject.set(x, "enableRequestReportTimeout", js.undefined)
    
    inline def setEncryption(value: SecretKey): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setExtensions(value: Any): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsList(value: js.Array[String]): Self = StObject.set(x, "extensionsList", value.asInstanceOf[js.Any])
    
    inline def setExtensionsListUndefined: Self = StObject.set(x, "extensionsList", js.undefined)
    
    inline def setExtensionsListVarargs(value: String*): Self = StObject.set(x, "extensionsList", js.Array(value*))
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setHttpPort(value: Double): Self = StObject.set(x, "httpPort", value.asInstanceOf[js.Any])
    
    inline def setHttpPortUndefined: Self = StObject.set(x, "httpPort", js.undefined)
    
    inline def setLoadConfig(value: Boolean): Self = StObject.set(x, "loadConfig", value.asInstanceOf[js.Any])
    
    inline def setLoadConfigUndefined: Self = StObject.set(x, "loadConfig", js.undefined)
    
    inline def setLogger(value: Silent): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMigrateEntitySetsToFolders(value: Boolean): Self = StObject.set(x, "migrateEntitySetsToFolders", value.asInstanceOf[js.Any])
    
    inline def setMigrateEntitySetsToFoldersUndefined: Self = StObject.set(x, "migrateEntitySetsToFolders", js.undefined)
    
    inline def setMode(value: Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setReportTimeout(value: Double): Self = StObject.set(x, "reportTimeout", value.asInstanceOf[js.Any])
    
    inline def setReportTimeoutUndefined: Self = StObject.set(x, "reportTimeout", js.undefined)
    
    inline def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
    
    inline def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
    
    inline def setStore(value: Provider): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setTempDirectory(value: String): Self = StObject.set(x, "tempDirectory", value.asInstanceOf[js.Any])
    
    inline def setTempDirectoryUndefined: Self = StObject.set(x, "tempDirectory", js.undefined)
    
    inline def setTemplatingEngines(value: AllowedModules): Self = StObject.set(x, "templatingEngines", value.asInstanceOf[js.Any])
    
    inline def setTemplatingEnginesUndefined: Self = StObject.set(x, "templatingEngines", js.undefined)
    
    inline def setUseExtensionsLocationCache(value: Boolean): Self = StObject.set(x, "useExtensionsLocationCache", value.asInstanceOf[js.Any])
    
    inline def setUseExtensionsLocationCacheUndefined: Self = StObject.set(x, "useExtensionsLocationCache", js.undefined)
  }
}
