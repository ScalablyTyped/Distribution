package typings
package markDotJsLib.markDotJsMod.MarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarkOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var done: js.UndefOr[js.Function1[/* marksTotal */ scala.Double, scala.Unit]] = js.undefined
  var element: js.UndefOr[java.lang.String] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var iframes: js.UndefOr[scala.Boolean] = js.undefined
  var iframesTimeout: js.UndefOr[scala.Double] = js.undefined
  var log: js.UndefOr[js.Object] = js.undefined
}

object UnmarkOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    done: /* marksTotal */ scala.Double => scala.Unit = null,
    element: java.lang.String = null,
    exclude: js.Array[java.lang.String] = null,
    iframes: js.UndefOr[scala.Boolean] = js.undefined,
    iframesTimeout: scala.Int | scala.Double = null,
    log: js.Object = null
  ): UnmarkOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction1(done))
    if (element != null) __obj.updateDynamic("element")(element)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (!js.isUndefined(iframes)) __obj.updateDynamic("iframes")(iframes)
    if (iframesTimeout != null) __obj.updateDynamic("iframesTimeout")(iframesTimeout.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log)
    __obj.asInstanceOf[UnmarkOptions]
  }
}

