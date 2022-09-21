package typings.ionic

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionicCliFramework.definitionsMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatesMod {
  
  @JSImport("ionic/lib/updates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUpdateConfig(hasConfig: GetUpdateConfigDeps): js.Promise[UpdateConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUpdateConfig")(hasConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpdateConfig]]
  
  inline def readUpdateConfig(dir: String): js.Promise[UpdateConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateConfig")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpdateConfig]]
  
  inline def runNotify(env: IonicEnvironment, pkg: PersistedPackage, latestVersion: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runNotify")(env.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any], latestVersion.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def runUpdateCheck(hasConfig: PersistPackageVersionsDeps): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runUpdateCheck")(hasConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def runUpdateNotify(env: IonicEnvironment, pkg: PackageJson): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runUpdateNotify")(env.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeUpdateConfig(dir: String, config: UpdateConfig): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUpdateConfig")(dir.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait GetUpdateConfigDeps extends StObject {
    
    val config: IConfig
  }
  object GetUpdateConfigDeps {
    
    inline def apply(config: IConfig): GetUpdateConfigDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetUpdateConfigDeps]
    }
    
    extension [Self <: GetUpdateConfigDeps](x: Self) {
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  trait PersistPackageVersionsDeps extends StObject {
    
    val config: IConfig
  }
  object PersistPackageVersionsDeps {
    
    inline def apply(config: IConfig): PersistPackageVersionsDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistPackageVersionsDeps]
    }
    
    extension [Self <: PersistPackageVersionsDeps](x: Self) {
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  trait PersistedPackage extends StObject {
    
    var name: String
    
    var version: String
  }
  object PersistedPackage {
    
    inline def apply(name: String, version: String): PersistedPackage = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistedPackage]
    }
    
    extension [Self <: PersistedPackage](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateConfig extends StObject {
    
    var lastNotify: js.UndefOr[String] = js.undefined
    
    var lastUpdate: js.UndefOr[String] = js.undefined
    
    var packages: js.Array[PersistedPackage]
  }
  object UpdateConfig {
    
    inline def apply(packages: js.Array[PersistedPackage]): UpdateConfig = {
      val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateConfig]
    }
    
    extension [Self <: UpdateConfig](x: Self) {
      
      inline def setLastNotify(value: String): Self = StObject.set(x, "lastNotify", value.asInstanceOf[js.Any])
      
      inline def setLastNotifyUndefined: Self = StObject.set(x, "lastNotify", js.undefined)
      
      inline def setLastUpdate(value: String): Self = StObject.set(x, "lastUpdate", value.asInstanceOf[js.Any])
      
      inline def setLastUpdateUndefined: Self = StObject.set(x, "lastUpdate", js.undefined)
      
      inline def setPackages(value: js.Array[PersistedPackage]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPackagesVarargs(value: PersistedPackage*): Self = StObject.set(x, "packages", js.Array(value*))
    }
  }
}
