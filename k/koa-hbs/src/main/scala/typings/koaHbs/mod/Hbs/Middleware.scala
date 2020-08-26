package typings.koaHbs.mod.Hbs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Middleware extends js.Object {
  var blockHelperName: js.UndefOr[String] = js.native
  var contentHelperName: js.UndefOr[String] = js.native
  var defaultLayout: js.UndefOr[String] = js.native
  var disableCache: js.UndefOr[Boolean] = js.native
  var extname: js.UndefOr[String] = js.native
  var handlebars: js.UndefOr[js.Function] = js.native
  var layoutsPath: js.UndefOr[String] = js.native
  var partialsPath: js.UndefOr[js.Array[String] | String] = js.native
  var templateOptions: js.UndefOr[js.Object] = js.native
  var viewPath: js.Array[String] | String = js.native
}

object Middleware {
  @scala.inline
  def apply(viewPath: js.Array[String] | String): Middleware = {
    val __obj = js.Dynamic.literal(viewPath = viewPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middleware]
  }
  @scala.inline
  implicit class MiddlewareOps[Self <: Middleware] (val x: Self) extends AnyVal {
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
    def setViewPathVarargs(value: String*): Self = this.set("viewPath", js.Array(value :_*))
    @scala.inline
    def setViewPath(value: js.Array[String] | String): Self = this.set("viewPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockHelperName(value: String): Self = this.set("blockHelperName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockHelperName: Self = this.set("blockHelperName", js.undefined)
    @scala.inline
    def setContentHelperName(value: String): Self = this.set("contentHelperName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentHelperName: Self = this.set("contentHelperName", js.undefined)
    @scala.inline
    def setDefaultLayout(value: String): Self = this.set("defaultLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLayout: Self = this.set("defaultLayout", js.undefined)
    @scala.inline
    def setDisableCache(value: Boolean): Self = this.set("disableCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCache: Self = this.set("disableCache", js.undefined)
    @scala.inline
    def setExtname(value: String): Self = this.set("extname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtname: Self = this.set("extname", js.undefined)
    @scala.inline
    def setHandlebars(value: js.Function): Self = this.set("handlebars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlebars: Self = this.set("handlebars", js.undefined)
    @scala.inline
    def setLayoutsPath(value: String): Self = this.set("layoutsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutsPath: Self = this.set("layoutsPath", js.undefined)
    @scala.inline
    def setPartialsPathVarargs(value: String*): Self = this.set("partialsPath", js.Array(value :_*))
    @scala.inline
    def setPartialsPath(value: js.Array[String] | String): Self = this.set("partialsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialsPath: Self = this.set("partialsPath", js.undefined)
    @scala.inline
    def setTemplateOptions(value: js.Object): Self = this.set("templateOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateOptions: Self = this.set("templateOptions", js.undefined)
  }
  
}

