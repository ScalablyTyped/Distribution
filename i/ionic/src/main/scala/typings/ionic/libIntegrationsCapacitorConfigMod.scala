package typings.ionic

import typings.ionic.anon.OriginalUrl
import typings.ionicCliFramework.libConfigMod.BaseConfigOptions
import typings.ionicCliFramework.mod.BaseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegrationsCapacitorConfigMod {
  
  @JSImport("ionic/lib/integrations/capacitor/config", "CAPACITOR_CONFIG_FILE")
  @js.native
  val CAPACITOR_CONFIG_FILE: /* "capacitor.config.json" */ String = js.native
  
  @JSImport("ionic/lib/integrations/capacitor/config", "CapacitorConfig")
  @js.native
  open class CapacitorConfig protected () extends BaseConfig[CapacitorConfigFile] {
    def this(p: String) = this()
    def this(p: String, hasSpacesPathPrefix: BaseConfigOptions) = this()
    
    def resetServerUrl(): Unit = js.native
    
    def setServerUrl(url: String): Unit = js.native
  }
  
  trait CapacitorConfigFile extends StObject {
    
    var appId: js.UndefOr[String] = js.undefined
    
    var appName: js.UndefOr[String] = js.undefined
    
    var server: js.UndefOr[OriginalUrl] = js.undefined
    
    var webDir: js.UndefOr[String] = js.undefined
  }
  object CapacitorConfigFile {
    
    inline def apply(): CapacitorConfigFile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CapacitorConfigFile]
    }
    
    extension [Self <: CapacitorConfigFile](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setServer(value: OriginalUrl): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setWebDir(value: String): Self = StObject.set(x, "webDir", value.asInstanceOf[js.Any])
      
      inline def setWebDirUndefined: Self = StObject.set(x, "webDir", js.undefined)
    }
  }
}
