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
    set: ConfigOptions => scala.Unit
  ): Config = {
    val __obj = js.Dynamic.literal(LOG_DEBUG = LOG_DEBUG, LOG_DISABLE = LOG_DISABLE, LOG_ERROR = LOG_ERROR, LOG_INFO = LOG_INFO, LOG_WARN = LOG_WARN, set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Config]
  }
}

