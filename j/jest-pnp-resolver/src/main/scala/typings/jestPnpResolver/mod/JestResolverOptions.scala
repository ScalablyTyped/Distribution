package typings.jestPnpResolver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JestResolverOptions extends js.Object {
  var basedir: String = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  def defaultResolver(request: String, opts: js.Any): String = js.native
}

object JestResolverOptions {
  @scala.inline
  def apply(basedir: String, defaultResolver: (String, js.Any) => String): JestResolverOptions = {
    val __obj = js.Dynamic.literal(basedir = basedir.asInstanceOf[js.Any], defaultResolver = js.Any.fromFunction2(defaultResolver))
    __obj.asInstanceOf[JestResolverOptions]
  }
  @scala.inline
  implicit class JestResolverOptionsOps[Self <: JestResolverOptions] (val x: Self) extends AnyVal {
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
    def setBasedir(value: String): Self = this.set("basedir", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultResolver(value: (String, js.Any) => String): Self = this.set("defaultResolver", js.Any.fromFunction2(value))
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
  }
  
}

