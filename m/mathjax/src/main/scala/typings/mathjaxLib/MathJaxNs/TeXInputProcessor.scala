package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeXInputProcessor extends js.Object {
  /*Because a definition of the form \def\x{\x aaa} \x would loop infinitely, and at the same time stack up lots
    * of a’s in MathJax’s equation buffer, the MAXBUFFER constant is used to limit the size of the string being
    * processed by MathJax. It is set to 5KB, which should be sufficient for any reasonable equation.
    */
  var MAXBUFFER: js.UndefOr[scala.Double] = js.undefined
  /*Because a definition of the form \def\x{\x} \x would cause MathJax to loop infinitely, the MAXMACROS constant
    * will limit the number of macro substitutions allowed in any expression processed by MathJax.
    */
  var MAXMACROS: js.UndefOr[scala.Double] = js.undefined
  /*This lists macros to define before the TeX input processor begins. These are name:value pairs where the name
    * gives the name of the TeX macro to be defined, and value gives the replacement text for the macro. The value
    * can be an array of the form [value,n], where value is the replacement text and n is the number of parameters
    * for the macro. Note that since the value is a javascript string, backslashes in the replacement text must be
    * doubled to prevent them from acting as javascript escape characters.
    */
  var Macros: js.UndefOr[js.Any] = js.undefined
  /*The width to use for the multline environment that is part of the AMSmath extension. This width gives room for
    * tags at either side of the equation, but if you are displaying mathematics in a small area or a thin column of
    * text, you might need to change the value to leave sufficient margin for tags.
    */
  var MultLineWidth: js.UndefOr[java.lang.String] = js.undefined
  /*This is the amount of indentation (from the right or left) for the tags produced by the \tag{} macro.*/
  var TagIndent: js.UndefOr[java.lang.String] = js.undefined
  /*This specifies the side on which \tag{} macros will place the tags. Set it to "left" to place the tags on the
    * left-hand side.
    */
  var TagSide: js.UndefOr[java.lang.String] = js.undefined
  /*This object controls the automatic equation numbering and the equation referencing.*/
  var equationNumbers: js.UndefOr[EquationNumbers] = js.undefined
  /*A comma-separated list of extensions to load at startup. The default directory is MathJax/extensions. The
    * tex2jax and mml2jax preprocessors can be listed here, as well as a FontWarnings extension that you can use to
    * inform your user that mathematics fonts are available that they can download to improve their experience of
    * your site.
    */
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TeXInputProcessor {
  @scala.inline
  def apply(
    MAXBUFFER: scala.Int | scala.Double = null,
    MAXMACROS: scala.Int | scala.Double = null,
    Macros: js.Any = null,
    MultLineWidth: java.lang.String = null,
    TagIndent: java.lang.String = null,
    TagSide: java.lang.String = null,
    equationNumbers: EquationNumbers = null,
    extensions: js.Array[java.lang.String] = null
  ): TeXInputProcessor = {
    val __obj = js.Dynamic.literal()
    if (MAXBUFFER != null) __obj.updateDynamic("MAXBUFFER")(MAXBUFFER.asInstanceOf[js.Any])
    if (MAXMACROS != null) __obj.updateDynamic("MAXMACROS")(MAXMACROS.asInstanceOf[js.Any])
    if (Macros != null) __obj.updateDynamic("Macros")(Macros)
    if (MultLineWidth != null) __obj.updateDynamic("MultLineWidth")(MultLineWidth)
    if (TagIndent != null) __obj.updateDynamic("TagIndent")(TagIndent)
    if (TagSide != null) __obj.updateDynamic("TagSide")(TagSide)
    if (equationNumbers != null) __obj.updateDynamic("equationNumbers")(equationNumbers)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[TeXInputProcessor]
  }
}

