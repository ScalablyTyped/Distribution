package typings.htmlWebpackPlugin.mod

import typings.htmlWebpackPlugin.anon.Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The values which are available during template execution
  *
  * Please keep in mind that the `templateParameter` options allows to change them
  */
@js.native
trait TemplateParameter extends js.Object {
  var compilation: js.Any = js.native
  var htmlWebpackPlugin: Files = js.native
  var webpackConfig: js.Any = js.native
}

object TemplateParameter {
  @scala.inline
  def apply(compilation: js.Any, htmlWebpackPlugin: Files, webpackConfig: js.Any): TemplateParameter = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], htmlWebpackPlugin = htmlWebpackPlugin.asInstanceOf[js.Any], webpackConfig = webpackConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateParameter]
  }
  @scala.inline
  implicit class TemplateParameterOps[Self <: TemplateParameter] (val x: Self) extends AnyVal {
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
    def setCompilation(value: js.Any): Self = this.set("compilation", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlWebpackPlugin(value: Files): Self = this.set("htmlWebpackPlugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebpackConfig(value: js.Any): Self = this.set("webpackConfig", value.asInstanceOf[js.Any])
  }
  
}

