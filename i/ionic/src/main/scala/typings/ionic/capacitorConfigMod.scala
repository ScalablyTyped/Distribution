package typings.ionic

import typings.ionic.anon.OriginalUrl
import typings.ionicCliFramework.configMod.BaseConfigOptions
import typings.ionicCliFramework.mod.BaseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object capacitorConfigMod {
  
  @JSImport("ionic/lib/integrations/capacitor/config", "CAPACITOR_CONFIG_FILE")
  @js.native
  val CAPACITOR_CONFIG_FILE: /* "capacitor.config.json" */ String = js.native
  
  @JSImport("ionic/lib/integrations/capacitor/config", "CapacitorConfig")
  @js.native
  class CapacitorConfig protected () extends BaseConfig[CapacitorConfigFile] {
    def this(p: String) = this()
    def this(p: String, hasPathPrefix: BaseConfigOptions) = this()
    
    def provideDefaults(config: CapacitorConfigFile): CapacitorConfigFile = js.native
    
    def resetServerUrl(): Unit = js.native
    
    def setServerUrl(url: String): Unit = js.native
  }
  
  @js.native
  trait CapacitorConfigFile extends StObject {
    
    var appId: js.UndefOr[String] = js.native
    
    var appName: js.UndefOr[String] = js.native
    
    var server: js.UndefOr[OriginalUrl] = js.native
    
    var webDir: js.UndefOr[String] = js.native
  }
  object CapacitorConfigFile {
    
    @scala.inline
    def apply(): CapacitorConfigFile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CapacitorConfigFile]
    }
    
    @scala.inline
    implicit class CapacitorConfigFileMutableBuilder[Self <: CapacitorConfigFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      @scala.inline
      def setServer(value: OriginalUrl): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      @scala.inline
      def setWebDir(value: String): Self = StObject.set(x, "webDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebDirUndefined: Self = StObject.set(x, "webDir", js.undefined)
    }
  }
}
