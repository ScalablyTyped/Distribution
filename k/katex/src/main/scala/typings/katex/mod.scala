package typings.katex

import typings.katex.katexStrings.html
import typings.katex.katexStrings.htmlAndMathml
import typings.katex.katexStrings.mathml
import typings.std.Error
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("katex", "ParseError")
  @js.native
  class ParseError protected () extends Error {
    def this(message: String, lexer: js.Any, position: Double) = this()
    
    var position: Double = js.native
  }
  
  @JSImport("katex", "render")
  @js.native
  def render(tex: String, element: HTMLElement): Unit = js.native
  @JSImport("katex", "render")
  @js.native
  def render(tex: String, element: HTMLElement, options: KatexOptions): Unit = js.native
  
  @JSImport("katex", "renderToString")
  @js.native
  def renderToString(tex: String): String = js.native
  @JSImport("katex", "renderToString")
  @js.native
  def renderToString(tex: String, options: KatexOptions): String = js.native
  
  @js.native
  trait KatexOptions extends StObject {
    
    /**
      * If `true`, `\color` will work like LaTeX's `\textcolor`
      * and takes 2 arguments
      *
      * If `false`, `\color` will work like LaTeX's `\color`
      * and takes 1 argument
      *
      * In both cases, `\textcolor` works as in LaTeX
      *
      * @default false
      */
    var colorIsTextColor: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, math will be rendered in display mode
      * (math in display style and center math on page)
      *
      * If `false`, math will be rendered in inline mode
      * @default false
      */
    var displayMode: js.UndefOr[Boolean] = js.native
    
    /**
      * A Color string given in format `#XXX` or `#XXXXXX`
      */
    var errorColor: js.UndefOr[String] = js.native
    
    /**
      * If `true`, display math renders flush left with a 2em left margin,
      * like \documentclass[fleqn] in LaTeX with the amsmath package.
      *
      * @default false
      */
    var fleqn: js.UndefOr[Boolean] = js.native
    
    /**
      * Place KaTeX code in the global group.
      *
      * @default false
      */
    var globalGroup: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, display math has \tags rendered on the left
      * instead of the right, like \\usepackage[leqno]{amsmath} in LaTeX.
      *
      * @default false
      */
    var leqno: js.UndefOr[Boolean] = js.native
    
    /**
      * A collection of custom macros.
      *
      * See `src/macros.js` for its usage
      */
    var macros: js.UndefOr[js.Any] = js.native
    
    /**
      * Limit the number of macro expansions to specified number
      *
      * If set to `Infinity`, marco expander will try to fully expand
      * as in LaTex
      *
      * @default 1000
      */
    var maxExpand: js.UndefOr[Double] = js.native
    
    /**
      * All user-specified sizes will be caped to `maxSize` ems
      *
      * If set to Infinity, users can make elements and space
      * arbitrarily large
      *
      * @default Infinity
      */
    var maxSize: js.UndefOr[Double] = js.native
    
    /**
      * Specifies a minimum thickness, in ems, for fraction lines,
      * \sqrt top lines, {array} vertical lines, \hline, \hdashline,
      * \\underline, \overline, and the borders of \fbox, \boxed, and
      * \fcolorbox.
      */
    var minRuleThickness: js.UndefOr[Double] = js.native
    
    /**
      * Determines the markup language of the output. The valid choices are:
      * - `html`: Outputs KaTeX in HTML only.
      * - `mathml`: Outputs KaTeX in MathML only.
      * - `htmlAndMathml`: Outputs HTML for visual rendering
      *   and includes MathML for accessibility.
      *
      * @default 'htmlAndMathml'
      */
    var output: js.UndefOr[html | mathml | htmlAndMathml] = js.native
    
    /**
      * If `false` or `"ignore"`, allow features that make
      * writing in LaTex convenient but not supported by LaTex
      *
      * If `true` or `"error"`, throw an error for such transgressions
      *
      * If `"warn"`, warn about behavior via `console.warn`
      *
      * @default "warn"
      */
    var strict: js.UndefOr[Boolean | String | js.Function] = js.native
    
    /**
      * If `true`, KaTeX will throw a `ParseError` when
      * it encounters an unsupported command or invalid LaTex
      *
      * If `false`, KaTeX will render unsupported commands as
      * text, and render invalid LaTeX as its source code with
      * hover text giving the error, in color given by errorColor
      * @default true
      */
    var throwOnError: js.UndefOr[Boolean] = js.native
    
    /**
      * If `false` (do not trust input), prevent any commands that could enable adverse behavior, rendering them instead in errorColor.
      *
      * If `true` (trust input), allow all such commands.
      *
      * @default false
      */
    var trust: js.UndefOr[Boolean | (js.Function1[/* context */ TrustContext, Boolean])] = js.native
  }
  object KatexOptions {
    
    @scala.inline
    def apply(): KatexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KatexOptions]
    }
    
    @scala.inline
    implicit class KatexOptionsMutableBuilder[Self <: KatexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorIsTextColor(value: Boolean): Self = StObject.set(x, "colorIsTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorIsTextColorUndefined: Self = StObject.set(x, "colorIsTextColor", js.undefined)
      
      @scala.inline
      def setDisplayMode(value: Boolean): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      @scala.inline
      def setErrorColor(value: String): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      @scala.inline
      def setFleqn(value: Boolean): Self = StObject.set(x, "fleqn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFleqnUndefined: Self = StObject.set(x, "fleqn", js.undefined)
      
      @scala.inline
      def setGlobalGroup(value: Boolean): Self = StObject.set(x, "globalGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalGroupUndefined: Self = StObject.set(x, "globalGroup", js.undefined)
      
      @scala.inline
      def setLeqno(value: Boolean): Self = StObject.set(x, "leqno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeqnoUndefined: Self = StObject.set(x, "leqno", js.undefined)
      
      @scala.inline
      def setMacros(value: js.Any): Self = StObject.set(x, "macros", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacrosUndefined: Self = StObject.set(x, "macros", js.undefined)
      
      @scala.inline
      def setMaxExpand(value: Double): Self = StObject.set(x, "maxExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxExpandUndefined: Self = StObject.set(x, "maxExpand", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setMinRuleThickness(value: Double): Self = StObject.set(x, "minRuleThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinRuleThicknessUndefined: Self = StObject.set(x, "minRuleThickness", js.undefined)
      
      @scala.inline
      def setOutput(value: html | mathml | htmlAndMathml): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean | String | js.Function): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setThrowOnError(value: Boolean): Self = StObject.set(x, "throwOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowOnErrorUndefined: Self = StObject.set(x, "throwOnError", js.undefined)
      
      @scala.inline
      def setTrust(value: Boolean | (js.Function1[/* context */ TrustContext, Boolean])): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustFunction1(value: /* context */ TrustContext => Boolean): Self = StObject.set(x, "trust", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrustUndefined: Self = StObject.set(x, "trust", js.undefined)
    }
  }
  
  @js.native
  trait TrustContext extends StObject {
    
    var command: String = js.native
    
    var protocol: String = js.native
    
    var url: String = js.native
  }
  object TrustContext {
    
    @scala.inline
    def apply(command: String, protocol: String, url: String): TrustContext = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustContext]
    }
    
    @scala.inline
    implicit class TrustContextMutableBuilder[Self <: TrustContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
