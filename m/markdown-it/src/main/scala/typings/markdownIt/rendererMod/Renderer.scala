package typings.markdownIt.rendererMod

import typings.markdownIt.libMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer extends js.Object {
  
  /**
    * Takes token stream and generates HTML. Probably, you will never need to call
    * this method directly.
    *
    * @param tokens list on block tokens to renter
    * @param options params of parser instance
    * @param env additional data from parsed input (references, for example)
    */
  def render(tokens: js.Array[typings.markdownIt.tokenMod.^], options: Options, env: js.Any): String = js.native
  
  /**
    * Render token attributes to string.
    */
  def renderAttrs(token: typings.markdownIt.tokenMod.^): String = js.native
  
  /**
    * The same as [[Renderer.render]], but for single token of `inline` type.
    *
    * @param tokens list on block tokens to renter
    * @param options params of parser instance
    * @param env additional data from parsed input (references, for example)
    */
  def renderInline(tokens: js.Array[typings.markdownIt.tokenMod.^], options: Options, env: js.Any): String = js.native
  
  /**
    * Special kludge for image `alt` attributes to conform CommonMark spec.
    * Don't try to use it! Spec requires to show `alt` content with stripped markup,
    * instead of simple escaping.
    *
    * @param tokens list on block tokens to renter
    * @param options params of parser instance
    * @param env additional data from parsed input (references, for example)
    */
  def renderInlineAsText(tokens: js.Array[typings.markdownIt.tokenMod.^], options: Options, env: js.Any): String = js.native
  
  /**
    * Default token renderer. Can be overriden by custom function
    * in [[Renderer#rules]].
    *
    * @param tokens list of tokens
    * @param idx token index to render
    * @param options params of parser instance
    */
  def renderToken(tokens: js.Array[typings.markdownIt.tokenMod.^], idx: Double, options: Options): String = js.native
  
  /**
    * Contains render rules for tokens. Can be updated and extended.
    *
    * ##### Example
    *
    * ```javascript
    * var md = require('markdown-it')();
    *
    * md.renderer.rules.strong_open  = function () { return '<b>'; };
    * md.renderer.rules.strong_close = function () { return '</b>'; };
    *
    * var result = md.renderInline(...);
    * ```
    *
    * Each rule is called as independent static function with fixed signature:
    *
    * ```javascript
    * function my_token_render(tokens, idx, options, env, renderer) {
    *   // ...
    *   return renderedHTML;
    * }
    * ```
    *
    * See [source code](https://github.com/markdown-it/markdown-it/blob/master/lib/renderer.js)
    * for more details and examples.
    */
  var rules: RenderRuleRecord = js.native
}
object Renderer {
  
  @scala.inline
  def apply(
    render: (js.Array[typings.markdownIt.tokenMod.^], Options, js.Any) => String,
    renderAttrs: typings.markdownIt.tokenMod.^ => String,
    renderInline: (js.Array[typings.markdownIt.tokenMod.^], Options, js.Any) => String,
    renderInlineAsText: (js.Array[typings.markdownIt.tokenMod.^], Options, js.Any) => String,
    renderToken: (js.Array[typings.markdownIt.tokenMod.^], Double, Options) => String,
    rules: RenderRuleRecord
  ): Renderer = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction3(render), renderAttrs = js.Any.fromFunction1(renderAttrs), renderInline = js.Any.fromFunction3(renderInline), renderInlineAsText = js.Any.fromFunction3(renderInlineAsText), renderToken = js.Any.fromFunction3(renderToken), rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderer]
  }
  
  @scala.inline
  implicit class RendererOps[Self <: Renderer] (val x: Self) extends AnyVal {
    
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
    def setRender(value: (js.Array[typings.markdownIt.tokenMod.^], Options, js.Any) => String): Self = this.set("render", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderAttrs(value: typings.markdownIt.tokenMod.^ => String): Self = this.set("renderAttrs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderInline(value: (js.Array[typings.markdownIt.tokenMod.^], Options, js.Any) => String): Self = this.set("renderInline", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderInlineAsText(value: (js.Array[typings.markdownIt.tokenMod.^], Options, js.Any) => String): Self = this.set("renderInlineAsText", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderToken(value: (js.Array[typings.markdownIt.tokenMod.^], Double, Options) => String): Self = this.set("renderToken", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRules(value: RenderRuleRecord): Self = this.set("rules", value.asInstanceOf[js.Any])
  }
}
