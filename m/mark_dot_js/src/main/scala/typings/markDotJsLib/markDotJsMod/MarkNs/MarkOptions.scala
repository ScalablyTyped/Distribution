package typings
package markDotJsLib.markDotJsMod.MarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkOptions extends js.Object {
  var accuracy: js.UndefOr[MarkAccuracy | markDotJsLib.Anon_Value] = js.undefined
  var acrossElements: js.UndefOr[scala.Boolean] = js.undefined
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var diacritics: js.UndefOr[scala.Boolean] = js.undefined
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
  var ignoreJoiners: js.UndefOr[scala.Boolean] = js.undefined
  var ignorePunctuation: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var log: js.UndefOr[js.Object] = js.undefined
  var noMatch: js.UndefOr[js.Function1[/* term */ java.lang.String, scala.Unit]] = js.undefined
  var separateWordSearch: js.UndefOr[scala.Boolean] = js.undefined
  var synonyms: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var wildcards: js.UndefOr[
    markDotJsLib.markDotJsLibStrings.disabled | markDotJsLib.markDotJsLibStrings.enabled | markDotJsLib.markDotJsLibStrings.withSpaces
  ] = js.undefined
}

object MarkOptions {
  @scala.inline
  def apply(
    accuracy: MarkAccuracy | markDotJsLib.Anon_Value = null,
    acrossElements: js.UndefOr[scala.Boolean] = js.undefined,
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    diacritics: js.UndefOr[scala.Boolean] = js.undefined,
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
    ignoreJoiners: js.UndefOr[scala.Boolean] = js.undefined,
    ignorePunctuation: js.Array[java.lang.String] = null,
    log: js.Object = null,
    noMatch: js.Function1[/* term */ java.lang.String, scala.Unit] = null,
    separateWordSearch: js.UndefOr[scala.Boolean] = js.undefined,
    synonyms: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    wildcards: markDotJsLib.markDotJsLibStrings.disabled | markDotJsLib.markDotJsLibStrings.enabled | markDotJsLib.markDotJsLibStrings.withSpaces = null
  ): MarkOptions = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (!js.isUndefined(acrossElements)) __obj.updateDynamic("acrossElements")(acrossElements)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(diacritics)) __obj.updateDynamic("diacritics")(diacritics)
    if (done != null) __obj.updateDynamic("done")(done)
    if (each != null) __obj.updateDynamic("each")(each)
    if (element != null) __obj.updateDynamic("element")(element)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(iframes)) __obj.updateDynamic("iframes")(iframes)
    if (iframesTimeout != null) __obj.updateDynamic("iframesTimeout")(iframesTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreJoiners)) __obj.updateDynamic("ignoreJoiners")(ignoreJoiners)
    if (ignorePunctuation != null) __obj.updateDynamic("ignorePunctuation")(ignorePunctuation)
    if (log != null) __obj.updateDynamic("log")(log)
    if (noMatch != null) __obj.updateDynamic("noMatch")(noMatch)
    if (!js.isUndefined(separateWordSearch)) __obj.updateDynamic("separateWordSearch")(separateWordSearch)
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms)
    if (wildcards != null) __obj.updateDynamic("wildcards")(wildcards.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkOptions]
  }
}

