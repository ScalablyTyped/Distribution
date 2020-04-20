package typings.markdownIt.rendererMod

import typings.markdownIt.libMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/renderer", JSImport.Namespace)
@js.native
class ^ () extends Renderer {
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
  /* CompleteClass */
  override var rules: RenderRuleRecord = js.native
  /**
    * Takes token stream and generates HTML. Probably, you will never need to call
    * this method directly.
    *
    * @param tokens list on block tokens to renter
    * @param options params of parser instance
    * @param env additional data from parsed input (references, for example)
    */
  /* CompleteClass */
  override def render(tokens: js.Array[typings.markdownIt.tokenMod.^], options: Options, env: js.Any): String = js.native
  /**
    * Render token attributes to string.
    */
  /* CompleteClass */
  override def renderAttrs(token: typings.markdownIt.tokenMod.^): String = js.native
  /**
    * The same as [[Renderer.render]], but for single token of `inline` type.
    *
    * @param tokens list on block tokens to renter
    * @param options params of parser instance
    * @param env additional data from parsed input (references, for example)
    */
  /* CompleteClass */
  override def renderInline(tokens: js.Array[typings.markdownIt.tokenMod.^], options: Options, env: js.Any): String = js.native
  /**
    * Special kludge for image `alt` attributes to conform CommonMark spec.
    * Don't try to use it! Spec requires to show `alt` content with stripped markup,
    * instead of simple escaping.
    *
    * @param tokens list on block tokens to renter
    * @param options params of parser instance
    * @param env additional data from parsed input (references, for example)
    */
  /* CompleteClass */
  override def renderInlineAsText(tokens: js.Array[typings.markdownIt.tokenMod.^], options: Options, env: js.Any): String = js.native
  /**
    * Default token renderer. Can be overriden by custom function
    * in [[Renderer#rules]].
    *
    * @param tokens list of tokens
    * @param idx token index to render
    * @param options params of parser instance
    */
  /* CompleteClass */
  override def renderToken(tokens: js.Array[typings.markdownIt.tokenMod.^], idx: Double, options: Options): String = js.native
}

