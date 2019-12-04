package typings.ionic

import typings.atIonicCliDashFramework.libConfigMod.BaseConfigOptions
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.IConfig
import typings.ionic.ionicStrings.configDOTjson
import typings.minimist.minimistMod.ParsedArgs
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
  
  val CONFIG_FILE: configDOTjson = js.native
  val DEFAULT_CONFIG_DIRECTORY: String = js.native
  val GLOBAL_OPTIONS: js.Array[CommandMetadataOption] = js.native
  def parseGlobalOptions(pargv: js.Array[String]): ParsedArgs = js.native
}

