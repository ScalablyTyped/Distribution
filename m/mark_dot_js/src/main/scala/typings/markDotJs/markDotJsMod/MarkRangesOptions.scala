package typings.markDotJs.markDotJsMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkRangesOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.undefined
  var each: js.UndefOr[js.Function2[/* element */ Element, /* range */ Range, Unit]] = js.undefined
  var element: js.UndefOr[String] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var filter: js.UndefOr[
    js.Function4[
      /* textNode */ Element, 
      /* term */ String, 
      /* marksSoFar */ Double, 
      /* marksTotal */ Double, 
      Boolean
    ]
  ] = js.undefined
  var iframes: js.UndefOr[Boolean] = js.undefined
  var iframesTimeout: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[js.Object] = js.undefined
  var noMatch: js.UndefOr[js.Function1[/* term */ String, Unit]] = js.undefined
}

object MarkRangesOptions {
  @scala.inline
  def apply(
    className: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    done: /* marksTotal */ Double => Unit = null,
    each: (/* element */ Element, /* range */ Range) => Unit = null,
    element: String = null,
    exclude: js.Array[String] = null,
    filter: (/* textNode */ Element, /* term */ String, /* marksSoFar */ Double, /* marksTotal */ Double) => Boolean = null,
    iframes: js.UndefOr[Boolean] = js.undefined,
    iframesTimeout: Int | Double = null,
    log: js.Object = null,
    noMatch: /* term */ String => Unit = null
  ): MarkRangesOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction1(done))
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (element != null) __obj.updateDynamic("element")(element)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4(filter))
    if (!js.isUndefined(iframes)) __obj.updateDynamic("iframes")(iframes)
    if (iframesTimeout != null) __obj.updateDynamic("iframesTimeout")(iframesTimeout.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log)
    if (noMatch != null) __obj.updateDynamic("noMatch")(js.Any.fromFunction1(noMatch))
    __obj.asInstanceOf[MarkRangesOptions]
  }
}

