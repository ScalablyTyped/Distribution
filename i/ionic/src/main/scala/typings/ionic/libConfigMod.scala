package typings.ionic

import typings.ionic.anon.PartialConfigFile
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.ConfigFile
import typings.ionic.definitionsMod.IConfig
import typings.ionicCliFramework.libConfigMod.BaseConfigOptions
import typings.minimist.mod.ParsedArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigMod {
  
  @JSImport("ionic/lib/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/config", "CONFIG_FILE")
  @js.native
  val CONFIG_FILE: /* "config.json" */ String = js.native
  
  @JSImport("ionic/lib/config", "Config")
  @js.native
  open class Config protected () extends IConfig {
    def this(p: String) = this()
    def this(p: String, options: BaseConfigOptions) = this()
    
    def provideDefaults(config: PartialConfigFile): ConfigFile = js.native
  }
  
  @JSImport("ionic/lib/config", "DEFAULT_CONFIG_DIRECTORY")
  @js.native
  val DEFAULT_CONFIG_DIRECTORY: String = js.native
  
  @JSImport("ionic/lib/config", "GLOBAL_OPTIONS")
  @js.native
  val GLOBAL_OPTIONS: js.Array[CommandMetadataOption] = js.native
  
  inline def parseGlobalOptions(pargv: js.Array[String]): ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGlobalOptions")(pargv.asInstanceOf[js.Any]).asInstanceOf[ParsedArgs]
}
