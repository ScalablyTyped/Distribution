package typings.koa2Cors.mod

import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowHeaders: js.UndefOr[js.Array[String]] = js.native
  var allowMethods: js.UndefOr[js.Array[String]] = js.native
  var credentials: js.UndefOr[Boolean] = js.native
  var exposeHeaders: js.UndefOr[js.Array[String]] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var origin: js.UndefOr[String | (js.Function1[/* ctx */ Context, Boolean | String])] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAllowHeadersVarargs(value: String*): Self = this.set("allowHeaders", js.Array(value :_*))
    @scala.inline
    def setAllowHeaders(value: js.Array[String]): Self = this.set("allowHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHeaders: Self = this.set("allowHeaders", js.undefined)
    @scala.inline
    def setAllowMethodsVarargs(value: String*): Self = this.set("allowMethods", js.Array(value :_*))
    @scala.inline
    def setAllowMethods(value: js.Array[String]): Self = this.set("allowMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMethods: Self = this.set("allowMethods", js.undefined)
    @scala.inline
    def setCredentials(value: Boolean): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setExposeHeadersVarargs(value: String*): Self = this.set("exposeHeaders", js.Array(value :_*))
    @scala.inline
    def setExposeHeaders(value: js.Array[String]): Self = this.set("exposeHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposeHeaders: Self = this.set("exposeHeaders", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setOriginFunction1(value: /* ctx */ Context => Boolean | String): Self = this.set("origin", js.Any.fromFunction1(value))
    @scala.inline
    def setOrigin(value: String | (js.Function1[/* ctx */ Context, Boolean | String])): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

