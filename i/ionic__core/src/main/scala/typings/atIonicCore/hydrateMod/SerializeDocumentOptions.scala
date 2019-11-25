package typings.atIonicCore.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeDocumentOptions extends HydrateDocumentOptions {
  var approximateLineWidth: js.UndefOr[Double] = js.undefined
  var prettyHtml: js.UndefOr[Boolean] = js.undefined
  var removeAttributeQuotes: js.UndefOr[Boolean] = js.undefined
  var removeBooleanAttributeQuotes: js.UndefOr[Boolean] = js.undefined
  var removeEmptyAttributes: js.UndefOr[Boolean] = js.undefined
  var removeHtmlComments: js.UndefOr[Boolean] = js.undefined
}

object SerializeDocumentOptions {
  @scala.inline
  def apply(
    approximateLineWidth: Int | Double = null,
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
  ): SerializeDocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (approximateLineWidth != null) __obj.updateDynamic("approximateLineWidth")(approximateLineWidth.asInstanceOf[js.Any])
    if (canonicalUrl != null) __obj.updateDynamic("canonicalUrl")(canonicalUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(clientHydrateAnnotations)) __obj.updateDynamic("clientHydrateAnnotations")(clientHydrateAnnotations.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainTimeouts)) __obj.updateDynamic("constrainTimeouts")(constrainTimeouts.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (maxHydrateCount != null) __obj.updateDynamic("maxHydrateCount")(maxHydrateCount.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyHtml)) __obj.updateDynamic("prettyHtml")(prettyHtml.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (!js.isUndefined(removeAttributeQuotes)) __obj.updateDynamic("removeAttributeQuotes")(removeAttributeQuotes.asInstanceOf[js.Any])
    if (!js.isUndefined(removeBooleanAttributeQuotes)) __obj.updateDynamic("removeBooleanAttributeQuotes")(removeBooleanAttributeQuotes.asInstanceOf[js.Any])
    if (!js.isUndefined(removeEmptyAttributes)) __obj.updateDynamic("removeEmptyAttributes")(removeEmptyAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(removeHtmlComments)) __obj.updateDynamic("removeHtmlComments")(removeHtmlComments.asInstanceOf[js.Any])
    if (!js.isUndefined(removeScripts)) __obj.updateDynamic("removeScripts")(removeScripts.asInstanceOf[js.Any])
    if (!js.isUndefined(removeUnusedStyles)) __obj.updateDynamic("removeUnusedStyles")(removeUnusedStyles.asInstanceOf[js.Any])
    if (resourcesUrl != null) __obj.updateDynamic("resourcesUrl")(resourcesUrl.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeDocumentOptions]
  }
}

