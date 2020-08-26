package typings.koaJwt.anon

import typings.koa.mod.Context
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Custom extends js.Object {
  var custom: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.native
  var ext: js.UndefOr[String | js.Array[String]] = js.native
  var method: js.UndefOr[String | js.Array[String]] = js.native
  var path: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
}

object Custom {
  @scala.inline
  def apply(): Custom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Custom]
  }
  @scala.inline
  implicit class CustomOps[Self <: Custom] (val x: Self) extends AnyVal {
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
    def setCustom(value: /* ctx */ Context => Boolean): Self = this.set("custom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setExtVarargs(value: String*): Self = this.set("ext", js.Array(value :_*))
    @scala.inline
    def setExt(value: String | js.Array[String]): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setMethodVarargs(value: String*): Self = this.set("method", js.Array(value :_*))
    @scala.inline
    def setMethod(value: String | js.Array[String]): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setPathVarargs(value: (String | RegExp)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

