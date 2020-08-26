package typings.katex.mod

import typings.katex.katexStrings.html
import typings.katex.katexStrings.htmlAndMathml
import typings.katex.katexStrings.mathml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KatexOptions extends js.Object {
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
  implicit class KatexOptionsOps[Self <: KatexOptions] (val x: Self) extends AnyVal {
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
    def setColorIsTextColor(value: Boolean): Self = this.set("colorIsTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorIsTextColor: Self = this.set("colorIsTextColor", js.undefined)
    @scala.inline
    def setDisplayMode(value: Boolean): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    @scala.inline
    def setErrorColor(value: String): Self = this.set("errorColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorColor: Self = this.set("errorColor", js.undefined)
    @scala.inline
    def setFleqn(value: Boolean): Self = this.set("fleqn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleqn: Self = this.set("fleqn", js.undefined)
    @scala.inline
    def setGlobalGroup(value: Boolean): Self = this.set("globalGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalGroup: Self = this.set("globalGroup", js.undefined)
    @scala.inline
    def setLeqno(value: Boolean): Self = this.set("leqno", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeqno: Self = this.set("leqno", js.undefined)
    @scala.inline
    def setMacros(value: js.Any): Self = this.set("macros", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMacros: Self = this.set("macros", js.undefined)
    @scala.inline
    def setMaxExpand(value: Double): Self = this.set("maxExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxExpand: Self = this.set("maxExpand", js.undefined)
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setMinRuleThickness(value: Double): Self = this.set("minRuleThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRuleThickness: Self = this.set("minRuleThickness", js.undefined)
    @scala.inline
    def setOutput(value: html | mathml | htmlAndMathml): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setStrict(value: Boolean | String | js.Function): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setThrowOnError(value: Boolean): Self = this.set("throwOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowOnError: Self = this.set("throwOnError", js.undefined)
    @scala.inline
    def setTrustFunction1(value: /* context */ TrustContext => Boolean): Self = this.set("trust", js.Any.fromFunction1(value))
    @scala.inline
    def setTrust(value: Boolean | (js.Function1[/* context */ TrustContext, Boolean])): Self = this.set("trust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrust: Self = this.set("trust", js.undefined)
  }
  
}

