package typings.karma.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var LOG_DEBUG: String
  var LOG_DISABLE: String
  var LOG_ERROR: String
  var LOG_INFO: String
  var LOG_WARN: String
  def set(config: ConfigOptions): Unit
}

object Config {
  @scala.inline
  def apply(
    LOG_DEBUG: String,
    LOG_DISABLE: String,
    LOG_ERROR: String,
    LOG_INFO: String,
    LOG_WARN: String,
    set: ConfigOptions => Unit
  ): Config = {
    val __obj = js.Dynamic.literal(LOG_DEBUG = LOG_DEBUG.asInstanceOf[js.Any], LOG_DISABLE = LOG_DISABLE.asInstanceOf[js.Any], LOG_ERROR = LOG_ERROR.asInstanceOf[js.Any], LOG_INFO = LOG_INFO.asInstanceOf[js.Any], LOG_WARN = LOG_WARN.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Config]
  }
}

@JSImport("karma", "config")
@js.native
object config extends js.Object {
  def parseConfig(configFilePath: String, cliOptions: ConfigOptions): Config = js.native
}

