package typings
package karmaLib.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var LOG_DEBUG: java.lang.String
  var LOG_DISABLE: java.lang.String
  var LOG_ERROR: java.lang.String
  var LOG_INFO: java.lang.String
  var LOG_WARN: java.lang.String
  def set(config: ConfigOptions): scala.Unit
}

object Config {
  @scala.inline
  def apply(
    LOG_DEBUG: java.lang.String,
    LOG_DISABLE: java.lang.String,
    LOG_ERROR: java.lang.String,
    LOG_INFO: java.lang.String,
    LOG_WARN: java.lang.String,
    set: js.Function1[ConfigOptions, scala.Unit]
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LOG_DEBUG")(LOG_DEBUG)
    __obj.updateDynamic("LOG_DISABLE")(LOG_DISABLE)
    __obj.updateDynamic("LOG_ERROR")(LOG_ERROR)
    __obj.updateDynamic("LOG_INFO")(LOG_INFO)
    __obj.updateDynamic("LOG_WARN")(LOG_WARN)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[Config]
  }
}

