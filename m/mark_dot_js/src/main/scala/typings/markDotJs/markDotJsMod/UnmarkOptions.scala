package typings.markDotJs.markDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarkOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.undefined
  var element: js.UndefOr[String] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var iframes: js.UndefOr[Boolean] = js.undefined
  var iframesTimeout: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[js.Object] = js.undefined
}

object UnmarkOptions {
  @scala.inline
  def apply(
    className: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    done: /* marksTotal */ Double => Unit = null,
    element: String = null,
    exclude: js.Array[String] = null,
    iframes: js.UndefOr[Boolean] = js.undefined,
    iframesTimeout: Int | Double = null,
    log: js.Object = null
  ): UnmarkOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction1(done))
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(iframes)) __obj.updateDynamic("iframes")(iframes.asInstanceOf[js.Any])
    if (iframesTimeout != null) __obj.updateDynamic("iframesTimeout")(iframesTimeout.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarkOptions]
  }
}

