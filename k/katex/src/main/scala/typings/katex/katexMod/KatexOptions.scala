package typings.katex.katexMod

import typings.katex.katexStrings.html
import typings.katex.katexStrings.htmlAndMathml
import typings.katex.katexStrings.mathml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var macros: js.UndefOr[js.Any] = js.undefined
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
  @scala.inline
  def apply(
    colorIsTextColor: js.UndefOr[Boolean] = js.undefined,
    displayMode: js.UndefOr[Boolean] = js.undefined,
    errorColor: String = null,
    fleqn: js.UndefOr[Boolean] = js.undefined,
    globalGroup: js.UndefOr[Boolean] = js.undefined,
    leqno: js.UndefOr[Boolean] = js.undefined,
    macros: js.Any = null,
    maxExpand: Int | Double = null,
    maxSize: Int | Double = null,
    minRuleThickness: Int | Double = null,
    output: html | mathml | htmlAndMathml = null,
    strict: Boolean | String | js.Function = null,
    throwOnError: js.UndefOr[Boolean] = js.undefined,
    trust: Boolean | (js.Function1[/* context */ TrustContext, Boolean]) = null
  ): KatexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorIsTextColor)) __obj.updateDynamic("colorIsTextColor")(colorIsTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(displayMode)) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (errorColor != null) __obj.updateDynamic("errorColor")(errorColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fleqn)) __obj.updateDynamic("fleqn")(fleqn.asInstanceOf[js.Any])
    if (!js.isUndefined(globalGroup)) __obj.updateDynamic("globalGroup")(globalGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(leqno)) __obj.updateDynamic("leqno")(leqno.asInstanceOf[js.Any])
    if (macros != null) __obj.updateDynamic("macros")(macros.asInstanceOf[js.Any])
    if (maxExpand != null) __obj.updateDynamic("maxExpand")(maxExpand.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minRuleThickness != null) __obj.updateDynamic("minRuleThickness")(minRuleThickness.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (strict != null) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnError)) __obj.updateDynamic("throwOnError")(throwOnError.asInstanceOf[js.Any])
    if (trust != null) __obj.updateDynamic("trust")(trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[KatexOptions]
  }
}

