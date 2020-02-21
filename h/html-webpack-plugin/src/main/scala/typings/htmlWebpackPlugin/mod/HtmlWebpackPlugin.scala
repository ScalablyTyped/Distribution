package typings.htmlWebpackPlugin.mod

import typings.webpack.mod.Plugin
import typings.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlWebpackPlugin extends Plugin {
  def evaluateCompilationResult(compilation: Compilation, content: String): js.Promise[String | TemplateFunction] = js.native
  def executeTemplate(templateFunction: TemplateFunction, chunks: js.Any, assets: js.Any, compilation: Compilation): js.Promise[String] = js.native
  def postProcessHtml(html: String, assets: js.Any, assetTags: js.Any): js.Promise[String] = js.native
}

