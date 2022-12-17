package typings.jsreportCore

import typings.jsreportCore.mod.EngineStrategy
import typings.jsreportCore.mod.ReporterOptionsBlobStorageProvider
import typings.jsreportCore.mod.ReporterOptionsStoreProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowedModules extends StObject {
    
    var allowedModules: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var forkOptions: js.UndefOr[ExecArgv] = js.undefined
    
    /**
      * defines the number of worker processes used for generating reports
      * @default 1
      */
    var numberOfWorkers: js.UndefOr[Double] = js.undefined
    
    /** @default 'dedicated-process' */
    var strategy: js.UndefOr[EngineStrategy] = js.undefined
    
    var templateCache: js.UndefOr[Max] = js.undefined
    
    /** sets the reporter timeout in milliseconds */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AllowedModules {
    
    inline def apply(): AllowedModules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowedModules]
    }
    
    extension [Self <: AllowedModules](x: Self) {
      
      inline def setAllowedModules(value: String | js.Array[String]): Self = StObject.set(x, "allowedModules", value.asInstanceOf[js.Any])
      
      inline def setAllowedModulesUndefined: Self = StObject.set(x, "allowedModules", js.undefined)
      
      inline def setAllowedModulesVarargs(value: String*): Self = StObject.set(x, "allowedModules", js.Array(value*))
      
      inline def setForkOptions(value: ExecArgv): Self = StObject.set(x, "forkOptions", value.asInstanceOf[js.Any])
      
      inline def setForkOptionsUndefined: Self = StObject.set(x, "forkOptions", js.undefined)
      
      inline def setNumberOfWorkers(value: Double): Self = StObject.set(x, "numberOfWorkers", value.asInstanceOf[js.Any])
      
      inline def setNumberOfWorkersUndefined: Self = StObject.set(x, "numberOfWorkers", js.undefined)
      
      inline def setStrategy(value: EngineStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setTemplateCache(value: Max): Self = StObject.set(x, "templateCache", value.asInstanceOf[js.Any])
      
      inline def setTemplateCacheUndefined: Self = StObject.set(x, "templateCache", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait DataDirectory extends StObject {
    
    var dataDirectory: js.UndefOr[String] = js.undefined
    
    var provider: js.UndefOr[ReporterOptionsBlobStorageProvider] = js.undefined
  }
  object DataDirectory {
    
    inline def apply(): DataDirectory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataDirectory]
    }
    
    extension [Self <: DataDirectory](x: Self) {
      
      inline def setDataDirectory(value: String): Self = StObject.set(x, "dataDirectory", value.asInstanceOf[js.Any])
      
      inline def setDataDirectoryUndefined: Self = StObject.set(x, "dataDirectory", js.undefined)
      
      inline def setProvider(value: ReporterOptionsBlobStorageProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
  }
  object Enabled {
    
    inline def apply(): Enabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enabled]
    }
    
    extension [Self <: Enabled](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  trait ExecArgv extends StObject {
    
    var execArgv: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ExecArgv {
    
    inline def apply(): ExecArgv = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecArgv]
    }
    
    extension [Self <: ExecArgv](x: Self) {
      
      inline def setExecArgv(value: String | js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      inline def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value*))
    }
  }
  
  trait Max extends StObject {
    
    var enabled: Boolean
    
    var max: Double
  }
  object Max {
    
    inline def apply(enabled: Boolean, max: Double): Max = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<jsreport-core.jsreport-core.RequestOptions> */
  trait PartialRequestOptions extends StObject {
    
    var preview: js.UndefOr[Boolean] = js.undefined
    
    var reportName: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object PartialRequestOptions {
    
    inline def apply(): PartialRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRequestOptions]
    }
    
    extension [Self <: PartialRequestOptions](x: Self) {
      
      inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      inline def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
      
      inline def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Provider extends StObject {
    
    var provider: js.UndefOr[ReporterOptionsStoreProvider] = js.undefined
  }
  object Provider {
    
    inline def apply(): Provider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Provider]
    }
    
    extension [Self <: Provider](x: Self) {
      
      inline def setProvider(value: ReporterOptionsStoreProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
  }
  
  trait SecretKey extends StObject {
    
    /** @default true */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** lenght must be 16 characters */
    var secretKey: String
  }
  object SecretKey {
    
    inline def apply(secretKey: String): SecretKey = {
      val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretKey]
    }
    
    extension [Self <: SecretKey](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Silent extends StObject {
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object Silent {
    
    inline def apply(): Silent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Silent]
    }
    
    extension [Self <: Silent](x: Self) {
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
