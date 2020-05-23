package typings.materializeCss.anon

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
    activationPercent: js.UndefOr[Double] = js.undefined,
    classes: String = null,
    completeCallback: () => Unit = null,
    displayLength: js.UndefOr[Double] = js.undefined,
    html: String = null,
    inDuration: js.UndefOr[Double] = js.undefined,
    outDuration: js.UndefOr[Double] = js.undefined
  ): PartialToastOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activationPercent)) __obj.updateDynamic("activationPercent")(activationPercent.get.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (completeCallback != null) __obj.updateDynamic("completeCallback")(js.Any.fromFunction0(completeCallback))
    if (!js.isUndefined(displayLength)) __obj.updateDynamic("displayLength")(displayLength.get.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(inDuration)) __obj.updateDynamic("inDuration")(inDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outDuration)) __obj.updateDynamic("outDuration")(outDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialToastOptions]
  }
}

