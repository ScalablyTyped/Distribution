package typings
package markDotJsLib.markDotJsMod.MarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkRegExpOptions extends js.Object {
  var acrossElements: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var done: js.UndefOr[js.Function1[/* marksTotal */ scala.Double, scala.Unit]] = js.undefined
  var each: js.UndefOr[js.Function1[/* element */ stdLib.Element, scala.Unit]] = js.undefined
  var element: js.UndefOr[java.lang.String] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filter: js.UndefOr[
    js.Function4[
      /* textNode */ stdLib.Element, 
      /* term */ java.lang.String, 
      /* marksSoFar */ scala.Double, 
      /* marksTotal */ scala.Double, 
      scala.Boolean
    ]
  ] = js.undefined
  var iframes: js.UndefOr[scala.Boolean] = js.undefined
  var iframesTimeout: js.UndefOr[scala.Double] = js.undefined
  var ignoreGroups: js.UndefOr[scala.Double] = js.undefined
  var log: js.UndefOr[js.Object] = js.undefined
  var noMatch: js.UndefOr[js.Function1[/* term */ java.lang.String, scala.Unit]] = js.undefined
}

object MarkRegExpOptions {
  @scala.inline
  def apply(
    acrossElements: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    done: js.Function1[/* marksTotal */ scala.Double, scala.Unit] = null,
    each: js.Function1[/* element */ stdLib.Element, scala.Unit] = null,
    element: java.lang.String = null,
    exclude: js.Array[java.lang.String] = null,
    filter: js.Function4[
      /* textNode */ stdLib.Element, 
      /* term */ java.lang.String, 
      /* marksSoFar */ scala.Double, 
      /* marksTotal */ scala.Double, 
      scala.Boolean
    ] = null,
    iframes: js.UndefOr[scala.Boolean] = js.undefined,
    iframesTimeout: scala.Int | scala.Double = null,
    ignoreGroups: scala.Int | scala.Double = null,
    log: js.Object = null,
    noMatch: js.Function1[/* term */ java.lang.String, scala.Unit] = null
  ): MarkRegExpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acrossElements)) __obj.updateDynamic("acrossElements")(acrossElements)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (done != null) __obj.updateDynamic("done")(done)
    if (each != null) __obj.updateDynamic("each")(each)
    if (element != null) __obj.updateDynamic("element")(element)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(iframes)) __obj.updateDynamic("iframes")(iframes)
    if (iframesTimeout != null) __obj.updateDynamic("iframesTimeout")(iframesTimeout.asInstanceOf[js.Any])
    if (ignoreGroups != null) __obj.updateDynamic("ignoreGroups")(ignoreGroups.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log)
    if (noMatch != null) __obj.updateDynamic("noMatch")(noMatch)
    __obj.asInstanceOf[MarkRegExpOptions]
  }
}

