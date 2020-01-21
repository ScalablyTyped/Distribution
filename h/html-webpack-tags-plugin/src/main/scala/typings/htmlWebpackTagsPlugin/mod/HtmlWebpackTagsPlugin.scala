package typings.htmlWebpackTagsPlugin.mod

import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlWebpackTagsPlugin extends js.Object {
  @JSName("apply")
  def apply(compiler: Compiler_): Unit
}

object HtmlWebpackTagsPlugin {
  @scala.inline
  def apply(apply: Compiler_ => Unit): HtmlWebpackTagsPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
  
    __obj.asInstanceOf[HtmlWebpackTagsPlugin]
  }
}

