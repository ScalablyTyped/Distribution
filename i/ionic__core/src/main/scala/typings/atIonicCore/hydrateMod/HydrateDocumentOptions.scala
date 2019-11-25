package typings.atIonicCore.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateDocumentOptions extends js.Object {
  var canonicalUrl: js.UndefOr[String] = js.undefined
  var clientHydrateAnnotations: js.UndefOr[Boolean] = js.undefined
  var constrainTimeouts: js.UndefOr[Boolean] = js.undefined
  var cookie: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var maxHydrateCount: js.UndefOr[Double] = js.undefined
  var referrer: js.UndefOr[String] = js.undefined
  var removeScripts: js.UndefOr[Boolean] = js.undefined
  var removeUnusedStyles: js.UndefOr[Boolean] = js.undefined
  var resourcesUrl: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object HydrateDocumentOptions {
  @scala.inline
  def apply(
    canonicalUrl: String = null,
    clientHydrateAnnotations: js.UndefOr[Boolean] = js.undefined,
    constrainTimeouts: js.UndefOr[Boolean] = js.undefined,
    cookie: String = null,
    direction: String = null,
    language: String = null,
    maxHydrateCount: Int | Double = null,
    referrer: String = null,
    removeScripts: js.UndefOr[Boolean] = js.undefined,
    removeUnusedStyles: js.UndefOr[Boolean] = js.undefined,
    resourcesUrl: String = null,
    timeout: Int | Double = null,
    title: String = null,
    url: String = null,
    userAgent: String = null
  ): HydrateDocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (canonicalUrl != null) __obj.updateDynamic("canonicalUrl")(canonicalUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(clientHydrateAnnotations)) __obj.updateDynamic("clientHydrateAnnotations")(clientHydrateAnnotations.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainTimeouts)) __obj.updateDynamic("constrainTimeouts")(constrainTimeouts.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (maxHydrateCount != null) __obj.updateDynamic("maxHydrateCount")(maxHydrateCount.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (!js.isUndefined(removeScripts)) __obj.updateDynamic("removeScripts")(removeScripts.asInstanceOf[js.Any])
    if (!js.isUndefined(removeUnusedStyles)) __obj.updateDynamic("removeUnusedStyles")(removeUnusedStyles.asInstanceOf[js.Any])
    if (resourcesUrl != null) __obj.updateDynamic("resourcesUrl")(resourcesUrl.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[HydrateDocumentOptions]
  }
}

