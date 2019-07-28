package typings.mathjax.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EquationNumbers extends js.Object {
  /*This controls whether equations are numbered and how. By default it is set to "none" to be compatible with
    * earlier versions of MathJax where auto-numbering was not performed (so pages will not change their
    * appearance). You can change this to "AMS" for equations numbered as the AMSmath package would do, or "all" to
    * get an equation number for every displayed equation.
    */
  var autoNumber: js.UndefOr[String] = js.undefined
  /*A function that tells MathJax what ID to use as an anchor for the equation (so that it can be used in URL
    * references).
    */
  var formatID: js.UndefOr[js.Function0[String]] = js.undefined
  /*A function that tells MathJax what tag to use for equation number n. This could be used to have the equations
    * labeled by a sequence of symbols rather than numbers, or to use section and subsection numbers instead.
    */
  var formatNumber: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
  /*A function that tells MathJax how to format an equation number for displaying as a tag for an equation. This
    * is what appears in the margin of a tagged or numbered equation.*/
  var formatTag: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
  /*A function that takes an equation ID and returns the URL to link to it.*/
  var formatURL: js.UndefOr[js.Function1[/* id */ String, String]] = js.undefined
  /*This controls whether element ID’s use the \label name or the equation number. When true, use the label, when
    * false, use the equation number.
    */
  var useLabelIds: js.UndefOr[Boolean] = js.undefined
}

object EquationNumbers {
  @scala.inline
  def apply(
    autoNumber: String = null,
    formatID: () => String = null,
    formatNumber: /* n */ Double => String = null,
    formatTag: /* n */ Double => String = null,
    formatURL: /* id */ String => String = null,
    useLabelIds: js.UndefOr[Boolean] = js.undefined
  ): EquationNumbers = {
    val __obj = js.Dynamic.literal()
    if (autoNumber != null) __obj.updateDynamic("autoNumber")(autoNumber)
    if (formatID != null) __obj.updateDynamic("formatID")(js.Any.fromFunction0(formatID))
    if (formatNumber != null) __obj.updateDynamic("formatNumber")(js.Any.fromFunction1(formatNumber))
    if (formatTag != null) __obj.updateDynamic("formatTag")(js.Any.fromFunction1(formatTag))
    if (formatURL != null) __obj.updateDynamic("formatURL")(js.Any.fromFunction1(formatURL))
    if (!js.isUndefined(useLabelIds)) __obj.updateDynamic("useLabelIds")(useLabelIds)
    __obj.asInstanceOf[EquationNumbers]
  }
}

