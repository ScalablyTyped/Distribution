package typings.log4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var context: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[typings.log4js.mod.Format] = js.native
  var level: js.UndefOr[String] = js.native
  var nolog: js.UndefOr[js.Any] = js.native
  var statusRules: js.UndefOr[js.Array[_]] = js.native
}

object Context {
  @scala.inline
  def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
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
    def setContext(value: Boolean): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setFormatFunction3(
      value: (/* req */ js.Any, /* res */ js.Any, /* formatter */ js.Function1[/* str */ String, String]) => String
    ): Self = this.set("format", js.Any.fromFunction3(value))
    @scala.inline
    def setFormat(value: typings.log4js.mod.Format): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setNolog(value: js.Any): Self = this.set("nolog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNolog: Self = this.set("nolog", js.undefined)
    @scala.inline
    def setStatusRulesVarargs(value: js.Any*): Self = this.set("statusRules", js.Array(value :_*))
    @scala.inline
    def setStatusRules(value: js.Array[_]): Self = this.set("statusRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusRules: Self = this.set("statusRules", js.undefined)
  }
  
}

