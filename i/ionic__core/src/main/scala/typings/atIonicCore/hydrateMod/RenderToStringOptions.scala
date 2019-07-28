package typings.atIonicCore.hydrateMod

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
    approximateLineWidth: Int | Double = null,
    beforeHydrate: /* document */ js.Any => _ | js.Promise[_] = null,
    canonicalUrl: String = null,
    clientHydrateAnnotations: js.UndefOr[Boolean] = js.undefined,
    constrainTimeouts: js.UndefOr[Boolean] = js.undefined,
    cookie: String = null,
    direction: String = null,
    language: String = null,
    maxHydrateCount: Int | Double = null,
    prettyHtml: js.UndefOr[Boolean] = js.undefined,
    referrer: String = null,
    removeAttributeQuotes: js.UndefOr[Boolean] = js.undefined,
    removeBooleanAttributeQuotes: js.UndefOr[Boolean] = js.undefined,
    removeEmptyAttributes: js.UndefOr[Boolean] = js.undefined,
    removeHtmlComments: js.UndefOr[Boolean] = js.undefined,
    removeScripts: js.UndefOr[Boolean] = js.undefined,
    removeUnusedStyles: js.UndefOr[Boolean] = js.undefined,
    resourcesUrl: String = null,
    timeout: Int | Double = null,
    title: String = null,
    url: String = null,
    userAgent: String = null
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

