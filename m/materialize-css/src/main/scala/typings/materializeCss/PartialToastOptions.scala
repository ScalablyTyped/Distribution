package typings.materializeCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.ToastOptions> */
trait PartialToastOptions extends js.Object {
  var activationPercent: js.UndefOr[Double] = js.undefined
  var classes: js.UndefOr[String] = js.undefined
  var completeCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var displayLength: js.UndefOr[Double] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var inDuration: js.UndefOr[Double] = js.undefined
  var outDuration: js.UndefOr[Double] = js.undefined
}

object PartialToastOptions {
  @scala.inline
  def apply(
    activationPercent: Int | Double = null,
    classes: String = null,
    completeCallback: () => Unit = null,
    displayLength: Int | Double = null,
    html: String = null,
    inDuration: Int | Double = null,
    outDuration: Int | Double = null
  ): PartialToastOptions = {
    val __obj = js.Dynamic.literal()
    if (activationPercent != null) __obj.updateDynamic("activationPercent")(activationPercent.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (completeCallback != null) __obj.updateDynamic("completeCallback")(js.Any.fromFunction0(completeCallback))
    if (displayLength != null) __obj.updateDynamic("displayLength")(displayLength.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (inDuration != null) __obj.updateDynamic("inDuration")(inDuration.asInstanceOf[js.Any])
    if (outDuration != null) __obj.updateDynamic("outDuration")(outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialToastOptions]
  }
}

