package typings.markdownIt

import org.scalablytyped.runtime.StringDictionary
import typings.markdownIt.libMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("markdown-it/lib/renderer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Renderer {
    
    /**
      * Takes token stream and generates HTML. Probably, you will never need to call
      * this method directly.
      *
      * @param tokens list on block tokens to renter
      * @param options params of parser instance
      * @param env additional data from parsed input (references, for example)
      */
    /* CompleteClass */
    override def render(tokens: js.Array[typings.markdownIt.tokenMod.^], options: Options, env: Any): String = js.native
    
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
    override def renderInline(tokens: js.Array[typings.markdownIt.tokenMod.^], options: Options, env: Any): String = js.native
    
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
    override def renderInlineAsText(tokens: js.Array[typings.markdownIt.tokenMod.^], options: Options, env: Any): String = js.native
    
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
    var rules: RenderRuleRecord = js.native
  }
  
  type RenderRule = js.Function5[
    /* tokens */ js.Array[typings.markdownIt.tokenMod.^], 
    /* idx */ Double, 
    /* options */ Options, 
    /* env */ Any, 
    /* self */ Renderer, 
    String
  ]
  
  trait RenderRuleRecord
    extends StObject
       with /* type */ StringDictionary[js.UndefOr[RenderRule]] {
    
    var code_block: js.UndefOr[RenderRule] = js.undefined
    
    var code_inline: js.UndefOr[RenderRule] = js.undefined
    
    var fence: js.UndefOr[RenderRule] = js.undefined
    
    var hardbreak: js.UndefOr[RenderRule] = js.undefined
    
    var html_block: js.UndefOr[RenderRule] = js.undefined
    
    var html_inline: js.UndefOr[RenderRule] = js.undefined
    
    var image: js.UndefOr[RenderRule] = js.undefined
    
    var softbreak: js.UndefOr[RenderRule] = js.undefined
    
    var text: js.UndefOr[RenderRule] = js.undefined
  }
  object RenderRuleRecord {
    
    inline def apply(): RenderRuleRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderRuleRecord]
    }
    
    extension [Self <: RenderRuleRecord](x: Self) {
      
      inline def setCode_block(
        value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "code_block", js.Any.fromFunction5(value))
      
      inline def setCode_blockUndefined: Self = StObject.set(x, "code_block", js.undefined)
      
      inline def setCode_inline(
        value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "code_inline", js.Any.fromFunction5(value))
      
      inline def setCode_inlineUndefined: Self = StObject.set(x, "code_inline", js.undefined)
      
      inline def setFence(
        value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "fence", js.Any.fromFunction5(value))
      
      inline def setFenceUndefined: Self = StObject.set(x, "fence", js.undefined)
      
      inline def setHardbreak(
        value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "hardbreak", js.Any.fromFunction5(value))
      
      inline def setHardbreakUndefined: Self = StObject.set(x, "hardbreak", js.undefined)
      
      inline def setHtml_block(
        value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "html_block", js.Any.fromFunction5(value))
      
      inline def setHtml_blockUndefined: Self = StObject.set(x, "html_block", js.undefined)
      
      inline def setHtml_inline(
        value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "html_inline", js.Any.fromFunction5(value))
      
      inline def setHtml_inlineUndefined: Self = StObject.set(x, "html_inline", js.undefined)
      
      inline def setImage(
        value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "image", js.Any.fromFunction5(value))
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setSoftbreak(
        value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "softbreak", js.Any.fromFunction5(value))
      
      inline def setSoftbreakUndefined: Self = StObject.set(x, "softbreak", js.undefined)
      
      inline def setText(
        value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "text", js.Any.fromFunction5(value))
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Renderer extends StObject {
    
    /**
      * Takes token stream and generates HTML. Probably, you will never need to call
      * this method directly.
      *
      * @param tokens list on block tokens to renter
      * @param options params of parser instance
      * @param env additional data from parsed input (references, for example)
      */
    def render(tokens: js.Array[typings.markdownIt.tokenMod.^], options: Options, env: Any): String
    
    /**
      * Render token attributes to string.
      */
    def renderAttrs(token: typings.markdownIt.tokenMod.^): String
    
    /**
      * The same as [[Renderer.render]], but for single token of `inline` type.
      *
      * @param tokens list on block tokens to renter
      * @param options params of parser instance
      * @param env additional data from parsed input (references, for example)
      */
    def renderInline(tokens: js.Array[typings.markdownIt.tokenMod.^], options: Options, env: Any): String
    
    /**
      * Special kludge for image `alt` attributes to conform CommonMark spec.
      * Don't try to use it! Spec requires to show `alt` content with stripped markup,
      * instead of simple escaping.
      *
      * @param tokens list on block tokens to renter
      * @param options params of parser instance
      * @param env additional data from parsed input (references, for example)
      */
    def renderInlineAsText(tokens: js.Array[typings.markdownIt.tokenMod.^], options: Options, env: Any): String
    
    /**
      * Default token renderer. Can be overriden by custom function
      * in [[Renderer#rules]].
      *
      * @param tokens list of tokens
      * @param idx token index to render
      * @param options params of parser instance
      */
    def renderToken(tokens: js.Array[typings.markdownIt.tokenMod.^], idx: Double, options: Options): String
    
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
    var rules: RenderRuleRecord
  }
  object Renderer {
    
    inline def apply(
      render: (js.Array[typings.markdownIt.tokenMod.^], Options, Any) => String,
      renderAttrs: typings.markdownIt.tokenMod.^ => String,
      renderInline: (js.Array[typings.markdownIt.tokenMod.^], Options, Any) => String,
      renderInlineAsText: (js.Array[typings.markdownIt.tokenMod.^], Options, Any) => String,
      renderToken: (js.Array[typings.markdownIt.tokenMod.^], Double, Options) => String,
      rules: RenderRuleRecord
    ): Renderer = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction3(render), renderAttrs = js.Any.fromFunction1(renderAttrs), renderInline = js.Any.fromFunction3(renderInline), renderInlineAsText = js.Any.fromFunction3(renderInlineAsText), renderToken = js.Any.fromFunction3(renderToken), rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Renderer]
    }
    
    extension [Self <: Renderer](x: Self) {
      
      inline def setRender(value: (js.Array[typings.markdownIt.tokenMod.^], Options, Any) => String): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setRenderAttrs(value: typings.markdownIt.tokenMod.^ => String): Self = StObject.set(x, "renderAttrs", js.Any.fromFunction1(value))
      
      inline def setRenderInline(value: (js.Array[typings.markdownIt.tokenMod.^], Options, Any) => String): Self = StObject.set(x, "renderInline", js.Any.fromFunction3(value))
      
      inline def setRenderInlineAsText(value: (js.Array[typings.markdownIt.tokenMod.^], Options, Any) => String): Self = StObject.set(x, "renderInlineAsText", js.Any.fromFunction3(value))
      
      inline def setRenderToken(value: (js.Array[typings.markdownIt.tokenMod.^], Double, Options) => String): Self = StObject.set(x, "renderToken", js.Any.fromFunction3(value))
      
      inline def setRules(value: RenderRuleRecord): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
}
