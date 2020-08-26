package typings.koaJoiRouter.mod

import typings.koa.mod.Context
import typings.koa.mod.Next
import typings.koaJoiRouter.anon.ContinueOnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var meta: js.UndefOr[js.Any] = js.native
  var pre: js.UndefOr[Handler] = js.native
  var validate: js.UndefOr[ContinueOnError] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setPreFunction2(value: (/* ctx */ Context, /* next */ Next) => js.Any): Self = this.set("pre", js.Any.fromFunction2(value))
    @scala.inline
    def setPre(value: Handler): Self = this.set("pre", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
    @scala.inline
    def setValidate(value: ContinueOnError): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

