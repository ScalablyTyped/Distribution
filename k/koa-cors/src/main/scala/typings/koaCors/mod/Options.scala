package typings.koaCors.mod

import typings.koa.mod.Request
import typings.koaCors.koaCorsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var credentials: js.UndefOr[`true`] = js.native
  var expose: js.UndefOr[String | js.Array[String]] = js.native
  var headers: js.UndefOr[String | js.Array[String]] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var methods: js.UndefOr[String | js.Array[String]] = js.native
  var origin: js.UndefOr[Boolean | String | (js.Function1[/* request */ Request, String])] = js.native
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
    def setCredentials(value: `true`): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setExposeVarargs(value: String*): Self = this.set("expose", js.Array(value :_*))
    @scala.inline
    def setExpose(value: String | js.Array[String]): Self = this.set("expose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpose: Self = this.set("expose", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: String | js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setMethodsVarargs(value: String*): Self = this.set("methods", js.Array(value :_*))
    @scala.inline
    def setMethods(value: String | js.Array[String]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setOriginFunction1(value: /* request */ Request => String): Self = this.set("origin", js.Any.fromFunction1(value))
    @scala.inline
    def setOrigin(value: Boolean | String | (js.Function1[/* request */ Request, String])): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

