package typings.ionic

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionicCliFramework.definitionsMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatesMod {
  
  @JSImport("ionic/lib/updates", "getUpdateConfig")
  @js.native
  def getUpdateConfig(hasConfig: GetUpdateConfigDeps): js.Promise[UpdateConfig] = js.native
  
  @JSImport("ionic/lib/updates", "readUpdateConfig")
  @js.native
  def readUpdateConfig(dir: String): js.Promise[UpdateConfig] = js.native
  
  @JSImport("ionic/lib/updates", "runNotify")
  @js.native
  def runNotify(env: IonicEnvironment, pkg: PersistedPackage, latestVersion: String): js.Promise[Unit] = js.native
  
  @JSImport("ionic/lib/updates", "runUpdateCheck")
  @js.native
  def runUpdateCheck(hasConfig: PersistPackageVersionsDeps): js.Promise[Unit] = js.native
  
  @JSImport("ionic/lib/updates", "runUpdateNotify")
  @js.native
  def runUpdateNotify(env: IonicEnvironment, pkg: PackageJson): js.Promise[Unit] = js.native
  
  @JSImport("ionic/lib/updates", "writeUpdateConfig")
  @js.native
  def writeUpdateConfig(dir: String, config: UpdateConfig): js.Promise[Unit] = js.native
  
  @js.native
  trait GetUpdateConfigDeps extends StObject {
    
    val config: IConfig = js.native
  }
  object GetUpdateConfigDeps {
    
    @scala.inline
    def apply(config: IConfig): GetUpdateConfigDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetUpdateConfigDeps]
    }
    
    @scala.inline
    implicit class GetUpdateConfigDepsMutableBuilder[Self <: GetUpdateConfigDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PersistPackageVersionsDeps extends StObject {
    
    val config: IConfig = js.native
  }
  object PersistPackageVersionsDeps {
    
    @scala.inline
    def apply(config: IConfig): PersistPackageVersionsDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistPackageVersionsDeps]
    }
    
    @scala.inline
    implicit class PersistPackageVersionsDepsMutableBuilder[Self <: PersistPackageVersionsDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PersistedPackage extends StObject {
    
    var name: String = js.native
    
    var version: String = js.native
  }
  object PersistedPackage {
    
    @scala.inline
    def apply(name: String, version: String): PersistedPackage = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistedPackage]
    }
    
    @scala.inline
    implicit class PersistedPackageMutableBuilder[Self <: PersistedPackage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateConfig extends StObject {
    
    var lastNotify: js.UndefOr[String] = js.native
    
    var lastUpdate: js.UndefOr[String] = js.native
    
    var packages: js.Array[PersistedPackage] = js.native
  }
  object UpdateConfig {
    
    @scala.inline
    def apply(packages: js.Array[PersistedPackage]): UpdateConfig = {
      val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateConfig]
    }
    
    @scala.inline
    implicit class UpdateConfigMutableBuilder[Self <: UpdateConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastNotify(value: String): Self = StObject.set(x, "lastNotify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastNotifyUndefined: Self = StObject.set(x, "lastNotify", js.undefined)
      
      @scala.inline
      def setLastUpdate(value: String): Self = StObject.set(x, "lastUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdateUndefined: Self = StObject.set(x, "lastUpdate", js.undefined)
      
      @scala.inline
      def setPackages(value: js.Array[PersistedPackage]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackagesVarargs(value: PersistedPackage*): Self = StObject.set(x, "packages", js.Array(value :_*))
    }
  }
}
