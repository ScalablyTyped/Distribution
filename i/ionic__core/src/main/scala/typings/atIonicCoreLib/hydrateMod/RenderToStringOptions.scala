package typings
package atIonicCoreLib.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderToStringOptions extends SerializeDocumentOptions {
  var afterHydrate: js.UndefOr[js.Function1[/* document */ js.Any, _ | js.Promise[_]]] = js.undefined
  var beforeHydrate: js.UndefOr[js.Function1[/* document */ js.Any, _ | js.Promise[_]]] = js.undefined
}

object RenderToStringOptions {
  @scala.inline
  def apply(
    afterHydrate: /* document */ js.Any => _ | js.Promise[_] = null,
    approximateLineWidth: scala.Int | scala.Double = null,
    beforeHydrate: /* document */ js.Any => _ | js.Promise[_] = null,
    canonicalUrl: java.lang.String = null,
    clientHydrateAnnotations: js.UndefOr[scala.Boolean] = js.undefined,
    constrainTimeouts: js.UndefOr[scala.Boolean] = js.undefined,
    cookie: java.lang.String = null,
    direction: java.lang.String = null,
    language: java.lang.String = null,
    maxHydrateCount: scala.Int | scala.Double = null,
    prettyHtml: js.UndefOr[scala.Boolean] = js.undefined,
    referrer: java.lang.String = null,
    removeAttributeQuotes: js.UndefOr[scala.Boolean] = js.undefined,
    removeBooleanAttributeQuotes: js.UndefOr[scala.Boolean] = js.undefined,
    removeEmptyAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    removeHtmlComments: js.UndefOr[scala.Boolean] = js.undefined,
    removeScripts: js.UndefOr[scala.Boolean] = js.undefined,
    removeUnusedStyles: js.UndefOr[scala.Boolean] = js.undefined,
    resourcesUrl: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    url: java.lang.String = null,
    userAgent: java.lang.String = null
  ): RenderToStringOptions = {
    val __obj = js.Dynamic.literal()
    if (afterHydrate != null) __obj.updateDynamic("afterHydrate")(js.Any.fromFunction1(afterHydrate))
    if (approximateLineWidth != null) __obj.updateDynamic("approximateLineWidth")(approximateLineWidth.asInstanceOf[js.Any])
    if (beforeHydrate != null) __obj.updateDynamic("beforeHydrate")(js.Any.fromFunction1(beforeHydrate))
    if (canonicalUrl != null) __obj.updateDynamic("canonicalUrl")(canonicalUrl)
    if (!js.isUndefined(clientHydrateAnnotations)) __obj.updateDynamic("clientHydrateAnnotations")(clientHydrateAnnotations)
    if (!js.isUndefined(constrainTimeouts)) __obj.updateDynamic("constrainTimeouts")(constrainTimeouts)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (maxHydrateCount != null) __obj.updateDynamic("maxHydrateCount")(maxHydrateCount.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyHtml)) __obj.updateDynamic("prettyHtml")(prettyHtml)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (!js.isUndefined(removeAttributeQuotes)) __obj.updateDynamic("removeAttributeQuotes")(removeAttributeQuotes)
    if (!js.isUndefined(removeBooleanAttributeQuotes)) __obj.updateDynamic("removeBooleanAttributeQuotes")(removeBooleanAttributeQuotes)
    if (!js.isUndefined(removeEmptyAttributes)) __obj.updateDynamic("removeEmptyAttributes")(removeEmptyAttributes)
    if (!js.isUndefined(removeHtmlComments)) __obj.updateDynamic("removeHtmlComments")(removeHtmlComments)
    if (!js.isUndefined(removeScripts)) __obj.updateDynamic("removeScripts")(removeScripts)
    if (!js.isUndefined(removeUnusedStyles)) __obj.updateDynamic("removeUnusedStyles")(removeUnusedStyles)
    if (resourcesUrl != null) __obj.updateDynamic("resourcesUrl")(resourcesUrl)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[RenderToStringOptions]
  }
}

