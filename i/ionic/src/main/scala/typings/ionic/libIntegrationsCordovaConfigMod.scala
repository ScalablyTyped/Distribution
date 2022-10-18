package typings.ionic

import typings.elementtree.mod.ElementTree
import typings.ionic.anon.RequiredProjectIntegratio
import typings.ionic.anon.Version
import typings.ionic.definitionsMod.CordovaPackageJson
import typings.ionic.definitionsMod.ResourcesPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegrationsCordovaConfigMod {
  
  @JSImport("ionic/lib/integrations/cordova/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/integrations/cordova/config", "CordovaConfig")
  @js.native
  open class CordovaConfig protected () extends StObject {
    def this(configXmlPath: String, packageJsonPath: String) = this()
    
    /* protected */ var _doc: js.UndefOr[ElementTree] = js.native
    
    /* protected */ var _pkg: js.UndefOr[CordovaPackageJson] = js.native
    
    /* protected */ var _sessionid: js.UndefOr[String] = js.native
    
    val configXmlPath: String = js.native
    
    def doc: ElementTree = js.native
    
    def ensurePlatformImages(platform: String, resourcesPlatform: ResourcesPlatform): Unit = js.native
    
    def ensureSplashScreenPreferences(): Unit = js.native
    
    def getBundleId(): js.UndefOr[String] = js.native
    
    def getConfiguredPlatforms(): js.Array[ConfiguredPlatform] = js.native
    
    def getPreference(prefName: String): js.UndefOr[String] = js.native
    
    def getProjectInfo(): Version = js.native
    
    val packageJsonPath: String = js.native
    
    def pkg: CordovaPackageJson = js.native
    
    /* protected */ def reload(): js.Promise[Unit] = js.native
    
    /**
      * Set config.xml src url back to its original url
      */
    def resetContentSrc(): Unit = js.native
    
    def save(): js.Promise[Unit] = js.native
    
    /* protected */ var saving: Boolean = js.native
    
    def sessionid: String = js.native
    
    def setBundleId(bundleId: String): Unit = js.native
    
    def setName(name: String): Unit = js.native
    
    /* protected */ def write(): String = js.native
    
    /**
      * Update config.xml content src to be a dev server url. As part of this
      * backup the original content src for a reset to occur at a later time.
      */
    def writeContentSrc(newSrc: String): Unit = js.native
  }
  /* static members */
  object CordovaConfig {
    
    @JSImport("ionic/lib/integrations/cordova/config", "CordovaConfig")
    @js.native
    val ^ : js.Any = js.native
    
    inline def load(configXmlPath: String, packageJsonPath: String): js.Promise[CordovaConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(configXmlPath.asInstanceOf[js.Any], packageJsonPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CordovaConfig]]
  }
  
  inline def loadCordovaConfig(integration: RequiredProjectIntegratio): js.Promise[CordovaConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCordovaConfig")(integration.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CordovaConfig]]
  
  trait ConfiguredPlatform extends StObject {
    
    var name: String
    
    var spec: js.UndefOr[String] = js.undefined
  }
  object ConfiguredPlatform {
    
    inline def apply(name: String): ConfiguredPlatform = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfiguredPlatform]
    }
    
    extension [Self <: ConfiguredPlatform](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: String): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
