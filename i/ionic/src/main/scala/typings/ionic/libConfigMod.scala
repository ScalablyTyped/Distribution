package typings.ionic

import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.IConfig
import typings.ionic.ionicStrings.configDotjson
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
  }
  
  val CONFIG_FILE: configDotjson = js.native
  val DEFAULT_CONFIG_DIRECTORY: String = js.native
  val GLOBAL_OPTIONS: js.Array[CommandMetadataOption] = js.native
  def parseGlobalOptions(pargv: js.Array[String]): ParsedArgs = js.native
}

