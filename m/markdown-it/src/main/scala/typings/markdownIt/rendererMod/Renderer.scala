package typings.markdownIt.rendererMod

import org.scalablytyped.runtime.StringDictionary
import typings.markdownIt.libMod.TokenRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var rules: StringDictionary[TokenRender]
  def render(tokens: js.Array[typings.markdownIt.tokenMod.^], options: js.Any, env: js.Any): String
  def renderAttrs(token: typings.markdownIt.tokenMod.^): String
  def renderInline(tokens: js.Array[typings.markdownIt.tokenMod.^], options: js.Any, env: js.Any): String
  def renderToken(tokens: js.Array[typings.markdownIt.tokenMod.^], idx: Double, options: js.Any): String
}

object Renderer {
  @scala.inline
  def apply(
    render: (js.Array[typings.markdownIt.tokenMod.^], js.Any, js.Any) => String,
    renderAttrs: typings.markdownIt.tokenMod.^ => String,
    renderInline: (js.Array[typings.markdownIt.tokenMod.^], js.Any, js.Any) => String,
    renderToken: (js.Array[typings.markdownIt.tokenMod.^], Double, js.Any) => String,
    rules: StringDictionary[TokenRender]
  ): Renderer = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction3(render), renderAttrs = js.Any.fromFunction1(renderAttrs), renderInline = js.Any.fromFunction3(renderInline), renderToken = js.Any.fromFunction3(renderToken), rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Renderer]
  }
}

