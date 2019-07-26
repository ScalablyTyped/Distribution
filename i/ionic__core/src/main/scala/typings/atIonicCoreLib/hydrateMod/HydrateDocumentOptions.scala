package typings
package atIonicCoreLib.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateDocumentOptions extends js.Object {
  var canonicalUrl: js.UndefOr[java.lang.String] = js.undefined
  var clientHydrateAnnotations: js.UndefOr[scala.Boolean] = js.undefined
  var constrainTimeouts: js.UndefOr[scala.Boolean] = js.undefined
  var cookie: js.UndefOr[java.lang.String] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var maxHydrateCount: js.UndefOr[scala.Double] = js.undefined
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  var removeScripts: js.UndefOr[scala.Boolean] = js.undefined
  var removeUnusedStyles: js.UndefOr[scala.Boolean] = js.undefined
  var resourcesUrl: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

object HydrateDocumentOptions {
  @scala.inline
  def apply(
    canonicalUrl: java.lang.String = null,
    clientHydrateAnnotations: js.UndefOr[scala.Boolean] = js.undefined,
    constrainTimeouts: js.UndefOr[scala.Boolean] = js.undefined,
    cookie: java.lang.String = null,
    direction: java.lang.String = null,
    language: java.lang.String = null,
    maxHydrateCount: scala.Int | scala.Double = null,
    referrer: java.lang.String = null,
    removeScripts: js.UndefOr[scala.Boolean] = js.undefined,
    removeUnusedStyles: js.UndefOr[scala.Boolean] = js.undefined,
    resourcesUrl: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    url: java.lang.String = null,
    userAgent: java.lang.String = null
  ): HydrateDocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (canonicalUrl != null) __obj.updateDynamic("canonicalUrl")(canonicalUrl)
    if (!js.isUndefined(clientHydrateAnnotations)) __obj.updateDynamic("clientHydrateAnnotations")(clientHydrateAnnotations)
    if (!js.isUndefined(constrainTimeouts)) __obj.updateDynamic("constrainTimeouts")(constrainTimeouts)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (maxHydrateCount != null) __obj.updateDynamic("maxHydrateCount")(maxHydrateCount.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (!js.isUndefined(removeScripts)) __obj.updateDynamic("removeScripts")(removeScripts)
    if (!js.isUndefined(removeUnusedStyles)) __obj.updateDynamic("removeUnusedStyles")(removeUnusedStyles)
    if (resourcesUrl != null) __obj.updateDynamic("resourcesUrl")(resourcesUrl)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[HydrateDocumentOptions]
  }
}

