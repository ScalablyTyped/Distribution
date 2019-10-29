package typings.htmlDashWebpackDashTagsDashPlugin.htmlDashWebpackDashTagsDashPluginMod

import typings.webpack.webpackMod.Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlWebpackTagsPlugin extends js.Object {
  @JSName("apply")
  def apply(compiler: Compiler): Unit
}

object HtmlWebpackTagsPlugin {
  @scala.inline
  def apply(apply: Compiler => Unit): HtmlWebpackTagsPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
  
    __obj.asInstanceOf[HtmlWebpackTagsPlugin]
  }
}

