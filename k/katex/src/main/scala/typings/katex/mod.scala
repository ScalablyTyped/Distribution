package typings.katex

import typings.katex.katexStrings.html
import typings.katex.katexStrings.htmlAndMathml
import typings.katex.katexStrings.mathml
import typings.std.Error
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("katex", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with typings.katex.mod.katex
  /* static members */
  object default {
    
    @JSImport("katex", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Renders a TeX expression into the specified DOM element
      * @param tex A TeX expression
      * @param element The DOM element to render into
      * @param options KaTeX options
      */
    inline def render(tex: String, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(tex.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def render(tex: String, element: HTMLElement, options: KatexOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(tex.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Renders a TeX expression into an HTML string
      * @param tex A TeX expression
      * @param options KaTeX options
      */
    inline def renderToString(tex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(tex.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def renderToString(tex: String, options: KatexOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(tex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("katex", "ParseError")
  @js.native
  open class ParseError protected ()
    extends StObject
       with Error {
    def this(message: String, lexer: Any, position: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var position: Double = js.native
  }
  
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
    var colorIsTextColor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, math will be rendered in display mode
      * (math in display style and center math on page)
      *
      * If `false`, math will be rendered in inline mode
      * @default false
      */
    var displayMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A Color string given in format `#XXX` or `#XXXXXX`
      */
    var errorColor: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, display math renders flush left with a 2em left margin,
      * like \documentclass[fleqn] in LaTeX with the amsmath package.
      *
      * @default false
      */
    var fleqn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Place KaTeX code in the global group.
      *
      * @default false
      */
    var globalGroup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, display math has \tags rendered on the left
      * instead of the right, like \\usepackage[leqno]{amsmath} in LaTeX.
      *
      * @default false
      */
    var leqno: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A collection of custom macros.
      *
      * See `src/macros.js` for its usage
      */
    var macros: js.UndefOr[Any] = js.undefined
    
    /**
      * Limit the number of macro expansions to specified number
      *
      * If set to `Infinity`, marco expander will try to fully expand
      * as in LaTex
      *
      * @default 1000
      */
    var maxExpand: js.UndefOr[Double] = js.undefined
    
    /**
      * All user-specified sizes will be caped to `maxSize` ems
      *
      * If set to Infinity, users can make elements and space
      * arbitrarily large
      *
      * @default Infinity
      */
    var maxSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies a minimum thickness, in ems, for fraction lines,
      * \sqrt top lines, {array} vertical lines, \hline, \hdashline,
      * \\underline, \overline, and the borders of \fbox, \boxed, and
      * \fcolorbox.
      */
    var minRuleThickness: js.UndefOr[Double] = js.undefined
    
    /**
      * Determines the markup language of the output. The valid choices are:
      * - `html`: Outputs KaTeX in HTML only.
      * - `mathml`: Outputs KaTeX in MathML only.
      * - `htmlAndMathml`: Outputs HTML for visual rendering
      *   and includes MathML for accessibility.
      *
      * @default 'htmlAndMathml'
      */
    var output: js.UndefOr[html | mathml | htmlAndMathml] = js.undefined
    
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
    var strict: js.UndefOr[Boolean | String | js.Function] = js.undefined
    
    /**
      * If `true`, KaTeX will throw a `ParseError` when
      * it encounters an unsupported command or invalid LaTex
      *
      * If `false`, KaTeX will render unsupported commands as
      * text, and render invalid LaTeX as its source code with
      * hover text giving the error, in color given by errorColor
      * @default true
      */
    var throwOnError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false` (do not trust input), prevent any commands that could enable adverse behavior, rendering them instead in errorColor.
      *
      * If `true` (trust input), allow all such commands.
      *
      * @default false
      */
    var trust: js.UndefOr[Boolean | (js.Function1[/* context */ TrustContext, Boolean])] = js.undefined
  }
  object KatexOptions {
    
    inline def apply(): KatexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KatexOptions]
    }
    
    extension [Self <: KatexOptions](x: Self) {
      
      inline def setColorIsTextColor(value: Boolean): Self = StObject.set(x, "colorIsTextColor", value.asInstanceOf[js.Any])
      
      inline def setColorIsTextColorUndefined: Self = StObject.set(x, "colorIsTextColor", js.undefined)
      
      inline def setDisplayMode(value: Boolean): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      inline def setErrorColor(value: String): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      inline def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      inline def setFleqn(value: Boolean): Self = StObject.set(x, "fleqn", value.asInstanceOf[js.Any])
      
      inline def setFleqnUndefined: Self = StObject.set(x, "fleqn", js.undefined)
      
      inline def setGlobalGroup(value: Boolean): Self = StObject.set(x, "globalGroup", value.asInstanceOf[js.Any])
      
      inline def setGlobalGroupUndefined: Self = StObject.set(x, "globalGroup", js.undefined)
      
      inline def setLeqno(value: Boolean): Self = StObject.set(x, "leqno", value.asInstanceOf[js.Any])
      
      inline def setLeqnoUndefined: Self = StObject.set(x, "leqno", js.undefined)
      
      inline def setMacros(value: Any): Self = StObject.set(x, "macros", value.asInstanceOf[js.Any])
      
      inline def setMacrosUndefined: Self = StObject.set(x, "macros", js.undefined)
      
      inline def setMaxExpand(value: Double): Self = StObject.set(x, "maxExpand", value.asInstanceOf[js.Any])
      
      inline def setMaxExpandUndefined: Self = StObject.set(x, "maxExpand", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMinRuleThickness(value: Double): Self = StObject.set(x, "minRuleThickness", value.asInstanceOf[js.Any])
      
      inline def setMinRuleThicknessUndefined: Self = StObject.set(x, "minRuleThickness", js.undefined)
      
      inline def setOutput(value: html | mathml | htmlAndMathml): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setStrict(value: Boolean | String | js.Function): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setThrowOnError(value: Boolean): Self = StObject.set(x, "throwOnError", value.asInstanceOf[js.Any])
      
      inline def setThrowOnErrorUndefined: Self = StObject.set(x, "throwOnError", js.undefined)
      
      inline def setTrust(value: Boolean | (js.Function1[/* context */ TrustContext, Boolean])): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
      
      inline def setTrustFunction1(value: /* context */ TrustContext => Boolean): Self = StObject.set(x, "trust", js.Any.fromFunction1(value))
      
      inline def setTrustUndefined: Self = StObject.set(x, "trust", js.undefined)
    }
  }
  
  trait TrustContext extends StObject {
    
    var command: String
    
    var protocol: String
    
    var url: String
  }
  object TrustContext {
    
    inline def apply(command: String, protocol: String, url: String): TrustContext = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustContext]
    }
    
    extension [Self <: TrustContext](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait katex extends StObject
}
