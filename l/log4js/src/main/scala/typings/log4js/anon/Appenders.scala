package typings.log4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Appenders extends js.Object {
  var appenders: js.Array[String] = js.native
  var enableCallStack: js.UndefOr[Boolean] = js.native
  var level: String = js.native
}

object Appenders {
  @scala.inline
  def apply(appenders: js.Array[String], level: String): Appenders = {
    val __obj = js.Dynamic.literal(appenders = appenders.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appenders]
  }
  @scala.inline
  implicit class AppendersOps[Self <: Appenders] (val x: Self) extends AnyVal {
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
    def setAppendersVarargs(value: String*): Self = this.set("appenders", js.Array(value :_*))
    @scala.inline
    def setAppenders(value: js.Array[String]): Self = this.set("appenders", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableCallStack(value: Boolean): Self = this.set("enableCallStack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCallStack: Self = this.set("enableCallStack", js.undefined)
  }
  
}

