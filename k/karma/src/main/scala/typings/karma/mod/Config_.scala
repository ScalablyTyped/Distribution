package typings.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config_ extends js.Object {
  var LOG_DEBUG: String = js.native
  var LOG_DISABLE: String = js.native
  var LOG_ERROR: String = js.native
  var LOG_INFO: String = js.native
  var LOG_WARN: String = js.native
  def set(config: ConfigOptions): Unit = js.native
}

object Config_ {
  @scala.inline
  def apply(
    LOG_DEBUG: String,
    LOG_DISABLE: String,
    LOG_ERROR: String,
    LOG_INFO: String,
    LOG_WARN: String,
    set: ConfigOptions => Unit
  ): Config_ = {
    val __obj = js.Dynamic.literal(LOG_DEBUG = LOG_DEBUG.asInstanceOf[js.Any], LOG_DISABLE = LOG_DISABLE.asInstanceOf[js.Any], LOG_ERROR = LOG_ERROR.asInstanceOf[js.Any], LOG_INFO = LOG_INFO.asInstanceOf[js.Any], LOG_WARN = LOG_WARN.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Config_]
  }
  @scala.inline
  implicit class Config_Ops[Self <: Config_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLOG_DEBUG(value: String): Self = this.set("LOG_DEBUG", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOG_DISABLE(value: String): Self = this.set("LOG_DISABLE", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOG_ERROR(value: String): Self = this.set("LOG_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOG_INFO(value: String): Self = this.set("LOG_INFO", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOG_WARN(value: String): Self = this.set("LOG_WARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: ConfigOptions => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

