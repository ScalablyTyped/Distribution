package typings.ionic

import typings.ionic.anon.PartialConfigFile
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.ConfigFile
import typings.ionic.definitionsMod.IConfig
import typings.ionicCliFramework.configMod.BaseConfigOptions
import typings.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/config", JSImport.Namespace)
@js.native
object libConfigMod extends js.Object {
  @js.native
  class Config protected () extends IConfig {
    def this(p: String) = this()
    def this(p: String, options: BaseConfigOptions) = this()
    def provideDefaults(config: PartialConfigFile): ConfigFile = js.native
  }
  
  val CONFIG_FILE: /* "config.json" */ String = js.native
  val DEFAULT_CONFIG_DIRECTORY: String = js.native
  val GLOBAL_OPTIONS: js.Array[CommandMetadataOption] = js.native
  def parseGlobalOptions(pargv: js.Array[String]): ParsedArgs = js.native
}

