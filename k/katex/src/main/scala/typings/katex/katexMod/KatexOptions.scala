package typings.katex.katexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KatexOptions extends js.Object {
  /**
    * Allowed protocols in `\href`
    *
    * Use `_relative` to allow relative urls
    *
    * Use `*` to allow all protocols
    */
  var allowedProtocols: js.UndefOr[js.Array[String]] = js.undefined
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
}

object KatexOptions {
  @scala.inline
  def apply(
    allowedProtocols: js.Array[String] = null,
    colorIsTextColor: js.UndefOr[Boolean] = js.undefined,
    displayMode: js.UndefOr[Boolean] = js.undefined,
    errorColor: String = null,
    macros: js.Any = null,
    maxExpand: Int | Double = null,
    maxSize: Int | Double = null,
    strict: Boolean | String | js.Function = null,
    throwOnError: js.UndefOr[Boolean] = js.undefined
  ): KatexOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedProtocols != null) __obj.updateDynamic("allowedProtocols")(allowedProtocols.asInstanceOf[js.Any])
    if (!js.isUndefined(colorIsTextColor)) __obj.updateDynamic("colorIsTextColor")(colorIsTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(displayMode)) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (errorColor != null) __obj.updateDynamic("errorColor")(errorColor.asInstanceOf[js.Any])
    if (macros != null) __obj.updateDynamic("macros")(macros.asInstanceOf[js.Any])
    if (maxExpand != null) __obj.updateDynamic("maxExpand")(maxExpand.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (strict != null) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnError)) __obj.updateDynamic("throwOnError")(throwOnError.asInstanceOf[js.Any])
    __obj.asInstanceOf[KatexOptions]
  }
}

